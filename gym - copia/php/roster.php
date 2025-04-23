<?php

include_once "Basic.php";
include_once "Medium.php";
include_once "Premium.php";
include_once "Plan.php";
include_once "User.php";

// Inicializar la sesión para almacenar los usuarios registrados
session_start();

// Si no hay usuarios registrados en la sesión, inicializar el arreglo
if (!isset($_SESSION['users'])) {
    $_SESSION['users'] = [];
}

// Crear planes
$basic = new Basic();
$medium = new Medium();
$premium = new Premium();

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Registrar un nuevo usuario
    if (isset($_POST['name']) && isset($_POST['lastName']) && isset($_POST['weight']) && isset($_POST['stature']) && isset($_POST['plan'])) {
        $name = $_POST['name'];
        $lastName = $_POST['lastName'];
        $weight = (float) $_POST['weight'];
        $stature = (float) $_POST['stature'];
        $choice = (int) $_POST['plan'];

        // Crear un nuevo usuario
        $newUser = new User($name, $lastName, $weight, $stature);

        // Asignar el plan seleccionado al usuario
        if ($choice === 1) {
            $newUser->setPlan($basic);
        } elseif ($choice === 2) {
            $newUser->setPlan($medium);
        } elseif ($choice === 3) {
            $newUser->setPlan($premium);
        }

        // Guardar el usuario en la sesión
        $_SESSION['users'][] = $newUser;
    }
}

// Mostrar los usuarios registrados
$users = $_SESSION['users'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Usuarios</title>
</head>
<body>
    <h1>Registrar Usuario</h1>
    <form action="roster.php" method="POST">
        <label for="name">Nombre:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="lastName">Apellido:</label>
        <input type="text" id="lastName" name="lastName" required><br>

        <label for="weight">Peso:</label>
        <input type="number" id="weight" name="weight" step="0.1" required><br>

        <label for="stature">Estatura:</label>
        <input type="number" id="stature" name="stature" step="0.1" required><br>

        <h3>Seleccione un plan:</h3>
        <label>
            <input type="radio" name="plan" value="1" required> Basic: $20000 - Access General
        </label><br>
        <label>
            <input type="radio" name="plan" value="2"> Medium: $40000 - General access + Directed classes
        </label><br>
        <label>
            <input type="radio" name="plan" value="3"> Premium: $120000 - General access + Guided classes + Personal trainer + Wet area
        </label><br><br>

        <button type="submit">Registrar Usuario</button>
    </form>

    <h1>Usuarios Registrados</h1>
    <?php 
    if (!empty($users)): 
    ?>
        <?php
         foreach ($users as $user): 
         ?>
            <h2>
                <?php 
                echo $user->getName() . " " . $user->getLastName(); 
                ?>
                </h2>
            <p>Peso: 

                <?php 
                echo $user->getWeight();
                 ?>
                  kg</p>
            <p>
                Estatura: <?php echo $user->getStature(); 
                ?> m</p>

            <?php 
            $plan = $user->getPlan(); 
            ?>
            <?php

             if ($plan !== null):
              ?>

                <p>Plan:
                     <?php echo $plan->getName(); 
                     ?></p>

                <p>Costo: 
                    <?php 
                    echo $plan->getCost();

                    ?></p>
                <p>Servicios:
                     <?php echo $plan->getServices(); 
                     ?></p>

            <?php 
        else: 
        ?>
                <p>No plan was selected.</p>
            <?php endif; ?>
            <hr>
        <?php endforeach; ?>
    <?php else: ?>
        <p>There are no registered users.</p>
    <?php endif; ?>
</body>
</html>
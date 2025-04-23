<?php

class deductions {
    protected $healthRate;
    protected $pensionRate;
    protected $arlRate;

    public function __construct(float $healthRate = 0.12, float $pensionRate = 0.16, float $arlRate = 0.052) {
        $this->healthRate = $healthRate;
        $this->pensionRate = $pensionRate;
        $this->arlRate = $arlRate;
    }

    public function discounts(float $salary): float {
        return 0; // Este método se sobrescribirá en las clases hijas
    }
}

?>
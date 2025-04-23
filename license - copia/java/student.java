public class student { 
    private String name;
    private String lastName;
    private String identification;
    private String direction;
    private String phone;
    private String rh;
    private license license;


    public student(String name, String lastName, String identification, String direction, String phone, String rh, license license){ 
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.direction = direction;
        this.phone = phone;
        this.rh = rh;
        this.license = license;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public String getIdentification(){
        return this.identification;
    }

    public void setIdentification(String identification){
        this.identification = identification;
    }           

    public String getDirection(){
        return this.direction;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getRh(){
        return this.rh;
    }

    public void setRh(String rh){
        this.rh = rh;
    }

    public license getLicense(){
        return this.license;
    }

    public void setLicense(license license){
        this.license = license;
    }

    public double CalculateCost(){
        return this.license.CalculateCost(); 
    }
    @Override
    public String toString(){
        return "Name: " + this.name + "\n" +
               "Last Name: " + this.lastName + "\n" +
               "Identification: " + this.identification + "\n" +
               "Direction: " + this.direction + "\n" +
               "Phone: " + this.phone + "\n" +
               "RH: " + this.rh + "\n" +
               "License: " + this.license.getName() + "\n" +
               "Cost: " + this.CalculateCost() + "\n";
    }




} 
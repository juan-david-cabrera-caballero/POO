public abstract class figureGeometric { 
    private final String name;
    private final String nameSpanish;

public figureGeometric (String name, String nameSpanish ){ 
    this.name = name;
    this.nameSpanish = nameSpanish;
}

public String getName(){
    return this.name;

}

public String getNameSpanish(){
    return this.nameSpanish;

}

public abstract double calculateArea();


}
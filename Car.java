/**
 * Creación de la clase Carro.
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-07
*/
public class Car {
    
    /**
     * Representa el peso del carro.
    */
    private double weight;
    /**
     * Representa la altura del carro.
    */
    private double height;
     /**
     * Representa el ancho del carro.
    */
    private double width;
     /**
     * Representa el largo del carro.
    */
    private double length;
     /**
     * Representa el numero de puertas del carro.
    */
    private int numberDoors;
     /**
     * Representa el modelo del carro.
    */
    private String model;
     /**
     * Representa si esta encendido el carro.
    */
    public boolean turnOn;

    /**
     * Crea una instancia de la clase Persona sin parámetros.
    */

    public Car(){
 
    }

    /**
     *Crea una instancia de la clase Carro con parámetros
     * @param double peso, double altura, double ancho, double largo, int numero de puertas, String modelo

    */

    public Car(double weight, double height, double width, double length, int numberDoors, String model) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
        this.numberDoors = numberDoors;
        this.model = model;
    }

    /**
     * Método accesador del peso del Carro
     * @return peso
    */
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /** 
     * Método accesador de la altura del Carro
     * @return altura
    */
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Método accesador del ancho del Carro
     * @return ancho
    */
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Método accesador del largo del Carro
     * @return largo
    */

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Método accesador del numero de puertas del Carro
     * @return numero de puertas
    */
    public int getNumberDoors() {
        return numberDoors;
    }
    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    /**
     * Método accesador del modelo del Carro
     * @return modelo
    */
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Método para encender el Carro
     * @return boolean Verdadero
    */
    public void turnOnCar(){
        this.turnOn = true;
        System.out.println("The car is on");
    }

    /**
     * Método para apagar el Carro
     * @return boolean Falso
    */
    public void turnOffCar(){
        this.turnOn = false;
        System.out.println("The car is off");
    }

    /**
     * Método usando condicional para mostrar el estado del Carro
     * 
    */

    public void status(){
        if(turnOn == true){
            System.out.println("The car is on");
        }else{
            System.out.println("The car is off");
        }

    }

    
}

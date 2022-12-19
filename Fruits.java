/**
 * Creación de la clase Frutas.
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-07
*/

import java.util.ArrayList;

public class Fruits {
     /**
     * Representa el nombre de la fruta.
    */
    public String name;
    /**
     * Representa el peso promedio de la fruta.
    */
    private Double averageWeight;
    /**
     * Representa el sabor de la fruta.
    */
    public String flavor;
    /**
     * Representa el color de la fruta.
    */
    public ArrayList<String>colors;

    /**
     * Crea una instancia de la clase Frutas sin parámetros.
    */
    public Fruits(){
        
    }

        
    /**
     *Crea una instancia de la clase Animal con parámetros
     * @param String nombre,double peso promedio,String sabor, String color de la fruta.

    */
    public Fruits(String name, Double averageWeight, String flavor, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.flavor = flavor;
        this.colors = colors;
    }

    /**
     * Método accesador al nombre de la fruta
     * @return nombre
    */
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método accesador al peso promedio de la fruta.
     * @return peso promedio
    */
    
    public Double getAverageWeight(){
        return averageWeight;
    }
    public void setAverageWeight(Double averageWeight) {
        this.averageWeight= averageWeight;
    }

    /**
     * Método accesador al sabor de la fruta.
     * @return sabor
    */
    
    public String getFlavor(){
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    /**
     * Método accesador al arrays de color de la fruta.
     * @return colores
    */
    public ArrayList<String> getColors(){
        return colors;
    }
    public void setColors(ArrayList<String>colors){
        this.colors=colors;
    }

    
    /**
     * Metodo para imprimir los datos de de la fruta.
    */
    
    public void printFruit(){
        System.out.println("============= Fruit data ===============");
        System.out.println("");
        System.out.println("The number 1 fruit is : "+ this.getName());
        System.out.println("Its average weight is: "+ this.getAverageWeight());
        System.out.println("Its flavor is: "+ this.getFlavor());
        System.out.println("Its colors are: "+ this.getColors());
        System.out.println("============ =========== ==================");
        System.out.println("");
    }



}




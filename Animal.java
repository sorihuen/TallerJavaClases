/**
 * Creación de la clase Animal.
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-07
*/

public class Animal{

    /**
     * Representa el nombre del animal.
    */
    private String name;
    /**
     * Representa la raza del animal.
    */
    private String race;
    /**
     * Representa los años del animal.
    */
    private int age;
    /**
     * Representa la clasificacion(vertebrado o invertebrado) del animal.
    */
    public String classification;
    
    
    /**
     *Crea una instancia de la clase Animal con parámetros
     * @param String nombre,raza, int años,String clasificacion.

    */
  
    public Animal(String name, String race, int age, String classification) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.classification = classification;
    }

    /**
     * Método accesador al nombre del animal
     * @return nombre
    */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método accesador a la raza del animal
     * @return raza
    */
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * Método accesador a la edad del animal
     * @return edad
    */
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Método accesador a la clasificación del animal
     * @return clasificación
    */
    public String getClassification() {
        return classification;
    }
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * Metodo para imprimir los datos del Animal.
    */
    
    public void printAnimal(){
        System.out.println("============= Animal data ===============");
        System.out.println("");
        System.out.println("The name of Animal is: "+ this.getName());
        System.out.println("The breed of the animal is: "+ this.getRace());
        System.out.println("How old is the animal "+ this.getAge());
        System.out.println("This is an animal : "+ this.getClassification());
        System.out.println("============ =========== ==================");
        System.out.println("");
    }


}

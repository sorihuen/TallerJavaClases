/**
 * Creación de la clase Persona con Atributos y Métodos.
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-07
*/

public class Person{
    /**
     * Representa el nombre de la Persona.
     */
    public String name;
    /**
     * Representa el primer apellido.
     */
    public String lastName1;
    /**
     * Representa el segundo apellido.
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento.
    */
    public String DateBirth;
    /**
     * Representa la edad de la Persona.
     */
    public int age;
    /**
     * Representa el sexo
     */
    public String sex;
    /**
     * Representa la altura de la Persona.
     */
    public double heigth;

    /**
     *Crea una instancia de la clase Persona sin parámetros.
    */
    public Person(){

        this.name = "Suyin";
        this.lastName1="Orihuen";
        this.lastName2="Bermúdez";
        this.DateBirth= "13.01.1986";
        this.age= 35;
        this.sex="F";
        this.heigth= 1.56;
    }
    /**
     * Crea una instancia de la clase Persona con parámetros.
    */
   

    public Person(String name, String lastName1, String lastName2, String dateBirth, int age, String sex, double heigth){
        this.name=name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.DateBirth = dateBirth;
        this.age = age;
        this.sex = sex;
        this.heigth = heigth;
    }
    /**
     * Método accesador de nombre
     * @return nombre
    */

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método accesador de primer Apellido
     * @return primer Apellido.
    */
   
    public String getLastName1() {
        return lastName1;
    }
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
     /**
     * Método accesador de segundo Apellido
     * @return segundo Apellido.
    */
   
    public String getLastName2() {
        return lastName2;
    }
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
     /**
     * Método accesador de Fecha de Nacimiento
     * @return fecha de Nacimiento.
    */
   
    public String getDateBirth() {
        return DateBirth;
    }
    public void setDateBirth(String dateBirth) {
        DateBirth = dateBirth;
    }
     /**
     * Método accesador de la edad Persona
     * @return edad
    */
   
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
     /**
     * Método accesador al sexo de la Persona
     * @return sexo.
    */
   
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * Método accesador de la altura de la Persona
     * @return altura
    */
   
    public double getHeigth() {
        return heigth;
    }
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    /**
     * Metodo para imprimir los datos de la Persona.
    */
    public void printPerson(){
        System.out.println("============= Personal data ===============");
        System.out.println("");
        System.out.println("The name of person 1 is: "+ this.getName());
        System.out.println("The first surname is: "+ this.getLastName1());
        System.out.println("The second surname is: "+ this.getLastName2());
        System.out.println("The date of birth is: "+ this.getDateBirth());
        System.out.println("The age is : "+ this.getAge());
        System.out.println("The sex is : "+ this.getSex());
        System.out.println("The height is: "+ this. getHeigth());
        System.out.println("============ =========== ==================");
        System.out.println("");
    }




}

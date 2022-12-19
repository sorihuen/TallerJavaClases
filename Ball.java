/**
 * Creación de la clase Pelota.
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-07
*/
public class Ball {
      
    /**
     * Representa el color de la pelota.
    */
    private String color;
      
    /**
     * Representa el radio de la pelota.
    */
    private float radius;
     
    /**
     * Representa el peso de la pelota.
    */
    private float weight;
   /**
     * Crea una instancia de la clase Pelota sin parámetros se le asigno valores.
    */
    public Ball() {
        color = "blue";
        radius = 68;
        weight= 410;
    }

    /**
     *Crea una instancia de la clase Pelota con parámetros
     * @param String color, float radio, float peso.

    */
    public Ball(String color, float radius, float weight) {
        this.color = color;
        this.radius = radius;
        this.weight = weight;
    }

    /**
     * Método accesador al color de la pelota
     * @return color
    */


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método accesador al radio de la pelota
     * @return radio
    */
    public float getRadius() {
        return this.radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * Método accesador al peso de la pelota
     * @return peso
    */

    public float getWeight() {
        return this.weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Método para Patear la pelota
     *
    */
    public void kickBall(){
        System.out.println("You have kicked the ball");

    }
    
    /**
     * Método para Agarrar la pelota
     *
    */

    public void catchBall(){
        System.out.println("You have caught the ball");

    }
        
}
    

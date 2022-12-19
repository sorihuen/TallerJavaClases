
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase principal 
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-07
*/


public class Main {
  /**
   * Metodo principal de la clase
   * 
   * @param args Argumentos de la linea de comandos
   */

    public static void main(String[] args){
        boolean salir= false;
        Scanner scanner = new Scanner(System.in);
      do{
        menu();
        
        int opc= scanner.nextInt();
        switch(opc){
            case 1:
                 
                Person person = new Person();
                person.printPerson();
            
                //Utilizando constructor con parametros
                
                Person person1= new Person("Ashley", "Osuna", "Pimentel", "30.10.2006", 16, "F", 1.63);
                person1.printPerson();
            break;
            case 2:

                ArrayList<String> colors = new ArrayList<>();
                colors.add("green");
                colors. add("yellow");
                colors.add("red");

                Fruits f1= new Fruits("Apple",1.7,"sweet", colors);
                f1.printFruit();
                
              
            
            break;
            case 3:
              double totalAccount;
              //creamos la cuenta
              BankAccount bank = new BankAccount(12345, true, 250000.20);

              totalAccount = bank.balance();
              System.out.println("===================================");
              System.out.println("Current account total: " + totalAccount);
              System.out.println("===================================");
              //ingreso en la cuenta

              double entry= 350.25;

              System.out.println("The following is credited to the account " + entry);

              bank.deposit(entry);
              System.out.println("===================================");
              // Consultamos saldo de nuevo

              totalAccount = bank.balance();
              System.out.println("Current account total: " + totalAccount);
              System.out.println("=====================================");


            break;
           
            case 4:
               Animal animal1= new Animal("Dog", "Pitbull", 3, "vertebrate");
               animal1.printAnimal();

              Animal animal2= new Animal("Jumping Spider", "Araneomorfas", 1, "invertebrate");
              animal2.printAnimal();

            break;
                    
            case 5:
              Ball ball = new Ball("yellow",70,450);
              ball. kickBall();
              System.out.println("The ball is colored "+ ball.getColor()+ " and its radius is  "+ ball.getRadius() + "cm, with a weight of  " + ball.getWeight()+" gr");
              Ball ball1= new Ball();
              ball1.catchBall();
              System.out.println("The ball you caught is colored "+ ball1.getColor());
              System.out.println("");
              System.out.println("=========================================================");

            break;
            case 6:
              Car car = new Car();
              car.status();
              car.turnOnCar();
              car.status();
              System.out.println("");
              System.out.println("=========================================================");


            break;
            case 0:
              System.out.println("Salir del sistema");
              salir= true;
            break;
            default:
            System.out.println("Opcion Invalida");
    
        }

      }while(!salir);


    }
    /*
     * Metodo para acceder al menu.
     */

    public static void menu() {
        System.out.println("Select the class to run:");
        System.out.println("1. Person");
        System.out.println("2.Fruits");
        System.out.println("3. Bank Account");
        System.out.println("4. Animals");
        System.out.println("5.Ball");
        System.out.println("6. Car");
        System.out.println("0. Salir del sistema");

    }

}

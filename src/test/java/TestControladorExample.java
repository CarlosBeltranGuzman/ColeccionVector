
import edu.cecar.controladores.ControladorExample;
import edu.cecar.modelos.Example;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static junit.framework.Assert.fail;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C4RL05 B3LTR4N
 */
public class TestControladorExample {

    @Test
    public void testConexionBaseDatos(){
        ControladorExample controladorEmpleado= new ControladorExample();
        System.out.println("Conexion Exitosa ;)");
        
    }
    public static void main(String[] args) {
        
        try {
            int opcion;
            int gender;
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            ControladorExample controladorExample = new ControladorExample();
            Vector<Example> example = controladorExample.consultarExample();
            System.out.println("---------------------------------");
            System.out.println("-----Operaciones con Vector------");
            System.out.println("---------------------------------");
            System.out.println("Seleccione una de las Opciones...");
            System.out.println("1 -> Mostrar Datos por Date ");
            System.out.println("2 -> Mostrar Datos por Gender ");
            System.out.println("3 -> Mostrar Datos por Gender and Date");
            System.out.println("4 -> Mostrar Datos Ordenados por Date");
            System.out.println("5 -> Mostrar Datos Ordenados por Fatal");
            System.out.println("6 -> Simplemente Mostrar Datos");
            System.out.println("7 -> Salir");
            
            
            System.out.print("Opcion> "); opcion = sc.nextInt();
            
            
            while (opcion != 7) {                
                switch(opcion){
                    case 1: System.out.print("Escriba la fecha exacta Para buscar por Date of stop > "); 
                            String date = sc1.nextLine();
                            if (!"".equals(date)) {
                                example.stream().filter(e -> e.getDate_of_stop().equals(date)).forEach(e -> System.out.println("Date: "+ e.getDate_of_stop() + "- Fatal: " + e.getFatal() + " - Gender: " + e.getGender() + " - Alcohol: " + e.getAlcohol()));
                            } 
                            
                    break;
                    case 2: System.out.print("Digite 1 para (F) o 2 para (M) y buscar por Gender > "); 
                            gender = sc.nextInt();
                            if (gender == 1) {
                                example.stream().filter(e -> e.getGender().equals("F")).forEach(e -> System.out.println("Date: "+ e.getDate_of_stop() + "- Fatal: " + e.getFatal() + " - Gender: " + e.getGender() + " - Alcohol: " + e.getAlcohol()));
                            } 
                            if (gender == 2){
                                example.stream().filter(e -> e.getGender().equals("M")).forEach(e -> System.out.println("Date: "+ e.getDate_of_stop() + "- Fatal: " + e.getFatal() + " - Gender: " + e.getGender() + " - Alcohol: " + e.getAlcohol()));
                            }
                    break;
                    
                    case 3: System.out.print("Digite 1 para (F) o 2 para (M) & La fecha Exacta Para buscar por Date and Gender > Gender:"); 
                            gender = sc.nextInt(); System.out.println("\nDate"); date = sc1.nextLine();
                            if (!"".equals(date)) {
                                if (gender == 1) {
                                    example.stream().filter(e -> e.getGender().equals("F") && e.getDate_of_stop().equals(date)).forEach(e -> System.out.println("Date: "+ e.getDate_of_stop() + "- Fatal: " + e.getFatal() + " - Gender: " + e.getGender() + " - Alcohol: " + e.getAlcohol()));
                                } 
                                if (gender == 2){
                                    example.stream().filter(e -> e.getGender().equals("M") && e.getDate_of_stop().equals(date)).forEach(e -> System.out.println("Date: "+ e.getDate_of_stop() + "- Fatal: " + e.getFatal() + " - Gender: " + e.getGender() + " - Alcohol: " + e.getAlcohol()));
                                }
                            }
                    break;
                    case 4: example.stream().sorted(Comparator.comparing(Example::getDate_of_stop)).forEach(e -> System.out.println("Date: "+ e.getDate_of_stop() + "- Fatal: " + e.getFatal() + " - Gender: " + e.getGender() + " - Alcohol: " + e.getAlcohol()));
                            System.out.println("\n"); 
                    break;
                    case 5: example.stream().sorted(Comparator.comparing(Example::getFatal).reversed()).forEach(e -> System.out.println("Date: "+ e.getDate_of_stop() + "- Fatal: " + e.getFatal() + " - Gender: " + e.getGender() + " - Alcohol: " + e.getAlcohol()));
                            System.out.println("\n");
                    break;
                    case 6: example.stream().forEach(e -> System.out.println("Date: "+ e.getDate_of_stop() + "- Fatal: " + e.getFatal() + " - Gender: " + e.getGender() + " - Alcohol: " + e.getAlcohol()));
                    break;
                    default: System.out.println("Opcion no valida");
                    break;
                }
                System.out.println("---------------------------------");
                System.out.println("-----Operaciones con Vector------");
                System.out.println("---------------------------------");
                System.out.println("Seleccione una de las Opciones...");
                System.out.println("1 -> Mostar Datos por Date ");
                System.out.println("2 -> Mostar Datos por Gender ");
                System.out.println("3 -> Mostar Datos por Gender and Date");
                System.out.println("4 -> Mostar Datos Ordenados por Date");
                System.out.println("5 -> Mostar Datos Ordenados por Fatal");
                System.out.println("6 -> Simplemente Mostar Datos");
                System.out.println("7 -> Salir");
                System.out.print("Opcion> "); opcion = sc.nextInt();
            }
        } catch (Exception ex) {
            Logger.getLogger(TestControladorExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

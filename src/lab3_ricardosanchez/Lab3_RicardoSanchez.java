package lab3_ricardosanchez;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Lab3_RicardoSanchez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("_____MENU_____"
                + "\n 1) Jugador"
                + "\n 2) Equipo"
                + "\n 3) Salir");
        System.out.println("Ingrese el numero lo que desea ver");
        int Opcion = sc.nextInt();
        
        switch(Opcion){
            case 1: // JUGADOR ====================================================================================================
                System.out.println("---Menu Jugador---"
                        + "\n 1) Agregar"
                        + "\n 2) Modificar"
                        + "\n 3) Eliminar");
                
                break;
            case 2:// EUIPO ========================================================================================================
                
                
                break;
            case 3:
                break;
                
            default:
                break;
        }
        
    }
    
}

package lab3_ricardosanchez;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Lab3_RicardoSanchez {

    //Objetos para los jugadores
    static String Nombre, Apellido, Estado, PaisDNaci, PiePref, Equipo;
    static int Edad, Num, Precio;
    //Objetos para los delanteros

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("_____MENU_____"
                + "\n 1) Jugador"
                + "\n 2) Equipo"
                + "\n 3) Salir");
        System.out.println("Ingrese el numero lo que desea ver");
        int Opcion = sc.nextInt();

        switch (Opcion) {
            case 1: // JUGADOR ====================================================================================================
                System.out.println("---Menu Jugador---"
                        + "\n 1) Agregar"
                        + "\n 2) Modificar"
                        + "\n 3) Eliminar");
                System.out.println("Ingrese el numero del la opcion que desea");
                int opcion2 = sc.nextInt();
                switch (opcion2) {
                    case 1: //Agregar Jugadores------------------------------------------------------------------------------------
                        char resp;
                        do {
                            System.out.println("Agregar Jugador");
                            System.out.println("Ingrese el primer nombre:");
                            Nombre = sc.next();
                            System.out.println("Ingrese apellido");
                            Apellido = sc.next();
                            Estado = "Libre";
                            System.out.println("Ingrese el pasi de nacimiento del jugador");
                            PaisDNaci = sc.next();
                            System.out.println("Ingrese el pie preferido");
                            PiePref = sc.next();
                            Equipo = "";

                            System.out.println("Desea agregar otro jugador [S/N]");
                            resp = sc.next().charAt(0);
                        } while (resp == 's' || resp == 'S');
                        break;
                    case 2: //Modificar Jugadores ---------------------------------------------------------------------------------

                        break;
                    case 3: //Eliminar Jugador ------------------------------------------------------------------------------------

                        break;
                    default:
                        break;
                }

                break;
            case 2:// EUIPO =======================================================================================================

                break;
            case 3:
                break;

            default:
                break;
        }

    }

}

package lab3_ricardosanchez;

import java.util.ArrayList;
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
    static int  NivelDef, Velocidad;
    static double Altura, PromGol;
    //Objetos para los medios
    static int NivelCrea, NivelDom;
    static double PromAsis;
    //Objetos para defensa
    static int NivelAgres, VelocidadD;
    static double AlturaD, PesoD;
    //Object para porteros
    static int NIvelJuegoA, NivelJuegoP;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Jugador> J = new ArrayList();
        System.out.println("_____MENU_____"
                + "\n 1) Jugador"
                + "\n 2) Equipo"
                + "\n 3) Salir");
        System.out.println("Ingrese el numero lo que desea ver");
        int Opcion = sc.nextInt();

        switch (Opcion) {
            case 1: // JUGADOR =============================================================================================================================
                System.out.println("---Menu Jugador---"
                        + "\n 1) Agregar"
                        + "\n 2) Modificar"
                        + "\n 3) Eliminar"
                        + "\n 4) Listar");
                
                System.out.println("Ingrese el numero del la opcion que desea");
                int opcion2 = sc.nextInt();
                switch (opcion2) {
                    case 1: //Agregar Jugadores----------------------------------------------------------------------------------------------------------------
                        char resp;
                        do {
                            System.out.println("Agregar Jugador");
                            System.out.println("Ingrese el primer nombre:");
                            Nombre = sc.next();
                            System.out.println("Ingrese apellido");
                            Apellido = sc.next();
                            Estado = "Libre";
                            System.out.println("Ingrese el pasi de nacimiento del jugador");
                            PaisDNaci = sc.nextLine();
                            System.out.println("Ingrese el pie preferido");
                            PiePref = sc.next();
                            Equipo = "";
                            System.out.println("Ingrese la edad");
                            Edad = sc.nextInt();
                            System.out.println("Ingrese su numero asignado");
                            Num = sc.nextInt();
                            System.out.println("Ingrese el precio del jugador");
                            Precio = sc.nextInt();
                            J.add(new Jugador(Nombre,Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad,Num,Precio));
                            System.out.println("Ingrese el numero de la posicion del jugador:"
                                    + "\n 1) Delantero"
                                    + "\n 2) Medio"
                                    + "\n 3) Defensa"
                                    + "\n 4) Portero");
                            int opcion3 = sc.nextInt();
                            switch(opcion3){
                                case 1: //Delantero ***************************************************************************************************************
                                    System.out.println("Es delantero");
                                    System.out.println("Ingrese su nivel de definicion (es  un numero entero)");
                                    NivelDef = sc.nextInt();
                                    System.out.println("Ingrese su altura");
                                    Altura = sc.nextDouble();
                                    System.out.println("Ingrese su velocidad");
                                    Velocidad = sc.nextInt();
                                    System.out.println("Ingrese su promedio de goles");
                                    PromGol = sc.nextDouble();
                                    J.add(new Delantero(NivelDef,Velocidad,Altura,PromGol,Nombre, Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad, Num,Precio));
                                    break;
                                    
                                case 2: // Medio ************************************************************************************************************
                                    System.out.println("Es Medio");
                                    System.out.println("Ingrese su nivel de creatividad (es un numero entero)");
                                    NivelCrea = sc.nextInt();
                                    System.out.println("Ingrese su nivel de domino (es un numero entero)");
                                    NivelDom = sc.nextInt();
                                    System.out.println("Ingrese su promedio de asistencias de partido");
                                    PromAsis = sc.nextDouble();
                                    J.add(new Medio(NivelCrea,NivelDom,PromAsis, Nombre,Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad, Num,Precio));
                                    break;
                                case 3: //Defensa **************************************************************************************************************
                                    System.out.println("Es defensa");
                                    System.out.println("Ingrese su nivel de agresividad (es un numero)");
                                    NivelAgres = sc.nextInt();
                                    System.out.println("Ingrese su altura");
                                    AlturaD = sc.nextDouble();
                                    System.out.println("Ingrese su peso");
                                    PesoD = sc.nextDouble();
                                    System.out.println("Ingrese su velocidad");
                                    VelocidadD = sc.nextInt();
                                    J.add(new Defensa(NivelAgres,VelocidadD,AlturaD,PesoD,Nombre,Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad,Num,Precio));
                                    break;
                                case 4: //Portero **************************************************************************************************************
                                    System.out.println("Es portero");
                                    System.out.println("Ingrese su nivel de juego aereo (es un numero entero)");
                                    NIvelJuegoA = sc.nextInt();
                                    System.out.println("Ingrese su nivel de juego con los pies (es un numero entero)");
                                    NivelJuegoP = sc.nextInt();
                                    J.add(new Portero(NIvelJuegoA,NivelJuegoP,Nombre,Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad,Num,Precio));
                            }

                            System.out.println("Desea agregar otro jugador [S/N]");
                            resp = sc.next().charAt(0);
                        } while (resp == 's' || resp == 'S');
                        break;
                    case 2: //Modificar Jugadores --------------------------------------------------------------------------------------------------------------
                        System.out.println("Ingrese el numero del jugador que desea modificar");
                        int mod = sc.nextInt();
                        while (mod < 0 || mod > J.size()){
                            System.out.println("Numero invalido. Ingrese otro:");
                            mod = sc.nextInt();
                        }
                        System.out.println("Ingrese el primer nombre:");
                            Nombre = sc.next();
                            System.out.println("Ingrese apellido");
                            Apellido = sc.next();
                            Estado = "Libre";
                            System.out.println("Ingrese el pasi de nacimiento del jugador");
                            PaisDNaci = sc.nextLine();
                            System.out.println("Ingrese el pie preferido");
                            PiePref = sc.next();
                            Equipo = "";
                            System.out.println("Ingrese la edad");
                            Edad = sc.nextInt();
                            System.out.println("Ingrese su numero asignado");
                            Num = sc.nextInt();
                            System.out.println("Ingrese el precio del jugador");
                            Precio = sc.nextInt();
                            J.set(mod,new Jugador(Nombre,Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad,Num,Precio));
                            System.out.println("Ingrese el numero de la posicion del jugador:"
                                    + "\n 1) Delantero"
                                    + "\n 2) Medio"
                                    + "\n 3) Defensa"
                                    + "\n 4) Portero");
                            int opcion3 = sc.nextInt();
                            switch(opcion3){
                                case 1: //Delantero ***************************************************************************************************************
                                    System.out.println("Es delantero");
                                    System.out.println("Ingrese su nivel de definicion (es  un numero entero)");
                                    NivelDef = sc.nextInt();
                                    System.out.println("Ingrese su altura");
                                    Altura = sc.nextDouble();
                                    System.out.println("Ingrese su velocidad");
                                    Velocidad = sc.nextInt();
                                    System.out.println("Ingrese su promedio de goles");
                                    PromGol = sc.nextDouble();
                                    J.set(mod,new Delantero(NivelDef,Velocidad,Altura,PromGol,Nombre, Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad, Num,Precio));
                                    break;
                                    
                                case 2: // Medio ************************************************************************************************************
                                    System.out.println("Es Medio");
                                    System.out.println("Ingrese su nivel de creatividad (es un numero entero)");
                                    NivelCrea = sc.nextInt();
                                    System.out.println("Ingrese su nivel de domino (es un numero entero)");
                                    NivelDom = sc.nextInt();
                                    System.out.println("Ingrese su promedio de asistencias de partido");
                                    PromAsis = sc.nextDouble();
                                    J.set(mod,new Medio(NivelCrea,NivelDom,PromAsis, Nombre,Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad, Num,Precio));
                                    break;
                                case 3: //Defensa **************************************************************************************************************
                                    System.out.println("Es defensa");
                                    System.out.println("Ingrese su nivel de agresividad (es un numero)");
                                    NivelAgres = sc.nextInt();
                                    System.out.println("Ingrese su altura");
                                    AlturaD = sc.nextDouble();
                                    System.out.println("Ingrese su peso");
                                    PesoD = sc.nextDouble();
                                    System.out.println("Ingrese su velocidad");
                                    VelocidadD = sc.nextInt();
                                    J.set(mod,new Defensa(NivelAgres,VelocidadD,AlturaD,PesoD,Nombre,Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad,Num,Precio));
                                    break;
                                case 4: //Portero **************************************************************************************************************
                                    System.out.println("Es portero");
                                    System.out.println("Ingrese su nivel de juego aereo (es un numero entero)");
                                    NIvelJuegoA = sc.nextInt();
                                    System.out.println("Ingrese su nivel de juego con los pies (es un numero entero)");
                                    NivelJuegoP = sc.nextInt();
                                    J.set(mod,new Portero(NIvelJuegoA,NivelJuegoP,Nombre,Apellido,Estado,PaisDNaci,PiePref,Equipo,Edad,Num,Precio));
                            }
                        break;
                    case 3: //Eliminar Jugador ------------------------------------------------------------------------------------------------------------------
                        System.out.println("Ingrese el numero del jugador que desea eliminar (Use listar Jugadores para ver sus numeros asignados):");
                        int elim = sc.nextInt();
                        J.remove(elim);
                        break;
                    case 4://Listar Jugadores ----------------------------------------------------------------------------------------------------------------------
                        for (int i = 0; i < J.size(); i++) {
                            System.out.println("Jugador #" + i + "  " +J.get(i));
                        }
                    default:
                        break;
                }

                break;
            case 2:// EQUIPO ==================================================================================================================================
                System.out.println("---Menu Esuipo---"
                        + "\n 1) Agregar equipo"
                        + "\n 2) Eliminar equipo"
                        + "\n 3) Modificar equipo");
                break;
            case 3:// SALIDA ==================================================================================================================================
                break;

            default:
                break;
        }

    }

}

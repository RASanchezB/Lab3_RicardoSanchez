package lab3_ricardosanchez;

import java.util.ArrayList;

public class Equipos extends Jugador{
    private String NombreE, Ciudad;
    private int Palmares, Presupuesto;
    ArrayList <Jugador> Miembros = new ArrayList();

    public Equipos() {
        super();
    }

    public Equipos(String NombreE, String Ciudad, int Palmares, int Presupuesto, String Nombre, String Apellido, String Estado, String PaisDNaci, String PiePref, String Equipo, int Edad, int Num, int Precio) {
        super(Nombre, Apellido, Estado, PaisDNaci, PiePref, Equipo, Edad, Num, Precio);
        this.NombreE = NombreE;
        this.Ciudad = Ciudad;
        this.Palmares = Palmares;
        this.Presupuesto = Presupuesto;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getPalmares() {
        return Palmares;
    }

    public void setPalmares(int Palmares) {
        this.Palmares = Palmares;
    }

    public int getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(int Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    public ArrayList<Jugador> getMiembros() {
        return Miembros;
    }

    public void setMiembros(ArrayList<Jugador> Miembros) {
        this.Miembros = Miembros;
    }

    @Override
    public String toString() {
        return "Equipos{" + "NombreE=" + NombreE + ", Ciudad=" + Ciudad + ", Palmares=" + Palmares + ", Presupuesto=" + Presupuesto + ", Miembros=" + Miembros + '}';
    }
    
    
}

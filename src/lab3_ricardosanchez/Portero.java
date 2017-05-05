package lab3_ricardosanchez;

public class Portero extends Jugador{
    private int NIvelJuegoA, NivelJuegoP;

    public Portero() {
        super();
    }

    public Portero(int NIvelJuegoA, int NivelJuegoP, String Nombre, String Apellido, String Estado, String PaisDNaci, String PiePref, String Equipo, int Edad, int Num, int Precio) {
        super(Nombre, Apellido, Estado, PaisDNaci, PiePref, Equipo, Edad, Num, Precio);
        this.NIvelJuegoA = NIvelJuegoA;
        this.NivelJuegoP = NivelJuegoP;
    }

    public int getNIvelJuegoA() {
        return NIvelJuegoA;
    }

    public void setNIvelJuegoA(int NIvelJuegoA) {
        this.NIvelJuegoA = NIvelJuegoA;
    }

    public int getNivelJuegoP() {
        return NivelJuegoP;
    }

    public void setNivelJuegoP(int NivelJuegoP) {
        this.NivelJuegoP = NivelJuegoP;
    }

    @Override
    public String toString() {
        return super.toString() + "Portero{" + "NIvelJuegoA=" + NIvelJuegoA + ", NivelJuegoP=" + NivelJuegoP + '}';
    }
    
}

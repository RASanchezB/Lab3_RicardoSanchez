package lab3_ricardosanchez;

public class Medio extends Jugador{
    private int NivelCrea, NivelDom;
    private double PromAsis;

    public Medio() {
        super();
    }

    public Medio(int NivelCrea, int NivelDom, double PromAsis, String Nombre, String Apellido, String Estado, String PaisDNaci, String PiePref, String Equipo, int Edad, int Num, int Precio) {
        super(Nombre, Apellido, Estado, PaisDNaci, PiePref, Equipo, Edad, Num, Precio);
        this.NivelCrea = NivelCrea;
        this.NivelDom = NivelDom;
        this.PromAsis = PromAsis;
    }

    public int getNivelCrea() {
        return NivelCrea;
    }

    public void setNivelCrea(int NivelCrea) {
        this.NivelCrea = NivelCrea;
    }

    public int getNivelDom() {
        return NivelDom;
    }

    public void setNivelDom(int NivelDom) {
        this.NivelDom = NivelDom;
    }

    public double getPromAsis() {
        return PromAsis;
    }

    public void setPromAsis(double PromAsis) {
        this.PromAsis = PromAsis;
    }

    @Override
    public String toString() {
        return super.toString() + "Medio{" + "NivelCrea=" + NivelCrea + ", NivelDom=" + NivelDom + ", PromAsis=" + PromAsis + '}';
    }
    
    
}

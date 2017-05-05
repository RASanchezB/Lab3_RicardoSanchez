package lab3_ricardosanchez;

public class Defensa extends Jugador{
    private int NivelAgres, VelocidadD;
    private double AlturaD, PesoD;

    public Defensa() {
        super();
    }

    public Defensa(int NivelAgres, int VelocidadD, double AlturaD, double PesoD, String Nombre, String Apellido, String Estado, String PaisDNaci, String PiePref, String Equipo, int Edad, int Num, int Precio) {
        super(Nombre, Apellido, Estado, PaisDNaci, PiePref, Equipo, Edad, Num, Precio);
        this.NivelAgres = NivelAgres;
        this.VelocidadD = VelocidadD;
        this.AlturaD = AlturaD;
        this.PesoD = PesoD;
    }

    public int getNivelAgres() {
        return NivelAgres;
    }

    public void setNivelAgres(int NivelAgres) {
        this.NivelAgres = NivelAgres;
    }

    public int getVelocidadD() {
        return VelocidadD;
    }

    public void setVelocidadD(int VelocidadD) {
        this.VelocidadD = VelocidadD;
    }

    public double getAlturaD() {
        return AlturaD;
    }

    public void setAlturaD(double AlturaD) {
        this.AlturaD = AlturaD;
    }

    public double getPesoD() {
        return PesoD;
    }

    public void setPesoD(double PesoD) {
        this.PesoD = PesoD;
    }

    @Override
    public String toString() {
        return super.toString() + "Defensa{" + "NivelAgres=" + NivelAgres + ", VelocidadD=" + VelocidadD + ", AlturaD=" + AlturaD + ", PesoD=" + PesoD + '}';
    }
    
    
}

package lab3_ricardosanchez;

public class Delantero extends Jugador {
    private int  NivelDef, Velocidad;
    private double Altura, PromGol;

    public Delantero() {
        super();
    }

    public Delantero(int NivelDef, int Velocidad, double Altura, double PromGol, String Nombre, String Apellido, String Estado, String PaisDNaci, String PiePref, String Equipo, int Edad, int Num, int Precio) {
        super(Nombre, Apellido, Estado, PaisDNaci, PiePref, Equipo, Edad, Num, Precio);
        this.NivelDef = NivelDef;
        this.Velocidad = Velocidad;
        this.Altura = Altura;
        this.PromGol = PromGol;
    }

    public int getNivelDef() {
        return NivelDef;
    }

    public void setNivelDef(int NivelDef) {
        this.NivelDef = NivelDef;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPromGol() {
        return PromGol;
    }

    public void setPromGol(double PromGol) {
        this.PromGol = PromGol;
    }

    @Override
    public String toString() {
        return super.toString() + "Delantero{" + "NivelDef=" + NivelDef + ", Velocidad=" + Velocidad + ", Altura=" + Altura + ", PromGol=" + PromGol + '}';
    }
    

}

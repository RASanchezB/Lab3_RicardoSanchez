package lab3_ricardosanchez;

public class Jugador {
    private String Nombre, Apellido, Estado, PaisDNaci, PiePref, Equipo;
    private int Edad, Num, Precio;

    public Jugador() {
    }

    public Jugador(String Nombre, String Apellido, String Estado, String PaisDNaci, String PiePref, String Equipo, int Edad, int Num, int Precio) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Estado = Estado;
        this.PaisDNaci = PaisDNaci;
        this.PiePref = PiePref;
        this.Equipo = Equipo;
        this.Edad = Edad;
        this.Num = Num;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPaisDNaci() {
        return PaisDNaci;
    }

    public void setPaisDNaci(String PaisDNaci) {
        this.PaisDNaci = PaisDNaci;
    }

    public String getPiePref() {
        return PiePref;
    }

    public void setPiePref(String PiePref) {
        this.PiePref = PiePref;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Estado=" + Estado + ", PaisDNaci=" + PaisDNaci + ", PiePref=" + PiePref + ", Equipo=" + Equipo + ", Edad=" + Edad + ", Num=" + Num + ", Precio=" + Precio + '}';
    }
    
    
}

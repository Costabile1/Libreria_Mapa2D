import java.util.Objects;

public class Posicion {
    private int ancho,alto;

    public Posicion(int ancho, int largo) {
        this.ancho = ancho;
        this.alto = largo;
    }

    public Posicion() {
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int largo) {
        this.alto = largo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Posicion)) return false;
        Posicion p = (Posicion) o;
        return ancho == p.ancho && alto == p.alto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ancho, alto);
    }


    
}

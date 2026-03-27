
import java.util.ArrayList;
import java.util.List;

class Entorno {
    private int alto,ancho;
    private Celda mapa[][];

    public Entorno(int ancho, int alto) {
        int i,y;
        this.alto = alto;
        this.ancho=ancho;
        mapa = new Celda[ancho][alto];
        for (i = 0; i < ancho; i++) {
            for (y = 0; y < alto; y++) {
                mapa[i][y] = new Celda();
            }
        }
    }

    public Entorno() {
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Celda[][] getMapa() {
        return mapa;
    }

    public List<Entidad> getEntidades() {
        List<Entidad> entidades = new ArrayList<>();
        for (int i = 0; i < ancho; i++) {
            for (int y = 0; y < alto; y++) {
                if (mapa[i][y].getOcupante() != null) {
                    entidades.add(mapa[i][y].getOcupante());
                }
            }
        }
        return entidades;
    }
}

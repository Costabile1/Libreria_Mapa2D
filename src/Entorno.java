
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

    

    
}

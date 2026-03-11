public class Celda {
    private boolean tieneRecurso;
    private Entidad ocupante;
    private Obstaculo obstaculo;

    public Entidad getOcupante() {
        return ocupante;
    }

     public void setOcupante(Entidad ocupante) {
         this.ocupante = ocupante;
     }

    public Celda( boolean tieneRecurso, Entidad ocupante, Obstaculo obstaculo) {
        this();
        this.tieneRecurso = tieneRecurso;
        this.ocupante = ocupante;
        this.obstaculo = obstaculo;
    }

    public Celda() {
    }

    public boolean isTieneRecurso() {
        return tieneRecurso;
    }

    public Obstaculo getObstaculo() {
        return obstaculo;
    }

    public void setObstaculo(Obstaculo obstaculo) {
        this.obstaculo = obstaculo;
    }

    public boolean TieneRecurso() {
        return tieneRecurso;
    }

    public void setTieneRecurso(boolean tieneRecurso) {
        this.tieneRecurso = tieneRecurso;
    }

    public boolean estaOcupada(){
        return getOcupante()!=null;
    }

    public boolean tieneObstaculo(){
        return getObstaculo()!=null;
    }

    public void colocarEnte(Entidad ente){
        if (ocupante != null) {

        }
        setOcupante(ente);
    }

    public boolean estaLibre(){

        return !tieneObstaculo() && !estaOcupada();
        
    }

    public void quitarEnte(){
        setOcupante(null);

    }


  
    
}

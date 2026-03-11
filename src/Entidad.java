public abstract class Entidad {

    private Posicion posicion;
    private int id;


    public Entidad(Posicion posicion, int id) {
        this.posicion = posicion;
        this.id = id;
    }

    public Entidad() {
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void SetearPosicion(Posicion nueva,Entorno entorno){
        //establece la celda como vacia
        entorno.getMapa()[getPosicion().getAncho()][getPosicion().getAlto()].quitarEnte();
        //le asigna la nueva posicion al ente
        setPosicion(nueva);
        //asigna el ente a la nueva celda
        entorno.getMapa()[nueva.getAncho()][nueva.getAlto()].colocarEnte(this);
    }


    public void mover(Direccion direccion, Entorno entorno, AnalisisDatos datos){
        boolean ejecutado=false;
        switch (direccion) {
            case DERECHA:
                ejecutado=moverDerecha(entorno);
                break;
            case IZQUIERDA:
                ejecutado=moverIzquierda(entorno);
                break;
            case ARRIBA:
                ejecutado=moverArriba(entorno);
                break;
            case ABAJO:
                ejecutado=moverAbajo(entorno);
                break;
        }
        if(ejecutado){
            System.out.println("movimiento realizado conexito");
        } else{
            System.out.println("movimiento no realizado");
        }
    }

    public boolean  moverArriba(Entorno entorno){
        boolean res=false;
        int x = getPosicion().getAncho();
        int y = getPosicion().getAlto();

        int nuevaX =x; int nuevaY = y-1;

        Posicion nueva = new Posicion(nuevaX, nuevaY);
        if(posicionValida(nueva, entorno)){
            SetearPosicion(nueva, entorno);
            res=true;
        } else{
            manejoColisiones(posicion, entorno);
        }
        return res;
        
    }

    public boolean moverAbajo(Entorno entorno){
        boolean res=false;
        int x = getPosicion().getAncho();
        int y = getPosicion().getAlto();

        int nuevaX =x; int nuevaY = y+1;
        Posicion nueva = new Posicion(nuevaX, nuevaY);
        if(posicionValida(nueva, entorno)){
            SetearPosicion(nueva, entorno);
            res=true;
        }else{
            manejoColisiones(posicion, entorno);
        }
        return res;
    }

    public boolean moverDerecha(Entorno entorno){
        boolean res=false;
        int x = getPosicion().getAncho();
        int y = getPosicion().getAlto();

        int nuevaX =x+1; int nuevaY = y;

        Posicion nueva = new Posicion(nuevaX, nuevaY);
        if(posicionValida(nueva, entorno)){
            SetearPosicion(nueva, entorno);
            res=true;
        }else{
            manejoColisiones(posicion, entorno);
        }
        return res;
    }

    public boolean moverIzquierda(Entorno entorno){
        boolean res=false;
        int x = getPosicion().getAncho();
        int y = getPosicion().getAlto();

        int nuevaX =x-1; int nuevaY = y;
        Posicion nueva = new Posicion(nuevaX, nuevaY);
        if(posicionValida(nueva, entorno)){
            SetearPosicion(nueva, entorno);
            res=true;
        }else{
            if(manejoColisiones(posicion, entorno)!=0){

            }
            
            if(manejoFueraLimites(posicion, entorno)!=0){
                
            }
        }
        return res;
    }

    private int manejoColisiones(Posicion nuevaPosicion, Entorno entorno){
        int res=0;
        if(verificaColicion(posicion, entorno)==1){
            System.out.println("Colision con otro ente");
            res=1;
        } else if(verificaColicion(posicion, entorno)==2){
            System.out.println("Colision con un obstaculo");
            res=1;
        }
        return res;
    }

    public static int distanciaManhattan(Posicion a, Posicion b) {
    return Math.abs(a.getAncho() - b.getAncho())
         + Math.abs(a.getAlto() - b.getAlto());
    }

    public static int distanciaChebyshev(Posicion a, Posicion b) {
    return Math.max(
        Math.abs(a.getAncho() - b.getAncho()),
        Math.abs(a.getAlto() - b.getAlto())
    );
    }

    /**
        @retorna 1 si hay colicion con otro Ente
        @retorna 2 si hay colicion con un obstaculo
        @retorna 0 si no hay colicion
    **/
    private int verificaColicion(Posicion nuevaPosicion, Entorno entorno){
        if(entorno.getMapa()[nuevaPosicion.getAncho()][nuevaPosicion.getAlto()].estaOcupada()){
            return 1;
        }else if(entorno.getMapa()[nuevaPosicion.getAncho()][nuevaPosicion.getAlto()].tieneObstaculo()){
            return 2;
        }else{
            return 0;
        }
    }

    private int manejoFueraLimites(Posicion nuevaPosicion, Entorno entorno){
        if(movimientoValidoEnX(nuevaPosicion.getAncho(), entorno) && movimientoValidoEnY(nuevaPosicion.getAlto(), entorno)){
            return 1;
        }else{
            return 0;
        }
    }


    private boolean posicionValida(Posicion nuevaPosicion, Entorno entorno){
        if(movimientoValidoEnX(nuevaPosicion.getAncho(), entorno) && movimientoValidoEnY(nuevaPosicion.getAlto(), entorno) && entorno.getMapa()[nuevaPosicion.getAncho()][nuevaPosicion.getAlto()].estaLibre() && !nuevaPosicion.equals(this.getPosicion())){
            return true;
        }else{
            return false;
        }
    }

    //solo funciona con entornos positivos
    private boolean movimientoValidoEnX(int nuevo, Entorno entorno){

        if(nuevo>=0 && nuevo<entorno.getAncho()){
            return true;
        }else{
     
            return false;
        }
    }

    private boolean movimientoValidoEnY(int nuevo, Entorno entorno){
        if(nuevo>=0 && nuevo<entorno.getAlto()){
            return true;
        }else{
           
            return false;
        }
    }

   
}

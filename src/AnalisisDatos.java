
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalisisDatos {
    private int totalMovimientos;
    private int totalcolisiones;
    private int totalcolisionesEnteEnte;
    private int totalcolisionesEnteObstaculo;
    private int totalmovimientosFueraLimites;
    private Direccion direccionMovimiento;

    private Map<Celda, Integer> celdasTransitadasMap = new HashMap<>(); //cuantas veces una celda fue transitada
    private Map<Entidad, List<Double>> datosPorEntidad= new HashMap<>(); //datos por individuo (totalmovimientos,totalcolisiones,totalcolisionesEnteEnte,totalcolisionesEnteObstaculo,totalmovimientosFueraLimites)
    private Map<Entidad, List<Direccion>> direccionesPorEntidad = new HashMap<>();
    public AnalisisDatos(int totalMovimientos, int totalcolisiones, int totalcolisionesEnteEnte,
            int totalcolisionesEnteObstaculo, int totalmovimientosFueraLimites, Direccion direccionMovimiento,
            Map<Celda, Integer> celdasTransitadasMap, Map<Entidad, List<Double>> datosPorEntidad,
            Map<Entidad, List<Direccion>> direccionesPorEntidad) {
        this.totalMovimientos = totalMovimientos;
        this.totalcolisiones = totalcolisiones;
        this.totalcolisionesEnteEnte = totalcolisionesEnteEnte;
        this.totalcolisionesEnteObstaculo = totalcolisionesEnteObstaculo;
        this.totalmovimientosFueraLimites = totalmovimientosFueraLimites;
        this.direccionMovimiento = direccionMovimiento;
        this.celdasTransitadasMap = celdasTransitadasMap;
        this.datosPorEntidad = datosPorEntidad;
        this.direccionesPorEntidad = direccionesPorEntidad;
    }

    public AnalisisDatos() {
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    public void setTotalMovimientos(int totalMovimientos) {
        this.totalMovimientos = totalMovimientos;
    }

    public int getTotalcolisiones() {
        return totalcolisiones;
    }

    public void setTotalcolisiones(int totalcolisiones) {
        this.totalcolisiones = totalcolisiones;
    }

    public int getTotalcolisionesEnteEnte() {
        return totalcolisionesEnteEnte;
    }

    public void setTotalcolisionesEnteEnte(int totalcolisionesEnteEnte) {
        this.totalcolisionesEnteEnte = totalcolisionesEnteEnte;
    }

    public int getTotalcolisionesEnteObstaculo() {
        return totalcolisionesEnteObstaculo;
    }

    public void setTotalcolisionesEnteObstaculo(int totalcolisionesEnteObstaculo) {
        this.totalcolisionesEnteObstaculo = totalcolisionesEnteObstaculo;
    }

    public int getTotalmovimientosFueraLimites() {
        return totalmovimientosFueraLimites;
    }

    public void setTotalmovimientosFueraLimites(int totalmovimientosFueraLimites) {
        this.totalmovimientosFueraLimites = totalmovimientosFueraLimites;
    }

    public Direccion getDireccionMovimiento() {
        return direccionMovimiento;
    }

    public void setDireccionMovimiento(Direccion direccionMovimiento) {
        this.direccionMovimiento = direccionMovimiento;
    }

    public Map<Celda, Integer> getCeldasTransitadasMap() {
        return celdasTransitadasMap;
    }

    public void setCeldasTransitadasMap(Map<Celda, Integer> celdasTransitadasMap) {
        this.celdasTransitadasMap = celdasTransitadasMap;
    }

    public Map<Entidad, List<Double>> getDatosPorEntidad() {
        return datosPorEntidad;
    }

    public void setDatosPorEntidad(Map<Entidad, List<Double>> datosPorEntidad) {
        this.datosPorEntidad = datosPorEntidad;
    }

    public Map<Entidad, List<Direccion>> getDireccionesPorEntidad() {
        return direccionesPorEntidad;
    }

    public void setDireccionesPorEntidad(Map<Entidad, List<Direccion>> direccionesPorEntidad) {
        this.direccionesPorEntidad = direccionesPorEntidad;
    }

    

    

}

package Parcial3;
import java.util.ArrayList;
import java.util.List;
public class SoloLeveling {

    private String nombreCazador;
    private String apellidoCazador;
    private int edadCazador;
    private String rangoCazador;
    private String rangoInicial;
    private String rangoActual;
    private int nivelActual;
    private int experienciaActual;
    private int puntosHabilidadDisponibles;
    private String gremioCazador;
    private int fuerza;
    private int agilidad;
    private int vitalidad;
    private int inteligencia;
    private int percepcion;
    private int puntosVida;
    private int puntosVidaMaximos;
    private int puntosMana;
    private int puntosManaMaximos;
    private int resistenciaFisica;
    private boolean tieneSistema;
    private int misionesDiariasPendientes;
    private int misionesDiariasCompletadas;
    private String penalizacionPorMisionIncompleta;
    private String tituloActual;
    private List<String> habilidadesDesbloqueadas;
    private int cofresEncontrados;
    private int puntosEstadisticasSinAsignar;
    private boolean ejercitoSombrasActivo;
    private List<String> soldadosSombra;
    private int numeroSoldadosSombra;
    private String generalSombraPrincipal;
    private int capacidadMaximaSombras;
    private String ultimaSombraExtraida;
    private boolean habilidadExtraccionDesbloqueada;
    private int mazmorrasCompletadas;
    private String mazmorraActual;
    private String rangoMazmorraActual;
    private boolean esMazmorraDobleRango;
    private int puertasActivasDetectadas;
    private int puertasCerradas;
    private String armaEquipada;
    private String armaduraEquipada;
    private List<String> inventarioObjetos;
    private List<String> itemsLegendariosObtenidos;
    private int monstruosDerrotados;
    private int jefesDerrotados;
    private List<String> miembrosFamilia;
    private List<String> aliadosCazadores;
    private boolean asociacionCazadoresRegistrado;

    public SoloLeveling(String nombreCazador, String rangoInicial, String gremioCazador) {
        this.nombreCazador = nombreCazador;
        this.rangoInicial = rangoInicial;
        this.rangoActual = rangoInicial;
        this.rangoCazador = rangoInicial;
        this.gremioCazador = gremioCazador;
        this.nivelActual = 1;
        this.experienciaActual = 0;
        this.puntosHabilidadDisponibles = 0;
        this.fuerza = 10;
        this.agilidad = 10;
        this.vitalidad = 10;
        this.inteligencia = 10;
        this.percepcion = 10;
        this.puntosVida = 100;
        this.puntosVidaMaximos = 100;
        this.puntosMana = 50;
        this.puntosManaMaximos = 50;
        this.resistenciaFisica = 5;
        this.tieneSistema = false;
        this.misionesDiariasPendientes = 0;
        this.misionesDiariasCompletadas = 0;
        this.cofresEncontrados = 0;
        this.puntosEstadisticasSinAsignar = 0;
        this.ejercitoSombrasActivo = false;
        this.numeroSoldadosSombra = 0;
        this.capacidadMaximaSombras = 10;
        this.habilidadExtraccionDesbloqueada = false;
        this.mazmorrasCompletadas = 0;
        this.monstruosDerrotados = 0;
        this.jefesDerrotados = 0;
        this.asociacionCazadoresRegistrado = true;
        this.habilidadesDesbloqueadas = new ArrayList<>();
        this.soldadosSombra = new ArrayList<>();
        this.inventarioObjetos = new ArrayList<>();
        this.itemsLegendariosObtenidos = new ArrayList<>();
        this.miembrosFamilia = new ArrayList<>();
        this.aliadosCazadores = new ArrayList<>();
    }

    public String getNombreCazador() { return nombreCazador; }
    public void setNombreCazador(String nombreCazador) { this.nombreCazador = nombreCazador; }

    public String getRangoActual() { return rangoActual; }
    public void setRangoActual(String rangoActual) { this.rangoActual = rangoActual; }

    public int getNivelActual() { return nivelActual; }
    public void setNivelActual(int nivelActual) { this.nivelActual = nivelActual; }

    public int getExperienciaActual() { return experienciaActual; }
    public void setExperienciaActual(int experienciaActual) { this.experienciaActual = experienciaActual; }

    public int getPuntosVida() { return puntosVida; }
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }

    public int getPuntosVidaMaximos() { return puntosVidaMaximos; }
    public void setPuntosVidaMaximos(int puntosVidaMaximos) { this.puntosVidaMaximos = puntosVidaMaximos; }

    public int getPuntosMana() { return puntosMana; }
    public void setPuntosMana(int puntosMana) { this.puntosMana = puntosMana; }

    public boolean isTieneSistema() { return tieneSistema; }
    public void setTieneSistema(boolean tieneSistema) { this.tieneSistema = tieneSistema; }

    public int getNumeroSoldadosSombra() { return numeroSoldadosSombra; }
    public void setNumeroSoldadosSombra(int numeroSoldadosSombra) { this.numeroSoldadosSombra = numeroSoldadosSombra; }

    public String getGeneralSombraPrincipal() { return generalSombraPrincipal; }
    public void setGeneralSombraPrincipal(String generalSombraPrincipal) { this.generalSombraPrincipal = generalSombraPrincipal; }

    public String getMazmorraActual() { return mazmorraActual; }
    public void setMazmorraActual(String mazmorraActual) { this.mazmorraActual = mazmorraActual; }

    public int getMazmorrasCompletadas() { return mazmorrasCompletadas; }
    public void setMazmorrasCompletadas(int mazmorrasCompletadas) { this.mazmorrasCompletadas = mazmorrasCompletadas; }

    public String getArmaEquipada() { return armaEquipada; }
    public void setArmaEquipada(String armaEquipada) { this.armaEquipada = armaEquipada; }

    public int getMonstruosDerrotados() { return monstruosDerrotados; }
    public void setMonstruosDerrotados(int monstruosDerrotados) { this.monstruosDerrotados = monstruosDerrotados; }

    public boolean isAsociacionCazadoresRegistrado() { return asociacionCazadoresRegistrado; }
    public void setAsociacionCazadoresRegistrado(boolean valor) { this.asociacionCazadoresRegistrado = valor; }

    public void subirNivel() {
        nivelActual++;
        experienciaActual = 0;
        puntosEstadisticasSinAsignar += 3;
        puntosVidaMaximos += 20;
        puntosManaMaximos += 10;
    }

    public void ganarExperiencia(int cantidad) {
        experienciaActual += cantidad;
        if (experienciaActual >= 100 * nivelActual) {
            subirNivel();
        }
    }

    public void asignarPuntoEstadistica(String estadistica) {
        if (puntosEstadisticasSinAsignar <= 0) {
            return;
        }
        switch (estadistica.toLowerCase()) {
            case "fuerza": fuerza++; break;
            case "agilidad": agilidad++; break;
            case "vitalidad": vitalidad++; break;
            case "inteligencia": inteligencia++; break;
            case "percepcion": percepcion++; break;
            default: return;
        }
        puntosEstadisticasSinAsignar--;
    }

    public void completarMisionDiaria() {
        if (misionesDiariasPendientes > 0) {
            misionesDiariasPendientes--;
            misionesDiariasCompletadas++;
        }
    }

    public void recibirPenalizacion() {
        penalizacionPorMisionIncompleta = "Teletransporte forzado a zona de penalización";
        puntosVida = (int) (puntosVida * 0.5);
    }

    public void extraerSombra(String nombreMonstruo) {
        if (!habilidadExtraccionDesbloqueada || numeroSoldadosSombra >= capacidadMaximaSombras) {
            return;
        }
        soldadosSombra.add(nombreMonstruo);
        numeroSoldadosSombra++;
        ultimaSombraExtraida = nombreMonstruo;
    }

    public void invocarEjercitoSombras() {
        ejercitoSombrasActivo = true;
    }

    public void disolverSombra(String nombreSombra) {
        if (soldadosSombra.remove(nombreSombra)) {
            numeroSoldadosSombra--;
        }
    }

    public void entrarMazmorra(String nombreMazmorra, String rango) {
        mazmorraActual = nombreMazmorra;
        rangoMazmorraActual = rango;
    }

    public void completarMazmorra() {
        mazmorrasCompletadas++;
        ganarExperiencia(200);
        mazmorraActual = null;
    }

    public void derrotarMonstruo(String nombre) {
        monstruosDerrotados++;
        ganarExperiencia(15);
    }

    public void derrotarJefe(String nombre) {
        jefesDerrotados++;
        ganarExperiencia(150);
    }

    public void recibirDanio(int cantidad) {
        puntosVida = Math.max(0, puntosVida - Math.max(0, cantidad - vitalidad));
    }

    public void curar(int cantidad) {
        puntosVida = Math.min(puntosVidaMaximos, puntosVida + cantidad);
    }

    public void equiparArma(String arma) {
        armaEquipada = arma;
    }

    public void equiparArmadura(String armadura) {
        armaduraEquipada = armadura;
    }

    public void agregarItemInventario(String item) {
        inventarioObjetos.add(item);
    }

    public void ascenderRango(String nuevoRango) {
        rangoActual = nuevoRango;
    }

    public void registrarAliado(String nombre) {
        aliadosCazadores.add(nombre);
    }

    public String generarResumenCazador() {
        return nombreCazador + " - Rango " + rangoActual + " - Nivel " + nivelActual
                + " - Sombras: " + numeroSoldadosSombra + " - Mazmorras completadas: " + mazmorrasCompletadas;
    }
}
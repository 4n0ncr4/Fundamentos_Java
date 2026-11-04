package Parcial3;
import java.util.ArrayList;
import java.util.List;
public class DeathNote {

    private String nombrePropietario;
    private String apellidoPropietario;
    private int edadPropietario;
    private String nombreUsuarioOficial;
    private boolean esConocidoComoKira;
    private boolean propietarioAccedioATratoDeVida;
    private int diasVidaRestantesPropietario;
    private List<String> historialPropietarios;
    private int vecesTransferido;
    private boolean fueRobado;
    private String ladronCuaderno;
    private String tipoCuaderno;
    private boolean esOriginal;
    private int numeroPaginas;
    private int paginasUsadas;
    private int paginasRestantes;
    private String colorPortada;
    private String materialPortada;
    private String idioma;
    private String numeroSerie;
    private boolean tienePortadaDanada;
    private boolean destruido;
    private String fechaCreacion;
    private String fechaUltimoUso;
    private List<String> reglas;
    private int limiteTiempoEscritura;
    private int limiteDetalleMuerte;
    private boolean puedeControlarAcciones;
    private String reglaEspecialActiva;
    private boolean esDetectablePorCamaras;
    private List<String> nombresEscritos;
    private List<String> causasMuerte;
    private String ultimaVictima;
    private String ultimaCausaMuerte;
    private int numeroVictimasTotales;
    private String shinigamiPropietario;
    private String nombreShinigamiGuardian;
    private boolean tieneOjosDeShinigami;
    private boolean shinigamiVisibleParaOtros;
    private int manzanasComidasPorShinigami;
    private List<String> shinigamisAsociados;
    private List<String> investigadoresAsignados;
    private String investigadorPrincipal;
    private boolean investigacionActiva;
    private String organizacionInvestigadora;
    private String ubicacionActual;
    private boolean estaOculto;
    private String metodoOcultamiento;
    private boolean cuadernoRegistradoComoPosesion;
    private boolean cuadernoEnPosesionHumana;

    public DeathNote(String nombrePropietario, String tipoCuaderno,
                              boolean esOriginal, int numeroPaginas) {
        this.nombrePropietario = nombrePropietario;
        this.tipoCuaderno = tipoCuaderno;
        this.esOriginal = esOriginal;
        this.numeroPaginas = numeroPaginas;
        this.paginasUsadas = 0;
        this.paginasRestantes = numeroPaginas;
        this.limiteTiempoEscritura = 40;
        this.limiteDetalleMuerte = 400;
        this.numeroVictimasTotales = 0;
        this.vecesTransferido = 0;
        this.fueRobado = false;
        this.destruido = false;
        this.investigacionActiva = false;
        this.estaOculto = false;
        this.cuadernoEnPosesionHumana = true;
        this.reglas = new ArrayList<>();
        this.nombresEscritos = new ArrayList<>();
        this.causasMuerte = new ArrayList<>();
        this.shinigamisAsociados = new ArrayList<>();
        this.historialPropietarios = new ArrayList<>();
        this.investigadoresAsignados = new ArrayList<>();
    }

    public String getNombrePropietario() { return nombrePropietario; }
    public void setNombrePropietario(String nombrePropietario) { this.nombrePropietario = nombrePropietario; }

    public String getNombreUsuarioOficial() { return nombreUsuarioOficial; }
    public void setNombreUsuarioOficial(String nombreUsuarioOficial) { this.nombreUsuarioOficial = nombreUsuarioOficial; }

    public String getTipoCuaderno() { return tipoCuaderno; }
    public void setTipoCuaderno(String tipoCuaderno) { this.tipoCuaderno = tipoCuaderno; }

    public boolean isEsOriginal() { return esOriginal; }
    public void setEsOriginal(boolean esOriginal) { this.esOriginal = esOriginal; }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    public int getPaginasRestantes() { return paginasRestantes; }
    public void setPaginasRestantes(int paginasRestantes) { this.paginasRestantes = paginasRestantes; }

    public boolean isDestruido() { return destruido; }
    public void setDestruido(boolean destruido) { this.destruido = destruido; }

    public String getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(String fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public List<String> getReglas() { return reglas; }
    public void setReglas(List<String> reglas) { this.reglas = reglas; }

    public List<String> getNombresEscritos() { return nombresEscritos; }
    public void setNombresEscritos(List<String> nombresEscritos) { this.nombresEscritos = nombresEscritos; }

    public int getNumeroVictimasTotales() { return numeroVictimasTotales; }
    public void setNumeroVictimasTotales(int numeroVictimasTotales) { this.numeroVictimasTotales = numeroVictimasTotales; }

    public String getShinigamiPropietario() { return shinigamiPropietario; }
    public void setShinigamiPropietario(String shinigamiPropietario) { this.shinigamiPropietario = shinigamiPropietario; }

    public String getInvestigadorPrincipal() { return investigadorPrincipal; }
    public void setInvestigadorPrincipal(String investigadorPrincipal) { this.investigadorPrincipal = investigadorPrincipal; }

    public String getUbicacionActual() { return ubicacionActual; }
    public void setUbicacionActual(String ubicacionActual) { this.ubicacionActual = ubicacionActual; }

    public boolean isEstaOculto() { return estaOculto; }
    public void setEstaOculto(boolean estaOculto) { this.estaOculto = estaOculto; }

    public void escribirNombre(String nombre) {
        if (destruido) {
            System.out.println("El cuaderno ha sido destruido, no se puede escribir.");
            return;
        }
        if (paginasRestantes <= 0) {
            System.out.println("No quedan páginas disponibles.");
            return;
        }
        nombresEscritos.add(nombre);
        ultimaVictima = nombre;
        numeroVictimasTotales++;
        paginasUsadas++;
        paginasRestantes--;
    }

    public void escribirNombreConCausa(String nombre, String causa) {
        escribirNombre(nombre);
        causasMuerte.add(causa);
        ultimaCausaMuerte = causa;
    }

    public void escribirNombreConDetalles(String nombre, String causa, String detalles) {
        escribirNombreConCausa(nombre, causa);
        System.out.println("Detalles de " + nombre + ": " + detalles
                + " (límite: " + limiteDetalleMuerte + " segundos)");
    }

    public void pasarPagina() {
        if (paginasRestantes > 0) {
            paginasUsadas++;
            paginasRestantes--;
        }
    }

    public boolean verificarPaginasDisponibles() {
        return paginasRestantes > 0;
    }

    public void agregarRegla(String regla) {
        reglas.add(regla);
    }

    public void eliminarRegla(String regla) {
        reglas.remove(regla);
    }

    public void mostrarReglas() {
        System.out.println("Reglas del Cuaderno de la Muerte:");
        for (String regla : reglas) {
            System.out.println("- " + regla);
        }
    }

    public void asignarShinigami(String nombre) {
        shinigamiPropietario = nombre;
        shinigamisAsociados.add(nombre);
    }

    public void liberarShinigami() {
        shinigamiPropietario = null;
    }

    public void activarTratoDeVida(int diasVida) {
        propietarioAccedioATratoDeVida = true;
        diasVidaRestantesPropietario = diasVida;
    }

    public int calcularMitadVidaRestante() {
        return diasVidaRestantesPropietario / 2;
    }

    public void asignarInvestigador(String nombre) {
        investigadoresAsignados.add(nombre);
        if (investigadorPrincipal == null) {
            investigadorPrincipal = nombre;
        }
    }

    public void iniciarInvestigacion() {
        investigacionActiva = true;
    }

    public void finalizarInvestigacion() {
        investigacionActiva = false;
    }

    public void transferirPropiedad(String nuevoPropietario) {
        if (nombrePropietario != null) {
            historialPropietarios.add(nombrePropietario);
        }
        nombrePropietario = nuevoPropietario;
        vecesTransferido++;
    }

    public void reportarRobo(String ladron) {
        fueRobado = true;
        ladronCuaderno = ladron;
    }

    public void ocultarCuaderno(String lugar) {
        estaOculto = true;
        ubicacionActual = lugar;
        metodoOcultamiento = "Escondido en: " + lugar;
    }

    public void destruirCuaderno() {
        destruido = true;
        nombresEscritos.clear();
    }

    public String generarResumen() {
        return "Cuaderno de " + nombrePropietario + " (" + tipoCuaderno + ") - "
                + numeroVictimasTotales + " víctimas registradas, "
                + paginasRestantes + " páginas restantes.";
    }
}
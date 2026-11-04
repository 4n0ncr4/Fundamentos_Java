package Parcial3;
import java.util.ArrayList;
import java.util.List;
public class TRotSH {

    private String nombreHeroe;
    private String apellidoHeroe;
    private int edadHeroe;
    private int nivelActual;
    private int experienciaActual;
    private int experienciaNecesaria;
    private String clase;
    private String mundoOrigen;
    private String fechaInvocacion;
    private boolean esUnoDeLosCuatroHeroesCardinales;
    private String nombreEscudoActual;
    private String tipoEscudoActual;
    private int nivelEscudoActual;
    private List<String> escudosDesbloqueados;
    private int defensaTotal;
    private int ataqueTotal;
    private boolean puedeAtacarDirectamente;
    private List<String> habilidadesDesbloqueadas;
    private List<String> bendicionesEscudo;
    private String maldicionSerieActiva;
    private String nombreCompaneroPrincipal;
    private String razaCompaneroPrincipal;
    private int nivelCompaneroPrincipal;
    private String nombreFilolial;
    private String tipoFilolial;
    private int nivelFilolial;
    private List<String> miembrosDelGrupo;
    private int maxMiembrosGrupo;
    private List<String> esclavosLiberados;
    private int contratosEsclavitudActivos;
    private int reputacionReino;
    private boolean esAcusadoFalsamente;
    private String nombreAcusador;
    private String tituloOficial;
    private int oroAcumulado;
    private String relacionConOtrosHeroes;
    private int numeroOlaActual;
    private int olasCompletadas;
    private String paisActual;
    private String ciudadActual;
    private int enemigosDerrotados;
    private int jefesDerrotados;
    private int puntosVida;
    private int puntosVidaMaximos;
    private int puntosMana;
    private int resistenciaVeneno;
    private int tiempoRestanteMundo;
    private boolean puedeVolverAMundoOriginal;
    private List<String> itemsEnInventario;
    private List<String> recetasAprendidas;

    public TRotSH(String nombreHeroe, String nombreEscudoActual, String paisActual) {
        this.nombreHeroe = nombreHeroe;
        this.nombreEscudoActual = nombreEscudoActual;
        this.paisActual = paisActual;
        this.nivelActual = 1;
        this.experienciaActual = 0;
        this.experienciaNecesaria = 100;
        this.clase = "Héroe del Escudo";
        this.puedeAtacarDirectamente = false;
        this.defensaTotal = 10;
        this.ataqueTotal = 1;
        this.puntosVida = 100;
        this.puntosVidaMaximos = 100;
        this.puntosMana = 50;
        this.reputacionReino = 0;
        this.esAcusadoFalsamente = false;
        this.oroAcumulado = 0;
        this.numeroOlaActual = 0;
        this.olasCompletadas = 0;
        this.enemigosDerrotados = 0;
        this.jefesDerrotados = 0;
        this.escudosDesbloqueados = new ArrayList<>();
        this.habilidadesDesbloqueadas = new ArrayList<>();
        this.bendicionesEscudo = new ArrayList<>();
        this.miembrosDelGrupo = new ArrayList<>();
        this.esclavosLiberados = new ArrayList<>();
        this.itemsEnInventario = new ArrayList<>();
        this.recetasAprendidas = new ArrayList<>();
    }

    public String getNombreHeroe() { return nombreHeroe; }
    public void setNombreHeroe(String nombreHeroe) { this.nombreHeroe = nombreHeroe; }

    public int getNivelActual() { return nivelActual; }
    public void setNivelActual(int nivelActual) { this.nivelActual = nivelActual; }

    public int getExperienciaActual() { return experienciaActual; }
    public void setExperienciaActual(int experienciaActual) { this.experienciaActual = experienciaActual; }

    public String getNombreEscudoActual() { return nombreEscudoActual; }
    public void setNombreEscudoActual(String nombreEscudoActual) { this.nombreEscudoActual = nombreEscudoActual; }

    public int getDefensaTotal() { return defensaTotal; }
    public void setDefensaTotal(int defensaTotal) { this.defensaTotal = defensaTotal; }

    public String getNombreCompaneroPrincipal() { return nombreCompaneroPrincipal; }
    public void setNombreCompaneroPrincipal(String nombre) { this.nombreCompaneroPrincipal = nombre; }

    public int getNivelCompaneroPrincipal() { return nivelCompaneroPrincipal; }
    public void setNivelCompaneroPrincipal(int nivel) { this.nivelCompaneroPrincipal = nivel; }

    public String getNombreFilolial() { return nombreFilolial; }
    public void setNombreFilolial(String nombreFilolial) { this.nombreFilolial = nombreFilolial; }

    public int getNivelFilolial() { return nivelFilolial; }
    public void setNivelFilolial(int nivelFilolial) { this.nivelFilolial = nivelFilolial; }

    public int getReputacionReino() { return reputacionReino; }
    public void setReputacionReino(int reputacionReino) { this.reputacionReino = reputacionReino; }

    public int getNumeroOlaActual() { return numeroOlaActual; }
    public void setNumeroOlaActual(int numeroOlaActual) { this.numeroOlaActual = numeroOlaActual; }

    public int getPuntosVida() { return puntosVida; }
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }

    public int getPuntosVidaMaximos() { return puntosVidaMaximos; }
    public void setPuntosVidaMaximos(int puntosVidaMaximos) { this.puntosVidaMaximos = puntosVidaMaximos; }

    public int getOroAcumulado() { return oroAcumulado; }
    public void setOroAcumulado(int oroAcumulado) { this.oroAcumulado = oroAcumulado; }

    public String getPaisActual() { return paisActual; }
    public void setPaisActual(String paisActual) { this.paisActual = paisActual; }

    public void subirNivel() {
        nivelActual++;
        experienciaActual = 0;
        experienciaNecesaria = (int) (experienciaNecesaria * 1.2);
        puntosVidaMaximos += 10;
        defensaTotal += 2;
    }

    public void ganarExperiencia(int cantidad) {
        experienciaActual += cantidad;
        if (experienciaActual >= experienciaNecesaria) {
            subirNivel();
        }
    }

    public void cambiarEscudo(String nombreEscudo) {
        if (escudosDesbloqueados.contains(nombreEscudo)) {
            nombreEscudoActual = nombreEscudo;
        }
    }

    public void desbloquearEscudo(String nombreEscudo) {
        if (!escudosDesbloqueados.contains(nombreEscudo)) {
            escudosDesbloqueados.add(nombreEscudo);
        }
    }

    public void desbloquearHabilidad(String habilidad) {
        habilidadesDesbloqueadas.add(habilidad);
    }

    public void recibirDanio(int cantidad) {
        puntosVida = Math.max(0, puntosVida - Math.max(0, cantidad - defensaTotal));
    }

    public void curar(int cantidad) {
        puntosVida = Math.min(puntosVidaMaximos, puntosVida + cantidad);
    }

    public void agregarCompanero(String nombre) {
        if (maxMiembrosGrupo == 0 || miembrosDelGrupo.size() < maxMiembrosGrupo) {
            miembrosDelGrupo.add(nombre);
        }
    }

    public void liberarEsclavo(String nombre) {
        esclavosLiberados.add(nombre);
        if (contratosEsclavitudActivos > 0) {
            contratosEsclavitudActivos--;
        }
    }

    public void subirNivelCompanero(String nombre) {
        if (nombre.equals(nombreCompaneroPrincipal)) {
            nivelCompaneroPrincipal++;
        } else if (nombre.equals(nombreFilolial)) {
            nivelFilolial++;
        }
    }

    public void cocinarReceta(String receta) {
        recetasAprendidas.add(receta);
    }

    public void iniciarOla(int numeroOla) {
        numeroOlaActual = numeroOla;
    }

    public void completarOla() {
        olasCompletadas++;
        reputacionReino += 10;
    }

    public void derrotarEnemigo(String nombre) {
        enemigosDerrotados++;
        ganarExperiencia(10);
    }

    public void derrotarJefe(String nombre) {
        jefesDerrotados++;
        ganarExperiencia(100);
    }

    public void acusarFalsamente(String acusador) {
        esAcusadoFalsamente = true;
        nombreAcusador = acusador;
        reputacionReino -= 50;
    }

    public void limpiarReputacion() {
        esAcusadoFalsamente = false;
        reputacionReino += 50;
    }

    public void cambiarCiudad(String ciudad) {
        ciudadActual = ciudad;
    }

    public void agregarItemInventario(String item) {
        itemsEnInventario.add(item);
    }

    public String generarResumenHeroe() {
        return nombreHeroe + " - Nivel " + nivelActual + " - Escudo: " + nombreEscudoActual
                + " - Reputación: " + reputacionReino + " - Olas completadas: " + olasCompletadas;
    }
}
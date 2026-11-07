package Parcial3;
import java.util.ArrayList;
public class LosXboxDelProfe {

    String marcaa = "Microsoft";
    String modelo = "Xbox One";
    String color = "Rojo y negro";
    double tamano = 30;
    double peso = 3.5;
    double altura = 8;
    double anchura = 30;
    double profundidad = 25;
    int capacidadAlmacenamiento = 1000;
    int memoriaRAM = 8;
    String procesador = "AMD";
    String tarjetaGrafica = "AMD Radeon";
    String sistemaOperativo = "Xbox OS";
    String resolucionImagen = "4K";
    double velocidadProcesador = 2.3;
    String tipoConexion = "Inalambrica";
    String puertoHDMI = "HDMI";
    int puertoUSB = 3;
    boolean conexionWiFi = true;
    boolean conexionBluetooth = true;
    boolean unidadDisco = true;
    String capacidadVentilacion = "Alta";
    String tipoAlimentacion = "Electrica";
    int voltaje = 120;
    int consumoEnergia = 150;
    int controlesCompatibles = 4;
    String colorControl = "Rojo";
    String tipoControl = "Inalambrico";
    int bateriaControl = 100;
    int botonesControl = 16;
    int joysticksControl = 2;
    int gatillosControl = 2;
    boolean conexionInternet = true;
    String cuentaXbox = "Jugador01";
    String perfilJugador = "Gamer";
    ArrayList<String> listaAmigos = new ArrayList<>();
    ArrayList<String> juegosInstalados = new ArrayList<>();
    String juegoEnEjecucion = "Ninguno";
    int espacioDisponible = 500;
    String idiomaSistema = "Español";
    int volumenAudio = 50;
    int brilloPantalla = 80;
    String fondoPantalla = "Gears of War";
    String temaConsola = "Oscuro";
    String disenoExterior = "Edicion especial Gears";
    boolean edicionEspecial = true;
    boolean compatibilidadJuegos = true;
    boolean encendida = false;
    double temperatura = 30;
    String numeroSerie = "XBOX123456";

    public void Encender() {
        encendida = true;
        System.out.println("Xbox encendida");
    }


    public void Apagar() {
        encendida = false;
        System.out.println("Xbox apagada");
    }
    public void Reiniciar() {
        encendida = false;
        encendida = true;
        System.out.println("Xbox reiniciada");
    }
    public void IniciarSesion() {
        System.out.println("Sesion iniciada: " + cuentaXbox);
    }
    public void CerrarSesion() {
        System.out.println("Sesion cerrada");
    }
    public void ConectarInternet() {
        conexionInternet = true;
        System.out.println("Internet conectado");
    }
    public void DesconectarInternet() {
        conexionInternet = false;
        System.out.println("Internet desconectado");
    }
    public void BuscarRedesWiFi() {
        System.out.println("Buscando redes WiFi...");
    }
    public void DescargarJuego() {
        System.out.println("Descargando juego...");
    }
    public void InstalarJuego() {
        juegosInstalados.add("Gears of War");
        System.out.println("Juego instalado");
    }
    public void DesinstalarJuego() {
        juegosInstalados.remove("Gears of War");
        System.out.println("Juego desinstalado");
    }
    public void ActualizarJuego() {
        System.out.println("Juego actualizado");
    }
    public void AbrirJuego() {
        juegoEnEjecucion = "Gears of War";
        System.out.println("Juego abierto");
    }
    public void CerrarJuego() {
        juegoEnEjecucion = "Ninguno";
        System.out.println("Juego cerrado");
    }
    public void PausarJuego() {
        System.out.println("Juego pausado");
    }
    public void ReanudarJuego() {
        System.out.println("Juego reanudado");
    }
    public void GuardarPartida() {
        System.out.println("Partida guardada");
    }
    public void CargarPartida() {
        System.out.println("Partida cargada");
    }
    public void EliminarPartida() {
        System.out.println("Partida eliminada");
    }
    public void ConectarControl() {
        System.out.println("Control conectado");
    }
    public void DesconectarControl() {
        System.out.println("Control desconectado");
    }
    public void SincronizarControl() {
        System.out.println("Control sincronizado");
    }
    public void CargarControl() {
        bateriaControl = 100;
        System.out.println("Control cargado");
    }
    public void ConfigurarControl() {
        System.out.println("Control configurado");
    }

    public void SubirVolumen() {
        if (volumenAudio < 100) {
            volumenAudio += 10;
        }
        System.out.println("Volumen: " + volumenAudio);
    }

    public void BajarVolumen() {
        if (volumenAudio > 0) {
            volumenAudio -= 10;
        }
        System.out.println("Volumen: " + volumenAudio);
    }
    public void SilenciarAudio() {
        volumenAudio = 0;
        System.out.println("Audio silenciado");
    }
    public void ReproducirSonido() {
        System.out.println("Reproduciendo sonido");
    }
    public void CambiarIdioma() {
        idiomaSistema = "Ingles";
        System.out.println("Idioma cambiado");
    }
    public void CambiarFondo() {
        fondoPantalla = "Gears 5";
        System.out.println("Fondo cambiado");
    }
    public void CambiarTema() {
        temaConsola = "Claro";
        System.out.println("Tema cambiado");
    }
    public void AjustarBrillo() {
        brilloPantalla = 100;
        System.out.println("Brillo ajustado");
    }
    public void AjustarResolucion() {
        resolucionImagen = "4K";
        System.out.println("Resolucion ajustada");
    }
    public void CapturarPantalla() {
        System.out.println("Captura de pantalla realizada");
    }
    public void GrabarVideo() {
        System.out.println("Grabando video del juego");
    }
    public void CompartirCaptura() {
        System.out.println("Captura compartida");
    }
    public void EnviarMensaje() {
        System.out.println("Mensaje enviado");
    }
    public void AgregarAmigo() {
        listaAmigos.add("Nuevo amigo");
        System.out.println("Amigo agregado");
    }
    public void EliminarAmigo() {
        listaAmigos.remove("Nuevo amigo");
        System.out.println("Amigo eliminado");
    }
    public void InvitarJugador() {
        System.out.println("Jugador invitado");
    }
    public void UnirseAPartida() {
        System.out.println("Uniendose a la partida");
    }
    public void CrearPartida() {
        System.out.println("Partida creada");
    }
    public void BuscarJugadores() {
        System.out.println("Buscando jugadores");
    }
    public void AbrirTienda() {
        System.out.println("Tienda Xbox abierta");
    }
    public void ComprarJuego() {
        juegosInstalados.add("Nuevo juego");
        System.out.println("Juego comprado");
    }
    public void ConsultarAlmacenamiento() {
        System.out.println("Espacio disponible: " + espacioDisponible + " GB");
    }
    public void LiberarEspacio() {
        espacioDisponible += 100;
        System.out.println("Espacio liberado");
    }
    public void ExpulsarDisco() {
        System.out.println("Disco expulsado");
    }
    public void ActualizarSistema() {
        sistemaOperativo = "Xbox OS actualizado";
        System.out.println("Sistema actualizado");
    }
    public void ConfigurarPrivacidad() {
        System.out.println("Privacidad configurada");
    }

    public void MostrarInfo() {
        System.out.println("===== INFORMACION DE MI XBOX =====");

        System.out.println("Marca: " + marcaa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Almacenamiento: " + capacidadAlmacenamiento + " GB");
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Procesador: " + procesador);
        System.out.println("Tarjeta grafica: " + tarjetaGrafica);
        System.out.println("Resolucion: " + resolucionImagen);
        System.out.println("Conexion WiFi: " + conexionWiFi);
        System.out.println("Bluetooth: " + conexionBluetooth);
        System.out.println("Color del control: " + colorControl);
        System.out.println("Bateria del control: " + bateriaControl + "%");
        System.out.println("Juego actual: " + juegoEnEjecucion);
        System.out.println("Idioma: " + idiomaSistema);
        System.out.println("Volumen: " + volumenAudio);
        System.out.println("Fondo: " + fondoPantalla);
        System.out.println("Edicion especial: " + edicionEspecial);
        System.out.println("Temperatura: " + temperatura + " grados");
        System.out.println("Numero de serie: " + numeroSerie);

        System.out.println("==================================");
    }

}
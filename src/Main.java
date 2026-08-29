// Ficha Técnica Laptop

void main() {

    // Variables declaradas con los 8 tipos de datos primitivos
    String modeloLaptop = "MacBookPro 15.1";
    String sistemaOperativo = "MacOS Sequoia 15.7.9";
    String tamañoPantalla = "15.4 Pulgadas";
    String tipoProcesador = "Intel Core i7-9750H";
    String tipoMemoria = "DDR4";
    String tarjetaGrafica = "Radeon Pro";
    char logoLaptop = '\uF8FF'; // Logo en caractér
    double pesoLaptop = 1.83; // Kg
    double grosorLaptop = 1.55; // cm
    double anchoLaptop = 34.93; // cm
    float velocidadProcesador = 2.6F; // GHz
    float entradaAudio = 3.5F; //mm
    byte vram = 4; // GB
    byte ram = 32; // GB
    short almacenamiento = 256; // GB
    short versionTarjetaGrafica = 560;
    int pixelesAncho = 2880;
    int pixelesAlto = 1800;
    long totalPixeles = 5_184_000L;
    boolean esFuncional = true;
    String [] programas = {"Brave", "Steam", "Discord", "IntelliJ IDEA", "VSCode", "Apple Music"};

    System.out.println("--------------------------------------------");
    System.out.println("Características del Sistema");
    System.out.println("Modelo del Equipo: " + modeloLaptop + " (2019)");
    System.out.println("Sistema Operativo: " + sistemaOperativo + " " + logoLaptop);
    System.out.println("--------------------------------------------");
    System.out.println("Gráficos");
    System.out.println("Pantalla: " + tamañoPantalla);
    System.out.println("Resolución: " + pixelesAncho + " x " + pixelesAlto + " píxeles");
    System.out.println("Pixeles totales: " + totalPixeles);
    System.out.println("Tarjeta Gráfica: " + tarjetaGrafica + " " + versionTarjetaGrafica + "X" + " (" + vram + "GB" + ")");
    System.out.println("--------------------------------------------");
    System.out.println("Memoria: " + ram + " GB" + " " + tipoMemoria);
    System.out.println("Procesador: " + tipoProcesador + " " + velocidadProcesador + "GHz" );
    System.out.println("--------------------------------------------");
    System.out.println("Almacenamiento");
    System.out.println("Disco Duro Interno: " + almacenamiento + " GB");
    System.out.println("--------------------------------------------");
    System.out.println("Características del Hardware");
    System.out.println("Peso: " + pesoLaptop + " Kg");
    System.out.println("Ancho: " + anchoLaptop + " cm");
    System.out.println("Grosor: " + grosorLaptop + " cm");
    System.out.println("Entrada de " + entradaAudio + " mm para audífonos");
    System.out.println("Tres micrófonos incluidos");
    System.out.println("Bocinas estéreo con un amplio rango dinámico");
    System.out.println("Cámara FaceTime HD (integrada)");
    System.out.println("El equipo es funcional? " +  esFuncional);
    System.out.println("--------------------------------------------");
    System.out.println("Aplicaciones Instaladas");
    System.out.println(programas [0] + ", " +  programas [1] + ", " + programas [2] + ", " +  programas [3] + ",");
    System.out.println(programas [4] +  ", " +  programas [5]);
    System.out.println("--------------------------------------------");

}
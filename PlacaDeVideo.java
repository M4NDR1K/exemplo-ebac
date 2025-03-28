/**
 * Classe que representa uma placa de vídeo NVIDIA RTX 4090.
 * Possui atributos como modelo, memória e temperatura, além de métodos para ligar, desligar e monitorar a temperatura.
 */
public class PlacaDeVideo {
    private String modelo;
    private int memoriaVRAM; // Memória em GB
    private int temperatura; // Temperatura em graus Celsius
    private boolean ligada;

    // Construtor da classe
    public PlacaDeVideo(String modelo, int memoriaVRAM) {
        this.modelo = modelo;
        this.memoriaVRAM = memoriaVRAM;
        this.temperatura = 30; // Temperatura inicial em 30°C
        this.ligada = false; // Começa desligada
    }

    // Método para ligar a placa de vídeo
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A " + modelo + " foi ligada.");
        } else {
            System.out.println("A placa de vídeo já está ligada.");
        }
    }

    // Método para desligar a placa de vídeo
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("A " + modelo + " foi desligada.");
        } else {
            System.out.println("A placa de vídeo já está desligada.");
        }
    }

    // Método para verificar a temperatura
    public void monitorarTemperatura() {
        if (ligada) {
            temperatura += 10; // A temperatura sobe quando a placa está em uso
            System.out.println("Temperatura atual: " + temperatura + "°C");
        } else {
            System.out.println("A placa de vídeo está desligada, temperatura estável.");
        }
    }

    // Método para exibir informações da placa
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Memória: " + memoriaVRAM + "GB, Temperatura: " + temperatura + "°C");
    }

    public static void main(String[] args) {
        PlacaDeVideo minhaPlaca = new PlacaDeVideo("NVIDIA RTX 4090", 24);
        minhaPlaca.exibirInfo();
        minhaPlaca.ligar();
        minhaPlaca.monitorarTemperatura();
        minhaPlaca.desligar();
    }
}

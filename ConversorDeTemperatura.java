import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (ºC): ");
        double celsius = scanner.nextDouble();

        // Realiza as conversões para Fahrenheit e Kelvin
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe os resultados na tela
        System.out.println("-------------------------------------------------");
        System.out.println("Resultados da Conversão:");
        System.out.println("Temperatura em Celsius = " + String.format("%.2f", celsius) + " ºC");
        System.out.println("Temperatura em Fahrenheit = " + String.format("%.2f", fahrenheit) + " ºF");
        System.out.println("Temperatura em Kelvin = " + String.format("%.2f", kelvin) + " K");
        System.out.println("-------------------------------------------------");

        // Fecha o objeto Scanner
        scanner.close();
    }
}
import java.util.Scanner;

public class CalculadoraNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("Olá! Vamos calcular suas notas anuais.");
        System.out.println("Por favor, digite suas 8 notas, uma de cada vez:");

        // Coleta as 8 notas do usuário
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
        }

        // Calcula as médias bimestrais
        double mediaBimestre1 = (notas[0] + notas[1]) / 2.0;
        double mediaBimestre2 = (notas[2] + notas[3]) / 2.0;
        double mediaBimestre3 = (notas[4] + notas[5]) / 2.0;
        double mediaBimestre4 = (notas[6] + notas[7]) / 2.0;

        // Calcula as médias semestrais
        double mediaSemestre1 = (mediaBimestre1 + mediaBimestre2) / 2.0;
        double mediaSemestre2 = (mediaBimestre3 + mediaBimestre4) / 2.0;

        // Calcula a média final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2.0;

        // ---
        
        System.out.println("\n--- Resumo das suas notas ---");

        // Exibe as médias bimestrais do 1º semestre
        System.out.printf("1º Bimestre = %.1f; 2º Bimestre = %.1f; 1º Semestre = %.1f\n", 
            mediaBimestre1, mediaBimestre2, mediaSemestre1);

        // Exibe as médias bimestrais do 2º semestre
        System.out.printf("3º Bimestre = %.1f; 4º Bimestre = %.1f; 2º Semestre = %.1f\n", 
            mediaBimestre3, mediaBimestre4, mediaSemestre2);
        
        // Exibe a média final
        System.out.printf("Média Final = %.1f\n", mediaFinal);

        scanner.close();
    }
}
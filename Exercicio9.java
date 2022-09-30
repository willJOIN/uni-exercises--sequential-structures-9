import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        float temperaturaF = 0;

        System.out.println("Digite a temperatura em Fahrenheit:\n");

        try {
            Scanner scanner1 = new Scanner(System.in);
            temperaturaF = scanner1.nextFloat();
            scanner1.close();
        } catch (Exception ex) {
            System.out.println("Erro ao pegar temperaturaF no exercicio4():\n" + ex);
        }
        System.out.println("A temperatura em Celsius de " + temperaturaF + " Fahrenheit eh:\n" + (int) (5 * ((temperaturaF - 32) / 9)) + " C.");
    }
}
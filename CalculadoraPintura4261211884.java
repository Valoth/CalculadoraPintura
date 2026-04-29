import java.util.Scanner;

public class CalculadoraPintura4261211884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura = 2.70, largura = 0, area = 0, desconto = 0, quantidadeLitros = 0;

        System.out.print("Digite a largura da parede (em metros): ");
        largura = scanner.nextDouble();

        area = (largura * altura) * 4;
        desconto = area * 0.90;
        quantidadeLitros = desconto / 10;

        System.out.println("Área da parede: " + area + " m²");
        System.out.println("Desconto: " + desconto + " m²");
        System.out.println("Quantidade de litros de tinta necessários: " + quantidadeLitros + " litros");

        scanner.close();
    }
}
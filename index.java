import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.print("Informe as horas: ");
        int horas = prompt.nextInt();
        System.out.print("Informe os minutos: ");
        int minutos = prompt.nextInt();
        System.out.print("Informe os segundos: ");
        int segundos = prompt.nextInt();
        int resultado = (horas*60*60) + (minutos*60) + segundos;
        System.out.println("Resultado em Segundos: "+resultado);

    }
}
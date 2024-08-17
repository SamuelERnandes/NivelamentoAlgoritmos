import java.util.Scanner;

public class calculoDeReajusteDeSalario {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.print("Digite seu Salario: ");
        double salario = prompt.nextDouble();
        //quem ganha  ate 1412 - reajuste de 12%
        //quem ganha ate 3000 - reajuste de 9%
        //quem ganha ate 5000 - reajuste de 100%
        //quem ganha mais de 5000 - sem reajuste

        if(salario <= 1412) {
            System.out.println(salario + salario * 0.12);
        }else if(salario <=3000) {
            System.out.println(salario + salario* 0.09);
        }else if(salario <=5000){
            System.out.println(salario + salario * 0.05);
        }else {
            System.out.println("Sem reajuste");
        }


        System.out.println("Resultado"+salario);
    }
}

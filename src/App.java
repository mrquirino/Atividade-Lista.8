import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner e = new Scanner(System.in);

       double vh, sal;
       int hm;
       System.out.println("Digite o valor das horas: ");
       vh = e.nextDouble();
       System.out.println("Digite o valor das de trabalho por mes:  ");
       hm = e.nextInt();
       sal = vh*hm;
       System.out.println("O total do salario deste mes e: " + sal);

    }
}

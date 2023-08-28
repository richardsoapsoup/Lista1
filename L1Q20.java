import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner salario = new Scanner(System.in);
     System.out.print("Digite o quanto ganha por hora: ");
     double ganho = salario.nextFloat();
    
     System.out.print("Digite quantas horas trabalhou esse mes: ");
     int horas = salario.nextInt();
     
     double salBruto = ganho * horas;
     double descontoN = salBruto * 0.08;
     double descontoS = salBruto * 0.05;
     double descontoI = salBruto * 0.11;
     
    System.out.printf("Salario bruto = %f", salBruto);
    System.out.printf("Descontado da NSS = %f", descontoN);
    System.out.printf("Descontado do sindicato = %f", descontoS);
    
    System.out.printf("Salario liquido = %f", salBruto - (descontoN + descontoS + descontoI));
    
      
    }
}
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner nota = new Scanner(System.in);
     System.out.print("Digite a 1º nota: ");
     float nota1 = nota.nextFloat();
    
     System.out.print("Digite a 2º nota: ");
     float nota2 = nota.nextFloat();
     
     System.out.print("Digite a 3º nota: ");
     float nota3 = nota.nextFloat();
    
     System.out.print("Digite a 4º nota: ");
     float nota4 = nota.nextFloat();
     
     float media = (nota1 + nota2 + nota3 + nota4) / 4;
     
     System.out.print(media);
     
      
    }
}
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double n1,n2,n3,n4;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Digite sua primeira nota:");
    n1 = in.nextDouble();
    
    System.out.println("Digite sua segunda nota:");
    n2 = in.nextDouble();
    
    System.out.println("Digite sua terceira nota:");
    n3 = in.nextDouble();
    
    System.out.println("Digite sua quarta nota:");
    n4 = in.nextDouble();

    double soma = n1+n2+n3+n4;
    double media = soma/4;

    if(media >= 7){
      System.out.println("Voce foi aprovado, sua media foi de "+ media);
    }else{
      System.out.println("Voce foi reprovado, sua media foi de "+ media);
    }

  }
}

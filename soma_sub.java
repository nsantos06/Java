import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  Scanner ler = new Scanner( System.in );
  int n1,n2,soma,sub;

  System.out.println("Digita um numero:");
  n1 = ler.nextInt();
  System.out.println("Digita outro numero:");
  n2 = ler.nextInt();

  soma = n1 + n2;
  System.out.println("A soma é:" + soma);

  sub = n1-n2;
  System.out.println("A sub é:" + sub);

  }
}

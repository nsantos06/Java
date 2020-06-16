import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  Scanner ler = new Scanner( System.in );
  double n1,n2,soma,sub,div,mt;

  System.out.println("Digita um numero:");
  n1 = ler.nextDouble();
  System.out.println("Digita outro numero:");
  n2 = ler.nextDouble();

  soma = n1 + n2;
  System.out.println("A soma é:" + soma);

  sub = n1-n2;
  System.out.println("A subtracao é:" + sub);

  div = n1/n2;
  System.out.println("A divisao é:" + div);

  mt = n1*n2;
  System.out.println("A multiplicacao é:" + mt);


  }
}

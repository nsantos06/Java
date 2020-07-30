import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double n1,n2;
    int choose;

    Scanner in = new Scanner(System.in);
    
    System.out.println("Digite o primeiro numero");
    n1 = in.nextDouble();
    
    System.out.println("Digite o segundo numero");
    n2 = in.nextDouble();

    System.out.println("Digite 1 para soma, 2 para subtracao, 3 para multiplicacao e 4 para divisao: ");
    choose = in.nextInt();

    if(choose == 1){
      double soma = n1+n2;
      System.out.println("Os numeros somados sao: "+ soma);
    }
    else if(choose == 2){
      double sub = n1-n2;
      System.out.println("Os numeros subtraidos sao: "+ sub);
    }
    else if(choose == 3 ){
      double mt = n1 * n2;
      System.out.println("Os numeros multiplicados sao: "+ mt);
    }
    else if(choose == 4){
      double div = n1/n2;
      System.out.println("os numeros divididos sao: "+ div);
    }


  }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    
    switch(num){
      case 1:
        System.out.print("Podaj liczbe 1");
        System.out.print("Podaj liczbe 2");
        Scanner sc = new Scanner(System.in);
        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();

        Double x = Math.pow(num1, num2);
        System.out.println(x);
        
        break;
      case 2:
        System.out.print("Podaj liczbe 1");
        System.out.print("Podaj liczbe 2");
        Scanner sca = new Scanner(System.in);
        int num3 = sca.nextInt();
        int num4 = sca.nextInt();

        Double x2 = Math.sqrt(num3) + Math.sqrt(num4);
        System.out.println(x2);
        
        break;
        case 3:
        System.out.print("Podaj liczbe 1");
        System.out.print("Podaj liczbe 2");
        Scanner sca3 = new Scanner(System.in);
        int num5 = sca3.nextInt();
        int num6 = sca3.nextInt();

        if (num5 > num6){
            System.out.println(num5);
          }
        else {
            System.out.println(num6);
          }
        
        break;
        
        case 4:
        System.out.print("Podaj liczbe 1");
        System.out.print("Podaj liczbe 2");
        Scanner sca4 = new Scanner(System.in);
        Double num7 = sca4.nextDouble();
        Double num8 = sca4.nextDouble();

        if (num8 == 0){
          System.out.print("nie dziel przez zero");
          break;
        } 
        Double x4 = num7/num8;
        System.out.print(x4);
        break;
    }
  }
}
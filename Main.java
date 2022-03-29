import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner (System.in);
    System.out.print("Im wieksza liczba n tym wieksza choinka. Liczba n: ");
    n = scanner.nextInt();
    for(int i=0;i<n;i++)
      {
        for(int j=0;j<i;j++)
          {
            System.out.print("*");
          }
        System.out.println(" ");
      }
    
    
  }
}
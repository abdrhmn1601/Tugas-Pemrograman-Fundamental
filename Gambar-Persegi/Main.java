import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int bintang = input.nextInt();
    
    for (int i = 0; i < bintang; i++){
      for (int j = 0; j < bintang; j++){
        System.out.print("");
      }
      System.out.println("");
    }
  }
}
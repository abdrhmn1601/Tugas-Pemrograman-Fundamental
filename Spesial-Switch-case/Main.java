import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int paket = input.nextInt();
        
    switch ( paket ) {
      case 1:
       System.out.println("Satu\nDua\nTiga");
         break;
      case 2:
       System.out.println("Dua\nTiga");
          break;
      case 3:
        System.out.println("Tiga");
          break;
       } 
  }
}
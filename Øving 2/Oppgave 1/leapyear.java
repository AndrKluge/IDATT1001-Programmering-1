import java.util.Scanner;
class leapyear{

    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn et årstall: ");
        int year = input.nextInt();
        input.close();

        if ((year%100==0 && year%400==0)||year%4 == 0 && year%100 !=0){
            System.out.println(year + " er ett skuddår");
        }
        else{
            System.out.println(year + " er IKKE ett skuddår");
        }
    }
}

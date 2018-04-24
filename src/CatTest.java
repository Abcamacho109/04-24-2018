import java.util.Scanner;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


Cat [] animals = new Cat [3];
Scanner scan = new Scanner (System.in);

System.out.println("Please enter a cat breed and a name");


for(int i = 0; i<3; i++){

Cat blue = new Cat (scan.nextLine() ,scan.nextLine());

animals [i] = blue;


}
	System.out.println(animals[1].Name);
System.out.println(animals[1].Breed);}

}

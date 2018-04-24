import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game [] play = new Game [5];
		
		
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please eneter the Name, Genre and Rating");
		Game game1 = new Game ("Mortal Kombat","Action",8);
		Game game2 = new Game ("Grand Theft Auto 5","Adeventure",9);
		Game game3 = new Game ("Toy Story","Crime",7);
		Game game4 = new Game ("Watch Dogs","Action",5);
		Game game5 = new Game ("Cinderella","Crimes",8);
		
		
		// create an array 
		Game [] players = {game1,  game2,  game3  , game4 , game5 };
		
		
		
		// ask the user to enter the name of a game 
		System.out.println("Please enter a game");
		String user1 = scan.nextLine();
		
	for(int i = 0; i<5; i++){		
		
		//if else
		if(user1.equals(players[i].Name)){
			System.out.println("Found");
			System.out.println(players[i].Name);
			System.out.println(players[i].Genre);
			System.out.println(players[i].Rating);
		}else{
			System.out.println("Not Found");
		}
		
		
		
		
	}

}
}
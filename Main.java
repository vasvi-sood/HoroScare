import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private int wallet1=500;
	private int wallet2=500;
	static String name="";
	static String opponent="";
	 Map<Integer,IBoard> board;
public int getWallet1() {
		return wallet1;
	}
public String getName()
{
	return name;
	
}
public String getOpponent()
{
	return opponent;
}


	public int getWallet2() {
		return wallet2;
	}

	public void setWallet1(int wallet1) {
		this.wallet1 = wallet1;
	}

	public void setWallet2(int wallet2) {
		this.wallet2 = wallet2;
	}

public static void main(String[] args) throws InterruptedException {
	Scanner in=new Scanner(System.in);
	System.out.println("My name is Vasvi and I'm a witch.\nI'll be guiding you in the journey through Callestelia, the only magic land on earth.\nYou are in an arcade of magical stuff.\nThe streets are bustling with witches and wizards on their brooms.\nUnravel your future as we cross these flashy streets.\n ");
	System.out.println("Tell me your name first");
	
	while(name.equals(""))
	name=in.nextLine();
	System.out.println("Now decide your oponent(enter 1,2,3 or 4)\n1.Talluah\n2.Brunhilda\n3.Bear\n4.Calestene");
	
	
	 int opp = -1;
	do{
	opp=in.nextInt(); 
	switch(opp)
	{
	
	case 1:
		opponent="Talluah";
		break;
	case 2:
		opponent="Brunhilda";
		break;
	case 3:
		opponent="Bear";
		break;
	case 4:
		opponent="Calestene";
		break;
		default:
			opp=-1;
			System.out.println("Please make a valid choice again!");
			
		  }
	  
	} while(opp==-1);
System.out.println("The rules are simple.Spin the dice,shop around but do manage your expenses!");
System.out.println("Whoever saves the most wins.");
System.out.println("Game will end if you or "+opponent+" are broke");
Main m=new Main();
m.add(m);
System.out.println("\nEnter the moves you wish to play");
int moves=in.nextInt();
System.out.println("500 is your initial budget");
System.out.println("1.To spin\n2.To peek into your wallet\n3.To peek into "+opponent+"'s wallet");
System.out.println("===================================================================");


System.out.println();
while(moves-->0)
{

	 System.out.println("\n1-Spin 2-My wallet 3-"+opponent+"'s wallet");
	int ch;
	ch=in.nextInt(); 
	while(ch<1 || ch>3)
	{
		System.out.println("Make a valid choice again!");
		ch=in.nextInt(); 
	}
    m.menu(1,ch);
    if(m.getWallet1()<0)
    	break;
    Thread.sleep(4000);
    System.out.println("\nNow "+opponent+" is spinning");
    Thread.sleep(2000);
    m.menu(2,1);
    if(m.getWallet2()<0)
    	break;
    System.out.println();
    System.out.println("===================================================================");
    System.out.println();
    Thread.sleep(1500);
   
}
System.out.println();
System.out.println("===================================================================");
System.out.println();
if(m.getWallet1()>m.getWallet2())
	System.out.println("Prepare a special dinner, "+name+"'s a winnner.");
else
	if(m.getWallet1()==m.getWallet2())
		System.out.println("You escaped from my claw,it was a draw");
	else
		System.out.println("Sing some hymns "+opponent+" wins.");
// board.put(2,"Today's a lucky day.100 lying on the street");
 
}

void add(Main m)
{
	board=new HashMap<Integer,IBoard>();
	board.put(1,new B1(m));
	board.put(2,new B2(m));
	board.put(3, new B3(m));
	board.put(4, new B4(m));
	board.put(5, new B5(m));
	board.put(6, new B6(m));
	board.put(7, new B7(m));
	board.put(8, new B8(m));
	board.put(9, new B9(m));
	board.put(10, new B10(m));
	board.put(11, new B11(m));
	board.put(12, new B12(m));
	board.put(13, new B13(m));
	board.put(14, new B14(m));
	board.put(15, new B15(m));
	board.put(16, new B16(m));
	board.put(17, new B17(m));
	board.put(18, new B18(m));
	board.put(19, new B19(m));
	board.put(20, new B20(m));
	board.put(21,new B21(m));
}
void menu(int player,int ch)
{
	Scanner in=new Scanner(System.in);
 
	

	while(ch!=1)
	{
		switch(ch)
		{
		
		
		case 2:
			System.out.println(name+"- "+this.getWallet1());
			break;
		case 3:
			System.out.println(opponent+"- "+this.getWallet2());
			break;
		
			default:
				System.out.println("Make a valid choice again!");
				
			  }
		ch=in.nextInt();
		}

	int spin=(int) (Math.random()*21+1);
	
	
	board.get(spin).print(player);
	board.get(spin).function(player);
	
	
		  
	
}
}

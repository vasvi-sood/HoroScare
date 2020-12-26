import java.util.Scanner;

public class B16 implements IBoard {
 Main obj;
	public B16(Main m) {
		obj=m;
	}

	@Override
	public void print(int player) {
	
		System.out.println("Choose a ball (Enter 1 or 2)\n1-Crimson 2-Gold");
		
	}

	@Override
	public void function(int player) {
		Scanner in=new Scanner(System.in);
		String ball = null;
		int ch;
		if(player==1)
		{
			do
		{
			ch=in.nextInt();
		switch(ch)
		{
		case 1:
			ball="crimson";
			break;
		case 2:
			ball="gold";
			break;
		default:
			System.out.println("You have made an invalid choice! Try again");
		}
		}while(ch>2 || ch<1);
		}
		
		else
		{
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			ball="crimson";
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println(obj.getOpponent()+" choose crimson.");
			System.out.println();
			ch=1;
		}
			
		System.out.println("Now you need to enter an amount.The magical hat draws a ball(only gold or crimson).\nIf your colour wins you will get the amount,oterwise your oponent recieves that amount. ");
		int amount;
		
		if(player==1)
		amount=in.nextInt();
		else
		{
			try {
				Thread.sleep(3500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			amount=500;
	  System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println(obj.getOpponent()+" choose 500.");
			System.out.println();
		}
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
			
		int s=(int)(Math.random()*2+1);
		
	   if(ch==s)
	   {
		  
		  System.out.println(ball+" ball was drawn.It's a win!");
		  if(player==1)
				obj.setWallet1(obj.getWallet1()+amount);
				else
				obj.setWallet2(obj.getWallet2()+amount);
	   }
	   else
	   {
		   System.out.println("Bad luck this time.");
		   if(player==1)
			  obj.setWallet2(obj.getWallet2()+amount);
		   else
		   obj.setWallet1(obj.getWallet1()+amount);
			   
	   }
	  

	}

}

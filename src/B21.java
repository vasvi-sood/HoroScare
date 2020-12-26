
public class B21 implements IBoard {
  Main obj;
	public B21(Main m) {
		obj=m;
	}

	@Override
	public void print(int player) {
		if(player==1)
			System.out.println("You lost a bet to "+obj.getOpponent()+" pay 250.");
		else
			System.out.println("You lost a bet to "+obj.getName()+" pay 250.");
	}

	@Override
	public void function(int player) {
	if(player==1)
	{
		obj.setWallet1(obj.getWallet1()-250);
		obj.setWallet2(obj.getWallet2()+250);
	}
	else
	{
		obj.setWallet1(obj.getWallet1()+250);
		obj.setWallet2(obj.getWallet2()-250);
	}
	


	}

}

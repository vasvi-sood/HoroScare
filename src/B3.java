
public class B3 implements IBoard {
	Main obj;
	B3(Main m)
	{
		obj=m;
	}

	@Override
	public void print(int player) {
		
		System.out.println("The street's aren't safe.A pickpocketer robbed your 500. ");
	}

	@Override
	public void function(int player) {
		if(player==1)
			
			obj.setWallet1(obj.getWallet1()-500);
			

	
		else
		
			obj.setWallet2(obj.getWallet2()-500);
			

	}

}

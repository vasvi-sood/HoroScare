
public class B6 implements IBoard {
Main obj;
	public B6(Main m) {
	obj=m;	
	}

	@Override
	public void print(int player) {
		
		System.out.println("Meet the love of your life, buy a love portion worth 450");
	}

	@Override
	public void function(int player) {
		if(player==1)
		obj.setWallet1(obj.getWallet1()-450);
		else
		
			obj.setWallet2(obj.getWallet2()-450);

	}

}

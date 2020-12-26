
public class B11 implements IBoard {
Main obj;
	public B11(Main m) {
		obj=m;
	}

	@Override
	public void print(int player) {
		System.out.println("The finest wizard dining is here.Grab a canaeryCream worth 100");
	}

	@Override
	public void function(int player) {
		if(player==1)
			obj.setWallet1(obj.getWallet1()-100);
			else
			
				obj.setWallet2(obj.getWallet2()-100);

	}

}

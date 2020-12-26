
public class B9 implements IBoard {
Main obj;
	public B9(Main obj) {
		this.obj=obj;
	}

	@Override
	public void print(int player) {
	     
		System.out.println("It's getting chilly, grab a butterbear pay 75.");
	}

	@Override
	public void function(int player) {
		if(player==1)
			obj.setWallet1(obj.getWallet1()-75);
			else
			
				obj.setWallet2(obj.getWallet2()-75);
	}

}

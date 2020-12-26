
public class B19 implements IBoard {
    Main obj;
	public B19(Main obj) {
		this.obj=obj;
	}

	@Override
	public void print(int player) {
		System.out.println("Buy whiskey that tastes devine, from the stars.Pay 150.");

	}

	@Override
	public void function(int player) {
		if(player==1)
			obj.setWallet1(obj.getWallet1()-150);
			else
				obj.setWallet2(obj.getWallet2()-150);
	}

}

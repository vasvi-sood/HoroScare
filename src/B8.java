
public class B8 implements IBoard {
 Main obj;
	public B8(Main obj) {
		this.obj=obj;
	}

	@Override
	public void print(int player) {
		
		System.out.println("You'll never have a scary dream again.Buy a blue or voilent or maybe crimson dreamcatcher.");
	}

	@Override
	public void function(int player) {
		System.out.println("Pay Rs 350");
		if(player==1)
		obj.setWallet1(obj.getWallet1()-350);
		else
		
			obj.setWallet2(obj.getWallet2()-350);
	}

}

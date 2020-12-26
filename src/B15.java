
public class B15 implements IBoard {
 Main  obj;
	public B15(Main m) {
		obj=m;
	}

	@Override
	public void print(int player) {
		System.out.println("Tried out the latest collection from whimsicle. Grab youir favourite popsicle for just 50");

	}

	@Override
	public void function(int player) {
		if(player==1)
			obj.setWallet1(obj.getWallet1()-50);
			else
			
				obj.setWallet2(obj.getWallet2()-50);

	}

}

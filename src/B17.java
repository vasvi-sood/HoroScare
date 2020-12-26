
public class B17 implements IBoard {
Main obj;
	public B17(Main m) {
		obj=m;
	}

	@Override
	public void print(int player) {
		System.out.println("You are getting married in the royal wizarding family.You recieve 500 as a gift");

	}

	@Override
	public void function(int player) {
		if(player==1)
			obj.setWallet1(obj.getWallet1()+500);
			else
			
				obj.setWallet2(obj.getWallet2()+500);

	}

}

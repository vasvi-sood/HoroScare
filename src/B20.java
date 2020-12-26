
public class B20 implements IBoard {
    Main obj;
	public B20(Main m) {
		obj=m;
	}

	@Override
	public void print(int player) {
		System.out.println("Your broom got broken. No worries when the best magician jonathan is here.Pay 100");

	}

	@Override
	public void function(int player) {
		if(player==1)
			obj.setWallet1(obj.getWallet1()-100);
			else
				obj.setWallet2(obj.getWallet2()-100);

	}

}

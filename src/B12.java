
public class B12 implements IBoard {
Main obj;
	public B12(Main m) {
		obj=m;
	}

	@Override
	public void print(int player) {
		System.out.println("It's time to board your broom. 100 credited to your wallet");
		System.out.println("Spinning again, and going to another place!");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.menu(player,1);
	}

	@Override
	public void function(int player) {
		if(player==1)
			obj.setWallet1(obj.getWallet1()+100);
			else
			
				obj.setWallet2(obj.getWallet2()+100);

	}

}

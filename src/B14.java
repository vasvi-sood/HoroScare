
public class B14 implements IBoard {
 Main obj;
	public B14(Main obj) {
		this.obj=obj;
	}

	@Override
	public void print(int player) {
		System.out.println("Mirror, Mirror whose the pretiest of all...."
				+ " Offcourse you are.");
        System.out.println("But trying out the latest cosmetics will surely not hurt.Pay 150");
	}

	@Override
	public void function(int player) {
		if(player==1)
			obj.setWallet1(obj.getWallet1()-150);
			else
			
				obj.setWallet2(obj.getWallet2()-150);
	
	}

}

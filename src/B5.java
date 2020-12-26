
public class B5 implements IBoard {
 Main obj;
	public B5(Main obj) {
	this.obj=obj;
	}

	@Override
	public void print(int player) {
		// TODO Auto-generated method stub
		System.out.println("I just read you palm and I'm horrified you are going to die!");
	}

	@Override
	public void function(int player) {
	 if(player==1)
		 obj.setWallet1(-500);
	 else
		 obj.setWallet2(-500);

	}

}

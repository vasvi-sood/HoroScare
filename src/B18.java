
public class B18 implements IBoard {
  Main obj;
	public B18(Main obj) {
		this.obj=obj;
	}

	@Override
	public void print(int player) {
		System.out.println("Empathy is a wizard's most important quality. A homeless seeks you help.Help him with 500");
	}

	@Override
	public void function(int player) {
		if(player==1)
			obj.setWallet1(obj.getWallet1()-500);
			else
			
				obj.setWallet2(obj.getWallet2()-500);

	}

}

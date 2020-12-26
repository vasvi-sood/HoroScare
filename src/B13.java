
public class B13 implements IBoard {
Main obj;
	public B13(Main obj) {
		this.obj=obj;
	}

	@Override
	public void print(int player) {
		System.out.println("Warewolves want to hunt.Sit back and miss 1 turn.");
		
	}

	@Override
	public void function(int player) {
	
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println();
		if(player==1)
			System.out.println(obj.getOpponent()+"'s turn......");
		else
			System.out.println(obj.getName()+"'s turn......");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		int spin;
	do
	{
		spin=(int) (Math.random()*21+1);	
	}while(spin==13);
		obj.board.get(spin).print(3-player);
 obj.board.get(spin).function(3-player);
		
}
}
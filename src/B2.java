
public class B2 implements IBoard {
  Main obj;
	public B2(Main obj) {
		this.obj=obj;
	}

	@Override
	public void print(int player){
		// TODO Auto-generated method stub
		System.out.println("It's a lucky day! 100 lying on the street are all yours nows");
	}

	@Override
	public void function(int player) {
		if(player==1)
		
			obj.setWallet1(obj.getWallet1()+100);
			

	
		else
		
			obj.setWallet2(obj.getWallet2()+100);
			
			
		
		
		}

	

}

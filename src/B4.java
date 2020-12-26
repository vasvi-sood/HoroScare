
public class B4 implements IBoard {
 Main obj;
	public B4(Main obj) {
		this.obj=obj;
	}

	@Override
	public void print(int player) {
		
		System.out.println("Your horoscope says, you'll recieve money today.");
	}

	@Override
	public void function(int player) {
if(player==1)
			
			obj.setWallet1(obj.getWallet1()+150);
			

	
		else
		
			obj.setWallet2(obj.getWallet2()+150);
  System.out.println("Rs 150 credited");
  
	}

}

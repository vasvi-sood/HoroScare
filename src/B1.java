
 public class B1 implements IBoard{
	 Main obj;
	 B1(Main obj)
	 {
		this.obj=obj; 
	 }


@Override
public void print(int player) {
	
	System.out.println("It's Time we assign some budget.");
	
}

@Override
public void function(int player) {
	int no=(int) (Math.random()*9+1);
	String name;
	int money;
	if(player==1)
	{
		obj.setWallet1(obj.getWallet1()+no*100);
		
		name=obj.getName();

	}
	else
	{
		obj.setWallet2(obj.getWallet2()+no*100);
		
		name=obj.getOpponent();
	
	}
	
	System.out.println("My Crystal Ball tells me to add "+no*100+" to "+ name+"'s wallet.");
	
}
}

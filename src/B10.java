
public class B10 implements IBoard {
	int visit1;
	int visit2;
  Main obj;

	public B10(Main obj) {
		this.obj=obj;
	}

	@Override
	public void print(int player) {
		if(player==1)
		{
		if(visit1==0)
		{
			visit1++;
		System.out.println("Your stars say,you'll be a great fortune teller one day.Take a course on astrology, pay 350.");
		
		}
		else
		{
			visit1 ++;
		System.out.println("Your astrology course paid off. "+Integer.toString(visit1-1)+" customers visited.");	
		}
		}
		else
		{
		if(visit2==0)
		{
			visit2++;
		System.out.println("Your stars say,you'll be a great fortune teller one day.Take a course on astrology, pay 350.");
		
		}
		else
		{
			visit2 ++;
			System.out.println("Your astrology course paid off. "+Integer.toString(visit2-1)+" customers visited.");	
		}
		}	
	}

	@Override
	public void function(int player) {
		
		
			if(player==1)
			{
				if(visit1==1)
				obj.setWallet1(obj.getWallet1()-350);
				else
				{
					System.out.println((visit1-1)*100+" added to your wallet.");
					obj.setWallet1(obj.getWallet1()+(visit1-1)*100);
				}
			}
				else
				
				{	
					
					if(visit2==1)
						obj.setWallet2(obj.getWallet2()-350);
						else
						{
							System.out.println((visit2-1)*100+" added to your wallet.");
							obj.setWallet2(obj.getWallet2()+(visit2-1)*100);
						}
					}
    
				}
	}



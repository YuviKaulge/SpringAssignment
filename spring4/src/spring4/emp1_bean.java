package spring4;

public class emp1_bean 
{
	
	private Manager many;
	
	 public void setMany(Manager many)
	 {
		 System.out.println("-----using setter for  @bean-----");
			this.many = many;                   //setter injection using bean
		
	 }

	
//	public emp1_bean(Manager many) 
//	{
//	System.out.println("-----using constructor for  @bean-----");	          //constructor injection using bean
//		this.many = many;
//	}
	
	 public	emp1_bean()
	{
		System.out.println(" good morning from default constructor");
	}
	 
     public void display()
	{
	   many.disply();
	   System.out.println("who are u ?i am employee2 class");	
	}

}

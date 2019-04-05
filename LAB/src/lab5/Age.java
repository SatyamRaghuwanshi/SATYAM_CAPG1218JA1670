package lab5;


	class MyException1 extends Exception
	{

		public void printMessage()
		{
			System.out.println("Enter age between 0 to 100");
		}
	}

	public class Age {
		private int age;
		public void setAge(int age) throws MyException1
		{
			if(age>0 && age<100)
			{
				this.age=age;
				System.out.println("age is "+ this.age);
			}
			else
			{
				throw new MyException1();
			}
		}
		public static void main(String args[]) throws MyException1
		{
			Age Age=new Age();
			try {
				Age.setAge(4);
				Age.setAge(-1);
				
			} catch (MyException1 e) {
				
				e.printMessage();
				}

		}
	}



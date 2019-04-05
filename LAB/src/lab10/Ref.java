package lab10;

interface Reference
{
	public void get();
}
class Refe
{
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void get() {
		System.out.println("ID's"+"\t"+"Names");
		System.out.println(id+"\t"+name);
	}
	
}
public class Ref {

	public static void main(String[] args)
	{
		Refe re=new Refe();
		re.setId(1);
		re.setName("Satyam");
		Reference r=re::get;
		r.get();
	}
}


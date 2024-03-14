package Strings;

final class Immutable {
	
	final int id;
	final String name;
	
	Immutable(int i, String n) {
		this.id = i;
		this.name = n;
	}
	 void run()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Immutable im = new Immutable(2,"Ammu");
		Immutable im2 = new Immutable(4,"kuricheti");
		im.run();
		im2.run();	
	}
}

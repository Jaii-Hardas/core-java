package junglebook;

public class game {
	public static void main(String[] args)
	{
		bear b= new bear();
		b.name="ballo";
		b.drink();
		b.eat();
		b.hunt();
		b.sleep();
		b.walk();
		
		elephant h= new elephant();
		h.name="winifred";
		h.drink();
		h.eat();
		h.trumpet();
		h.sleep();
		h.walk();
		
		tiger t= new tiger();
		t.name="sherkhan";
		t.drink();
		t.eat();
		t.roar();
		t.sleep();
		t.walk();
		
		wolf w= new wolf();
		w.name="baghera";
		w.drink();
		w.eat();
		w.whistle();
		w.sleep();
		w.walk();
		
	}
}

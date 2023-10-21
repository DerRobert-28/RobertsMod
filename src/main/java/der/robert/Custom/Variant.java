package der.robert.Custom;
//
//	JAVA
//
import java.lang.String;


public class Variant {

	public static Variant use() { return new Variant(); }

	private boolean b = false;
	public boolean isFalse() { return (this.b == false); }
	public boolean isTrue() { return this.b; }

	private char c = '\0';
	public char getc() { return this.c; }

	private double d = 0.0;
	public double valueOf() { return this.d; }
	
	private int i = 0;
	public int get() { return i; }

	private long l = 0l;
	public long lget() { return l; }

	private String s = "";
	public String get$() { return s; }

	public void ctoi() { this.i = (int)this.c; }
	public void dec() { this.i--; }
	public void decl() { this.l--; }
	public void inc() { this.i++; }
	public void incl() { this.l++; }
	public void itoc() { this.c = (char)this.i; }
	public void itol() { this.l = (long)this.i; }
	public void let(double d) { this.d = d; }
	public void lset(int l) { this.l = l; }
	public void ltoi() { this.i = (int)this.l; }
	public void neg() { this.i = -this.i; }
	public void negate() { this.b = (this.b == false); }
	public void negl() { this.l = -this.l; }
	public void set(int i) { this.i = i; }
	public void set$(String s) { this.s = s; }
	public void setc(char c) { this.c = c; }
	public void setFalse() { this.b = false; }
	public void setTrue() { this.b = true; }
	public void toggle() { this.negate(); }

	private Variant() {};
}

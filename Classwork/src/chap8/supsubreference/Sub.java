package chap8.supsubreference;

public class Sub extends Super{
	int b;
	
	Sub(int i, int j){
		super(j);
		b = i;
	}
}
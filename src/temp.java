import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class temp {
	public static long horners(List<Integer> coeff, int x) {
		Collections.reverse(coeff);
		Integer accum = coeff.get(0);
		for(int i = 1; i < coeff.size(); i++) {
			accum = (accum * x) + (Integer)coeff.get(i);
		}
		return accum;
	}
	public static void main(String[] args) {
		List<Integer> co = new ArrayList<Integer>();
		co.add(-19);
		co.add(7);
		co.add(-4);
		co.add(6);
		System.out.println(horners(co, 3));
	}
}
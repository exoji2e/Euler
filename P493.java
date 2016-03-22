import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P493 extends EulerProblem{
	private class State {
		double prob;
		int dist;
		Integer [] st;
		int left;
		public State(Integer[] in, double prob, int left) {
			dist = 7;
			st = new Integer[dist];
			for(int i = 0; i<dist; i++) {
				st[i] = in[i];
			}
			this.prob = prob;
			this.left = left;
		}
		public ArrayList<State> add() {
			ArrayList<State> states = new ArrayList<State>();
			for(int i = 0; i<dist; i++) {
				Integer[] put = new Integer[dist];
				for(int j = 0; j<dist; j++) {
					put[j] = st[j];
				}
				put[i]++;
				Arrays.sort(put, Collections.reverseOrder());
				if(10-st[i] != 0) {
					states.add(new State(put,prob*(10-st[i])/left,left-1));
				}
				
			}
			return states;
		}
		public boolean equals(State s) {
			for(int i = 0; i<dist; i++) {
				if(st[i] != s.st[i]) {
					return false;
				}
			}
			return true;
		}
		public int distinct() {
			for(int i = 0; i<dist; i++) {
				if(st[i] == 0) {
					return i;
				}
			}
			return dist;
		}
	}
	public P493 (){
		problemNumber = 493;
	}

	@Override
	//This should definitely be done with an array instead.
	protected void execute() {
		Integer[] startarr = {1,0,0,0,0,0,0};
		State a = new State(startarr, 1, 69);
		ArrayList<State> currentS = new ArrayList<State>();
		currentS.add(a);
		
		for(int i = 1; i<20; i++) {
			ArrayList<State> newS = new ArrayList<State>();
			for(State s: currentS) {
				ArrayList<State> sa = s.add();
				for(State ss:sa) {
					boolean added = false;
					for(State sss:newS){
						if(sss.equals(ss)) {
							sss.prob += ss.prob;
							added = true;
							break;
						}
					}
					if(!added) {
						newS.add(ss);
					}
				}
			}
			currentS = newS;
		}
		double exp = 0;
		for(State s: currentS) {
			exp += s.distinct()*s.prob;
		}
		System.out.print(exp);
		
	}
	
	@Override
	protected void input() {
		System.out.print("");
		
	}

}

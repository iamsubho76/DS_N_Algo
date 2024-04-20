package com.org.ds.v1.array;

public class D18_TowerOfHanoi {
	public static void main(String[] args) {
		D18_TowerOfHanoi towerOfHanoi = new D18_TowerOfHanoi();
		towerOfHanoi.move(3,'A', 'C', 'B');
	}

	private void move(int numberOfDiscs, char from, char to, char inter) {
		
		/*StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		for(int i=0; i<stackTrace.length; i++) {
            System.out.println(stackTrace[i]);
        }*/
		if(numberOfDiscs == 1){
			System.out.println("Moving disc 1 from " + from + " to " + to);
		}else{
			move(numberOfDiscs - 1, from, inter, to);
			System.out.println("Moving disc " + numberOfDiscs + " from " + from + " to " + to);
			move(numberOfDiscs - 1, inter, to, from);
		}
	}
}

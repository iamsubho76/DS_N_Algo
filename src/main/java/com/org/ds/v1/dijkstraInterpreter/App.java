package com.org.ds.v1.dijkstraInterpreter;

public class App {

	public static void main(String[] args) {
	
		Algorithm algorithm = new Algorithm();
		
		algorithm.interpretExpression("( ( 1 + 22 ) * ( 2 + 1 ) )");

		algorithm.result();
	}
}
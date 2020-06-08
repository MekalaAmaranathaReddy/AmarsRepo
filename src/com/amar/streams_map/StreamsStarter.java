package com.amar.streams_map;

import java.util.Arrays;

public class StreamsStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int no [] ={12,21,32,45,52,63};
      Arrays.stream(no).filter((n)->n%3==0).map((n)->++n).filter((n)->n%8==0).forEach(System.out::println);
	}

}

//Exercise
//Given a list of numbers ,return a list of the cube of each number.
//For example ,given [1,2,3,4,5]the program should return [1,8,27,64,125] 

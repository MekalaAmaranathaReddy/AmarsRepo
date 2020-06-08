package com.amar.optional_classes2;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code without Optional classes
		/*String[] words = new String[10];   
        String word = words[5].toLowerCase();   //Here we will get a NullPointerException
        System.out.print(word);*/
		
		/*To avoid abnormal termination, we use the Optional class. In the following example, we are using Optional. So, our program can execute without crashing.*/
		
		String[] words = new String[10];   
        //Optional<String> checkNull =  
                      Optional.ofNullable(words[5]); 
       Optional<String> checkNull =Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {   
            String word = words[5].toLowerCase();   
            System.out.print(word);   
        } else  
            System.out.println("word is null");   
    }   

	}

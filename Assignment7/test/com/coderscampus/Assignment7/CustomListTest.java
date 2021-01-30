package com.coderscampus.Assignment7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomListTest {

	private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	// sut is system under test
	private CustomList<Character> sut;

	@BeforeEach
	void init_before_every_test() {
		System.out.println("Initiating the arrange of the test");
		sut = new CustomArrayList<Character>();
		// String alphabet = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < alphabet.length(); i++) {
			sut.add(alphabet.charAt(i));

		}
	}

	
	@Test
	void should_verify_that_all_characters_are_lowercase() {

		// act

		int trueOccurrences = 0;

		for (int i = 0; i < sut.getSize(); i++) {

			if (sut.get(i).equals(alphabet.charAt(i))) {
				System.out.println(sut.get(i).equals(alphabet.charAt(i)));
				trueOccurrences++;
			}
		}
		Integer actual = trueOccurrences;

		// Assert
		Integer expected = 26;
		assertEquals(expected, actual);
	}
	@Test
	void should_verify_that_one_character_is_added_at_end_of_arraylist() {
		
		//Act
		boolean actual = false;
		sut.add('0');
		
	
			
			if(sut.get(sut.getSize()-1).equals('0')) 
			{
				actual = true;
			}
	
		
		//Assert
		boolean expected = true;
		assertEquals(expected,actual);
	}
	@Test
	void should_verify_that_one_character_is_added_at_middle_of_arraylist() {
		
		//Act
		boolean actual = false;
		sut.add((sut.getSize()/2),'*');
		
	
			
			if(sut.get((sut.getSize()-1)/2).equals('*')) 
			{
				actual = true;
			}
	
		
		//Assert
		boolean expected = true;
		assertEquals(expected,actual);
	}
	@Test
	void a_value_should_be_removed_from_the_array_and_size_is_one_less() {
		
		//act
		Integer beforeRemoval = sut.getSize();
		Character itemRemoved = sut.remove(10);
		Integer afterRemoval = sut.getSize();
		
		//Assert
		
		assertEquals(26,beforeRemoval);
		assertEquals('k',itemRemoved);
		assertEquals(25,afterRemoval);
		
	}
	@Test
	void a_given_index_with_actual_value_should_match_the_expected_value() {
		
		//act
		char [] letters = new char[26];
		int i = 0;
		
		while(i<(letters.length-1))
		{
			if(sut.get(i)!=null) 
			  letters[i]=sut.get(i);
			
			i++;
		}
		//assert
		for(int index = 0;index < letters.length-1; index++) {
			assertEquals(letters[index],sut.get(index));
			
		}
	}

}
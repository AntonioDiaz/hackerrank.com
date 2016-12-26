package algorithms.implementation.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import algorithms.implementation.medium.AbsolutePermutation;

public class AbsolutePermutationTest {

	
	@Test
	public void calculatePermutation01(){
		AbsolutePermutation absolutePermutation = new AbsolutePermutation(2, 1);
		assertEquals("2 1", AbsolutePermutation.listToString(absolutePermutation.calculatePermutation()));
	}
	
	@Test
	public void calculatePermutation02(){
		AbsolutePermutation absolutePermutation = new AbsolutePermutation(3, 0);
		assertEquals("1 2 3", AbsolutePermutation.listToString(absolutePermutation.calculatePermutation()));
	}
	
	@Test
	public void calculatePermutation03(){
		AbsolutePermutation absolutePermutation = new AbsolutePermutation(3, 2);
		assertEquals("-1", AbsolutePermutation.listToString(absolutePermutation.calculatePermutation()));
	}
	
	private static final String OUTPUT_04 = "3 4 1 2 7 8 5 6 11 12 9 10 15 16 13 14 19 20 17 18 23 24 21 22 27 28 25 26 31 32 29 30 35 36 33 34 39 40 37 38 43 44 41 42 47 48 45 46 51 52 49 50 55 56 53 54 59 60 57 58 63 64 61 62 67 68 65 66 71 72 69 70 75 76 73 74 79 80 77 78 83 84 81 82 87 88 85 86 91 92 89 90 95 96 93 94 99 100 97 98";
	@Test
	public void calculatePermutation04(){
		AbsolutePermutation absolutePermutation = new AbsolutePermutation(100, 2);
		assertEquals(OUTPUT_04, AbsolutePermutation.listToString(absolutePermutation.calculatePermutation()));
	}	
}

package unittest.cs105;

import static org.junit.Assert.assertEquals;

import static edu.sbcc.cs105.MergeSorted.mergeSorted;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedTester {
	private static final int maximumScore = 20;
	private static final int maximumAssignmentScore = 25;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your unit test score is %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void testEmpty() {
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();

		ArrayList<Integer> merged = mergeSorted(x, y);
		assertEquals(0, merged.size());
		totalScore += 4;
	}

	@Test
	public void testOneEmpty() {
		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(0));
		ArrayList<Integer> y = new ArrayList<>();

		ArrayList<Integer> merged = mergeSorted(x, y);
		assertEquals(1, merged.size());
		assertEquals(0, (int)merged.get(0));
		totalScore += 2;

		merged = mergeSorted(y, x);
		assertEquals(1, merged.size());
		assertEquals(0, (int)merged.get(0));
		totalScore += 2;
	}

	@Test
	public void testOneOne() {
		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(0));
		ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1));

		ArrayList<Integer> merged = mergeSorted(x, y);
		assertEquals(2, merged.size());
		assertEquals(0, (int)merged.get(0));
		assertEquals(1, (int)merged.get(1));
		totalScore += 2;

		merged = mergeSorted(y, x);
		assertEquals(2, merged.size());
		assertEquals(0, (int)merged.get(0));
		assertEquals(1, (int)merged.get(1));
		totalScore += 2;
	}

	@Test
	public void testDifferentSize() {
		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 5, 7));
		ArrayList<Integer> y = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 8));

		ArrayList<Integer> merged = mergeSorted(x, y);
		assertEquals(11, merged.size());
		assertEquals(1, (int)merged.get(0));
		assertEquals(2, (int)merged.get(1));
		assertEquals(2, (int)merged.get(2));
		assertEquals(2, (int)merged.get(3));
		assertEquals(4, (int)merged.get(4));
		assertEquals(4, (int)merged.get(5));
		assertEquals(5, (int)merged.get(6));
		assertEquals(5, (int)merged.get(7));
		assertEquals(5, (int)merged.get(8));
		assertEquals(7, (int)merged.get(9));
		assertEquals(8, (int)merged.get(10));
		totalScore += 2;

		merged = mergeSorted(y, x);
		assertEquals(11, merged.size());
		assertEquals(1, (int)merged.get(0));
		assertEquals(2, (int)merged.get(1));
		assertEquals(2, (int)merged.get(2));
		assertEquals(2, (int)merged.get(3));
		assertEquals(4, (int)merged.get(4));
		assertEquals(4, (int)merged.get(5));
		assertEquals(5, (int)merged.get(6));
		assertEquals(5, (int)merged.get(7));
		assertEquals(5, (int)merged.get(8));
		assertEquals(7, (int)merged.get(9));
		assertEquals(8, (int)merged.get(10));
		totalScore += 2;
	}

	@Test
	public void testBigEmpty() {
		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 5, 7));
		ArrayList<Integer> y = new ArrayList<>();

		ArrayList<Integer> merged = mergeSorted(x, y);
		assertEquals(6, merged.size());
		assertEquals(1, (int)merged.get(0));
		assertEquals(2, (int)merged.get(1));
		assertEquals(4, (int)merged.get(2));
		assertEquals(5, (int)merged.get(3));
		assertEquals(5, (int)merged.get(4));
		assertEquals(7, (int)merged.get(5));
		totalScore += 2;

		merged = mergeSorted(y, x);
		assertEquals(6, merged.size());
		assertEquals(1, (int)merged.get(0));
		assertEquals(2, (int)merged.get(1));
		assertEquals(4, (int)merged.get(2));
		assertEquals(5, (int)merged.get(3));
		assertEquals(5, (int)merged.get(4));
		assertEquals(7, (int)merged.get(5));
		totalScore += 2;
	}
}

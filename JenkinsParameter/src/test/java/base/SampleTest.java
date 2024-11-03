package base;

import org.testng.annotations.Test;

public class SampleTest extends Demo {

		@Test(priority = 1)
		public void testCase1() {

			System.out.println("This is testCase1");
			System.out.println("This is New Comment");
			System.out.println("This is New Comment2");

		}
		@Test(priority = 2)
		public void testCase2() {

			System.out.println("This is testCase2");

		}
		@Test(priority = 3)
		public void testCase3() {

			System.out.println("This is testCase3");
		}

	
	
}
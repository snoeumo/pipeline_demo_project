package pipeline_pr;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PiplineDemo {

	@BeforeTest
	public void display() {
		System.out.println("display solution");
	}
	
	@Test
	public void start() {
		System.out.println("start test");
	}
	@AfterTest
	public void stop() {
		System.out.println("stop test");
	}
}

package Basic;

import org.testng.annotations.Test;

public class depensOnMethod {

	@Test
	public void createAcount() {
		System.out.println("account is ceated");
	}
	@Test
	public void modifyAcoount() {
		System.out.println("account has been modified");
	}
}

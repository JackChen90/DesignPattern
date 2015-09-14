package indi.jackc.designPattern.builder;

import org.junit.Test;

public class TestPet {

	@Test
	public void legalBuild() {
		final Pet.Builder builder = new Pet.Builder();
		final Pet pet = builder.setPetName("A").setOwnerName("Jack")
				.setTelephone("12345566").setAddress("育贤花园").builde();
	}
	
	@Test(expected=IllegalStateException.class)
	public void illegalBuild() {
		final Pet.Builder builder = new Pet.Builder();
		final Pet pet = builder.setPetName("A").setOwnerName("Jack")
				.setTelephone("12345566").builde();
	}
}

package indi.jackc.designPattern.builder;

import java.util.Date;

public class Pet {
	private final String petName;
	private final String ownerName;
	private final String address;
	private final String telephone;
	private final Date dateOfBrith;// 可选属性
	private final String email;// 可选属性

	private Pet(final String petName, final String ownerName,
			final String address, final String telephone,
			final Date dateOfBrith, final String email) {
		this.petName = petName;
		this.ownerName = ownerName;
		this.address = address;
		this.telephone = telephone;
		this.dateOfBrith = dateOfBrith;
		this.email = email;
	}

	public static class Builder {
		private String petName;
		private String ownerName;
		private String address;
		private String telephone;
		private Date dateOfBrith;
		private String email;

		public Builder setPetName(final String petName) {
			this.petName = petName;
			return this;
		}

		public Builder setOwnerName(final String ownerName) {
			this.ownerName = ownerName;
			return this;
		}

		public Builder setAddress(final String address) {
			this.address = address;
			return this;
		}

		public Builder setTelephone(final String telephone) {
			this.telephone = telephone;
			return this;
		}

		public Builder setDateOfBrith(final Date dateOfBrith) {
			this.dateOfBrith = dateOfBrith;
			return this;
		}

		public Builder setEmail(final String email) {
			this.email = email;
			return this;
		}

		public Pet builde() {
			if (this.petName == null || this.ownerName == null
					|| this.address == null || this.telephone == null)
				throw new IllegalStateException("can not create Pet!");
			else
				return new Pet(petName, ownerName, address, telephone,
						dateOfBrith, email);
		}
	}
}

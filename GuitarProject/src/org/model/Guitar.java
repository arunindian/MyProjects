package org.model;

/**
 * 
 * @author dixit
 *
 */
public class Guitar {
	
	private String serialNumber;
	private String builder;
	private String model;
	private String backWood;
	private String frontWood;
	
	public Guitar(String serialNumber,
			String builder,
			String model,
			String backWood,
			String frontWood) {
		this.serialNumber = serialNumber;
		this.builder =builder;
		this.model = model;
		this.backWood = backWood;
		this.frontWood = frontWood;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getFrontWood() {
		return frontWood;
	}

	public void setFrontWood(String frontWood) {
		this.frontWood = frontWood;
	}
	
}

package com.showroom;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private String chasisNo;
	private String companyName;
	private double price;
	private Color vehCol;
	private boolean isAvailable;
	private Date mfgDate;
	public static SimpleDateFormat sdf;

	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Vehicle(String chasisNo, String companyName, double price, String vehCol, Date mfgDate) {
		super();
		this.chasisNo = chasisNo;
		this.companyName = companyName;
		this.price = price;
		this.vehCol =  Color.valueOf(vehCol);
		this.isAvailable = true;
		this.mfgDate = mfgDate;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", companyName=" + companyName + ", price=" + price + ", vehCol="
				+ vehCol + ", isAvailable=" + isAvailable + ", mfgDate=" + sdf.format(mfgDate) + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Vehicle) {
			Vehicle v = (Vehicle) o;
			return this.chasisNo.equals(v.chasisNo);
		}
		return false;
	}

}

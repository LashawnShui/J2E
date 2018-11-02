package cn.smbms.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Record {
	private Integer id;
	private String version;
	private BigDecimal factoryPrice;
	private Date manufactureDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public BigDecimal getFactoryPrice() {
		return factoryPrice;
	}
	public void setFactoryPrice(BigDecimal factoryPrice) {
		this.factoryPrice = factoryPrice;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
}

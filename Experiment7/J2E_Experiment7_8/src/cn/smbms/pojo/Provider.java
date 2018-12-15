package cn.smbms.pojo;

import java.util.Date;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;

public class Provider {
	
	private Integer id;   //id
	@NotEmpty(message="��Ӧ�̱��벻��Ϊ��")
	private String proCode; //��Ӧ�̱���
	@NotEmpty(message="��Ӧ�����Ʋ���Ϊ��")
	private String proName; //��Ӧ������
	private String proDesc; //��Ӧ������
	@NotEmpty(message="��ϵ�˲���Ϊ��")
	private String proContact; //��Ӧ����ϵ��
	@Pattern(regexp="^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$",message="��������ȷ��ʽ���ֻ���")
	private String proPhone; //��Ӧ�̵绰
	private String proAddress; //��Ӧ�̵�ַ
	private String proFax; //��Ӧ�̴���
	private Integer createdBy; //������
	private Date creationDate; //����ʱ��
	private Integer modifyBy; //������
	private Date modifyDate;//����ʱ��
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public String getProContact() {
		return proContact;
	}
	public void setProContact(String proContact) {
		this.proContact = proContact;
	}
	public String getProPhone() {
		return proPhone;
	}
	public void setProPhone(String proPhone) {
		this.proPhone = proPhone;
	}
	public String getProAddress() {
		return proAddress;
	}
	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}
	public String getProFax() {
		return proFax;
	}
	public void setProFax(String proFax) {
		this.proFax = proFax;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
}
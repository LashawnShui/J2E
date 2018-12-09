package cn.smbms.dao.bill;

import cn.smbms.pojo.Bill;

public interface BillMapper {
	/**
	 * ��Ӷ���
	 * @param bill
	 * @return
	 */
	public Integer add(Bill bill);
	/**
	 * �޸Ķ���
	 * @param bill
	 */
	public void update(Bill bill);
	/**
	 * ɾ������
	 * @param id
	 */
	public void delete(Integer id);
	/**
	 * ��ѯ����
	 * @param id
	 * @return
	 */
	public Bill getBill(Integer id);
}

package cn.smbms.service;

import cn.smbms.pojo.Bill;

public interface BillService {

	/**
	 * Ìí¼Ó¶©µ¥
	 * @param bill
	 * @return
	 */
	public Integer add(Bill bill);
	/**
	 * ÐÞ¸Ä¶©µ¥
	 * @param bill
	 */
	public void update(Bill bill);
	/**
	 * É¾³ý¶©µ¥
	 * @param id
	 */
	public void delete(Integer id);
	/**
	 * ²éÑ¯¶©µ¥
	 * @param id
	 * @return
	 */
	public Bill getBill(Integer id);
}

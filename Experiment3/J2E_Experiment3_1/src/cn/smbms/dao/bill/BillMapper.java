package cn.smbms.dao.bill;

import java.util.List;
import java.util.Map;

import cn.smbms.pojo.Bill;

public interface BillMapper {
	public List<Bill> getBillList(Map<String, String> billMap);
}

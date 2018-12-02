package cn.smbms.service.bill;

import java.util.List;
import java.util.Map;

import cn.smbms.pojo.Bill;

public interface BillService {
	public List<Bill> findBillsWithConditions(Map<String, String> billMap);
}

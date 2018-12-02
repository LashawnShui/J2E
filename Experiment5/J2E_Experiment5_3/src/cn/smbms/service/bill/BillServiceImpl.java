package cn.smbms.service.bill;

import java.util.List;
import java.util.Map;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.pojo.Bill;

public class BillServiceImpl implements BillService {
	private BillMapper billMapper;

	public BillMapper getBillMapper() {
		return billMapper;
	}
	public void setBillMapper(BillMapper billMapper) {
		this.billMapper = billMapper;
	}

	public List<Bill> findBillsWithConditions(Map<String, String> billMap) {
		try {
			return billMapper.getBillListByMap(billMap);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

}

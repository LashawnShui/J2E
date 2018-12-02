package cn.smbms.service.bill;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.pojo.Bill;

@Service("billService")
public class BillServiceImpl implements BillService {
	@Autowired
	private BillMapper billMapper;

	public List<Bill> findBillsWithConditions(Map<String, String> billMap) {
		try {
			return billMapper.getBillListByMap(billMap);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

}

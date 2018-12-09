package cn.smbms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.pojo.Bill;
import cn.smbms.service.BillService;

@Service("billService")
@Transactional(propagation=Propagation.REQUIRED)
public class BillServiceImpl implements BillService {

	@Autowired
	@Qualifier("billMapper")
	private BillMapper billMapper;
	public BillMapper getBillMapper() {
		return billMapper;
	}

	public void setBillMapper(BillMapper billMapper) {
		this.billMapper = billMapper;
	}

	@Override
	public Integer add(Bill bill) {
		// TODO Auto-generated method stub
		return billMapper.add(bill);
	}

	@Override
	public void update(Bill bill) {
		// TODO Auto-generated method stub
		billMapper.update(bill);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		billMapper.delete(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	@Override
	public Bill getBill(Integer id) {
		// TODO Auto-generated method stub
		return billMapper.getBill(id);
	}

}

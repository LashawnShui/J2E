package cn.smbms.dao.bill.impl;

import org.mybatis.spring.SqlSessionTemplate;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.pojo.Bill;

///仅在使用SqlSessionTemplate时使用映射器的实现类。

public class BillMapperImpl implements BillMapper {

	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public Integer add(Bill bill) {
		// TODO Auto-generated method stub		
		return sqlSessionTemplate.getMapper(BillMapper.class).add(bill);		
	}

	@Override
	public void update(Bill bill) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.getMapper(BillMapper.class).update(bill);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.getMapper(BillMapper.class).delete(id);
	}

	@Override
	public Bill getBill(Integer id) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.getMapper(BillMapper.class).getBill(id);
	}

}

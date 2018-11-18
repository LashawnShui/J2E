package cn.smbms.dao.bill;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Bill;

public interface BillMapper {
	public List<Bill> getBillList(@Param("billCode")String billCode,
								@Param("providerId")Integer providerId,
								@Param("from")Integer currentPageNo,
								@Param("pageSize")Integer pageSize
	);
}

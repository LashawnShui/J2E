package cn.smbms.service.provider;

import java.sql.Connection;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.smbms.dao.BaseDao;
import cn.smbms.dao.provider.ProviderDao;
import cn.smbms.pojo.Provider;
@Service
public class ProviderServiceImpl implements ProviderService {
	@Resource
	private ProviderDao providerDao;

	@Override
	public List<Provider> getProviderList(String proName, String proCode,
			int currentPageNo, int pageSize) {
		// TODO Auto-generated method stub
		Connection connection = null;
		List<Provider> providerList = null;
		System.out.println("query proName ---- > " + proName);
		System.out.println("query proCode ---- > " + proCode);
		try {
			connection = BaseDao.getConnection();
			providerList = providerDao.getProviderList(connection, proName,proCode,currentPageNo,pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeResource(connection, null, null);
		}
		return providerList;
	}
	@Override
	public int getproviderCount(String proName, String proCode) {
		// TODO Auto-generated method stub
		Connection connection = null;
		int count = 0;
		try {
			connection = BaseDao.getConnection();
			count = providerDao.getproviderCount(connection, proName, proCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeResource(connection, null, null);
		}
		return count;
	}

}

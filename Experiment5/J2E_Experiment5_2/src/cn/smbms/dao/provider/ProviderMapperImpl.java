package cn.smbms.dao.provider;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.smbms.pojo.Provider;

public class ProviderMapperImpl extends SqlSessionDaoSupport implements
		ProviderMapper {
	public List<Provider> getProviderListWithProName(String proName) {
		return this.getSqlSession().selectList("cn.smbms.dao.provider.ProviderMapper.getProviderListWithProName", proName);
	}
}

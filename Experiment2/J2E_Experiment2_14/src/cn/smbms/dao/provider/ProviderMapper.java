package cn.smbms.dao.provider;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Provider;

public interface ProviderMapper {
	public List<Provider> getBillListByProviderId(@Param("id")Integer providerId);
}

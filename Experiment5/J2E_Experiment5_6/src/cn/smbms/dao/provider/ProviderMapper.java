package cn.smbms.dao.provider;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Provider;

public interface ProviderMapper {
	public int add(Provider provider);
	public int update(Provider provider);
	public int delete(@Param("id")Integer delId);
}

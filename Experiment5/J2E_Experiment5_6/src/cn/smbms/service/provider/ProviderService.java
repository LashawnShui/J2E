package cn.smbms.service.provider;

import cn.smbms.pojo.Provider;

public interface ProviderService {
	public boolean addNewProvider(Provider provider);
	public boolean updateProvider(Provider provider);
	public boolean deleteProvider(Integer delId);
}

package cn.smbms.service.provider;

import java.util.List;

import cn.smbms.pojo.Provider;

public interface ProviderService {
	public List<Provider> findProvidersWithConditions(String proName);
}

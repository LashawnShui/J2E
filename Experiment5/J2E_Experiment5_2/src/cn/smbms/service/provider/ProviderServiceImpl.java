package cn.smbms.service.provider;

import java.util.List;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;

public class ProviderServiceImpl implements ProviderService {
	private ProviderMapper providerMapper;

	public ProviderMapper getProviderMapper() {
		return providerMapper;
	}
	public void setProviderMapper(ProviderMapper providerMapper) {
		this.providerMapper = providerMapper;
	}

	public List<Provider> findProvidersWithConditions(String proName) {
		try {
			return providerMapper.getProviderListWithProName(proName);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

}

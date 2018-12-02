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

	public List<Provider> findAllProviders() {
		try {
			return providerMapper.getProviderList();
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

}

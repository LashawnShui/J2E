package cn.smbms.service.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;

@Service("providerService")
public class ProviderlServiceImpl implements ProviderService {
	@Autowired
	private ProviderMapper providerMapper;

	public boolean addNewProvider(Provider provider) {
		boolean result = false;
		try {
			if (providerMapper.add(provider) == 1) {
				result = true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

}

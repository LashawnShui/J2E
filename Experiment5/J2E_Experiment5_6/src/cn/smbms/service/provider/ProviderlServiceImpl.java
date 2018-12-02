package cn.smbms.service.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;

@Transactional
@Service("providerService")
public class ProviderlServiceImpl implements ProviderService {
	@Autowired
	private ProviderMapper providerMapper;

	@Transactional(propagation = Propagation.SUPPORTS)
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
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public boolean updateProvider(Provider provider) {
		boolean result = false;
		try {
			if (providerMapper.update(provider) == 1) {
				result = true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public boolean deleteProvider(Integer delId) {
		boolean result = false;
		try {
			if (providerMapper.delete(delId) == 1) {
				result = true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

}

package cn.smbms.service.provider;

import java.io.File;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.smbms.dao.bill.BillMapper;
import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;

@Service
public class ProviderServiceImpl implements ProviderService{
	@Resource
	private ProviderMapper providerMapper;
	@Resource
	private BillMapper billMapper;
	
	@Override
	public List<Provider> getProviderList(String proName, String proCode,
			Integer currentPageNo, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		currentPageNo = (currentPageNo-1)*pageSize;
		return providerMapper.getProviderList(proName, proCode, currentPageNo, pageSize);
	}

	@Override
	public int getproviderCount(String proName, String proCode)
			throws Exception {
		// TODO Auto-generated method stub
		return providerMapper.getProviderCount(proName, proCode);
	}

	@Override
	public boolean add(Provider provider) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(providerMapper.add(provider) > 0)
			flag = true;
		return flag;
	}

	@Override
	public Provider getProviderById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return providerMapper.getProviderById(id);
	}

	@Override
	public boolean modify(Provider provider) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(providerMapper.modify(provider) > 0)
			flag = true;
		return flag;
	}
	
	/**
	 * ҵ�񣺸���IDɾ����Ӧ�̱������֮ǰ����Ҫ��ȥ����������в�ѯ����
	 * �����������޸ù�Ӧ�̵Ķ������ݣ������ɾ��
	 * ���иù�Ӧ�̵Ķ������ݣ�����м���ɾ������ɾ��������ɾ��Ӧ��
	 * 
	 */
	@Override
	public  boolean smbmsdeleteProviderById(Integer delId) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = true;
		int billCount = billMapper.getBillCountByProviderId(delId);
		if(billCount > 0 ){//�ȶ�����Ϣ
			billMapper.deleteBillByProviderId(delId);
		}
		//��ɾ��������¼���ϴ��ļ�
		Provider provider = providerMapper.getProviderById(delId);
		if(provider.getCompanyLicPicPath() != null && !provider.getCompanyLicPicPath().equals("")){
			//ɾ������������ҵӪҵִ����Ƭ
			File file = new File(provider.getCompanyLicPicPath());
			if(file.exists()){
				flag = file.delete();
			}
		}
		if(flag && provider.getOrgCodePicPath() != null && !provider.getOrgCodePicPath().equals("")){
			//ɾ������������֯��������֤��Ƭ
			File file = new File(provider.getOrgCodePicPath());
			if(file.exists()){
				flag = file.delete();
			}
		}
		if(!flag){
			throw new Exception();
		}
		providerMapper.deleteProviderById(delId);
		return flag;
	}

}

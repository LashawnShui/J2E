package cn.smbms.controller;

import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import cn.smbms.pojo.Provider;
import cn.smbms.service.provider.ProviderService;
import cn.smbms.tools.Constants;
import cn.smbms.tools.PageSupport;

@Controller
@RequestMapping("/provider")
public class ProviderController {
	private Logger logger = Logger.getLogger(ProviderController.class);
	
	@Resource
	private ProviderService providerService;
	
	@RequestMapping(value="/providerlist.html")
	public String getProviderList(Model model,
							@RequestParam(value="queryProCode",required=false) String queryProCode,
							@RequestParam(value="queryProName",required=false) String queryProName,
							@RequestParam(value="pageIndex",required=false) String pageIndex){
		logger.info("getProviderList ---- > queryProCode: " + queryProCode);
		logger.info("getProviderList ---- > queryProName: " + queryProName);
		logger.info("getProviderList ---- > pageIndex: " + pageIndex);
		List<Provider> providerList = null;
		//设置页面容量
    	int pageSize = Constants.pageSize;
    	//当前页码
    	int currentPageNo = 1;
	
		if(queryProCode == null){
			queryProCode = "";
		}
		if(queryProName == null){
			queryProName = "";
		}
    	if(pageIndex != null){
    		try{
    			currentPageNo = Integer.valueOf(pageIndex);
    		}catch(NumberFormatException e){
    			return "redirect:/provider/syserror.html";
    		}
    	}	
    	//总数量（表）	
    	int totalCount	= providerService.getproviderCount(queryProCode,queryProName);
    	//总页数
    	PageSupport pages=new PageSupport();
    	pages.setCurrentPageNo(currentPageNo);
    	pages.setPageSize(pageSize);
    	pages.setTotalCount(totalCount);
    	int totalPageCount = pages.getTotalPageCount();
    	//控制首页和尾页
    	if(currentPageNo < 1){
    		currentPageNo = 1;
    	}else if(currentPageNo > totalPageCount){
    		currentPageNo = totalPageCount;
    	}
    	providerList = providerService.getProviderList(queryProName,queryProCode,currentPageNo, pageSize);
    	model.addAttribute("providerList", providerList);
    	model.addAttribute("queryProCode", queryProCode);
		model.addAttribute("queryProName", queryProName);
		model.addAttribute("totalPageCount", totalPageCount);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("currentPageNo", currentPageNo);
		return "providerlist";
	}
	
	@RequestMapping(value="/syserror.html")
	public String sysError(){
		return "syserror";
	}
	
}

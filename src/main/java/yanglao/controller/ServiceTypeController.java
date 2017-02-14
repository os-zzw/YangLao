package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import yanglao.po.ServiceType;
import yanglao.service.ServiceTypeService;
import yanglao.vo.JsonResponse;

/**
 * Created by john(Zhewei) on 2017/1/19.
 */
@Controller
@RequestMapping("serviceType")
public class ServiceTypeController {

    @Autowired
    private ServiceTypeService mServiceTypeService;

    //获取服务
    @RequestMapping(method = RequestMethod.GET)
    public JsonResponse getMessage(ServiceType serviceType) {
        List<ServiceType> list = mServiceTypeService.queryByWhere(serviceType);
        return new JsonResponse(list);
    }


    //添加服务
    @RequestMapping(method = RequestMethod.PUT)
    public JsonResponse saveMessage(ServiceType serviceType) {
        mServiceTypeService.save(serviceType);
        return new JsonResponse(serviceType);
    }


    //修改
    @RequestMapping(method = RequestMethod.POST)
    public JsonResponse updateMessage(ServiceType serviceType) {
        mServiceTypeService.updateSelective(serviceType);
        return new JsonResponse(null);
    }


    //删除
    @RequestMapping(method = RequestMethod.DELETE)
    public JsonResponse deleteMessage(ServiceType serviceType) {
        mServiceTypeService.deleteByString(serviceType.getId());
        return new JsonResponse(null);
    }


}

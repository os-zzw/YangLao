package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.UUID;

import yanglao.po.SharePlatformInfo;
import yanglao.service.SharePlatformInfoService;
import yanglao.vo.JsonResponse;

/**
 * Created by john(Zhewei) on 2017/1/22.
 * 用户
 */
@Controller
@RequestMapping(value = "sharePlatformInfo", produces = "application/json")
public class SharePlatformInfoController {

    @Autowired
    private SharePlatformInfoService mSharePlatformInfoService;

    @RequestMapping(method = RequestMethod.GET)
    public JsonResponse getMessage() {
        List<SharePlatformInfo> sharePlatformInfoes = mSharePlatformInfoService.queryAll();
        return new JsonResponse(sharePlatformInfoes);
    }

    /**
     * 注册，添加用户
     *
     * @param sharePlatformInfo
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.PUT)
    public JsonResponse register(SharePlatformInfo sharePlatformInfo) {
        sharePlatformInfo.setUserCode(UUID.randomUUID().toString());
        mSharePlatformInfoService.save(sharePlatformInfo);
        return new JsonResponse(sharePlatformInfo);
    }

    /**
     * 修改
     *
     * @param SharePlatformInfo
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public JsonResponse update(SharePlatformInfo SharePlatformInfo) {
        mSharePlatformInfoService.updateSelective(SharePlatformInfo);
        return new JsonResponse(null);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public JsonResponse delete(SharePlatformInfo SharePlatformInfo) {
        mSharePlatformInfoService.deleteByString(SharePlatformInfo.getId());
        return new JsonResponse(null);
    }

    /**
     * 登陆
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JsonResponse login(SharePlatformInfo sharePlatformInfo) {
        sharePlatformInfo = mSharePlatformInfoService.queryOne(sharePlatformInfo);

        if (sharePlatformInfo == null) {
            return new JsonResponse();
        }
        return new JsonResponse(sharePlatformInfo);
    }


}

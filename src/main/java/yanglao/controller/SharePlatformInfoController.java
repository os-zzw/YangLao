package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import yanglao.po.SharePlatformInfo;
import yanglao.service.SharePlatformInfoService;

/**
 * Created by john(Zhewei) on 2017/1/22.
 */
@Controller
@RequestMapping("sharePlatformInfo")
public class SharePlatformInfoController  {

    @Autowired
    private SharePlatformInfoService mSharePlatformInfoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<SharePlatformInfo>> getMessage() {
        List<SharePlatformInfo> SharePlatformInfoes = mSharePlatformInfoService.queryAll();
        return ResponseEntity.ok(SharePlatformInfoes);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<SharePlatformInfo> saveMessage(SharePlatformInfo SharePlatformInfo) {
        mSharePlatformInfoService.save(SharePlatformInfo);
        return ResponseEntity.status(201).body(SharePlatformInfo);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> updateMessage(SharePlatformInfo SharePlatformInfo) {
        mSharePlatformInfoService.updateSelective(SharePlatformInfo);
        return ResponseEntity.status(204).build();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteMessage(SharePlatformInfo SharePlatformInfo) {
        mSharePlatformInfoService.deleteByString(SharePlatformInfo.getId());
        return ResponseEntity.status(204).build();
    }

}

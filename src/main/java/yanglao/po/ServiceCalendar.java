package yanglao.po;

import java.util.Date;

public class ServiceCalendar {

    private String serviceAbilitiesCode;

    private String sharePlatformInfoCode;

    private String serviceEnd;

    private String serviceStart;

    private Date serviceDate;

    private String id;

    private String code;

    public String getServiceAbilitiesCode() {
        return serviceAbilitiesCode;
    }

    public void setServiceAbilitiesCode(String serviceAbilitiesCode) {
        this.serviceAbilitiesCode = serviceAbilitiesCode == null ? null : serviceAbilitiesCode.trim();
    }

    public String getSharePlatformInfoCode() {
        return sharePlatformInfoCode;
    }

    public void setSharePlatformInfoCode(String sharePlatformInfoCode) {
        this.sharePlatformInfoCode = sharePlatformInfoCode == null ? null : sharePlatformInfoCode.trim();
    }

    public String getServiceEnd() {
        return serviceEnd;
    }

    public void setServiceEnd(String serviceEnd) {
        this.serviceEnd = serviceEnd == null ? null : serviceEnd.trim();
    }

    public String getServiceStart() {
        return serviceStart;
    }

    public void setServiceStart(String serviceStart) {
        this.serviceStart = serviceStart == null ? null : serviceStart.trim();
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}
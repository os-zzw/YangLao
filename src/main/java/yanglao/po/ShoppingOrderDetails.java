package yanglao.po;

import java.util.Date;

public class ShoppingOrderDetails {
    private String id;

    private String code;

    private String foreignCode;

    private String foreignType;

    private String orderCode;

    private String orderStatus;

    private String orderType;

    private Short orderCount;

    private Short orderTotle;

    private String distributionWay;

    private String appointmentUuid;

    private String addressCode;

    private Date sendDate;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private String appointmentName;

    private String appointmentPhone;

    private Date appointmentStartTime;

    private Date appointmentEndTime;

    private String appointmentStatus;

    private String details;

    private String appointmentReply;

    private Date appointmentReplyDate;

    private String serviceManCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForeignCode() {
        return foreignCode;
    }

    public void setForeignCode(String foreignCode) {
        this.foreignCode = foreignCode;
    }

    public String getForeignType() {
        return foreignType;
    }

    public void setForeignType(String foreignType) {
        this.foreignType = foreignType;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Short getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Short orderCount) {
        this.orderCount = orderCount;
    }

    public Short getOrderTotle() {
        return orderTotle;
    }

    public void setOrderTotle(Short orderTotle) {
        this.orderTotle = orderTotle;
    }

    public String getDistributionWay() {
        return distributionWay;
    }

    public void setDistributionWay(String distributionWay) {
        this.distributionWay = distributionWay;
    }

    public String getAppointmentUuid() {
        return appointmentUuid;
    }

    public void setAppointmentUuid(String appointmentUuid) {
        this.appointmentUuid = appointmentUuid;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAppointmentName() {
        return appointmentName;
    }

    public void setAppointmentName(String appointmentName) {
        this.appointmentName = appointmentName;
    }

    public String getAppointmentPhone() {
        return appointmentPhone;
    }

    public void setAppointmentPhone(String appointmentPhone) {
        this.appointmentPhone = appointmentPhone;
    }

    public Date getAppointmentStartTime() {
        return appointmentStartTime;
    }

    public void setAppointmentStartTime(Date appointmentStartTime) {
        this.appointmentStartTime = appointmentStartTime;
    }

    public Date getAppointmentEndTime() {
        return appointmentEndTime;
    }

    public void setAppointmentEndTime(Date appointmentEndTime) {
        this.appointmentEndTime = appointmentEndTime;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getAppointmentReply() {
        return appointmentReply;
    }

    public void setAppointmentReply(String appointmentReply) {
        this.appointmentReply = appointmentReply;
    }

    public Date getAppointmentReplyDate() {
        return appointmentReplyDate;
    }

    public void setAppointmentReplyDate(Date appointmentReplyDate) {
        this.appointmentReplyDate = appointmentReplyDate;
    }

    public String getServiceManCode() {
        return serviceManCode;
    }

    public void setServiceManCode(String serviceManCode) {
        this.serviceManCode = serviceManCode;
    }
}
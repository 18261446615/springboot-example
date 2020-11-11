package com.example.base.entity;

import java.io.Serializable;
import java.util.Date;

public class AomengOrder implements Serializable {
    private String id;

    private Integer actionid;

    private String courseTypeId;

    private Date orderTime;

    private String saleName;

    private Integer money;

    private Integer buyClass;

    private String teacherId;

    private String type;

    private String studentId;

    private Double unitPrice;

    private Integer isSendGold;

    private String exchangeOrderId;

    private String uuid;

    private String unusedetOrderId;

    private String note;

    private String contractStatus;

    private String lessonId;

    private Integer studentNum;

    private String contractExtra;

    private String cancelNote;

    private String creatorId;

    private Integer removeClass;

    private String cardName;

    private String cardIdcardNumber;

    private Date signTime;

    private String signIp;

    private String crmOrderId;

    private Integer orderStatus;

    private Integer invoice;

    private Byte lnvicestate;

    private String giveReason;

    private Integer channelBatchId;

    private String channelBatchName;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getActionid() {
        return actionid;
    }

    public void setActionid(Integer actionid) {
        this.actionid = actionid;
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId == null ? null : courseTypeId.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getBuyClass() {
        return buyClass;
    }

    public void setBuyClass(Integer buyClass) {
        this.buyClass = buyClass;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getIsSendGold() {
        return isSendGold;
    }

    public void setIsSendGold(Integer isSendGold) {
        this.isSendGold = isSendGold;
    }

    public String getExchangeOrderId() {
        return exchangeOrderId;
    }

    public void setExchangeOrderId(String exchangeOrderId) {
        this.exchangeOrderId = exchangeOrderId == null ? null : exchangeOrderId.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getUnusedetOrderId() {
        return unusedetOrderId;
    }

    public void setUnusedetOrderId(String unusedetOrderId) {
        this.unusedetOrderId = unusedetOrderId == null ? null : unusedetOrderId.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus == null ? null : contractStatus.trim();
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId == null ? null : lessonId.trim();
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public String getContractExtra() {
        return contractExtra;
    }

    public void setContractExtra(String contractExtra) {
        this.contractExtra = contractExtra == null ? null : contractExtra.trim();
    }

    public String getCancelNote() {
        return cancelNote;
    }

    public void setCancelNote(String cancelNote) {
        this.cancelNote = cancelNote == null ? null : cancelNote.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Integer getRemoveClass() {
        return removeClass;
    }

    public void setRemoveClass(Integer removeClass) {
        this.removeClass = removeClass;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardIdcardNumber() {
        return cardIdcardNumber;
    }

    public void setCardIdcardNumber(String cardIdcardNumber) {
        this.cardIdcardNumber = cardIdcardNumber == null ? null : cardIdcardNumber.trim();
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getSignIp() {
        return signIp;
    }

    public void setSignIp(String signIp) {
        this.signIp = signIp == null ? null : signIp.trim();
    }

    public String getCrmOrderId() {
        return crmOrderId;
    }

    public void setCrmOrderId(String crmOrderId) {
        this.crmOrderId = crmOrderId == null ? null : crmOrderId.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Byte getLnvicestate() {
        return lnvicestate;
    }

    public void setLnvicestate(Byte lnvicestate) {
        this.lnvicestate = lnvicestate;
    }

    public String getGiveReason() {
        return giveReason;
    }

    public void setGiveReason(String giveReason) {
        this.giveReason = giveReason == null ? null : giveReason.trim();
    }

    public Integer getChannelBatchId() {
        return channelBatchId;
    }

    public void setChannelBatchId(Integer channelBatchId) {
        this.channelBatchId = channelBatchId;
    }

    public String getChannelBatchName() {
        return channelBatchName;
    }

    public void setChannelBatchName(String channelBatchName) {
        this.channelBatchName = channelBatchName == null ? null : channelBatchName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", actionid=").append(actionid);
        sb.append(", courseTypeId=").append(courseTypeId);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", saleName=").append(saleName);
        sb.append(", money=").append(money);
        sb.append(", buyClass=").append(buyClass);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", type=").append(type);
        sb.append(", studentId=").append(studentId);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", isSendGold=").append(isSendGold);
        sb.append(", exchangeOrderId=").append(exchangeOrderId);
        sb.append(", uuid=").append(uuid);
        sb.append(", unusedetOrderId=").append(unusedetOrderId);
        sb.append(", note=").append(note);
        sb.append(", contractStatus=").append(contractStatus);
        sb.append(", lessonId=").append(lessonId);
        sb.append(", studentNum=").append(studentNum);
        sb.append(", contractExtra=").append(contractExtra);
        sb.append(", cancelNote=").append(cancelNote);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", removeClass=").append(removeClass);
        sb.append(", cardName=").append(cardName);
        sb.append(", cardIdcardNumber=").append(cardIdcardNumber);
        sb.append(", signTime=").append(signTime);
        sb.append(", signIp=").append(signIp);
        sb.append(", crmOrderId=").append(crmOrderId);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", invoice=").append(invoice);
        sb.append(", lnvicestate=").append(lnvicestate);
        sb.append(", giveReason=").append(giveReason);
        sb.append(", channelBatchId=").append(channelBatchId);
        sb.append(", channelBatchName=").append(channelBatchName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
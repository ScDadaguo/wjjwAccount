package com.guohao.account.model;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*
*  @author guohao
*/
@Component
public class Wjjw implements Serializable {

    private static final long serialVersionUID = 1580883947360L;


    /**
    * 主键
    * 主键 自动递增
    * isNullAble:0
    */
    private Integer id;

    /**
    * 机型
    * isNullAble:1
    */
    private String machineName;

    /**
    * 工作地点
    * isNullAble:1
    */
    private String workPlace;

    /**
    * 开始时间
    * isNullAble:1
    */
    private String startTime;

    /**
    * 结束时间
    * isNullAble:1
    */
    private String endTime;

    /**
    * 工作时长
    * isNullAble:1
    */
    private java.math.BigDecimal workHours;

    /**
    * 单价
    * isNullAble:1
    */
    private Integer unitPrice;

    /**
    * 合计金额
    * isNullAble:1
    */
    private java.math.BigDecimal totalSum;


    /**
    * 板车趟数
    * isNullAble:1
    */
    private Integer flatcarCount;

    /**
    * 板车费
    * isNullAble:1
    */
    private Integer flatcarFee;

    /**
    * 其他
    * isNullAble:1
    */
    private String other;

    /**
    * 日期
    * isNullAble:1
    */
    private String  workDate;

    /**
    * 创建时间
    * isNullAble:1
    */
    private java.time.LocalDateTime created_at;

    /**
    * 更新时间
    * isNullAble:1
    */
    private java.time.LocalDateTime updated_at;

    private String openId;


    private MultipartFile file;

    private String localPath;

    private String fileName;



    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setMachineName(String machineName){this.machineName = machineName;}

    public String getMachineName(){return this.machineName;}

    public void setWorkPlace(String workPlace){this.workPlace = workPlace;}

    public String getWorkPlace(){return this.workPlace;}

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setStartTime(String startTime){this.startTime = startTime;}

    public String getStartTime(){return this.startTime;}

    public void setEndTime(String endTime){this.endTime = endTime;}

    public String getEndTime(){return this.endTime;}

    public void setWorkHours(java.math.BigDecimal workHours){this.workHours = workHours;}

    public java.math.BigDecimal getWorkHours(){return this.workHours;}

    public void setUnitPrice(Integer unitPrice){this.unitPrice = unitPrice;}

    public Integer getUnitPrice(){return this.unitPrice;}

    public void setTotalSum(java.math.BigDecimal totalSum){this.totalSum = totalSum;}

    public java.math.BigDecimal getTotalSum(){return this.totalSum;}

    public void setFlatcarCount(Integer flatcarCount){this.flatcarCount = flatcarCount;}

    public Integer getFlatcarCount(){return this.flatcarCount;}

    public void setFlatcarFee(Integer flatcarFee){this.flatcarFee = flatcarFee;}

    public Integer getFlatcarFee(){return this.flatcarFee;}

    public void setOther(String other){this.other = other;}

    public String getOther(){return this.other;}

    public void setWorkDate(String workDate){this.workDate = workDate;}

    public String getWorkDate(){return this.workDate;}

    public void setCreated_at(java.time.LocalDateTime created_at){this.created_at = created_at;}

    public java.time.LocalDateTime getCreated_at(){return this.created_at;}

    public void setUpdated_at(java.time.LocalDateTime updated_at){this.updated_at = updated_at;}

    public java.time.LocalDateTime getUpdated_at(){return this.updated_at;}
    @Override
    public String toString() {
        return "wjjw{" +
                "id='" + id + '\'' +
                "machineName='" + machineName + '\'' +
                "workPlace='" + workPlace + '\'' +
                "startTime='" + startTime + '\'' +
                "endTime='" + endTime + '\'' +
                "workHours='" + workHours + '\'' +
                "unitPrice='" + unitPrice + '\'' +
                "totalSum='" + totalSum + '\'' +
                "flatcarCount='" + flatcarCount + '\'' +
                "flatcarFee='" + flatcarFee + '\'' +
                "other='" + other + '\'' +
                "workDate='" + workDate + '\'' +
                "created_at='" + created_at + '\'' +
                "updated_at='" + updated_at + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Wjjw set;

        private ConditionBuilder where;

        public UpdateBuilder set(Wjjw set){
            this.set = set;
            return this;
        }

        public Wjjw getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Wjjw {
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> machineNameList;

        public List<String> getMachineNameList(){return this.machineNameList;}


        private List<String> fuzzyMachineName;

        public List<String> getFuzzyMachineName(){return this.fuzzyMachineName;}

        private List<String> rightFuzzyMachineName;

        public List<String> getRightFuzzyMachineName(){return this.rightFuzzyMachineName;}
        private List<String> workPlaceList;

        public List<String> getWorkPlaceList(){return this.workPlaceList;}


        private List<String> fuzzyWorkPlace;

        public List<String> getFuzzyWorkPlace(){return this.fuzzyWorkPlace;}

        private List<String> rightFuzzyWorkPlace;

        public List<String> getRightFuzzyWorkPlace(){return this.rightFuzzyWorkPlace;}
        private List<java.time.LocalDate> startTimeList;

        public List<java.time.LocalDate> getStartTimeList(){return this.startTimeList;}

        private java.time.LocalDate startTimeSt;

        private java.time.LocalDate startTimeEd;

        public java.time.LocalDate getStartTimeSt(){return this.startTimeSt;}

        public java.time.LocalDate getStartTimeEd(){return this.startTimeEd;}

        private List<java.time.LocalDate> endTimeList;

        public List<java.time.LocalDate> getEndTimeList(){return this.endTimeList;}

        private java.time.LocalDate endTimeSt;

        private java.time.LocalDate endTimeEd;

        public java.time.LocalDate getEndTimeSt(){return this.endTimeSt;}

        public java.time.LocalDate getEndTimeEd(){return this.endTimeEd;}

        private List<java.math.BigDecimal> workHoursList;

        public List<java.math.BigDecimal> getWorkHoursList(){return this.workHoursList;}

        private java.math.BigDecimal workHoursSt;

        private java.math.BigDecimal workHoursEd;

        public java.math.BigDecimal getWorkHoursSt(){return this.workHoursSt;}

        public java.math.BigDecimal getWorkHoursEd(){return this.workHoursEd;}

        private List<Integer> unitPriceList;

        public List<Integer> getUnitPriceList(){return this.unitPriceList;}

        private Integer unitPriceSt;

        private Integer unitPriceEd;

        public Integer getUnitPriceSt(){return this.unitPriceSt;}

        public Integer getUnitPriceEd(){return this.unitPriceEd;}

        private List<java.math.BigDecimal> totalSumList;

        public List<java.math.BigDecimal> getTotalSumList(){return this.totalSumList;}

        private java.math.BigDecimal totalSumSt;

        private java.math.BigDecimal totalSumEd;

        public java.math.BigDecimal getTotalSumSt(){return this.totalSumSt;}

        public java.math.BigDecimal getTotalSumEd(){return this.totalSumEd;}

        private List<Integer> flatcarCountList;

        public List<Integer> getFlatcarCountList(){return this.flatcarCountList;}

        private Integer flatcarCountSt;

        private Integer flatcarCountEd;

        public Integer getFlatcarCountSt(){return this.flatcarCountSt;}

        public Integer getFlatcarCountEd(){return this.flatcarCountEd;}

        private List<Integer> flatcarFeeList;

        public List<Integer> getFlatcarFeeList(){return this.flatcarFeeList;}

        private Integer flatcarFeeSt;

        private Integer flatcarFeeEd;

        public Integer getFlatcarFeeSt(){return this.flatcarFeeSt;}

        public Integer getFlatcarFeeEd(){return this.flatcarFeeEd;}

        private List<String> otherList;

        public List<String> getOtherList(){return this.otherList;}


        private List<String> fuzzyOther;

        public List<String> getFuzzyOther(){return this.fuzzyOther;}

        private List<String> rightFuzzyOther;

        public List<String> getRightFuzzyOther(){return this.rightFuzzyOther;}
        private List<java.time.LocalDate> workDateList;

        public List<java.time.LocalDate> getWorkDateList(){return this.workDateList;}

        private java.time.LocalDate workDateSt;

        private java.time.LocalDate workDateEd;

        public java.time.LocalDate getWorkDateSt(){return this.workDateSt;}

        public java.time.LocalDate getWorkDateEd(){return this.workDateEd;}

        private List<java.time.LocalDateTime> created_atList;

        public List<java.time.LocalDateTime> getCreated_atList(){return this.created_atList;}

        private java.time.LocalDateTime created_atSt;

        private java.time.LocalDateTime created_atEd;

        public java.time.LocalDateTime getCreated_atSt(){return this.created_atSt;}

        public java.time.LocalDateTime getCreated_atEd(){return this.created_atEd;}

        private List<java.time.LocalDateTime> updated_atList;

        public List<java.time.LocalDateTime> getUpdated_atList(){return this.updated_atList;}

        private java.time.LocalDateTime updated_atSt;

        private java.time.LocalDateTime updated_atEd;

        public java.time.LocalDateTime getUpdated_atSt(){return this.updated_atSt;}

        public java.time.LocalDateTime getUpdated_atEd(){return this.updated_atEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyMachineName (List<String> fuzzyMachineName){
            this.fuzzyMachineName = fuzzyMachineName;
            return this;
        }

        public QueryBuilder fuzzyMachineName (String ... fuzzyMachineName){
            this.fuzzyMachineName = solveNullList(fuzzyMachineName);
            return this;
        }

        public QueryBuilder rightFuzzyMachineName (List<String> rightFuzzyMachineName){
            this.rightFuzzyMachineName = rightFuzzyMachineName;
            return this;
        }

        public QueryBuilder rightFuzzyMachineName (String ... rightFuzzyMachineName){
            this.rightFuzzyMachineName = solveNullList(rightFuzzyMachineName);
            return this;
        }

        public QueryBuilder machineName(String machineName){
            setMachineName(machineName);
            return this;
        }

        public QueryBuilder machineNameList(String ... machineName){
            this.machineNameList = solveNullList(machineName);
            return this;
        }

        public QueryBuilder machineNameList(List<String> machineName){
            this.machineNameList = machineName;
            return this;
        }

        public QueryBuilder fetchMachineName(){
            setFetchFields("fetchFields","machineName");
            return this;
        }

        public QueryBuilder excludeMachineName(){
            setFetchFields("excludeFields","machineName");
            return this;
        }

        public QueryBuilder fuzzyWorkPlace (List<String> fuzzyWorkPlace){
            this.fuzzyWorkPlace = fuzzyWorkPlace;
            return this;
        }

        public QueryBuilder fuzzyWorkPlace (String ... fuzzyWorkPlace){
            this.fuzzyWorkPlace = solveNullList(fuzzyWorkPlace);
            return this;
        }

        public QueryBuilder rightFuzzyWorkPlace (List<String> rightFuzzyWorkPlace){
            this.rightFuzzyWorkPlace = rightFuzzyWorkPlace;
            return this;
        }

        public QueryBuilder rightFuzzyWorkPlace (String ... rightFuzzyWorkPlace){
            this.rightFuzzyWorkPlace = solveNullList(rightFuzzyWorkPlace);
            return this;
        }

        public QueryBuilder workPlace(String workPlace){
            setWorkPlace(workPlace);
            return this;
        }

        public QueryBuilder workPlaceList(String ... workPlace){
            this.workPlaceList = solveNullList(workPlace);
            return this;
        }

        public QueryBuilder workPlaceList(List<String> workPlace){
            this.workPlaceList = workPlace;
            return this;
        }

        public QueryBuilder fetchWorkPlace(){
            setFetchFields("fetchFields","workPlace");
            return this;
        }

        public QueryBuilder excludeWorkPlace(){
            setFetchFields("excludeFields","workPlace");
            return this;
        }

        public QueryBuilder startTimeBetWeen(java.time.LocalDate startTimeSt,java.time.LocalDate startTimeEd){
            this.startTimeSt = startTimeSt;
            this.startTimeEd = startTimeEd;
            return this;
        }

        public QueryBuilder startTimeGreaterEqThan(java.time.LocalDate startTimeSt){
            this.startTimeSt = startTimeSt;
            return this;
        }
        public QueryBuilder startTimeLessEqThan(java.time.LocalDate startTimeEd){
            this.startTimeEd = startTimeEd;
            return this;
        }


        public QueryBuilder startTime(String startTime){
            setStartTime(startTime);
            return this;
        }

        public QueryBuilder startTimeList(java.time.LocalDate ... startTime){
            this.startTimeList = solveNullList(startTime);
            return this;
        }

        public QueryBuilder startTimeList(List<java.time.LocalDate> startTime){
            this.startTimeList = startTime;
            return this;
        }

        public QueryBuilder fetchStartTime(){
            setFetchFields("fetchFields","startTime");
            return this;
        }

        public QueryBuilder excludeStartTime(){
            setFetchFields("excludeFields","startTime");
            return this;
        }

        public QueryBuilder endTimeBetWeen(java.time.LocalDate endTimeSt,java.time.LocalDate endTimeEd){
            this.endTimeSt = endTimeSt;
            this.endTimeEd = endTimeEd;
            return this;
        }

        public QueryBuilder endTimeGreaterEqThan(java.time.LocalDate endTimeSt){
            this.endTimeSt = endTimeSt;
            return this;
        }
        public QueryBuilder endTimeLessEqThan(java.time.LocalDate endTimeEd){
            this.endTimeEd = endTimeEd;
            return this;
        }


        public QueryBuilder endTime(String endTime){
            setEndTime(endTime);
            return this;
        }

        public QueryBuilder endTimeList(java.time.LocalDate ... endTime){
            this.endTimeList = solveNullList(endTime);
            return this;
        }

        public QueryBuilder endTimeList(List<java.time.LocalDate> endTime){
            this.endTimeList = endTime;
            return this;
        }

        public QueryBuilder fetchEndTime(){
            setFetchFields("fetchFields","endTime");
            return this;
        }

        public QueryBuilder excludeEndTime(){
            setFetchFields("excludeFields","endTime");
            return this;
        }

        public QueryBuilder workHoursBetWeen(java.math.BigDecimal workHoursSt,java.math.BigDecimal workHoursEd){
            this.workHoursSt = workHoursSt;
            this.workHoursEd = workHoursEd;
            return this;
        }

        public QueryBuilder workHoursGreaterEqThan(java.math.BigDecimal workHoursSt){
            this.workHoursSt = workHoursSt;
            return this;
        }
        public QueryBuilder workHoursLessEqThan(java.math.BigDecimal workHoursEd){
            this.workHoursEd = workHoursEd;
            return this;
        }


        public QueryBuilder workHours(java.math.BigDecimal workHours){
            setWorkHours(workHours);
            return this;
        }

        public QueryBuilder workHoursList(java.math.BigDecimal ... workHours){
            this.workHoursList = solveNullList(workHours);
            return this;
        }

        public QueryBuilder workHoursList(List<java.math.BigDecimal> workHours){
            this.workHoursList = workHours;
            return this;
        }

        public QueryBuilder fetchWorkHours(){
            setFetchFields("fetchFields","workHours");
            return this;
        }

        public QueryBuilder excludeWorkHours(){
            setFetchFields("excludeFields","workHours");
            return this;
        }

        public QueryBuilder unitPriceBetWeen(Integer unitPriceSt,Integer unitPriceEd){
            this.unitPriceSt = unitPriceSt;
            this.unitPriceEd = unitPriceEd;
            return this;
        }

        public QueryBuilder unitPriceGreaterEqThan(Integer unitPriceSt){
            this.unitPriceSt = unitPriceSt;
            return this;
        }
        public QueryBuilder unitPriceLessEqThan(Integer unitPriceEd){
            this.unitPriceEd = unitPriceEd;
            return this;
        }


        public QueryBuilder unitPrice(Integer unitPrice){
            setUnitPrice(unitPrice);
            return this;
        }

        public QueryBuilder unitPriceList(Integer ... unitPrice){
            this.unitPriceList = solveNullList(unitPrice);
            return this;
        }

        public QueryBuilder unitPriceList(List<Integer> unitPrice){
            this.unitPriceList = unitPrice;
            return this;
        }

        public QueryBuilder fetchUnitPrice(){
            setFetchFields("fetchFields","unitPrice");
            return this;
        }

        public QueryBuilder excludeUnitPrice(){
            setFetchFields("excludeFields","unitPrice");
            return this;
        }

        public QueryBuilder totalSumBetWeen(java.math.BigDecimal totalSumSt,java.math.BigDecimal totalSumEd){
            this.totalSumSt = totalSumSt;
            this.totalSumEd = totalSumEd;
            return this;
        }

        public QueryBuilder totalSumGreaterEqThan(java.math.BigDecimal totalSumSt){
            this.totalSumSt = totalSumSt;
            return this;
        }
        public QueryBuilder totalSumLessEqThan(java.math.BigDecimal totalSumEd){
            this.totalSumEd = totalSumEd;
            return this;
        }


        public QueryBuilder totalSum(java.math.BigDecimal totalSum){
            setTotalSum(totalSum);
            return this;
        }

        public QueryBuilder totalSumList(java.math.BigDecimal ... totalSum){
            this.totalSumList = solveNullList(totalSum);
            return this;
        }

        public QueryBuilder totalSumList(List<java.math.BigDecimal> totalSum){
            this.totalSumList = totalSum;
            return this;
        }

        public QueryBuilder fetchTotalSum(){
            setFetchFields("fetchFields","totalSum");
            return this;
        }

        public QueryBuilder excludeTotalSum(){
            setFetchFields("excludeFields","totalSum");
            return this;
        }

        public QueryBuilder flatcarCountBetWeen(Integer flatcarCountSt,Integer flatcarCountEd){
            this.flatcarCountSt = flatcarCountSt;
            this.flatcarCountEd = flatcarCountEd;
            return this;
        }

        public QueryBuilder flatcarCountGreaterEqThan(Integer flatcarCountSt){
            this.flatcarCountSt = flatcarCountSt;
            return this;
        }
        public QueryBuilder flatcarCountLessEqThan(Integer flatcarCountEd){
            this.flatcarCountEd = flatcarCountEd;
            return this;
        }


        public QueryBuilder flatcarCount(Integer flatcarCount){
            setFlatcarCount(flatcarCount);
            return this;
        }

        public QueryBuilder flatcarCountList(Integer ... flatcarCount){
            this.flatcarCountList = solveNullList(flatcarCount);
            return this;
        }

        public QueryBuilder flatcarCountList(List<Integer> flatcarCount){
            this.flatcarCountList = flatcarCount;
            return this;
        }

        public QueryBuilder fetchFlatcarCount(){
            setFetchFields("fetchFields","flatcarCount");
            return this;
        }

        public QueryBuilder excludeFlatcarCount(){
            setFetchFields("excludeFields","flatcarCount");
            return this;
        }

        public QueryBuilder flatcarFeeBetWeen(Integer flatcarFeeSt,Integer flatcarFeeEd){
            this.flatcarFeeSt = flatcarFeeSt;
            this.flatcarFeeEd = flatcarFeeEd;
            return this;
        }

        public QueryBuilder flatcarFeeGreaterEqThan(Integer flatcarFeeSt){
            this.flatcarFeeSt = flatcarFeeSt;
            return this;
        }
        public QueryBuilder flatcarFeeLessEqThan(Integer flatcarFeeEd){
            this.flatcarFeeEd = flatcarFeeEd;
            return this;
        }


        public QueryBuilder flatcarFee(Integer flatcarFee){
            setFlatcarFee(flatcarFee);
            return this;
        }

        public QueryBuilder flatcarFeeList(Integer ... flatcarFee){
            this.flatcarFeeList = solveNullList(flatcarFee);
            return this;
        }

        public QueryBuilder flatcarFeeList(List<Integer> flatcarFee){
            this.flatcarFeeList = flatcarFee;
            return this;
        }

        public QueryBuilder fetchFlatcarFee(){
            setFetchFields("fetchFields","flatcarFee");
            return this;
        }

        public QueryBuilder excludeFlatcarFee(){
            setFetchFields("excludeFields","flatcarFee");
            return this;
        }

        public QueryBuilder fuzzyOther (List<String> fuzzyOther){
            this.fuzzyOther = fuzzyOther;
            return this;
        }

        public QueryBuilder fuzzyOther (String ... fuzzyOther){
            this.fuzzyOther = solveNullList(fuzzyOther);
            return this;
        }

        public QueryBuilder rightFuzzyOther (List<String> rightFuzzyOther){
            this.rightFuzzyOther = rightFuzzyOther;
            return this;
        }

        public QueryBuilder rightFuzzyOther (String ... rightFuzzyOther){
            this.rightFuzzyOther = solveNullList(rightFuzzyOther);
            return this;
        }

        public QueryBuilder other(String other){
            setOther(other);
            return this;
        }

        public QueryBuilder otherList(String ... other){
            this.otherList = solveNullList(other);
            return this;
        }

        public QueryBuilder otherList(List<String> other){
            this.otherList = other;
            return this;
        }

        public QueryBuilder fetchOther(){
            setFetchFields("fetchFields","other");
            return this;
        }

        public QueryBuilder excludeOther(){
            setFetchFields("excludeFields","other");
            return this;
        }

        public QueryBuilder workDateBetWeen(java.time.LocalDate workDateSt,java.time.LocalDate workDateEd){
            this.workDateSt = workDateSt;
            this.workDateEd = workDateEd;
            return this;
        }

        public QueryBuilder workDateGreaterEqThan(java.time.LocalDate workDateSt){
            this.workDateSt = workDateSt;
            return this;
        }
        public QueryBuilder workDateLessEqThan(java.time.LocalDate workDateEd){
            this.workDateEd = workDateEd;
            return this;
        }


        public QueryBuilder workDate(String workDate){
            setWorkDate(workDate);
            return this;
        }

        public QueryBuilder workDateList(java.time.LocalDate ... workDate){
            this.workDateList = solveNullList(workDate);
            return this;
        }

        public QueryBuilder workDateList(List<java.time.LocalDate> workDate){
            this.workDateList = workDate;
            return this;
        }

        public QueryBuilder fetchWorkDate(){
            setFetchFields("fetchFields","workDate");
            return this;
        }

        public QueryBuilder excludeWorkDate(){
            setFetchFields("excludeFields","workDate");
            return this;
        }

        public QueryBuilder created_atBetWeen(java.time.LocalDateTime created_atSt,java.time.LocalDateTime created_atEd){
            this.created_atSt = created_atSt;
            this.created_atEd = created_atEd;
            return this;
        }

        public QueryBuilder created_atGreaterEqThan(java.time.LocalDateTime created_atSt){
            this.created_atSt = created_atSt;
            return this;
        }
        public QueryBuilder created_atLessEqThan(java.time.LocalDateTime created_atEd){
            this.created_atEd = created_atEd;
            return this;
        }


        public QueryBuilder created_at(java.time.LocalDateTime created_at){
            setCreated_at(created_at);
            return this;
        }

        public QueryBuilder created_atList(java.time.LocalDateTime ... created_at){
            this.created_atList = solveNullList(created_at);
            return this;
        }

        public QueryBuilder created_atList(List<java.time.LocalDateTime> created_at){
            this.created_atList = created_at;
            return this;
        }

        public QueryBuilder fetchCreated_at(){
            setFetchFields("fetchFields","created_at");
            return this;
        }

        public QueryBuilder excludeCreated_at(){
            setFetchFields("excludeFields","created_at");
            return this;
        }

        public QueryBuilder updated_atBetWeen(java.time.LocalDateTime updated_atSt,java.time.LocalDateTime updated_atEd){
            this.updated_atSt = updated_atSt;
            this.updated_atEd = updated_atEd;
            return this;
        }

        public QueryBuilder updated_atGreaterEqThan(java.time.LocalDateTime updated_atSt){
            this.updated_atSt = updated_atSt;
            return this;
        }
        public QueryBuilder updated_atLessEqThan(java.time.LocalDateTime updated_atEd){
            this.updated_atEd = updated_atEd;
            return this;
        }


        public QueryBuilder updated_at(java.time.LocalDateTime updated_at){
            setUpdated_at(updated_at);
            return this;
        }

        public QueryBuilder updated_atList(java.time.LocalDateTime ... updated_at){
            this.updated_atList = solveNullList(updated_at);
            return this;
        }

        public QueryBuilder updated_atList(List<java.time.LocalDateTime> updated_at){
            this.updated_atList = updated_at;
            return this;
        }

        public QueryBuilder fetchUpdated_at(){
            setFetchFields("fetchFields","updated_at");
            return this;
        }

        public QueryBuilder excludeUpdated_at(){
            setFetchFields("excludeFields","updated_at");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Wjjw build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> machineNameList;

        public List<String> getMachineNameList(){return this.machineNameList;}


        private List<String> fuzzyMachineName;

        public List<String> getFuzzyMachineName(){return this.fuzzyMachineName;}

        private List<String> rightFuzzyMachineName;

        public List<String> getRightFuzzyMachineName(){return this.rightFuzzyMachineName;}
        private List<String> workPlaceList;

        public List<String> getWorkPlaceList(){return this.workPlaceList;}


        private List<String> fuzzyWorkPlace;

        public List<String> getFuzzyWorkPlace(){return this.fuzzyWorkPlace;}

        private List<String> rightFuzzyWorkPlace;

        public List<String> getRightFuzzyWorkPlace(){return this.rightFuzzyWorkPlace;}
        private List<java.time.LocalDate> startTimeList;

        public List<java.time.LocalDate> getStartTimeList(){return this.startTimeList;}

        private java.time.LocalDate startTimeSt;

        private java.time.LocalDate startTimeEd;

        public java.time.LocalDate getStartTimeSt(){return this.startTimeSt;}

        public java.time.LocalDate getStartTimeEd(){return this.startTimeEd;}

        private List<java.time.LocalDate> endTimeList;

        public List<java.time.LocalDate> getEndTimeList(){return this.endTimeList;}

        private java.time.LocalDate endTimeSt;

        private java.time.LocalDate endTimeEd;

        public java.time.LocalDate getEndTimeSt(){return this.endTimeSt;}

        public java.time.LocalDate getEndTimeEd(){return this.endTimeEd;}

        private List<java.math.BigDecimal> workHoursList;

        public List<java.math.BigDecimal> getWorkHoursList(){return this.workHoursList;}

        private java.math.BigDecimal workHoursSt;

        private java.math.BigDecimal workHoursEd;

        public java.math.BigDecimal getWorkHoursSt(){return this.workHoursSt;}

        public java.math.BigDecimal getWorkHoursEd(){return this.workHoursEd;}

        private List<Integer> unitPriceList;

        public List<Integer> getUnitPriceList(){return this.unitPriceList;}

        private Integer unitPriceSt;

        private Integer unitPriceEd;

        public Integer getUnitPriceSt(){return this.unitPriceSt;}

        public Integer getUnitPriceEd(){return this.unitPriceEd;}

        private List<java.math.BigDecimal> totalSumList;

        public List<java.math.BigDecimal> getTotalSumList(){return this.totalSumList;}

        private java.math.BigDecimal totalSumSt;

        private java.math.BigDecimal totalSumEd;

        public java.math.BigDecimal getTotalSumSt(){return this.totalSumSt;}

        public java.math.BigDecimal getTotalSumEd(){return this.totalSumEd;}

        private List<Integer> flatcarCountList;

        public List<Integer> getFlatcarCountList(){return this.flatcarCountList;}

        private Integer flatcarCountSt;

        private Integer flatcarCountEd;

        public Integer getFlatcarCountSt(){return this.flatcarCountSt;}

        public Integer getFlatcarCountEd(){return this.flatcarCountEd;}

        private List<Integer> flatcarFeeList;

        public List<Integer> getFlatcarFeeList(){return this.flatcarFeeList;}

        private Integer flatcarFeeSt;

        private Integer flatcarFeeEd;

        public Integer getFlatcarFeeSt(){return this.flatcarFeeSt;}

        public Integer getFlatcarFeeEd(){return this.flatcarFeeEd;}

        private List<String> otherList;

        public List<String> getOtherList(){return this.otherList;}


        private List<String> fuzzyOther;

        public List<String> getFuzzyOther(){return this.fuzzyOther;}

        private List<String> rightFuzzyOther;

        public List<String> getRightFuzzyOther(){return this.rightFuzzyOther;}
        private List<java.time.LocalDate> workDateList;

        public List<java.time.LocalDate> getWorkDateList(){return this.workDateList;}

        private java.time.LocalDate workDateSt;

        private java.time.LocalDate workDateEd;

        public java.time.LocalDate getWorkDateSt(){return this.workDateSt;}

        public java.time.LocalDate getWorkDateEd(){return this.workDateEd;}

        private List<java.time.LocalDateTime> created_atList;

        public List<java.time.LocalDateTime> getCreated_atList(){return this.created_atList;}

        private java.time.LocalDateTime created_atSt;

        private java.time.LocalDateTime created_atEd;

        public java.time.LocalDateTime getCreated_atSt(){return this.created_atSt;}

        public java.time.LocalDateTime getCreated_atEd(){return this.created_atEd;}

        private List<java.time.LocalDateTime> updated_atList;

        public List<java.time.LocalDateTime> getUpdated_atList(){return this.updated_atList;}

        private java.time.LocalDateTime updated_atSt;

        private java.time.LocalDateTime updated_atEd;

        public java.time.LocalDateTime getUpdated_atSt(){return this.updated_atSt;}

        public java.time.LocalDateTime getUpdated_atEd(){return this.updated_atEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyMachineName (List<String> fuzzyMachineName){
            this.fuzzyMachineName = fuzzyMachineName;
            return this;
        }

        public ConditionBuilder fuzzyMachineName (String ... fuzzyMachineName){
            this.fuzzyMachineName = solveNullList(fuzzyMachineName);
            return this;
        }

        public ConditionBuilder rightFuzzyMachineName (List<String> rightFuzzyMachineName){
            this.rightFuzzyMachineName = rightFuzzyMachineName;
            return this;
        }

        public ConditionBuilder rightFuzzyMachineName (String ... rightFuzzyMachineName){
            this.rightFuzzyMachineName = solveNullList(rightFuzzyMachineName);
            return this;
        }

        public ConditionBuilder machineNameList(String ... machineName){
            this.machineNameList = solveNullList(machineName);
            return this;
        }

        public ConditionBuilder machineNameList(List<String> machineName){
            this.machineNameList = machineName;
            return this;
        }

        public ConditionBuilder fuzzyWorkPlace (List<String> fuzzyWorkPlace){
            this.fuzzyWorkPlace = fuzzyWorkPlace;
            return this;
        }

        public ConditionBuilder fuzzyWorkPlace (String ... fuzzyWorkPlace){
            this.fuzzyWorkPlace = solveNullList(fuzzyWorkPlace);
            return this;
        }

        public ConditionBuilder rightFuzzyWorkPlace (List<String> rightFuzzyWorkPlace){
            this.rightFuzzyWorkPlace = rightFuzzyWorkPlace;
            return this;
        }

        public ConditionBuilder rightFuzzyWorkPlace (String ... rightFuzzyWorkPlace){
            this.rightFuzzyWorkPlace = solveNullList(rightFuzzyWorkPlace);
            return this;
        }

        public ConditionBuilder workPlaceList(String ... workPlace){
            this.workPlaceList = solveNullList(workPlace);
            return this;
        }

        public ConditionBuilder workPlaceList(List<String> workPlace){
            this.workPlaceList = workPlace;
            return this;
        }

        public ConditionBuilder startTimeBetWeen(java.time.LocalDate startTimeSt,java.time.LocalDate startTimeEd){
            this.startTimeSt = startTimeSt;
            this.startTimeEd = startTimeEd;
            return this;
        }

        public ConditionBuilder startTimeGreaterEqThan(java.time.LocalDate startTimeSt){
            this.startTimeSt = startTimeSt;
            return this;
        }
        public ConditionBuilder startTimeLessEqThan(java.time.LocalDate startTimeEd){
            this.startTimeEd = startTimeEd;
            return this;
        }


        public ConditionBuilder startTimeList(java.time.LocalDate ... startTime){
            this.startTimeList = solveNullList(startTime);
            return this;
        }

        public ConditionBuilder startTimeList(List<java.time.LocalDate> startTime){
            this.startTimeList = startTime;
            return this;
        }

        public ConditionBuilder endTimeBetWeen(java.time.LocalDate endTimeSt,java.time.LocalDate endTimeEd){
            this.endTimeSt = endTimeSt;
            this.endTimeEd = endTimeEd;
            return this;
        }

        public ConditionBuilder endTimeGreaterEqThan(java.time.LocalDate endTimeSt){
            this.endTimeSt = endTimeSt;
            return this;
        }
        public ConditionBuilder endTimeLessEqThan(java.time.LocalDate endTimeEd){
            this.endTimeEd = endTimeEd;
            return this;
        }


        public ConditionBuilder endTimeList(java.time.LocalDate ... endTime){
            this.endTimeList = solveNullList(endTime);
            return this;
        }

        public ConditionBuilder endTimeList(List<java.time.LocalDate> endTime){
            this.endTimeList = endTime;
            return this;
        }

        public ConditionBuilder workHoursBetWeen(java.math.BigDecimal workHoursSt,java.math.BigDecimal workHoursEd){
            this.workHoursSt = workHoursSt;
            this.workHoursEd = workHoursEd;
            return this;
        }

        public ConditionBuilder workHoursGreaterEqThan(java.math.BigDecimal workHoursSt){
            this.workHoursSt = workHoursSt;
            return this;
        }
        public ConditionBuilder workHoursLessEqThan(java.math.BigDecimal workHoursEd){
            this.workHoursEd = workHoursEd;
            return this;
        }


        public ConditionBuilder workHoursList(java.math.BigDecimal ... workHours){
            this.workHoursList = solveNullList(workHours);
            return this;
        }

        public ConditionBuilder workHoursList(List<java.math.BigDecimal> workHours){
            this.workHoursList = workHours;
            return this;
        }

        public ConditionBuilder unitPriceBetWeen(Integer unitPriceSt,Integer unitPriceEd){
            this.unitPriceSt = unitPriceSt;
            this.unitPriceEd = unitPriceEd;
            return this;
        }

        public ConditionBuilder unitPriceGreaterEqThan(Integer unitPriceSt){
            this.unitPriceSt = unitPriceSt;
            return this;
        }
        public ConditionBuilder unitPriceLessEqThan(Integer unitPriceEd){
            this.unitPriceEd = unitPriceEd;
            return this;
        }


        public ConditionBuilder unitPriceList(Integer ... unitPrice){
            this.unitPriceList = solveNullList(unitPrice);
            return this;
        }

        public ConditionBuilder unitPriceList(List<Integer> unitPrice){
            this.unitPriceList = unitPrice;
            return this;
        }

        public ConditionBuilder totalSumBetWeen(java.math.BigDecimal totalSumSt,java.math.BigDecimal totalSumEd){
            this.totalSumSt = totalSumSt;
            this.totalSumEd = totalSumEd;
            return this;
        }

        public ConditionBuilder totalSumGreaterEqThan(java.math.BigDecimal totalSumSt){
            this.totalSumSt = totalSumSt;
            return this;
        }
        public ConditionBuilder totalSumLessEqThan(java.math.BigDecimal totalSumEd){
            this.totalSumEd = totalSumEd;
            return this;
        }


        public ConditionBuilder totalSumList(java.math.BigDecimal ... totalSum){
            this.totalSumList = solveNullList(totalSum);
            return this;
        }

        public ConditionBuilder totalSumList(List<java.math.BigDecimal> totalSum){
            this.totalSumList = totalSum;
            return this;
        }

        public ConditionBuilder flatcarCountBetWeen(Integer flatcarCountSt,Integer flatcarCountEd){
            this.flatcarCountSt = flatcarCountSt;
            this.flatcarCountEd = flatcarCountEd;
            return this;
        }

        public ConditionBuilder flatcarCountGreaterEqThan(Integer flatcarCountSt){
            this.flatcarCountSt = flatcarCountSt;
            return this;
        }
        public ConditionBuilder flatcarCountLessEqThan(Integer flatcarCountEd){
            this.flatcarCountEd = flatcarCountEd;
            return this;
        }


        public ConditionBuilder flatcarCountList(Integer ... flatcarCount){
            this.flatcarCountList = solveNullList(flatcarCount);
            return this;
        }

        public ConditionBuilder flatcarCountList(List<Integer> flatcarCount){
            this.flatcarCountList = flatcarCount;
            return this;
        }

        public ConditionBuilder flatcarFeeBetWeen(Integer flatcarFeeSt,Integer flatcarFeeEd){
            this.flatcarFeeSt = flatcarFeeSt;
            this.flatcarFeeEd = flatcarFeeEd;
            return this;
        }

        public ConditionBuilder flatcarFeeGreaterEqThan(Integer flatcarFeeSt){
            this.flatcarFeeSt = flatcarFeeSt;
            return this;
        }
        public ConditionBuilder flatcarFeeLessEqThan(Integer flatcarFeeEd){
            this.flatcarFeeEd = flatcarFeeEd;
            return this;
        }


        public ConditionBuilder flatcarFeeList(Integer ... flatcarFee){
            this.flatcarFeeList = solveNullList(flatcarFee);
            return this;
        }

        public ConditionBuilder flatcarFeeList(List<Integer> flatcarFee){
            this.flatcarFeeList = flatcarFee;
            return this;
        }

        public ConditionBuilder fuzzyOther (List<String> fuzzyOther){
            this.fuzzyOther = fuzzyOther;
            return this;
        }

        public ConditionBuilder fuzzyOther (String ... fuzzyOther){
            this.fuzzyOther = solveNullList(fuzzyOther);
            return this;
        }

        public ConditionBuilder rightFuzzyOther (List<String> rightFuzzyOther){
            this.rightFuzzyOther = rightFuzzyOther;
            return this;
        }

        public ConditionBuilder rightFuzzyOther (String ... rightFuzzyOther){
            this.rightFuzzyOther = solveNullList(rightFuzzyOther);
            return this;
        }

        public ConditionBuilder otherList(String ... other){
            this.otherList = solveNullList(other);
            return this;
        }

        public ConditionBuilder otherList(List<String> other){
            this.otherList = other;
            return this;
        }

        public ConditionBuilder workDateBetWeen(java.time.LocalDate workDateSt,java.time.LocalDate workDateEd){
            this.workDateSt = workDateSt;
            this.workDateEd = workDateEd;
            return this;
        }

        public ConditionBuilder workDateGreaterEqThan(java.time.LocalDate workDateSt){
            this.workDateSt = workDateSt;
            return this;
        }
        public ConditionBuilder workDateLessEqThan(java.time.LocalDate workDateEd){
            this.workDateEd = workDateEd;
            return this;
        }


        public ConditionBuilder workDateList(java.time.LocalDate ... workDate){
            this.workDateList = solveNullList(workDate);
            return this;
        }

        public ConditionBuilder workDateList(List<java.time.LocalDate> workDate){
            this.workDateList = workDate;
            return this;
        }

        public ConditionBuilder created_atBetWeen(java.time.LocalDateTime created_atSt,java.time.LocalDateTime created_atEd){
            this.created_atSt = created_atSt;
            this.created_atEd = created_atEd;
            return this;
        }

        public ConditionBuilder created_atGreaterEqThan(java.time.LocalDateTime created_atSt){
            this.created_atSt = created_atSt;
            return this;
        }
        public ConditionBuilder created_atLessEqThan(java.time.LocalDateTime created_atEd){
            this.created_atEd = created_atEd;
            return this;
        }


        public ConditionBuilder created_atList(java.time.LocalDateTime ... created_at){
            this.created_atList = solveNullList(created_at);
            return this;
        }

        public ConditionBuilder created_atList(List<java.time.LocalDateTime> created_at){
            this.created_atList = created_at;
            return this;
        }

        public ConditionBuilder updated_atBetWeen(java.time.LocalDateTime updated_atSt,java.time.LocalDateTime updated_atEd){
            this.updated_atSt = updated_atSt;
            this.updated_atEd = updated_atEd;
            return this;
        }

        public ConditionBuilder updated_atGreaterEqThan(java.time.LocalDateTime updated_atSt){
            this.updated_atSt = updated_atSt;
            return this;
        }
        public ConditionBuilder updated_atLessEqThan(java.time.LocalDateTime updated_atEd){
            this.updated_atEd = updated_atEd;
            return this;
        }


        public ConditionBuilder updated_atList(java.time.LocalDateTime ... updated_at){
            this.updated_atList = solveNullList(updated_at);
            return this;
        }

        public ConditionBuilder updated_atList(List<java.time.LocalDateTime> updated_at){
            this.updated_atList = updated_at;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Wjjw obj;

        public Builder(){
            this.obj = new Wjjw();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder machineName(String machineName){
            this.obj.setMachineName(machineName);
            return this;
        }
        public Builder workPlace(String workPlace){
            this.obj.setWorkPlace(workPlace);
            return this;
        }
        public Builder startTime(String startTime){
            this.obj.setStartTime(startTime);
            return this;
        }
        public Builder endTime(String endTime){
            this.obj.setEndTime(endTime);
            return this;
        }
        public Builder workHours(java.math.BigDecimal workHours){
            this.obj.setWorkHours(workHours);
            return this;
        }
        public Builder unitPrice(Integer unitPrice){
            this.obj.setUnitPrice(unitPrice);
            return this;
        }
        public Builder totalSum(java.math.BigDecimal totalSum){
            this.obj.setTotalSum(totalSum);
            return this;
        }
        public Builder flatcarCount(Integer flatcarCount){
            this.obj.setFlatcarCount(flatcarCount);
            return this;
        }
        public Builder flatcarFee(Integer flatcarFee){
            this.obj.setFlatcarFee(flatcarFee);
            return this;
        }
        public Builder other(String other){
            this.obj.setOther(other);
            return this;
        }
        public Builder workDate(String workDate){
            this.obj.setWorkDate(workDate);
            return this;
        }
        public Builder created_at(java.time.LocalDateTime created_at){
            this.obj.setCreated_at(created_at);
            return this;
        }
        public Builder updated_at(java.time.LocalDateTime updated_at){
            this.obj.setUpdated_at(updated_at);
            return this;
        }
        public Wjjw build(){return obj;}
    }

}

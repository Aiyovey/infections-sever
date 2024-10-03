package com.jd.infectious.business.newcase;

import com.jd.infectious.common.vo.NewCaseDataVO;
import com.jd.infectious.constant.InfectionsConstant;
import com.jd.infectious.domain.NewCaseData;
import com.jd.infectious.service.NewCaseDataService;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class NewCaseBusiness {

    @Autowired
    private NewCaseDataService newCaseDataService;

    public NewCaseDataVO getNewCaseData() {
        List<NewCaseData> list = newCaseDataService.getList();
        List<DefaultKeyValue<Integer, Integer>> newCaseData = new ArrayList<>();
        List<DefaultKeyValue<Integer, String>> xLabels = new ArrayList<>();
//        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            newCaseData.add(new DefaultKeyValue<>(list.get(i).getStep(), i+1));
        }
        int maxStep = list.get(list.size()-1).getStep();
        int maxDay = maxStep / 28800 + 1;
        for (int i=0; i< maxDay; i++) {
            xLabels.add(new DefaultKeyValue<>(i*28800, "第"+(i+1)+"天"));
        }
        NewCaseDataVO res = new NewCaseDataVO();
        res.setCaseData(newCaseData);
        res.setXlabel(xLabels);
        return res;
    }

    /**
     * 获取感染模拟当前结果
     * @return 当前结果
     */
    public Map<String, Object> getInfectionRes() {
        Map<String, Object> res = new HashMap<>(16);
        long infectionNum = newCaseDataService.getInfectionNum();
        res.put(InfectionsConstant.INFECTION_NUM, infectionNum);
        return res;
    }
}

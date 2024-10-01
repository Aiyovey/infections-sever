package com.jd.infectious.mapper;

import com.jd.infectious.domain.NewCaseDataEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class NewCaseDataMapper2 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 全量查询
     *
     * @return List<NewCaseData>
     */
    public List<NewCaseDataEntity> getList() {
        String sql = "SELECT  *  FROM new_case_data ";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(NewCaseDataEntity.class));
    }

    /**
     * 插入
     *
     * @param NewCaseData
     * @return int
     */
//    public int insert(NewCaseData NewCaseData) {
//        String sql = " INSERT INTO user (id,type,gender,age,resistance,is_regular_customer,initial_state,booths_id,booths_polygon," +
//                "center_longitude,center_latitude,visit_day,visit_hour,visit_time_slice,move_pattern,market_entrance," +
//                "market_export,market_start_time,market_end_time,region,entrance_id,exit_id,start_time,end_time,start_state,end_state) " +
//                "values(,,,,,,,,,,,,,,,,,,,,,,,,,)";
//
//        return jdbcTemplate.update(sql, NewCaseData.getId(), NewCaseData.getAgentType());
//    }

    /**
     * 按 agentId 查询
     * @param agentId
     * @return
     */
    public NewCaseDataEntity getNewCaseDataByAgentId(Integer agentId) {
        final NewCaseDataEntity NewCaseDataEntity = new NewCaseDataEntity();

        //SQL
        String sql = "SELECT *  FROM agent_visit WHERE agent_id = " + agentId;

        jdbcTemplate.query(sql, new RowCallbackHandler() {
            //映射每行数据
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                NewCaseDataEntity.setIdx(rs.getInt("idx"));
                NewCaseDataEntity.setAgentNum(rs.getInt("agent_num"));
                NewCaseDataEntity.setAgentId(rs.getInt("agent_id"));
                NewCaseDataEntity.setIsNewCase(rs.getInt("is_new_case"));
                NewCaseDataEntity.setParentCase(rs.getInt("parent_case"));
                NewCaseDataEntity.setStep(rs.getInt("step"));
                NewCaseDataEntity.setRegion(rs.getInt("region"));
            }
        });
        return NewCaseDataEntity;
    }
}

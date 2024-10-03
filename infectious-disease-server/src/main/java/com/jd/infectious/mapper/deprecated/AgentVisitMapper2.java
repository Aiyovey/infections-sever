package com.jd.infectious.mapper.deprecated;

import com.jd.infectious.domain.AgentVisit;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Deprecated
@Repository
public class AgentVisitMapper2 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 全量查询
     *
     * @return List<AgentVisit>
     */
    public List<AgentVisit> getList() {
        String sql = "SELECT  *  FROM agent_visit ";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(AgentVisit.class));
    }

    /**
     * 插入
     *
     * @param agentVisit
     * @return int
     */
//    public int insert(AgentVisit agentVisit) {
//        String sql = " INSERT INTO user (id,type,gender,age,resistance,is_regular_customer,initial_state,booths_id,booths_polygon," +
//                "center_longitude,center_latitude,visit_day,visit_hour,visit_time_slice,move_pattern,market_entrance," +
//                "market_export,market_start_time,market_end_time,region,entrance_id,exit_id,start_time,end_time,start_state,end_state) " +
//                "values(,,,,,,,,,,,,,,,,,,,,,,,,,)";
//
//        return jdbcTemplate.update(sql, agentVisit.getId(), agentVisit.getAgentType());
//    }

    /**
     * 按 id 查询
     * @param id
     * @return
     */
    public AgentVisit getAgentVisitById(Integer id) {
        final AgentVisit AgentVisit = new AgentVisit();

        //SQL
        String sql = "SELECT *  FROM agent_visit WHERE id = " + id;

        jdbcTemplate.query(sql, new RowCallbackHandler() {
            //映射每行数据
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                AgentVisit.setIdx(rs.getInt("idx"));
                AgentVisit.setId(rs.getInt("id"));
                AgentVisit.setAgentType(rs.getInt("type"));
                AgentVisit.setGender(rs.getInt("gender"));
                AgentVisit.setAge(rs.getInt("age"));
                AgentVisit.setResistance(rs.getDouble("resistance"));
                AgentVisit.setIsRegularCustomer(rs.getInt("is_regular_customer"));
                AgentVisit.setInitialState(rs.getInt("initial_state"));
                AgentVisit.setBoothsId(rs.getInt("booths_id"));
                AgentVisit.setBoothsPolygon(rs.getString("booths_polygon"));
                AgentVisit.setCenterLongitude(rs.getDouble("center_longitude"));
                AgentVisit.setCenterLatitude(rs.getDouble("center_latitude"));
                AgentVisit.setVisitDay(rs.getInt("visit_day"));
                AgentVisit.setVisitHour(rs.getInt("visit_hour"));
                AgentVisit.setVisitTimeSlice(rs.getInt("visit_time_slice"));
                AgentVisit.setMovePattern(rs.getInt("move_pattern"));
                AgentVisit.setMarketEntrance(rs.getInt("market_entrance"));
                AgentVisit.setMarketExport(rs.getInt("market_export"));
                AgentVisit.setMarketStartTime(rs.getInt("market_start_time"));
                AgentVisit.setMarketEndTime(rs.getInt("market_end_time"));
                AgentVisit.setRegion(rs.getInt("region"));
                AgentVisit.setEntranceId(rs.getInt("entrance_id"));
                AgentVisit.setExitId(rs.getInt("exit_id"));
                AgentVisit.setStartTime(rs.getInt("start_time"));
                AgentVisit.setEndTime(rs.getInt("end_time"));
                AgentVisit.setStartState(rs.getInt("start_state"));
                AgentVisit.setEndState(rs.getInt("end_state"));
            }
        });
        return AgentVisit;
    }
}

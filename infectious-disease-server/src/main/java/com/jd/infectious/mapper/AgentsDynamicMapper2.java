package com.jd.infectious.mapper;

import com.jd.infectious.domain.AgentsDynamic;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AgentsDynamicMapper2 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 全量查询
     * @return List<AgentsDynamic>
     */
    public List<AgentsDynamic> getList() {
        String sql = "SELECT  *  FROM agents_dynamic ";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(AgentsDynamic.class));
    }

    /**
     * 插入
     * @param agentsDynamic
     * @return int
     */
    public int insert(AgentsDynamic agentsDynamic) {
        String sql = " INSERT INTO user (step , agent , longitude , latitude, state, virusLoadQuantity ) values(?,?,?,?,?,?)";

        return jdbcTemplate.update(sql, agentsDynamic.getStep(), agentsDynamic.getAgent(), agentsDynamic.getLongitude(), agentsDynamic.getLatitude(), agentsDynamic.getState(), agentsDynamic.getVirusLoadQuantity());
    }

    /**
     * 按 agent 查询
     * @param agent
     * @return
     */
    public AgentsDynamic getAgentDynamicByAgent(Integer agent) {
        final AgentsDynamic agentsDynamic = new AgentsDynamic();

        //SQL
        String sql = "SELECT *  FROM agents_dynamic WHERE agent = " + agent;

        jdbcTemplate.query(sql, new RowCallbackHandler() {
            //映射每行数据
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                agentsDynamic.setIdx(rs.getInt("idx"));
                agentsDynamic.setStep(rs.getInt("step"));
                agentsDynamic.setAgent(rs.getInt("agent"));
                agentsDynamic.setLongitude(rs.getDouble("longitude"));
                agentsDynamic.setLatitude(rs.getDouble("latitude"));
                agentsDynamic.setState(rs.getInt("state"));
                agentsDynamic.setVirusLoadQuantity(rs.getInt("virusLoadQuantity"));
            }
        });
        return agentsDynamic;
    }
}

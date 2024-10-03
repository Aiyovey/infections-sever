package com.jd.infectious.mapper.deprecated;

import com.jd.infectious.domain.AgentsStatic;
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
public class AgentsStaticMapper2 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 全量查询
     *
     * @return List<AgentsStatic>
     */
    public List<AgentsStatic> getList() {
        String sql = "SELECT  *  FROM agents_static ";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(AgentsStatic.class));
    }

    /**
     * 插入
     *
     * @param agentsStatic
     * @return int
     */
    public int insert(AgentsStatic agentsStatic) {
        String sql = " INSERT INTO user (id, type, gender, age, resistance, is_regular_customer, initial_state, booths_id, booths_polygon, center_longitude, center_latitude ) values(?,?,?,?,?,?,?,?,?,?,?)";

        return jdbcTemplate.update(sql, agentsStatic.getId(), agentsStatic.getType(), agentsStatic.getGender(), agentsStatic.getAge(), agentsStatic.getResistance(), agentsStatic.getIsRegularCustomer(), agentsStatic.getInitialState(), agentsStatic.getBoothsId(), agentsStatic.getBoothsPolygon(), agentsStatic.getCenterLongitude(), agentsStatic.getCenterLatitude());
    }

    /**
     * 按 id 查询
     * @param id
     * @return
     */
    public AgentsStatic getAgentDynamicById(Integer id) {
        final AgentsStatic agentsStatic = new AgentsStatic();

        //SQL
        String sql = "SELECT *  FROM agents_static WHERE id = " + id;

        jdbcTemplate.query(sql, new RowCallbackHandler() {
            //映射每行数据
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                agentsStatic.setIdx(rs.getInt("idx"));
                agentsStatic.setId(rs.getInt("id"));
                agentsStatic.setType(rs.getInt("type"));
                agentsStatic.setGender(rs.getInt("gender"));
                agentsStatic.setAge(rs.getInt("age"));
                agentsStatic.setResistance(rs.getDouble("resistance"));
                agentsStatic.setIsRegularCustomer(rs.getInt("is_regular_customer"));
                agentsStatic.setInitialState(rs.getInt("initial_state"));
                agentsStatic.setBoothsId(rs.getInt("booths_id"));
                agentsStatic.setBoothsPolygon(rs.getString("booths_polygon"));
                agentsStatic.setCenterLongitude(rs.getDouble("center_longitude"));
                agentsStatic.setCenterLatitude(rs.getDouble("center_latitude"));
            }
        });
        return agentsStatic;
    }
}

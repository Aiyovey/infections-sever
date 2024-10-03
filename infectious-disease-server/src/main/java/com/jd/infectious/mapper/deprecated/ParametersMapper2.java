package com.jd.infectious.mapper.deprecated;

import com.jd.infectious.domain.Parameters;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Deprecated
public class ParametersMapper2 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 全量查询
     * @return List<Parameters>
     */
    public List<Parameters> getList() {
        String sql = "SELECT  *  FROM parameters ";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Parameters.class));
    }

    /**
     * 插入
     * @param parameters
     * @return int
     */
    public int insert(Parameters parameters) {
        String sql = " INSERT INTO user (idx , name , value) values(?,?,?)";

        return jdbcTemplate.update(sql, parameters.getIdx(), parameters.getName(), parameters.getValue());
    }

    /**
     * 按 参数名称name 查询
     * @param name
     * @return Parameters
     */
    public Parameters getAgentDynamicByName(String name) {
        final Parameters parameters = new Parameters();

        //SQL
        String sql = "SELECT *  FROM parameters WHERE name = " + name;

        jdbcTemplate.query(sql, new RowCallbackHandler() {
            //映射每行数据
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                parameters.setIdx(rs.getInt("idx"));
                parameters.setName(rs.getString("name"));
                parameters.setValue(rs.getString("value"));
            }
        });
        return parameters;
    }
}

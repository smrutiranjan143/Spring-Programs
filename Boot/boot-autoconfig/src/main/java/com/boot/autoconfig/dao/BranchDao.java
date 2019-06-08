package com.boot.autoconfig.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.boot.autoconfig.bo.BranchBo;

@Repository
public class BranchDao {
	private final String SQL_SELECT_BRANCHES = "select branch_no, branch_nm, ifsc_code, address_line1, city, state from branch";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<BranchBo> getBranches() {
		return jdbcTemplate.query(SQL_SELECT_BRANCHES, (rs, rowNum) -> {
			BranchBo bo = null;
			bo = new BranchBo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6));
			return bo;
		});
	}

}

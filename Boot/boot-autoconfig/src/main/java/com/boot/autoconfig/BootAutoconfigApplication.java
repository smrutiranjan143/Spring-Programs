package com.boot.autoconfig;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.autoconfig.bo.BranchBo;
import com.boot.autoconfig.dao.BranchDao;

@SpringBootApplication
public class BootAutoconfigApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		BranchDao branchDao = null;

		context = SpringApplication.run(BootAutoconfigApplication.class, args);
		branchDao = context.getBean("branchDao", BranchDao.class);
		List<BranchBo> branches = branchDao.getBranches();
		System.out.println(branches);

		System.exit(SpringApplication.exit(context));
	}

}

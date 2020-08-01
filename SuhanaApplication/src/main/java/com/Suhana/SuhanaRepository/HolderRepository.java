package com.Suhana.SuhanaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.Suhana.SuhanaModel.Holder;

public interface HolderRepository extends JpaRepository<Holder, Integer> {
	
	@Transactional
	@Modifying
	@Query("update Holder set balance=?1 where accNum=?2")
	Integer updatebalance(int balance,int accNum);
	
	
}

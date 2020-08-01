package com.Suhana.SuhanaRepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Suhana.SuhanaModel.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> 
{
	@Query(nativeQuery = true,value="SELECT * FROM Transaction h ORDER BY h.trans_id DESC LIMIT 0,5")
	Iterable<Transaction> findByTop(); 
}

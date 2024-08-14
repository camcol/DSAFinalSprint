package com.keyin.finalsprint.repository;


import com.keyin.finalsprint.model.TreeRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<TreeRecord, Long> {
}

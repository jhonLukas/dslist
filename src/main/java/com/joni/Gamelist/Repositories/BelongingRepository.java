package com.joni.Gamelist.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joni.Gamelist.entities.Belonging;
import com.joni.Gamelist.entities.BelongingPK;

@Repository
public interface BelongingRepository extends JpaRepository<Belonging, BelongingPK> {
}

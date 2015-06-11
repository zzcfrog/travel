package com.zack.travel.dao;

import org.springframework.stereotype.Repository;

import com.zack.travel.domain.TravelTestDO;

@Repository
public interface ITravelTestDAO {

	public TravelTestDO getById(long id);
}

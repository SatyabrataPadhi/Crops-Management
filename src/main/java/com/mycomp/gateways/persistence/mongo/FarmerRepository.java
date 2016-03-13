package com.mycomp.gateways.persistence.mongo;

import com.mycomp.gateways.persistence.Farmer;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by spadhi on 13/03/16.
 */
@Repository
public interface FarmerRepository extends MongoRepository<Farmer, String> {

}

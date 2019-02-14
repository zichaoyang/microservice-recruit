package com.stalary.pf.user.repo;

import com.stalary.pf.user.data.entity.UserEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Stalary
 * @description
 * @date 2019/2/14
 */
@Repository
public interface UserEsRepo extends ElasticsearchCrudRepository<UserEs, Long> {

}

package com.cjimgarten.dummy.model.data;

import com.cjimgarten.dummy.model.Dummy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by chris on 8/8/17.
 */
@Repository
@Transactional
public interface DummyDao extends CrudRepository<Dummy, Integer> {
}

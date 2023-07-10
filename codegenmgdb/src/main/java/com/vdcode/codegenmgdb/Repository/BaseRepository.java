package com.vdcode.codegenmgdb.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
@Primary
public interface BaseRepository<T, ID> extends MongoRepository<T, ID> {
}

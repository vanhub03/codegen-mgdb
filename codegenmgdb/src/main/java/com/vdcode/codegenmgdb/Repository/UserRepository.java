package com.vdcode.codegenmgdb.Repository;

import com.vdcode.codegenmgdb.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User,String>{
}

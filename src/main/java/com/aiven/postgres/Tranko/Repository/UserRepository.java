package com.aiven.postgres.Tranko.Repository;

import com.aiven.postgres.Tranko.Entity.User;
import org.hibernate.type.descriptor.java.LongJavaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

package org.sid.signaturebackend.repos;

import org.sid.signaturebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User , Long> {
}

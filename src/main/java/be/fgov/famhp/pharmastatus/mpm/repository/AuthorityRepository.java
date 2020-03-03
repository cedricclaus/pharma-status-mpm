package be.fgov.famhp.pharmastatus.mpm.repository;

import be.fgov.famhp.pharmastatus.mpm.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}

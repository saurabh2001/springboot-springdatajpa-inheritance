package example.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity Company.
 * 
 * @see example.models.UserBaseRepository
 */
@Transactional
public interface CompanyRepository extends UserBaseRepository<Company> { }

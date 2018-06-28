package example.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity Person.
 * 
 * @see example.models.UserBaseRepository
 */
@Transactional
public interface PersonRepository extends UserBaseRepository<Person> { }

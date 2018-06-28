package example.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity User.
 * 
 * @see example.models.UserBaseRepository
 */
@Transactional
public interface UserRepository extends UserBaseRepository<User> { }

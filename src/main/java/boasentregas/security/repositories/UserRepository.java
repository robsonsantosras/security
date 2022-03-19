package boasentregas.security.repositories;

import boasentregas.security.models.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Login,String> {

 }

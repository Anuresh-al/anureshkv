package web.application.phaseone;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopperRepository extends MongoRepository<Shopper, String>{

}

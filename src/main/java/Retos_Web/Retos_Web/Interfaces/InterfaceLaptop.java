package Retos_Web.Retos_Web.Interfaces;

import Retos_Web.Retos_Web.Model.Laptop;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Juan
 */
public interface InterfaceLaptop extends MongoRepository<Laptop, Integer>{
    
}

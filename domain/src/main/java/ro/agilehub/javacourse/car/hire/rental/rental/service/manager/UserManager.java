package ro.agilehub.javacourse.car.hire.rental.rental.service.manager;


import org.springframework.stereotype.Component;
import ro.agilehub.javacourse.car.hire.rental.rental.service.domain.UserDO;

import java.util.Optional;
@Component
public interface UserManager {

    Optional<UserDO> getById(Integer id);

}

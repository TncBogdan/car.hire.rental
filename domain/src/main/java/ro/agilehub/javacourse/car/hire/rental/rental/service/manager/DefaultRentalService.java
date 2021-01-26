package ro.agilehub.javacourse.car.hire.rental.rental.service.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.rental.rental.service.definition.RentalService;
import ro.agilehub.javacourse.car.hire.rental.rental.service.domain.RentalDO;
import ro.agilehub.javacourse.car.hire.rental.rental.service.domain.RentalStatusDO;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class DefaultRentalService implements RentalService {

    private final UserManager userManager;
    private final CarManager carManager;
    private final RentalManager rentalManager;

    @Override
    public Integer createNewRental(RentalDO example) {
        var userDo = userManager.getById(example.getUser().getId());
        var carDo = carManager.getById(example.getCar().getId());
        if (userDo.isPresent() && carDo.isPresent()) {
            example.setStatus(RentalStatusDO.ACTIVE);
            return rentalManager.save(example);
        }
        throw new NoSuchElementException();
    }
}
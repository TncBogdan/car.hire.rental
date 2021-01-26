package ro.agilehub.javacourse.car.hire.rental.rental.service.domain;


import java.time.OffsetDateTime;

public record RentalDO(Integer id, UserDO user, CarDO car, OffsetDateTime startDate, OffsetDateTime endDate,
                       RentalStatusDO status) {

    @Override
    public Integer id() {
        return id;
    }

    public void setStatus(RentalStatusDO active) {
    }
}

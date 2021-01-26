package ro.agilehub.javacourse.car.hire.rental.rental.service.domain;

public record CarDO(Integer id) {
    @Override
    public Integer id() {
        return id;
    }
}

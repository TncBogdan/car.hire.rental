package ro.agilehub.javacourse.car.hire.rental.rental.service.domain;


public record UserDO(Integer id, String email, String username, String firstName, String lastName, String driverLicense,
                     UserStatusDO status) {

    @Override
    public Integer id() {
        return id;
    }
}

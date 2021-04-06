package person;

import person.hair.Hair;

public class PersonBuilder {
    private String id;
    private Fio fio;
    private Physical phys;
    private Hair hair;
    private Eye eye;
    private Phone phone;

    public final PersonBuilder setId(final String inputId) {
        this.id = inputId;
        return this;
    }


    public final PersonBuilder setFio(final Fio inputFio) {
        this.fio = inputFio;
        return this;
    }

    public final PersonBuilder setPhys(final Physical inputPhys) {
        this.phys = inputPhys;
        return this;
    }

    public final PersonBuilder setHair(final Hair inputHair) {
        this.hair = inputHair;
        return this;
    }

    public final PersonBuilder setEye(final Eye inputEye) {
        this.eye = inputEye;
        return this;
    }

    public final PersonBuilder setPhone(final Phone inputPhone) {
        this.phone = inputPhone;
        return this;
    }

    public final Person build() {
        final Person person = new Person();
        person.setId(this.id);
        person.setFio(this.fio);
        person.setPhys(this.phys);
        person.setHair(this.hair);
        person.setEye(this.eye);
        person.setPhone(this.phone);
        return person;
    }
}

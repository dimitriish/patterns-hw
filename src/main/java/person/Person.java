package person;

import person.hair.Hair;

public class Person {

    private String id;
    private Fio fio;
    private Physical phys;
    private Hair hair;
    private Eye eye;
    private Phone phone;

    public final void setId(final String id) {
        this.id = id;
    }

    public final void setFio(final Fio fio) {
        this.fio = fio;
    }

    public final void setPhys(final Physical phys) {
        this.phys = phys;
    }

    public final void setHair(final Hair hair) {
        this.hair = hair;
    }

    public final void setEye(final Eye eye) {
        this.eye = eye;
    }

    public final void setPhone(final Phone phone) {
        this.phone = phone;
    }



    /*public Person(final String id,
                  final String lastName,
                  final String firstName,
                  final String middleName,
                  final Physical phys,
                  final Appearance appearance,
                  final Phone phone) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phys = phys;
        this.appearance = appearance;
        this.phone = phone;
    }*/


    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(fio).append("\n")
                .append(phys).append("\n")
                .append(eye).append("\n")
                .append(hair).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}
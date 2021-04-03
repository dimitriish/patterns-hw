import generators.PhoneGenerator;
import generators.EyeGenerator;
import generators.FioGenerator;
import generators.HairGenerator;
import generators.PhysGenerator;
import person.Eye;
import person.Fio;
import person.Phone;
import person.Physical;
import person.hair.Hair;
import person.PersonBuilder;

public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            final int intCode = Integer.parseInt(input);

            final Fio fio = new FioGenerator().buildResponse(intCode);

            final Physical physical = new PhysGenerator().buildResponse(intCode);

            final Hair hair = new HairGenerator().buildResponse(intCode);

            final Eye eye = new EyeGenerator().buildResponse(intCode);

            Phone phone = null;
            // добавляем телефон, только если введённый код не палиндром
            if (!input.equals(new StringBuilder(input).reverse().toString())) {

                phone = new PhoneGenerator().buildResponse(intCode);
            }


            PersonBuilder personBuilder = new PersonBuilder();
            result = personBuilder
                    .setId(input)
                    .setFio(fio)
                    .setPhys(physical)
                    .setHair(hair)
                    .setEye(eye)
                    .setPhone(phone)
                    .build()
                    .toString();
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}

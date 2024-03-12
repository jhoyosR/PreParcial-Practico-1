public class Main {
    public static void main(String[] args) {
        PersonaDAO dao = new PersonaDAO();

        PersonaImpl persona1 = new PersonaImpl("Juan","Rojas",23);
        PersonaImpl persona2 = new PersonaImpl("Juan","Rojas",23);

        dao.save(persona1);
        dao.save(persona2);

        dao.readName(persona1);
        dao.updateAge(persona2, 31);
        dao.remove(persona1);
        dao.displayPeople();
    }
}

import java.util.ArrayList;

public class PersonaDAO {
    public ArrayList<PersonaImpl> personas;

    public PersonaDAO() {
        personas = new ArrayList<>();
    }

    public void save(PersonaImpl persona){
        personas.add(persona);
    }

    public String readName(PersonaImpl persona){
        return persona.getNombre();
    }

    public void updateAge(PersonaImpl persona, int newAge){
            persona.setEdad(newAge);
    }

    public void remove(PersonaImpl persona){
        personas.remove(persona);
    }

    public void displayPeople(){
        for (PersonaImpl persona : personas){
            System.out.println(persona);
        }
    }

}

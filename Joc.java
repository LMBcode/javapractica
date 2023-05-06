import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Joc {
    private List<Personatge> personatges;
    private Personatge personatgeActiu;

    public Joc() {
        personatges = new ArrayList<>();
    }

    public void crearPersonatge(String nom, int PS, int PA, int PD, int PEX) {
        personatges.add(new Personatge(nom, PS, PA, PD, PEX));
    }

    public void eliminarPersonatge(int index) {
        if (index >= 0 && index < personatges.size()) {
            personatges.remove(index);
        }
    }

    public void modificarPersonatge(int index, String nom, int PS, int PA, int PD, int PEX) {
        if (index >= 0 && index < personatges.size()) {
            Personatge p = personatges.get(index);
            p.setNom(nom);
            p.setPS(PS);
            p.setPA(PA);
            p.setPD(PD);
            p.setPEX(PEX);
        }
    }

    public void iniciarCombat() {
        if (personatges.size() < 2) {
            System.out.println("No hay suficientes personajes para iniciar un combate.");
            return;
        }

        Random random = new Random();
        Personatge personatge1 = personatges.get(random.nextInt(personatges.size()));
        Personatge personatge2 = personatges.get(random.nextInt(personatges.size()));

        while (personatge1 == personatge2) {
            personatge2 = personatges.get(random.nextInt(personatges.size()));
        }

        System.out.println("Iniciando combate entre " + personatge1.getNom() + " y " + personatge2.getNom());
    }

}

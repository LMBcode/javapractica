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

        while (personatge1.getPS() > 0 && personatge2.getPS() > 0) {
            // Personatge 1 ataca a personatge 2
            int dany1 = personatge1.getPA() - personatge2.getPD();
            if (dany1 > 0) {
                personatge2.setPS(personatge2.getPS() - dany1);
            }

            // Personatge 2 ataca a personatge 1
            int dany2 = personatge2.getPA() - personatge1.getPD();
            if (dany2 > 0) {
                personatge1.setPS(personatge1.getPS() - dany2);
            }
        }

        if (personatge1.getPS() <= 0 && personatge2.getPS() <= 0) {
            System.out.println("El combate ha terminado en empate.");
        } else if (personatge1.getPS() > 0) {
            System.out.println("El combate ha terminado. El ganador es " + personatge1.getNom());
        } else {
            System.out.println("El combate ha terminado. El ganador es " + personatge2.getNom());
        }
    }

}

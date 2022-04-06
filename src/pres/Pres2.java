package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) throws Exception {

        /*
            Injection des dépendance par instanciation dynamique
         */

        // lire le fichier config.txt
        Scanner scanner = new Scanner(new File("src/config.txt"));

        // On va lire la premier ligne du fichier config.txt
        String daoClassName = scanner.nextLine();
        // On va charger le nom de la class
        Class cDao = Class.forName(daoClassName);
        // On va créer une instance de cette class
        IDao dao = (IDao) cDao.newInstance();


        // On va lire la deuxième ligne du fichier config.txt
        String metierClassName = scanner.nextLine();
        // On va charger le nom de la class
        Class cMetier = Class.forName(metierClassName);
        // On va créer une instance de cette class
        IMetier metier = (IMetier) cMetier.newInstance();


        /*
        Pour faire appel à une méthode dynamique on créé l'objet
        method, on spécifie le nom de la méthode
         */
        Method method = cMetier.getMethod("setDao", IDao.class);
        // metier.setDao(dao)
        // fait appel à la méthode invoke
        method.invoke(metier, dao);

        //System.out.println(dao.getData());
        System.out.println("Résultat => "+metier.calcul());
    }

}

# enset_ico
 
<h1> PARTIE 1 : </h1>
<p>
 Dans cette partie, on va créer une application fermée à la modification et ouverte à l'extension.
 Dans le premier temps nous allons voir comment créer cette application, et comment donc utiliser 
 qu'on appelle l'injection des dépendances et comment à la fin introduire la version de controle.
</p>

<h3> étape 1 : </h3>

<p>
 Tout d'abord on va créer une interface qu'on appelle IDao, voir le code dans le package dao.
 puis on va créer une classe qu'on appelle DaoImpl qui implémente l'interface IDao. voir le code dans le même package de IDao.
</p>

<h3> étape 2 : </h3>

 <p>
 Après cette étap on va créer la deuxième interface IMetier dans le package metier, puis on va créer une classe MetierImpl qui implémente l'interface IMetier.
</p>

<h3> étape 3 : </h3>

<p>
 En fin on va créer la classe Presentation dans le package pres, ce classe contient la méthode main pour fait l'exécution de l'application.
</p>

![image](https://user-images.githubusercontent.com/61559275/162483804-abcbf293-aa80-4b50-96bc-0f603f5f1bb4.png)


<h3> étape 4 : </h3>

<p>
 On exécute l'application et on obtient le résultat suivant :
</p>

![image](https://user-images.githubusercontent.com/61559275/162481393-8e92c377-e459-4adf-952d-4724208f6db9.png)

<p> Alors cette application n'est pas fermée à la modification et ouverte à l'extension car dans la classe principal Presentation<br>
 parce que on utulise le couplage fort c-à-d on instancier les objet avec la méthode new.
</p>
 
 <h3> étape 5 : </h3>
 
<p>
 Maintenant on va créer la deuxième version de l'application.
 On va créer la classe DaoImpl2 dans le package ext, ce classe implémente l'interface IDao.
On va changer le type de l'objet dao (DaoImpl vers DaoImpl2) dans la classe principal Presentation.
</p>

![image](https://user-images.githubusercontent.com/61559275/162483901-32c3124b-3750-4855-975b-d78422ae50ad.png)


<p>
 On exécute l'application et on obtient le résultat suivant :
</p>

![image](https://user-images.githubusercontent.com/61559275/162483607-79755381-8981-454e-9f4f-0186a8bbdc85.png)

<h3> étape 6 : </h3>

<p>
 Dans cette étape on va créer un fichier qu'on appelle config  de type txt qui contient les noms des classes pour fait l'instanciation dynamique.
</p>

![image](https://user-images.githubusercontent.com/61559275/162485700-8a883e1b-564b-4ed4-b301-59c82cdc6c1d.png)

<p>
 puis on va créer une nouvelle classe principal qu'on applle Pres2 qui contient la méthode main aussi.
 Dans ce classe on va créer un objet de type Scanner pour lire le fichier config, voir le code dans le package pres.
</p>

<p>
 On exécute l'application et on obtient le résultat suivant :
</p>

<p> avec la premier version : </p>

![image](https://user-images.githubusercontent.com/61559275/162487423-950d408f-1ee4-4d0c-ad98-fdb0e70b3ef2.png)

![image](https://user-images.githubusercontent.com/61559275/162487278-365fddc7-d436-4466-9566-f458875f911c.png)

<p> Avec la deuxième version : </p>

![image](https://user-images.githubusercontent.com/61559275/162487712-e1ef6ed1-ff03-4f20-ad8b-4e6963bfa79d.png)

![image](https://user-images.githubusercontent.com/61559275/162487829-472d56d5-2197-48d3-852d-6890c8e2cdf9.png)

<p>
 Maintenant on a créé une application dynamique sans framework.
</p>



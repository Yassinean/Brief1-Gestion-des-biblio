# Gestion de Bibliothèque - Application Console
## Description
Ce projet est une application console développée en Java 8 pour gérer une bibliothèque municipale. L'application permet d'automatiser la gestion des livres et des magazines, ainsi que la gestion des emprunts et retours de documents. Elle est conçue avec une architecture en couches pour séparer la logique métier, la présentation, et les utilitaires.

## Fonctionnalités
L'application offre les fonctionnalités suivantes :

##### Ajouter un document : Permet d'ajouter un livre ou un magazine à la bibliothèque.
##### Emprunter un document : Permet d'emprunter un document en le marquant comme indisponible.
##### Retourner un document : Permet de retourner un document emprunté, le rendant à nouveau disponible.
##### Afficher tous les documents : Affiche la liste de tous les livres et magazines disponibles dans la bibliothèque.
##### Rechercher un document : Recherche un document par son titre et affiche ses détails.
##### Quitter : Quitte l'application.
## Structure du Projet
Le projet est organisé en trois couches principales :

### Couche de Présentation (src.presentation) :

###### ConsoleUI : Interface utilisateur en ligne de commande qui permet d'interagir avec l'utilisateur et de collecter ses choix.
### Couche Métier (src.metier) :

###### Document : Classe abstraite qui représente un document générique.
###### Livre : Sous-classe de Document représentant un livre.
###### Magazine : Sous-classe de Document représentant un magazine.
###### Bibliotheque : Classe qui gère les documents et les opérations d'ajout, de recherche, d'emprunt, et de retour.
### Couche Utilitaire (src.utilitaire) :

###### DateUtils : Classe utilitaire pour la manipulation et la validation des dates.
## Installation
Cloner le dépôt :

bash
Copy code
git clone https://github.com/Yassinean/gestion-bibliotheque.git
cd gestion-bibliotheque
Importer dans votre IDE : Importez le projet en tant que projet Maven/Java dans votre IDE (IntelliJ IDEA, Eclipse, etc.).

Compiler le projet : Compilez le projet à l'aide de votre IDE ou via Maven si vous utilisez un fichier pom.xml.

Exécuter l'application : Exécutez la classe ConsoleUI pour démarrer l'application console.

## Utilisation
Une fois l'application démarrée, vous serez accueilli par un menu interactif vous permettant de naviguer entre les différentes fonctionnalités. Suivez les instructions à l'écran pour ajouter, emprunter, retourner, afficher ou rechercher des documents dans la bibliothèque.

## Exemples de commande
Ajouter un livre : Sélectionnez l'option 1, choisissez "Livre", et saisissez les informations demandées.
Rechercher un document : Sélectionnez l'option 5, et tapez le titre du document que vous souhaitez rechercher.
## Technologies
Java 8
Java Time API : Pour la gestion des dates.
Collections Java (ArrayList, HashMap) : Pour stocker et gérer les documents.
Contribuer
Les contributions sont les bienvenues ! Si vous avez des idées d'améliorations ou si vous trouvez des bugs, n'hésitez pas à ouvrir une issue ou à soumettre une pull request.

## Auteurs
Yassine Hanach - YouCode student - https://github.com/Yassinean
## Licence
Ce projet est sous licence MIT - voir le fichier LICENSE pour plus de détails.
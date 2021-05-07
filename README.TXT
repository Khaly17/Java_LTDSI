            Exo1:

Implémenter les classes Document, Livre et Roman. Ces documents doivent être automatiquement numérotés en commençant par le numéro 1. (1,5 Pt)
Implémenter pour les ces différentes classes la méthode toString() produisant une description sous forme de chaîne de caractères des objets. (0,5 Pt)
La classe Bibliothèque: Une bibliothèque sera représentée par une collection (documents) de documents (Livres et Romans).
Définissez la classe Bibliotheque, avec une telle collection en plus de son nom et de sa capacité (le nombre maximum de documents  qu’elle peut contenir). (1 Pt)
Implémenter la méthode findDocuments () permettant d’affiche tous les ouvrages de la bibliothèque. (1 Pt)
Implémenter la méthode findDocumentByTitre (String titre) permettant  d’affiche les informations de l’ouvrage dont le titre est passé en paramètre. (1 Pt)
Implémenter la méthode addDocument (Document doc) permettant d’ajouter le document indiqué en paramètre à la collection de documents, au cas où il n’y a plus de place pour le document (si on dépasse la capacité de la bibliothèque), cette méthode doit lever une exception PlusDePlaceException. Vous devez créer la classe d’exception personnalisée PlusDePlaceException. (3 Pts)
Dans une classe de teste: (2 Pts)
Créer  Deux livres,
Créer  Deux romans,
Créer  Une bibliothèque,
Ajouter les quatre documents à la bibliothèque,
Afficher la liste des documents de la bibliothèque,


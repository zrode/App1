Petite appli qui montre les 3 types d'injection de dépendances : 

PrésentationV1 -> injection de dépendance statique via le mutateur (setter)

PrésentationV2 -> injection de dépendance statique via le constructeur

PrésentationV3 -> injection de dépendance dynamique via un fichier de configuration : config.txt. Dans la réalité, on utilisera des fichiers de configuration XML ou YML

Les versions V1 et V2 présentent un soucis : elles ne sont pas fermées à la modification (principes SOLID).

Pour ce faire, il faut utiliser l'instanciation dynamique.

Cependant, si on a une application importante, il sera lourd de procéder ainsi. Il vaudrait donc mieux avoir recours à un framework tel que Spring afin d'éviter la répétition de code technique qui ne fera que polluer notre code.

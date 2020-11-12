# Aufgabe 1 Factory Pattern (1 Punkt)
Das Factory Pattern steht in Konkurrenz zur Erzeugung von Objekten direkt über ihren Konstruktor.
Geben Sie ein eigenes Beispiel an, bei man eher ein Factory Pattern verwenden sollte und begründen
Sie es.  
Demonstrieren Sie das Factory Pattern an einem einfachen Beispiel Ihrer Wahl in einem Java Programm.

### Answer:
In meinem Beispiel haben wir ein Computerspiel, welches verschiedene Räume generiert.
Der RaumCreator selbst beinhaltet allgemeine Logiken, wie Wände bauen, welche jeder Raum braucht.
In den jeweiligen Trap und Treasure Factories wird dann ein Raum entsprechend des Types erstellt.
Sie enthalten eigene Methoden, welche nur sie brauchen.

Das Model besteht aus einem allgemeinem Raum und verschiedenen Spezifikationen.

Vorteil des Factory Pattern:  
Der Raum ist wirklich nur ein Objekt zum Informationen bewahren und hat selbst keine Logik.
Die Logik wie der Raum aufgebaut wird befindet sich in der jeweiligen Factory.
Wenn der Client einen Raum erstellen will, dann braucht er nicht alle Informationen bereit zu stellen.
Die Factory kapselt die Informationen ab, welche es vom Client benötigt und holt sich die anderen Informationen selbst.

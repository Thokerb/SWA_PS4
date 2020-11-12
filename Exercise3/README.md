# Aufgabe 3 Anti-Pattern (1 Punkt)
Neben den Entwurfsmustern für eine gute SW-Architektur gibt es auch eine Reihe von
Entwurfsmustern die eine problematische SW-Architektur kennzeichnen: Diese werden als AntiPattern bezeichnet.  
### Recherchieren Sie dazu typische Beispiele
1. Wählen Sie drei Antipattern aus, und beschreiben Sie sie mit eigenen Worten.
2. Ist Ihnen eines dieser Anti-Pattern bereits in Ihrer Informatikerlaufbahn begegnet?  
---
1. Reinvent The Wheel [[1]](#1)  
Es gibt bereits eine bestehende Lösung, bzw. in einem anderen Projekt gibt es Funktionalität die sehr ähnlich ist.
Es ist meist sinnvoller den bestehenden Code wiederzuverwenden, da dieser bereits erprobt ist und edge - cases abdeckt. Selbst schon einmal passiert mit einer beliebten REST API wo ich selbst Rate Limiting, etc eingebaut habe, anstatt bestehende Projekte zu verwenden / erweitern.
2. Cover Your Assets [[1]](#1)  
Oft wird Software von 3. in Auftrag gegeben. Diese verfassen dann Dokumente, welche die Software und Anforderungen beschreibt.
In der Realität kommt es leider oft vor, dass diese Personen jedoch selber nicht genau wissen was sie wollen, bzw widersprüchliche Angaben hinterlegen. Hier ist es dann die Aufgabe des Softwarearchitekten bzw. Project Owner mit dem Kunden diese Unstimmigkeiten zu klären und dem Kunden mögliche Optionen zu zeigen.
3. Stovepipe Enterprise [[1]](#1)    
Stovepipe auf deutsch Ofenrohr beschreibt ein Rohr welches immer wieder notdürftig geflickt wird. (Es gibt mehrere Stovepipe AntiPatterns, finde diese Definition nur der Vollständigkeit halber wichtig.)  
StovePipe Enterprise beschreibt uneinheitliche Architektur imd GuideLines innerhalb eines Unternehmens bei mehreren Projekten. Hierduch wird Wiederverwendbarkeit erschwert.
Ursachen: Keine Firmenstrategie / Guidelines, zu wenig Kommunikation


## References
<a id="1">
Brown, W. H. et al. “AntiPatterns: Refactoring Software, Architectures, and Projects in Crisis.” (1998).
</a>
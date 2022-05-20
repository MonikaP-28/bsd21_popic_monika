# Warum werden Logging Bibliotheken verwendet?
- Beim Entwickeln von Algorithmen müssen eine Vielzahl von Informationen ausgegeben werden,
um den Ablauf nachvollziehen zu können. Oftmals fügt man in großen Softwareprojekten eine
Standardausgabe ein (siehe Abbildung), welche die interessanten Parameter herausschreibt. Um
diesen Schritt effektiver zu gestalten, existieren bereits fertige Bibliotheken wie glog oder log4cxx.
Diese stellen Schnittstellen bereit, mit denen in Abhängigkeit vom gewünschten Detailgrad der
Protokollierung die Daten der Algorithmen effizient weitergeben werden können. 

*Quelle: https://ifte.de/lehre/projekt_gmt/themen_19/18_krinke_auswahl_und_einsatz_einer_logging-bibliothek.pdf*

# Welche Loglevel gibt es in Log4J und was hat es damit auf sich?
- Log4j ist ein Framework zum Loggen von Anwendungsmeldungen in Java. Innerhalb vieler Open-Source- und kommerzieller Softwareprodukte hat es sich über die Jahre zu einem De-facto-Standard entwickelt. Log4j gilt als Vorreiter für andere Logging-Frameworks, auch in anderen Programmiersprachen.

*Quelle: https://de.wikipedia.org/wiki/Log4j*

- ALL
- DEBUG
- INFO
- WARN
- ERROR
- FATAL
- TRACE

*Quelle: https://www.tutorialspoint.com/log4j/log4j_logging_levels.htm*

# Was für Konfiguationsmöglichkeiten bietet Ihnen log4J?
- Log4j2 folgt einer Suchreihenfolge, um nach den Konfigurationsdateien zu suchen

- Log4j hat die Fähigkeit, sich während der Initialisierung automatisch selbst zu konfigurieren. Wenn Log4j startet, findet es alle ConfigurationFactory-Plugins und ordnet sie in gewichteter Reihenfolge von der höchsten zur niedrigsten. Im Auslieferungszustand enthält Log4j vier ConfigurationFactory-Implementierungen: eine für JSON, eine für YAML, eine für Eigenschaften und eine für XML
*Quelle: http://makeseleniumeasy.com/2021/03/24/log4j2-tutorial-3-setup-console-appender-using-xml-configuration-file/#Automatic_Configuration*
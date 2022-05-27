## Was ist notwendig um Maven Site Dokumentation zu genreiren?
- ![Mvn](resources/images/mvn.png)

## Welche unterschiedlichen Aspekte, Konfigurationen, Informationen usw. werden in site.xml bzw. pom.xml konfiguriert?
- Ein Projektobjektmodell oder POM ist die grundlegende Arbeitseinheit in Maven. Es ist eine XML-Datei, die Informationen über das Projekt und Konfigurationsdetails enthält, die von Maven zum Erstellen des Projekts verwendet werden. Es enthält Standardwerte für die meisten Projekte. Beispiele hierfür sind das Build-Verzeichnis, das Ziel ist, das Quellverzeichnis, das src/main/java ist, das Testquellverzeichnis, das src/test/java ist, usw. Beim Ausführen einer Aufgabe oder eines Ziels sucht Maven im aktuellen Verzeichnis nach dem POM. Es liest das POM, ruft die erforderlichen Konfigurationsinformationen ab und führt dann das Ziel aus.

Einige der Konfigurationen, die im POM angegeben werden können, sind die Projektabhängigkeiten, die Plugins oder Ziele, die ausgeführt werden können, die Build-Profile und so weiter. Auch andere Informationen wie Projektversion, Beschreibung, Entwickler, Mailinglisten und dergleichen können angegeben werden.

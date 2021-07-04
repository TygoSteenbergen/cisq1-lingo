# CISQ1: Lingo Trainer
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=TygoSteenbergen_cisq1-lingo&metric=alert_status)](https://sonarcloud.io/dashboard?id=TygoSteenbergen_cisq1-lingo)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=TygoSteenbergen_cisq1-lingo&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=TygoSteenbergen_cisq1-lingo)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=TygoSteenbergen_cisq1-lingo&metric=coverage)](https://sonarcloud.io/dashboard?id=TygoSteenbergen_cisq1-lingo)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=TygoSteenbergen_cisq1-lingo&metric=security_rating)](https://sonarcloud.io/dashboard?id=TygoSteenbergen_cisq1-lingo)

##OWASP:  
###A1:2017 Injection:  
Injection kan plaats vinden wanneer een aanvaller data kan sturen naar de interperter van een systeem  
Het project heeft één injection weakness. In de guess methode wordt een attemptDTO geserialiseerd met daarin een string value. Deze string wordt uiteindelijk in de database   gezet en kan dus gebruikt worden om ongeautoriseerde invloed te hebben op de database.


###A9:2017 Using Components with Known Vulnerabilities:  
Deze weakness komt voor wanneer er veel externe componenten worden gebruikt die niet periodiek worden geüpdatet en gecheckt op kwetsbaarheden.  
Om dit te voorkomen gebruiken we dependency check maven. Dependency check maven is een plugin die de dependencies checkt op openbaar gemaakte kwetsbaarheden.


###A10:2017 Insufficient Logging and Monitoring:  
Een veel voorkomend probleem in het beschermen tegen aanvallen is een tekort aan logging. Zonder logging kan een potentiële aanvaller ongemerkt naar kwetsbaarheden in het systeem zoeken.  
Een goede manier om te testen of je genoeg logging en monitoring hebt is het uitvoeren van penetration testing, ofwel een nagebootste aanval op het systeem. Hierna moet er genoeg informatie vanuit het systeem komen om te weten welke delen van het systeem zijn aangetast.

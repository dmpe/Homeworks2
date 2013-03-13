This is an ReadMe file for Aufgabe 1

Holidays: some updates done. 

The task was (in germany):

> Programmieren Sie einen Geldautomaten in Java, welcher die Funktionalität zur EC-Karteneingabe, PIN-Eingabe, Geldauszahlung und Kontostandsabfrage über Methoden für den Benutzer bereitstellt.
> 
> (a)
> 
> Für die Repräsentation eines Kontos und einer EC-Karte sind die Klassen Account und CashCard anzulegen. Die Klasse Account verfügt über die Attribute accountNumber (Speicherung der Kontonummer), overdraft (Dispokredit des Kontos) und bankDeposit (die Höhe des Kontoguthabens).
> 
> Die Klasse CashCard verfügt über das Attribut der Kontonummer (accountNumber). Erstellen Sie zu den jeweiligen Klassen auch die nötigen Konstruktoren und Getter/Setter-Methoden.
> 
> (b)
> 
> Programmieren Sie einen Geldautomaten (CashMachine). Diese Klasse verfügt über ein Attribute Account[] accounts in dem alle Konten abgespeichert werden, auf die über den Geldautomat zugegriffen werden kann. Ein weiteres Attribut ist CashCard cashCard (zur Speicherung der EC-Karte). Außerdem ist ein Enum-Typ (State) mit folgenden Werten zu erstellen:
> 
>  
> - READY Automat ohne Karte
>  
> - CARD_INSERTED Automat mit Karte
> 
> Mit diesen Werten wird der Status des Geldautomaten repräsentiert.
> 
> Implementieren Sie folgende Methoden für den Automaten (die PIN-Eingabe wird noch zurückgestellt):
> 
> 
-  Karteneingabe
> 
> **public void insertCashCard(CashCard cashCard)**
> 
> Nur im Zustand READY können die Informationen der eingegebenen Cashcard im Attribute cashCard abgespeichert werden. Bei erfolgreicher Eingabe wechselt der Zustand von READY auf CARD_INSERTED. Der Status des Automaten soll auf der Konsole protokolliert werden.
> 
> 
-    Abheben
> 
> **public void withdraw(double amount)**
> 
> Das Abheben kann nur erfolgen wenn der Geldautomat im Zustand CARD_INSERTED ist. Der angegebene Betrag kann vom Konto abgehoben werden, solange es den Dispokredit nicht überschreitet. Außerdem muss das Kontoguthaben neu berechnet und auf der Konsole ausgegeben werden.
> 
> 
-  Kontoinformationen
> 
> **public void accountStatement()**
> 
> Ausgabe der aktuellen Kontoinformationen auf der Konsole, nur möglich im Zustand CARD_INSERTED.
> 
>
-  Kartenauswurf
> 
> **public void ejectCashCard()**
> 
> Der Geldautomat wird auf den Status READY gesetzt, das Attribute cashCard wird zur Nullreferenz. Das ist nur möglich im Zustand CARD_INSERTED. Der Status des Automaten soll auf der Konsole protokolliert werden.
> 
> (c)
> 
> Erweitern Sie die Klasse Account um das Attribut int pin (steht natürlich für die zur Karte gehörende PIN). In der Klasse CashMachine erweitern Sie den Enum Typ State um folgende Werte:
> 
> 
- PIN_CORRECT Automat mit Karte und korrekter PIN-Eingabe
> 
> 
- PIN_WRONG Automat mit Karte und falscher PIN-Eingabe
> 
> Des Weiteren implementieren Sie folgende Methode:
> 
>  **public void enterPin(int pin)**
> 
> Die Methode gleicht die Eingabe des Pins mit dem Pin des gerade verwendeten Accounts ab. Bei korrekter Eingabe wechselt der Zustand des Geldautomaten in PIN_CORRECT. Bei Falscheingabe in PIN_WRONG. Der Status des Automaten soll auf der Konsole protokolliert werden.
> 
> Im Zustand PIN_WRONG, ist das Ausführen von weiteren Methoden nicht möglich.
> 
> Beachten Sie, dass Geld nur noch abgehoben werden kann, wenn der Pin korrekt ist. Die Methoden accountStatement() und ejectCashCard() können auch im Zustand PIN_CORRECT ausgeführt werden.
> 
> Weitere Informationen:
> 
> Wählen Sie für die jeweiligen Attribute die passenden Datentypen aus (falls nicht gegeben).
> 
> Innerhalb der main-Methode einer Testklasse soll der Automat und seine Funktionen überprüft werden. Erstellen Sie hierzu ein CashMachine-Objekt, welches mehrere Konten verwaltet. Überprüfen Sie durch Aufruf der einzelnen Methoden, ob sich der Automat im jeweiligen Zustand korrekt verhält.
> 
> Befindet sich der Geldautomat in einem Zustand in dem eine Methode nicht korrekt ausgeführt werden kann, ist eine Exception zu werfen. Hierfür schreiben und verwenden Sie ihre eigene Exception-Klasse die von der Exception IllegalStateException abgeleitet wird (es handelt sichhier um eine RuntimeException!). Mit Hilfe Ihrer Exception soll ein kleiner Infotext über den Ausfallgrund in der Konsole ausgegeben.
> 
> 
> Viel Spass! :-)
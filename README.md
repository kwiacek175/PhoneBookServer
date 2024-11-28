

## 1. Opis

Projekt jest komunikatorem sieciowym typu klient-serwer, który umożliwia zarządzanie książką telefoniczną. Program składa się z serwera, który obsługuje wielu klientów, oraz z klientów, którzy mogą wysyłać komendy do serwera w celu zarządzania kontaktami w książce telefonicznej. Komunikacja między serwerem a klientami odbywa się za pomocą gniazd sieciowych.

Serwer obsługuje różne operacje na książce telefonicznej, takie jak:
- **LOAD** – wczytanie książki telefonicznej z pliku.
- **SAVE** – zapisanie książki telefonicznej do pliku.
- **GET** – pobranie numeru telefonu po nazwisku.
- **DELETE** – usunięcie kontaktu po nazwisku.
- **PUT** – dodanie nowego kontaktu.
- **REPLACE** – zastąpienie numeru telefonu w kontakcie.
- **LIST** – wypisanie wszystkich kontaktów.
- **CLOSE** – zakończenie sesji.
- **BYE** – zakończenie połączenia z klientem.

Klienci mogą się łączyć z serwerem, wysyłać zapytania i odbierać odpowiedzi.


## 2. Narzędzia wykorzystane
- **Java SE**: Użyto języka programowania Java oraz jego bibliotek do implementacji serwera i klientów.
- **Swing**: Biblioteka Java Swing do tworzenia GUI dla serwera.
- **Gniazda sieciowe (Sockets)**: Wykorzystano gniazda sieciowe do komunikacji klient-serwer.

## 3. Struktura plików
- `PhoneBookServer.java`: Implementacja serwera, który nasłuchuje na porcie i obsługuje klientów.
- `PhoneBook.java`: Klasa zawierająca logikę zarządzania książką telefoniczną.
- `PhoneBookClient.java`: Klasa reprezentująca klienta, który łączy się z serwerem i wysyła zapytania.
- `ClientThread.java`: Klasa, która tworzy wątki do obsługi klientów i realizuje komunikację.
- `Tester.java`: Klasa uruchamiająca serwer i symulująca działanie dwóch klientów.

## 4. Funkcjonalności

- **Obsługa wielu klientów**: Serwer może obsługiwać wielu klientów jednocześnie.
- **Zarządzanie książką telefoniczną**: Klient wysyła komendy do serwera, który wykonuje operacje na książce telefonicznej.
- **Komunikacja w czasie rzeczywistym**: Klienci i serwer wymieniają wiadomości w czasie rzeczywistym.
- **GUI serwera**: Serwer posiada interfejs graficzny (GUI) do zarządzania połączeniami i wiadomościami od klientów.

### Dostępne komendy:
- `LOAD <file>` – Wczytuje książkę telefoniczną z pliku.
- `SAVE <file>` – Zapisuje książkę telefoniczną do pliku.
- `GET <name>` – Pobiera numer telefonu przypisany do nazwy.
- `DELETE <name>` – Usuwa kontakt.
- `PUT <name> <number>` – Dodaje nowy kontakt.
- `REPLACE <name> <number>` – Zastępuje numer telefonu w istniejącym kontakcie.
- `LIST` – Wypisuje wszystkie kontakty.
- `CLOSE` – Zamyka sesję.
- `BYE` – Kończy połączenie z klientem.

## 5. Używanie aplikacji

1. **Uruchomienie serwera:**
   - Aby uruchomić serwer, wystarczy uruchomić klasę `PhoneBookServer`. Serwer zacznie nasłuchiwać na porcie 25000.
   - Serwer będzie oczekiwał na połączenie od klientów i będzie w stanie obsłużyć wiele połączeń jednocześnie.

2. **Uruchomienie klienta:**
   - Klient można uruchomić poprzez klasę `PhoneBookClient`, przekazując w konstruktorze nazwę użytkownika oraz adres serwera.
   - Klient łączy się z serwerem, a użytkownik może wysyłać różne komendy do zarządzania książką telefoniczną.
   - Klient może wykonywać komendy, takie jak `LOAD`, `SAVE`, `GET`, `DELETE`, `PUT`, `REPLACE`, `LIST`, `CLOSE`, `BYE`.

3. **Interfejs graficzny:**
   - Serwer posiada prosty interfejs graficzny, który umożliwia wybór klienta i wysyłanie wiadomości do wybranego klienta. Wszystkie interakcje z klientami są wyświetlane w oknie dialogowym.




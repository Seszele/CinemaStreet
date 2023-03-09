# CinemaStreet
## Projekt na przedmiot "Technologie Obiektowe" realizowany w 2022/2023
## Opis
Aplikacja służy do zarządzania sprzedażą biletów w kinie. Umożliwia zarządzanie użytkownikami, w tym rolami Moderatora, Użytkownika i Administratora. Pozwala na sprzedaż biletów oraz zarządzanie filmami i seansami, w tym generowanie rekomendacji. Istnieje możliwość odświeżenia planu sali kinowej z pliku .json oraz generowania statystyk dotyczących sprzedaży biletów i popularności filmów. Aplikacja umożliwia także wysyłanie maili z rekomendacjami filmów użytkownikom.
## Technologie
- Java 17
- Spring Boot 3.0.0
- Hibernate (za pośrednictwem Spring Boot Starter Data JPA)
- JavaFX 17
- Baza danych H2 (do testów)
- Jackson Databind 2.14.0 (do przetwarzania JSON)
- Spring Boot Starter Mail (do integracji z pocztą elektroniczną)

## Menu główne
![Screenshot 2023-03-09 194402](https://user-images.githubusercontent.com/75536188/224133498-973d62f9-d854-4362-a23a-61493117d774.jpg)
## Strona filmów (filtrowanie, wyszukiwanie, dodawanie, usuwanie, rekomendowanie)
![Screenshot 2023-03-09 194339](https://user-images.githubusercontent.com/75536188/224133527-74d2f807-46d6-41d2-a02f-a7f85815f6ea.jpg)
## Widok szczegółowy filmu z edycją
![Screenshot 2023-03-09 200343](https://user-images.githubusercontent.com/75536188/224133542-a62f43b2-afa9-4863-a06d-d452c45b69da.jpg)

Her er en ny iterasjon som tar utgangspunkt i mange av de samme ideene som potion-bryggingen, men med et scenario som er intuitivt og enkelt å forstå uten å lene seg på magiske elementer. Eksempelet er morsomt, intuitivt, og lett gjenkjennbart:

---

# 📜 PRD: Gordon Ramsay’s Ultimate Burger Builder 🍔🔥

## 🎯 Formål og oversikt

Programmet simulerer kjendiskokken Gordon Ramsay, som bygger den perfekte hamburger ved å legge ingredienser i riktig rekkefølge. Målet er å vise hvordan man bruker `main`-metoden for testing, demonstrerer debugging-teknikker i Java, og lager automatiske tester for å bekrefte at oppskriften følges.

Programmet skal være **enkelt**, **morsomt**, **tydelig stateful**, og det skal være intuitivt hvorfor feil ingrediens eller feil rekkefølge fører til et dårlig resultat.

---

## 🍔 Programbeskrivelse

Gordon Ramsay skal lage sin berømte hamburger. Burgeren består av følgende ingredienser:

* 🍞 **Brød (bunn og topp)**
* 🥩 **Burgerkjøtt**
* 🧀 **Cheddarost**
* 🥬 **Salat**
* 🍅 **Tomat**
* 🧅 **Løk**
* 🥓 **Sprøstekt bacon**
* 🍔 **Spesialsaus**

En riktig rekkefølge er:

1. Brød (bunn)
2. Spesialsaus
3. Salat
4. Tomat
5. Løk
6. Burgerkjøtt
7. Cheddarost (smeltet på kjøttet)
8. Bacon
9. Brød (topp)

Burgerens kvalitet avhenger av ingrediensenes rekkefølge og tilstedeværelse.

---

## 🎯 Hva skal demonstreres?

* Hvordan bruke `main`-metoden til enkel egentesting av koden.
* Hvordan debugging fungerer i praksis (steg-for-steg gjennomgang med breakpoints).
* Hvordan automatiserte tester kan verifisere korrekt oppførsel.

---

## ⚠️ Eksempler på feil som kan introduseres

| Feiltype                        | Eksempel                                             | Konsekvens (Feilmelding fra Ramsay)                     |
| ------------------------------- | ---------------------------------------------------- | ------------------------------------------------------- |
| **Feil rekkefølge-logikk**      | Cheddar legges før kjøttet.                          | *«Are you mad? You melted cheese directly on the bun!»* |
| **Off-by-one feil**             | Toppen av brødet mangler (siste ingrediens uteblir). | *«This burger has no top bun! It's an open disaster!»*  |
| **Glemt å nullstille tilstand** | Rester fra forrige burger er med i ny burger.        | *«Why is yesterday’s bacon in today's burger?»*         |
| **Feil betingelse i if-sjekk**  | Burger uten kjøtt blir akseptert.                    | *«There's no burger patty! Are you a vegetarian now?»*  |

---

## 🐞 Hvordan oppdages feilene?

Feilene blir svært tydelige gjennom Gordon Ramsays humoristiske og kritiske kommentarer printet i konsollen:

* Feil ingrediensrekkefølge:
  `"💥 Gordon Ramsay yells: 'You placed the lettuce on top of the bun? What a disaster!'"`

* Manglende ingredienser:
  `"🚨 Gordon Ramsay shouts: 'There's no cheese in my burger! Unbelievable!'"`

* Glemt nullstilling:
  `"⚠️ Gordon Ramsay screams: 'Who put yesterday's sauce on today's masterpiece?!'"`

---

## 🛠️ Hvordan løses feilene?

| Feiltype                       | Løsning                                                  |
| ------------------------------ | -------------------------------------------------------- |
| **Feil rekkefølge-logikk**     | Innføre korrekt rekkefølgesjekk (f.eks. via liste).      |
| **Off-by-one feil**            | Justere indeksering riktig (bruk av debugger).           |
| **Glemt nullstilling**         | Tilbakestille burger-tilstand etter hver bygging.        |
| **Feil betingelse i if-sjekk** | Korrigere logikken (f.eks. bruk debugger for å avdekke). |

---

## 🔍 Hvordan debugges feilene steg-for-steg?

Bruk IDE-debugger (f.eks. IntelliJ):

1. **Sette Breakpoints:**
   Sett breakpoints ved starten av `addIngredient()`-metoden.

2. **Stepping Through:**
   Stegvis gjennomgang av hver ingrediens som legges til.

3. **Inspeksjon av variabler:**
   Observer hvordan `burgerState`, `ingredientsList`, og indekser oppfører seg.

4. **Evaluer uttrykk:**
   Bruk `Evaluate Expression` for å teste om ingrediensene er lagt i riktig rekkefølge.

---

## ✅ Hvordan skrives og brukes tester?

JUnit-tester kan brukes til å bekrefte at burgeren er riktig bygget, eksempelvis:

```java
@Test
public void testPerfectBurger() {
  Burger burger = new Burger();
  burger.addIngredient("Brød (bunn)");
  burger.addIngredient("Spesialsaus");
  burger.addIngredient("Salat");
  burger.addIngredient("Tomat");
  burger.addIngredient("Løk");
  burger.addIngredient("Burgerkjøtt");
  burger.addIngredient("Cheddarost");
  burger.addIngredient("Bacon");
  burger.addIngredient("Brød (topp)");

  assertEquals("🍔 Ultimate Burger Complete", burger.getResult());
}

@Test
public void testMissingPatty() {
  Burger burger = new Burger();
  burger.addIngredient("Brød (bunn)");
  burger.addIngredient("Spesialsaus");
  // Burgerkjøtt glemt!
  burger.addIngredient("Cheddarost");
  burger.addIngredient("Bacon");
  burger.addIngredient("Brød (topp)");

  assertEquals("🚨 Missing Patty Error", burger.getResult());
}
```

---

## 🎓 Pedagogisk begrunnelse

| Pedagogisk prinsipp     | Begrunnelse                                                              |
| ----------------------- | ------------------------------------------------------------------------ |
| **Umiddelbar feedback** | Tydelige og humoristiske meldinger gir rask forståelse av feilene.       |
| **Statefulness**        | Programmet har en klar og forståelig indre tilstand (burgerbygging).     |
| **Intuitive feil**      | Det er åpenbart hvorfor feil ingrediens eller rekkefølge blir feil.      |
| **Motivasjon og humor** | Gordon Ramsay som karakter gir en morsom og minneverdig opplevelse.      |
| **Trinnvis læring**     | Enkelt å demonstrere debugging-steg, samt hvordan tester sikrer løsning. |

---

## 🧪 Konkret gjennomføring av demonstrasjonen

1. **Vis korrekt resultat først:**
   Kjør burgerbygging med riktig rekkefølge.

2. **Introduser feil:**
   Demonstrer hva som skjer med feil ingredienser eller rekkefølge.

3. **Debugging:**
   Gå gjennom koden stegvis med debugger og avdekk feilen.

4. **Rett feilen:**
   Utfør og demonstrer rettelsen.

5. **Automatiserte tester:**
   Kjør tester for å bekrefte at programmet fungerer etter rettelser.

---

## ✨ Oppsummering

"Gordon Ramsay’s Ultimate Burger Builder" gir elevene en morsom, intuitiv og praktisk erfaring med debugging og testing. Elevene forstår umiddelbart hvorfor visse handlinger gir feil resultat, samtidig som de lærer hvordan debugging og testing kan bidra til å produsere korrekt og robust kode.

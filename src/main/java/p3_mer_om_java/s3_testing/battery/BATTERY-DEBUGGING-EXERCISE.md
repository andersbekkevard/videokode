# Debugging - Battery-oppgave

Oppgaven handler om feilsøking i en **Battery**- og en **BatteryProgram**-klasse ved bruk av [debuggeren i VSCode](https://www.ntnu.no/wiki/pages/viewpage.action?pageId=235996724).

Et **Battery**-objekt representerer et oppladbart batteri med maksimal kapasitet og nåværende ladningsnivå.

- Maksimal kapasitet må være et ikke-negativt flyttall, som til enhver tid må være større enn nåværende ladningsnivå.
- Nåværende ladningsnivå er et ikke-negativt flyttall som til enhver tid må være mindre enn maksimal kapasitet til batteriet.

**Battery**-klassen har følgende metoder og konstruktører:

- `Battery()` - konstruktør som setter standard initialverdier til $0.0$ kapasitet og $0.0$ nåværende ladning.
- `Battery(double, double)` - konstruktør som setter initialverdier til de oppgitte verdiene.
- `void drainBattery(double)` og `void chargeBattery(double)` - henholdsvis tømmer og lader batteriet. Om man prøver å tømme mer enn det finnes i batteriet, eller lader for mye blir en `IllegalArgumentException` utløst.
- `void upgradeBattery(double)` - øker kapasiteten på batteriet. Om man prøver å gjøre batteriet mindre skjer ingenting.
- I tillegg har klassen noen private hjelpefunksjoner som man kan identifisere selv.

**BatteryProgram**-klassen er en hovedprogramklasse som oppretter en instans av **Battery**, og utfører en sekvens av kall til batteriets ulike metoder.

I denne oppgaven blir en implementasjon av **Battery** sammen med et hovedprogram utdelt, men i implementasjonen av hovedprogrammet har vi plantet noen feil. Det er to oppgaver som må løses.

Battery-koden finner du i [Battery.java](Battery.java). BatteryProgram finner du i [BatteryProgram.java](BatteryProgram.java).

## Leseliste

- [Debuggeren i VSCode](https://www.ntnu.no/wiki/pages/viewpage.action?pageId=235996724) - Debuggeren er et verktøy som brukes til å analysere kjørende kode, noe som kan være svært nyttig når man vil forstå og evt. rette feil i et program.
- [Hovedprogramklasser](https://www.ntnu.no/wiki/display/tdt4100/Hovedprogramklasser) - Hovedprogramklasser er klasser som aktiveres når programmer starter opp og som initialiserer og kontrollerer/koordinerer de andre objekter i applikasjonen.
- [`java.util.Random`](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html) - En pseudotilfeldig nummergenerator (PRNG) i Java.

### Del 1

Målet for oppgaven er å finne en feil i funksjonen `part1()` ved hjelp av debuggeren i VSCode. Kjør hovedprogrammet i debug-modus, og bruk dette til å finne hva maksimal kapasitet og nåværende ladningsnivå er like før programmet utløser et unntak.

Finn også ut hvilken metode i **Battery** som utløser unntaket.

**Hint:** Se etter operasjoner som prøver å tømme batteriet for mye eller lade det over kapasitet.

### Del 2

Du fant feilen i oppgave 1, bra! Kommentér ut kallet til `part1()` i hovedprogrammet, så slipper vi å ha mer med det å gjøre.

Du skal nå finne ut hvordan nåværende ladningsnivå endrer seg i `part2()`, før programmet utløser et unntak. Lag en liste over hvilke verdier nivået har. Hvilken metode i **Battery** utløser et unntak denne gangen? Hvilken type unntak blir utløst?

**Hint:** Følg med på hvordan `upgradeBattery()` påvirker hva som er gyldig å lade inn i batteriet.

## Debugging-tips

1. **Sett breakpoints** ved starten av `part1()` og `part2()` metodene
2. **Step through** koden linje for linje med F10 (Step Over)
3. **Inspiser variabler** i debugging-panelet for å se `maxCapacity` og `currentCharge`
4. **Bruk Watch-panelet** til å overvåke verdiene `battery.getMaxCapacity()` og `battery.getCurrentCharge()`
5. **Observer Random-verdier** ved å evaluere uttrykk som `Math.floor(r.nextDouble() * 1500.0)`

## Forventet læring

Etter å ha fullført denne oppgaven skal du:
- Forstå hvordan debuggeren i VSCode fungerer
- Kunne sette breakpoints og inspisere variable tilstander
- Forstå sammenhengen mellom objekttilstand og unntakshåndtering
- Kunne spore feil gjennom sekvenser av metodekall
- Forstå viktigheten av tilstandsvalidering i objektorientert programmering 
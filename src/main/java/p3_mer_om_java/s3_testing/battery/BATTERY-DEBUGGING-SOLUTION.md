# Battery Debugging Exercise - Solution Guide

## Del 1 - Løsning

### Feilanalyse med debugger:

Når du setter breakpoint på første linje i `part1()` og stepper gjennom koden, vil du observere følgende:

**Batteritilstand like før unntaket:**
- **Maksimal kapasitet:** 3000.0 mAh (etter første `upgradeBattery(3000.0)`)
- **Nåværende ladning:** cirka 700-800 mAh (avhenger av Random-verdiene)
- **Problematisk operasjon:** `this.battery.drainBattery(Math.ceil(this.r.nextDouble() * 2800.0));`

**Metode som utløser unntaket:**
- `drainBattery()` i Battery-klassen (linje 45)
- **Unntakstype:** `IllegalArgumentException`
- **Melding:** "Cannot drain that much power from the battery!"

**Årsak til feilen:**
Programmet prøver å tømme batteriet for mer strøm enn det faktisk inneholder. Random-generatoren produserer verdier som kan være større enn nåværende ladningsnivå.

---

## Del 2 - Løsning

### Sporing av ladningsnivå:

Når du kommenterer ut `part1()` og debugger `part2()`, kan du følge disse endringene:

**Startverdi:** 1500.0 mAh (fra konstruktør)

**Sekvens av endringer:**
1. `drainBattery(Math.floor(r.nextDouble() * 1500.0))` → ~1100 mAh
2. `chargeBattery(Math.floor(r.nextDouble() * 2000.0))` → ~2500 mAh  
3. `drainBattery(Math.ceil(r.nextDouble() * 2800.0))` → ~500 mAh
4. Neste `drainBattery()` eller `chargeBattery()` operasjon feiler

**Metode som utløser unntaket:**
- Sannsynligvis `chargeBattery()` (overladning) eller `drainBattery()` (overtømming)
- **Unntakstype:** `IllegalArgumentException`

**Årsak til feilen:**
Programmet genererer tilfeldige verdier som kan overskride batteriet kapasitet eller prøve å tømme mer enn tilgjengelig.

---

## Debugging-teknikker brukt:

1. **Breakpoints:** Satt på metodestarter
2. **Step Over (F10):** For å gå gjennom kode linje-for-linje
3. **Variable inspection:** Overvåket `maxCapacity` og `currentCharge`
4. **Expression evaluation:** Testet Random-verdier underveis
5. **Call stack analysis:** Identifisert hvor unntaket oppstod

---

## Pedagogisk poeng:

Denne oppgaven demonstrerer:
- **Tilstandsvalidering:** Viktigheten av å validere objekttilstand
- **Exception handling:** Hvordan unntaksmekanismer beskytter mot ugyldig tilstand
- **Debugging workflow:** Systematisk tilnærming til feilsøking
- **Random testing:** Hvordan tilfeldige verdier kan avdekke edge cases 
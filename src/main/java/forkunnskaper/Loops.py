
alder = 21
alder += 1
alder -= 1
alder == 21 # TRUE
alder != 40 # TRUE

if alder >= 18:
    print("Du er myndig!")

for i in range(10):
    print(i)

n = 0
while n <= 10:
    if n % 2 == 0:
        print(f"{n} er partall")
    n += 1

tall_vi_leter_etter = 5
maks_tall = 10
for i in range(maks_tall):
    if i != tall_vi_leter_etter:
        print("Ikke funnet ennå")
        continue
    print("JIPPI! Jeg fant")
    break

funnet_tall = False
tall_vi_undersoker = 0
while not funnet_tall:
    if tall_vi_undersoker == tall_vi_leter_etter:
        print(f"Vi fant tallet {tall_vi_leter_etter}")
        funnet_tall = True
    tall_vi_undersoker += 1

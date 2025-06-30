#!/bin/bash

# Script to recreate the folder structure of the videokode project
# This creates the complete src directory structure without any files

echo "Creating folder structure for videokode project..."

# Create main directories
mkdir -p src/main/java
mkdir -p src/test/java

# Create innkapsling directories
mkdir -p src/main/java/innkapsling_1
mkdir -p src/main/java/innkapsling_2

# Create kladd directory
mkdir -p src/main/java/kladd

# Create p0_oppsett
mkdir -p src/main/java/p0_oppsett

# Create p1_intro_java structure
mkdir -p src/main/java/p1_intro_java/s1_datatyper/strings
mkdir -p src/main/java/p1_intro_java/s2_løkker
mkdir -p src/main/java/p1_intro_java/s3_metoder

# Create p2_intro_oop structure
mkdir -p src/main/java/p2_intro_oop/s1_klasser
mkdir -p src/main/java/p2_intro_oop/s2_innkapsling_validering

# Create p3_mer_om_java structure
mkdir -p src/main/java/p3_mer_om_java/s1_collections
mkdir -p src/main/java/p3_mer_om_java/s2_språkdetaljer
mkdir -p src/main/java/p3_mer_om_java/s3_testing

# Create p4_relasjoner structure
mkdir -p src/main/java/p4_relasjoner/s1_assosiasjoner/enTilEn
mkdir -p src/main/java/p4_relasjoner/s1_assosiasjoner/enTilMange
mkdir -p src/main/java/p4_relasjoner/s1_assosiasjoner/mangeTilMange
mkdir -p src/main/java/p4_relasjoner/s2_arv
mkdir -p src/main/java/p4_relasjoner/s3_diagrammer

# Create p5_abstraksjon structure
mkdir -p src/main/java/p5_abstraksjon/s1_abstrakte_klasser
mkdir -p src/main/java/p5_abstraksjon/s2_interface

# Create p6_funksjonell_programmering structure
mkdir -p src/main/java/p6_funksjonell_programmering/s1_grensesnitt
mkdir -p src/main/java/p6_funksjonell_programmering/s2_lambda
mkdir -p src/main/java/p6_funksjonell_programmering/s3_comparator_iterator
mkdir -p src/main/java/p6_funksjonell_programmering/s4_streams

# Create p7_oop_teknikker structure
mkdir -p src/main/java/p7_oop_teknikker/eksempel
mkdir -p src/main/java/p7_oop_teknikker/s1_delegering
mkdir -p src/main/java/p7_oop_teknikker/s2_observert

# Create p8_io structure
mkdir -p src/main/java/p8_io/s1_lesing
mkdir -p src/main/java/p8_io/s2_skriving

# Create p9_misc structure
mkdir -p src/main/java/p9_misc/s1_optionals
mkdir -p src/main/java/p9_misc/s2_records
mkdir -p src/main/java/p9_misc/s3_varargs

# Create test structure
mkdir -p src/test/java/p2

echo "Folder structure created successfully!"
echo "Total directories created: $(find src -type d | wc -l)"

# Display the created structure
echo ""
echo "Created structure:"
find src -type d | sort
#!/bin/bash

# Script to recreate the folder structure of the videokode project
# This creates the complete src directory structure with Video.java files in leaf directories

echo "Creating folder structure with Video.java files for videokode project..."

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

# Function to create Video.java file with correct package
create_video_file() {
    local dir_path=$1
    local package_name=$(echo "$dir_path" | sed 's|src/main/java/||' | sed 's|src/test/java/||' | sed 's|/|.|g')
    
    # Create Video.java file
    cat > "$dir_path/Video.java" << EOF
package $package_name;

public class Video {
}
EOF
    echo "Created Video.java in $dir_path with package $package_name"
}

# Find all leaf directories and create Video.java files
echo ""
echo "Creating Video.java files in leaf directories..."

# List of all leaf directories
leaf_dirs=(
    "src/test/java/p2"
    "src/main/java/p1_intro_java/s3_metoder"
    "src/main/java/p1_intro_java/s2_løkker"
    "src/main/java/p1_intro_java/s1_datatyper/strings"
    "src/main/java/p2_intro_oop/s1_klasser"
    "src/main/java/p2_intro_oop/s2_innkapsling_validering"
    "src/main/java/innkapsling_2"
    "src/main/java/p8_io/s1_lesing"
    "src/main/java/p8_io/s2_skriving"
    "src/main/java/kladd"
    "src/main/java/p5_abstraksjon/s2_interface"
    "src/main/java/p5_abstraksjon/s1_abstrakte_klasser"
    "src/main/java/p0_oppsett"
    "src/main/java/p9_misc/s1_optionals"
    "src/main/java/p9_misc/s3_varargs"
    "src/main/java/p9_misc/s2_records"
    "src/main/java/p4_relasjoner/s2_arv"
    "src/main/java/p4_relasjoner/s3_diagrammer"
    "src/main/java/p4_relasjoner/s1_assosiasjoner/enTilEn"
    "src/main/java/p4_relasjoner/s1_assosiasjoner/mangeTilMange"
    "src/main/java/p4_relasjoner/s1_assosiasjoner/enTilMange"
    "src/main/java/p6_funksjonell_programmering/s2_lambda"
    "src/main/java/p6_funksjonell_programmering/s4_streams"
    "src/main/java/p6_funksjonell_programmering/s3_comparator_iterator"
    "src/main/java/p6_funksjonell_programmering/s1_grensesnitt"
    "src/main/java/innkapsling_1"
    "src/main/java/p3_mer_om_java/s3_testing"
    "src/main/java/p3_mer_om_java/s2_språkdetaljer"
    "src/main/java/p3_mer_om_java/s1_collections"
    "src/main/java/p7_oop_teknikker/s1_delegering"
    "src/main/java/p7_oop_teknikker/eksempel"
    "src/main/java/p7_oop_teknikker/s2_observert"
)

# Create Video.java in each leaf directory
for dir in "${leaf_dirs[@]}"; do
    create_video_file "$dir"
done

echo ""
echo "Setup complete!"
echo "Total directories created: $(find src -type d | wc -l)"
echo "Total Video.java files created: $(find src -name "Video.java" | wc -l)"

# Display the created structure
echo ""
echo "Created structure with Video.java files:"
find src -name "Video.java" | sort
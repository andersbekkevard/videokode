# Folder Structure Scripts

This directory contains scripts to recreate the videokode project's folder structure.

## Scripts

### `create-folder-structure.sh`
Creates the complete `src` directory structure without any files.

**Usage:**
```bash
./create-folder-structure.sh
```

**What it does:**
- Creates all 46 directories from the original project structure
- Includes educational modules p0-p9 with their subsections
- Creates test directory structure
- Does not create any files, only directories

### `create-folder-structure-filled.sh`
Creates the complete `src` directory structure with `Video.java` files in leaf directories.

**Usage:**
```bash
./create-folder-structure-filled.sh
```

**What it does:**
- Creates the same directory structure as above
- Generates `Video.java` files in all 32 leaf directories
- Each `Video.java` file contains:
  - Correct package declaration based on directory path
  - Simple `public class Video {}` class definition
- Useful for Git repositories that need files to track directory structure

## Purpose

These scripts are designed to help replicate the project structure when:
- Setting up a new development environment
- Creating a template repository
- Sharing the project structure without source code
- Ensuring Git can track the complete folder hierarchy
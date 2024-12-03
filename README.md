# Medical Health Records - Java OOP Project

## Overview

This project was developed as part of the course "Object-Oriented Programming" at Abu Dhabi University. It focuses on converting complex medical health data into a standardized format suitable for further analysis. The system reads raw data from sensors and other medical indicators, processes it, and categorizes the information into predefined groups. The project is built using Object-Oriented Programming (OOP) principles in Java, employing interfaces and abstract methods for handling medical records efficiently.

## Contributors
1. Ameen Siddiqui
2. [Johann](https://github.com/JohannC05)
3. Omar Abdulla Alzaabi


## Project Objectives

- **Data Processing:** Read and process medical health records from a structured input file.
- **Data Mapping:** Categorize health metrics such as BMI, blood pressure, fasting blood sugar, and cholesterol levels into predefined categories.
- **Standardization:** Convert raw medical data into a standardized format for ease of analysis.

## Problem Statement

Medical health records contain extensive data that must be processed and organized for accurate analysis. Manual handling of this data is time-consuming and error-prone. This project offers an automated solution to read, map, and output medical records in a standardized format, improving the efficiency of data management in healthcare settings.

## Solution Design

The solution is built around several core components:

1. **Patient Class:** Stores basic patient information and calculates the Body Mass Index (BMI).
2. **Laboratory Class:** Extends the Patient class to include additional laboratory findings such as blood pressure, fasting blood sugar, and cholesterol levels.
3. **Mapping Interface:** Defines abstract methods for mapping health metrics into predefined categories.
4. **MedicalMapper Class:** Implements the Mapping interface and extends the Laboratory class, adding functionality for mapping and comparing health data.
5. **Main Class:** Orchestrates the reading of input files, processing of data, and mapping of records, followed by writing the output to a file in a structured format.

## Key Technologies

- **Java OOP principles**
- **Interfaces and Abstract Classes**
- **File I/O for data handling**

This project demonstrates my ability to design and implement object-oriented solutions for real-world data processing tasks, particularly in the medical domain.

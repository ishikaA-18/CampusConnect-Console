# Campus Connect — Console Edition

A console-based two-sided faculty locator system built in Java.
Helps students find teachers by department, name, or subject.
Admins can manage faculty data through a password-protected interface.

---

## Why I Built This

In my third semester I saw a student knocking on our ongoing class 
looking for a teacher. Our lecturer got annoyed. I wanted to build 
something that would prevent that kind of confusion — especially 
for freshers who don't know the campus yet.

This console version is the foundation. I built it from scratch to 
deeply understand the data management logic before rebuilding it 
as a full Android application.

---

## How It Works

**Student Mode** — Read-only access. Search for any faculty by 
department, name, or subject. Results show name, room number, 
designation and subject taught.

**Admin Mode** — Password protected. Authorised staff can add new 
teachers or remove existing ones. All changes save permanently to 
a CSV file and reflect immediately on next startup.

---

## Features

- Real faculty data from Electrical Engineering department
- Search by department, teacher name, or subject (case-insensitive)
- Admin mode with password protection
- Add new teacher — saves permanently to file
- Delete teacher — updates file immediately
- Data persists after program closes via CSV file storage
- Graceful exception handling if data file is missing

---

## Tech Concepts Used

- Object-Oriented Programming — Encapsulation, Abstraction
- Three-class architecture: Faculty, FacultyRepository, Main
- File I/O — BufferedReader, BufferedWriter, FileWriter
- Exception Handling — try-catch for file operations
- ArrayList for dynamic faculty data storage
- Scanner for user input handling

---

## Project Structure
```
CampusConnect/
├── src/
│   ├── Faculty.java
│   ├── FacultyRepository.java
│   └── Main.java
├── data.csv
└── README.md
```
---

## Tech Used

- Java
- VS Code, Git, GitHub

---

## Coming Soon

- Navigation directions to each room and block
- More departments beyond EE
- HOD subclass extending Faculty (inheritance)
- Android version rebuilt from scratch with Firebase backend

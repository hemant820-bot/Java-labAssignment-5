# Student Management System

A console-based Java application for managing student records with file persistence, featuring OOP principles, exception handling, and multi-threading.

## Features

- **Add Student Records**: Input student details including roll number, name, email, course, and marks
- **View All Students**: Display complete list of all enrolled students
- **Search Functionality**: Find students by name
- **Delete Records**: Remove student records by name
- **Sort by Marks**: View students ranked by their marks in descending order
- **Automatic Grading**: Grades are calculated automatically based on marks
- **File Persistence**: All records are saved to and loaded from a text file
- **Input Validation**: Comprehensive error handling for invalid inputs
- **Loading Animations**: Multi-threaded loading indicators for better UX

## Grading Scale

| Marks Range | Grade |
|-------------|-------|
| 90-100      | A+    |
| 80-89       | A     |
| 70-79       | B     |
| 60-69       | C     |
| 50-59       | D     |
| Below 50    | F     |

## Technical Highlights

### Object-Oriented Programming
- **Inheritance**: `Student` extends abstract `Person` class
- **Abstraction**: Abstract class and interface implementation
- **Encapsulation**: Private fields with getters/setters
- **Polymorphism**: Method overriding and interface implementation

### Key Concepts Demonstrated
- Custom exception classes (`InvalidInputException`, `StudentNotFoundException`)
- Multi-threading with `Runnable` interface for loading animations
- Collections framework (ArrayList, HashMap, Iterator)
- File I/O operations with BufferedReader/Writer
- Interface implementation (`RecordActions`)
- Anonymous inner classes (Comparator)

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

## Installation & Usage

1. Clone the repository:
```bash
git clone https://github.com/abhinavgautam08/Student_Management_System.git
cd Student_Management_System
```

2. Compile the program:
```bash
javac Main.java
```

3. Run the application:
```bash
java Main
```

## Menu Options

```
===== Capstone Student Menu =====
1. Add Student
2. View All Students
3. Search by Name
4. Delete by Name
5. Sort by Marks
6. Save and Exit
```

## Data Storage

Student records are automatically saved to `students.txt` in CSV format:
```
rollNo,name,email,course,marks
```

The file is loaded on startup and saved when you exit the application.

## Input Validation

The system validates:
- Name, email, and course cannot be empty
- Marks must be between 0 and 100
- Roll numbers must be unique
- Proper exception handling for all invalid inputs

## Example Usage

### Adding a Student
```
Enter Roll No: 101
Enter Name: John Doe
Enter Email: john@example.com
Enter Course: Computer Science
Enter Marks: 85
Adding student...
```

### Searching for a Student
```
Enter name to search: John Doe
Student Info:
Roll No: 101
Name: John Doe
Email: john@example.com
Course: Computer Science
Marks: 85.0
```

## Project Structure

```
├── Main.java
│   ├── InvalidInputException (Custom Exception)
│   ├── StudentNotFoundException (Custom Exception)
│   ├── Loader (Runnable for loading animation)
│   ├── Person (Abstract base class)
│   ├── Student (extends Person)
│   ├── RecordActions (Interface)
│   ├── StudentManager (implements RecordActions)
│   └── Main (Entry point)
└── students.txt (Auto-generated data file)
```# Student_Management_System

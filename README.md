# Cleaning Inventory and Issuance System (PRG 381 Project)

A Java Swing desktop application for managing a cleaning department's inventory — suppliers, materials, cleaners, and material issuance — backed by a PostgreSQL database. Built as a group university project (Track B) for the PRG 381 module.

## Features

- **Login page** — user authentication before accessing the system
- **Dashboard** — overview panel summarizing key stats
- **Suppliers & Cleaners** — manage supplier and cleaner (staff) records
- **Materials** — track stock items, quantities, and reorder levels
- **Issuance** — record materials issued to cleaners, linked to material and cleaner records

## Tech Stack

- **Language:** Java
- **UI:** Java Swing (built with the NetBeans GUI Builder — `.form` files)
- **Database:** PostgreSQL (via JDBC, `postgresql-42.7.7.jar`)
- **Build/IDE:** Apache NetBeans (Ant-based build, `build.xml` / `nbproject/`)
- **Architecture:** DAO pattern — `model` → `dao` (interfaces) → `daoimpl` (PostgreSQL implementations) → UI panels

## Project Structure

```
src/prg_381_project/
├── PRG_381_Project.java        # Entry point — launches the login page
├── Login_Page.java             # Login screen
├── DashboardPanel.java         # Main dashboard
├── Cleaners_Suppliers.java     # Cleaners & suppliers management UI
├── connection/
│   └── DBConnection.java       # JDBC connection setup
├── model/                      # Cleaner, Supplier, Material, Issuance, User
├── dao/                        # DAO interfaces
├── daoimpl/                    # PostgreSQL DAO implementations
├── materials/                  # Materials management UI
├── issuance/                   # Issuance management UI
├── database.sql                # Schema (suppliers, materials, cleaners, users, issuances)
└── Icons/                      # UI icons
```

## Getting Started

### Prerequisites

- Java JDK (8+)
- Apache NetBeans (recommended, since the project uses NetBeans project files and Swing `.form` GUI builder metadata)
- PostgreSQL server

### Database Setup

1. Create a PostgreSQL database.
2. Run the schema in `src/prg_381_project/database.sql` (or `BackupCleanInvDB.sql` for a fuller backup/dataset) against it.
3. Open `src/prg_381_project/connection/DBConnection.java` and update the connection constants to match your local setup:

```java
private static final String URL = "jdbc:postgresql://localhost:5432/<your_db_name>";
private static final String USER = "<your_db_user>";
private static final String PASSWORD = "<your_db_password>";
```

> **Note:** The committed `DBConnection.java` contains placeholder/personal credentials used during development. Replace them with your own local database credentials — don't commit real passwords.

### Running the Project

1. Open the project folder in NetBeans (it will be picked up as an Ant-based NetBeans project via `nbproject/`).
2. Ensure the PostgreSQL JDBC driver (`lib/postgresql-42.7.7.jar`) is on the project's classpath (it should resolve automatically from `lib/`).
3. Build and run `PRG_381_Project.java` — this launches the login page.

## Team

Group project for PRG 381 — Track B: Cleaning Inventory and Issuance System.

## License

No license specified — academic project.

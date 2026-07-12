CREATE TABLE suppliers (
    supplier_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(20),
    email VARCHAR(100),
    address TEXT
);

CREATE TABLE materials (
    material_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    quantity INT NOT NULL,
    reorder_level INT NOT NULL,
    supplier_id INT,
    CONSTRAINT fk_supplier
        FOREIGN KEY (supplier_id)
        REFERENCES suppliers(supplier_id)
);

CREATE TABLE cleaners (
    cleaner_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    department VARCHAR(100)
);

CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    role VARCHAR(20) NOT NULL
);

CREATE TABLE issuances (
    issuance_id SERIAL PRIMARY KEY,
    cleaner_id INT NOT NULL,
    material_id INT NOT NULL,
    quantity INT NOT NULL,
    issue_date DATE NOT NULL,
    CONSTRAINT fk_cleaner
        FOREIGN KEY (cleaner_id)
        REFERENCES cleaners(cleaner_id),
    CONSTRAINT fk_material
        FOREIGN KEY (material_id)
        REFERENCES materials(material_id)
);
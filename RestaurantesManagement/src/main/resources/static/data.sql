
INSERT INTO tables (id, capacity, is_occupied, location_description) VALUES (1, 4, false, 'Window');
INSERT INTO tables (id, capacity, is_occupied, location_description) VALUES (2, 2, false, 'Patio');
-- Add more INSERT statements for the tables as needed.

-- If you have auto-increment IDs, you can omit the id column:
INSERT INTO tables (capacity, is_occupied, location_description) VALUES (4, false, 'Window');
INSERT INTO tables (capacity, is_occupied, location_description) VALUES (2, false, 'Patio');
-- and so on...

/*
Manufactor
*/
insert into manufacturers (id, name)
VALUES (1, 'Xiaomi', 0),
       (2, 'BMW', 0),
       (3, 'Tier', 0);
/*
Models
*/
insert into models(model_label, service_interval, manufactures_id, version)
VALUES ('Hyper HYPER', 200, 1, 0),
       ('Future', 200, 2, 0),
       ('Future', 250, 3,0);
/*
Countries
*/
insert into countries (iso_code, name, version)
VALUES  ('AUT', 'Austria', 0),
        ('GER', 'Germany', 0);
/*
Cities
*/
insert into cities (id, version,inhabitants, name, country_iso_code)
VALUES (1,0, 15000, 'Zwettl', 'AUT'),
       (2,0, 20000000, 'Wien', 'AUT');
/*
Scooter
*/
insert into scooters (serial_number, version ,battery_level, purchase_date, scrapping_date, city_id, model_manufactures_id, model_model_label)
VALUES ('123abc', 0, 100, '2022-09-01', null, 1,1, 'Hyper Hyper'),
       ('124abc', 0, 90, '2022-08-15', null, 1,1, 'Hyper Hyper'),
       ('125abc', 0, 60, '2022-10-01', null, 1,2, 'Future'),
       ('126abc', 0, 50, '2022-10-02', null, 1,3, 'Future');

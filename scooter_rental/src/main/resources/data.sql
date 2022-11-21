/*
Manufactor
*/
insert into manufacturers (id, name)
VALUES (1, 'Xiaomi'),
       (2, 'BMW'),
       (3, 'Tier');
/*
Models
*/
insert into models(model_label, service_interval,manufacturers_id)
VALUES ('Hyper HYPER', 200,1),
       ('Future', 200,2),
       ('Future', 250,3);
/*
Countries
*/
insert into countries (iso_code, name, version)
VALUES  ('AUT', 'Austria', 0),
        ('GER', 'Germany', 0);
/*
Cities
*/
insert into cities (id,version, inhabitants, name, country_iso_code)
VALUES (1,1, 15000, 'Zwettl', 'AUT'),
       (2,1, 20000000, 'Wien', 'AUT');
/*
Scooter
*/
insert into scooters (serial_number, version ,battery_level, purchase_date, scrapping_date, city_id, model_manufactures_id, model_model_label)
VALUES ('123abc', 0, 100, '2022-09-01', null, 1,1, 'Hyper Hyper'),
       ('124abc', 0, 90, '2022-08-15', null, 1,1, 'Hyper Hyper'),
       ('125abc', 0, 60, '2022-10-01', null, 1,2, 'Future'),
       ('126abc', 0, 50, '2022-10-02', null, 1,3, 'Future');
/*
 Customers
*/
insert into customers (version, birthdate, customer_count_no, first_name, identity_card_id, last_name, password)
values (1, '2002-8-8', 87, 'Hans', '575478', 'Huber', 'pw1'),
       (1, '2000-8-4', 87, 'Sabine', '575478', 'Kurz', 'pw2'),
       (1, '1989-1-8', 87, 'Katrin', '575478', 'Stronach', 'pw3'),
       (1, '1989-2-8', 87, 'Siglinde', '575478', 'Huber', 'pw3');
insert into bookings (version, booking_state, start_time, customer_id, scooter_serial_number)
values (1, 1, '2021-10-10', 1, '125abc'),
       (1, 1, '2021-10-10', 1, '123abc'),
       (1, 1, '2021-10-10', 2, '124abc');
insert into bookings (version, booking_state, costs, end_time, start_time, customer_id, scooter_serial_number)
values (1, 0, 500, '2021-10-15', '2021-10-14',3,  '124abc'),
       (1, 0, 800, '2021-09-15', '2021-09-14',3,  '123abc'),
       (1, 1, 200, '2021-08-15', '2021-08-14',3,  '125abc');
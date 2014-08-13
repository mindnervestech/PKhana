# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table audit_logging (
  log_id                    integer auto_increment not null,
  unique_id                 varchar(255),
  log_parameters            varchar(255),
  log_type                  varchar(255),
  log_message               varchar(255),
  log_date_time             datetime,
  constraint pk_audit_logging primary key (log_id))
;

create table contacts (
  contact_id                integer auto_increment not null,
  pharmacy_profile_profile_id integer not null,
  contact_type              varchar(255),
  contact                   varchar(255),
  constraint pk_contacts primary key (contact_id))
;

create table country (
  country_id                integer auto_increment not null,
  country_code              varchar(255),
  constraint pk_country primary key (country_id))
;

create table insurance_profile (
  ins_profile_id            integer auto_increment not null,
  insurances_insurance_id   integer not null,
  insurance_program         varchar(255),
  language_language_id      integer,
  country_country_id        integer,
  constraint pk_insurance_profile primary key (ins_profile_id))
;

create table insurances (
  insurance_id              integer auto_increment not null,
  constraint pk_insurances primary key (insurance_id))
;

create table language (
  language_id               integer auto_increment not null,
  language_code             varchar(255),
  language                  varchar(255),
  constraint pk_language primary key (language_id))
;

create table location (
  location_id               integer auto_increment not null,
  longitude                 varchar(255),
  latitude                  varchar(255),
  constraint pk_location primary key (location_id))
;

create table pharmacy (
  pharmacy_id               integer auto_increment not null,
  pharmacy_logo             varchar(255),
  appeared_in_search        bigint,
  contacted_by_count        bigint,
  profile_view_count        bigint,
  constraint pk_pharmacy primary key (pharmacy_id))
;

create table pharmacy_profile (
  profile_id                integer auto_increment not null,
  pharmacy_pharmacy_id      integer not null,
  name                      varchar(255),
  address                   varchar(255),
  city                      varchar(255),
  country_country_id        integer,
  language_language_id      integer,
  location_location_id      integer,
  predefined_loc_loc_id     integer,
  constraint pk_pharmacy_profile primary key (profile_id))
;

create table pre_defined_locations (
  loc_id                    integer auto_increment not null,
  location_name             varchar(255),
  language_language_id      integer,
  country_country_id        integer,
  constraint pk_pre_defined_locations primary key (loc_id))
;

create table service_profile (
  ser_profile_id            integer auto_increment not null,
  services_service_id       integer not null,
  service_name              varchar(255),
  service_desc              varchar(255),
  language_language_id      integer,
  constraint pk_service_profile primary key (ser_profile_id))
;

create table services (
  service_id                integer auto_increment not null,
  service_code              varchar(255),
  constraint pk_services primary key (service_id))
;


create table pharmacy_insurances (
  pharmacy_pharmacy_id           integer not null,
  insurances_insurance_id        integer not null,
  constraint pk_pharmacy_insurances primary key (pharmacy_pharmacy_id, insurances_insurance_id))
;

create table pharmacy_services (
  pharmacy_pharmacy_id           integer not null,
  services_service_id            integer not null,
  constraint pk_pharmacy_services primary key (pharmacy_pharmacy_id, services_service_id))
;
alter table contacts add constraint fk_contacts_pharmacy_profile_1 foreign key (pharmacy_profile_profile_id) references pharmacy_profile (profile_id) on delete restrict on update restrict;
create index ix_contacts_pharmacy_profile_1 on contacts (pharmacy_profile_profile_id);
alter table insurance_profile add constraint fk_insurance_profile_insurances_2 foreign key (insurances_insurance_id) references insurances (insurance_id) on delete restrict on update restrict;
create index ix_insurance_profile_insurances_2 on insurance_profile (insurances_insurance_id);
alter table insurance_profile add constraint fk_insurance_profile_language_3 foreign key (language_language_id) references language (language_id) on delete restrict on update restrict;
create index ix_insurance_profile_language_3 on insurance_profile (language_language_id);
alter table insurance_profile add constraint fk_insurance_profile_country_4 foreign key (country_country_id) references country (country_id) on delete restrict on update restrict;
create index ix_insurance_profile_country_4 on insurance_profile (country_country_id);
alter table pharmacy_profile add constraint fk_pharmacy_profile_pharmacy_5 foreign key (pharmacy_pharmacy_id) references pharmacy (pharmacy_id) on delete restrict on update restrict;
create index ix_pharmacy_profile_pharmacy_5 on pharmacy_profile (pharmacy_pharmacy_id);
alter table pharmacy_profile add constraint fk_pharmacy_profile_country_6 foreign key (country_country_id) references country (country_id) on delete restrict on update restrict;
create index ix_pharmacy_profile_country_6 on pharmacy_profile (country_country_id);
alter table pharmacy_profile add constraint fk_pharmacy_profile_language_7 foreign key (language_language_id) references language (language_id) on delete restrict on update restrict;
create index ix_pharmacy_profile_language_7 on pharmacy_profile (language_language_id);
alter table pharmacy_profile add constraint fk_pharmacy_profile_location_8 foreign key (location_location_id) references location (location_id) on delete restrict on update restrict;
create index ix_pharmacy_profile_location_8 on pharmacy_profile (location_location_id);
alter table pharmacy_profile add constraint fk_pharmacy_profile_predefinedLoc_9 foreign key (predefined_loc_loc_id) references pre_defined_locations (loc_id) on delete restrict on update restrict;
create index ix_pharmacy_profile_predefinedLoc_9 on pharmacy_profile (predefined_loc_loc_id);
alter table pre_defined_locations add constraint fk_pre_defined_locations_language_10 foreign key (language_language_id) references language (language_id) on delete restrict on update restrict;
create index ix_pre_defined_locations_language_10 on pre_defined_locations (language_language_id);
alter table pre_defined_locations add constraint fk_pre_defined_locations_country_11 foreign key (country_country_id) references country (country_id) on delete restrict on update restrict;
create index ix_pre_defined_locations_country_11 on pre_defined_locations (country_country_id);
alter table service_profile add constraint fk_service_profile_services_12 foreign key (services_service_id) references services (service_id) on delete restrict on update restrict;
create index ix_service_profile_services_12 on service_profile (services_service_id);
alter table service_profile add constraint fk_service_profile_language_13 foreign key (language_language_id) references language (language_id) on delete restrict on update restrict;
create index ix_service_profile_language_13 on service_profile (language_language_id);



alter table pharmacy_insurances add constraint fk_pharmacy_insurances_pharmacy_01 foreign key (pharmacy_pharmacy_id) references pharmacy (pharmacy_id) on delete restrict on update restrict;

alter table pharmacy_insurances add constraint fk_pharmacy_insurances_insurances_02 foreign key (insurances_insurance_id) references insurances (insurance_id) on delete restrict on update restrict;

alter table pharmacy_services add constraint fk_pharmacy_services_pharmacy_01 foreign key (pharmacy_pharmacy_id) references pharmacy (pharmacy_id) on delete restrict on update restrict;

alter table pharmacy_services add constraint fk_pharmacy_services_services_02 foreign key (services_service_id) references services (service_id) on delete restrict on update restrict;

# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table audit_logging;

drop table contacts;

drop table country;

drop table insurance_profile;

drop table insurances;

drop table language;

drop table location;

drop table pharmacy;

drop table pharmacy_insurances;

drop table pharmacy_services;

drop table pharmacy_profile;

drop table pre_defined_locations;

drop table service_profile;

drop table services;

SET FOREIGN_KEY_CHECKS=1;


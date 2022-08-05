-- begin FINEXPRONEW_WORKER
create table FINEXPRONEW_WORKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    EMAIL varchar(100) not null,
    DEPARTMENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end FINEXPRONEW_WORKER
-- begin FINEXPRONEW_DOCUMENT
create table FINEXPRONEW_DOCUMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255),
    DESCRIPTION varchar(1000) not null,
    WORKER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end FINEXPRONEW_DOCUMENT
-- begin FINEXPRONEW_DEPARTMENT
create table FINEXPRONEW_DEPARTMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    HEAD_ID varchar(36),
    --
    primary key (ID)
)^
-- end FINEXPRONEW_DEPARTMENT

create table if not exists todo(
    id bigint unsigned auto_increment not null,
    title varchar(30) not null unique key,
    deadline date not null,
    status boolean not null default false,
    create_time datetime not null default current_timestamp,
    update_time datetime not null default current_timestamp on update current_timestamp,
    primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
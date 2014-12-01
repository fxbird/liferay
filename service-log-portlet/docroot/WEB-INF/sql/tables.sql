create table sl_CallLog (
	log_id LONG not null primary key,
	user_name VARCHAR(255) null,
	resource_name VARCHAR(255) null,
	start_time DATE null,
	end_time DATE null,
	log_status VARCHAR(255) null,
	log_message VARCHAR(255) null,
	user_id LONG,
	resource_id LONG,
	in_msg VARCHAR(255) null,
	out_msg VARCHAR(255) null
);

create table sl_CheckStatus (
	status_id LONG not null primary key,
	status_name VARCHAR(255) null
);

create table sl_Foo (
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(255) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(255) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(255) null
);

create table sl_Service (
	resource_id LONG not null primary key,
	resource_name INTEGER,
	resource_description INTEGER,
	status_id INTEGER,
	apply_date INTEGER
);

create table sl_ServiceInfo (
	resource_id LONG not null primary key,
	resource_name INTEGER,
	resource_description INTEGER,
	status_id INTEGER,
	apply_date INTEGER
);

create table t_attachment (
	attach_id LONG not null primary key,
	ori_name VARCHAR(255) null,
	save_name VARCHAR(255) null,
	type_code VARCHAR(255) null,
	att_content BLOB,
	ext_name VARCHAR(255) null,
	create_date DATE null,
	create_by LONG
);

create table t_log (
	log_id LONG not null primary key,
	user_name VARCHAR(255) null,
	resource_name VARCHAR(255) null,
	start_time DATE null,
	end_time DATE null,
	log_status VARCHAR(255) null,
	log_message VARCHAR(255) null,
	user_id LONG,
	resource_id LONG,
	in_msg VARCHAR(255) null,
	out_msg VARCHAR(255) null
);

create table t_resource (
	resource_id LONG not null primary key,
	resource_name VARCHAR(255) null,
	resource_description VARCHAR(255) null,
	logo_att_id LONG,
	wsdl_att_id LONG,
	status_id INTEGER,
	apply_date INTEGER,
	create_date DATE null,
	create_by LONG,
	update_date DATE null,
	update_by LONG
);

create table t_status (
	status_id LONG not null primary key,
	status_name VARCHAR(255) null
);
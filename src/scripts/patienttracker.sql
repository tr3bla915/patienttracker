DROP TABLE IF EXISTS `patienttracker`.`user`;
CREATE TABLE  `patienttracker`.`user` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(24) NOT NULL,
  `password` varchar(24) NOT NULL,
  `fullname` varchar(64) NOT NULL,
  `userrole` varchar(24) NOT NULL,
  `status` varchar(24) NOT NULL,
  `active` varchar(1) NOT NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
ALTER TABLE `patienttracker`.`user` MODIFY COLUMN `id` INTEGER NOT NULL AUTO_INCREMENT;

insert into user (username, password, fullname, userrole, status, active) values('lita', 'litalita', 'Lita Sange', 'Receptionist', 'available','Y');
insert into user (username, password, fullname, userrole, status, active) values('kito', 'kitokito', 'Kito Saya', 'Nurse', 'available','Y');
insert into user (username, password, fullname, userrole, status, active) values('miya', 'miyamiya', 'Miya Quinto', 'Doctor', 'available','Y');
insert into user (username, password, fullname, userrole, status, active) values('carl', 'carlcarl', 'Carl Baygo', 'Doctor', 'off-duty','Y');


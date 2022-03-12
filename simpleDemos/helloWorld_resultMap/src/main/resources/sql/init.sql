CREATE TABLE `t_emp`
(
    `eid`      int(11) NOT NULL AUTO_INCREMENT,
    `emp_name` varchar(20) DEFAULT NULL,
    `age`      int(11) DEFAULT NULL,
    `sex`      char(1)     DEFAULT NULL,
    `email`    varchar(20) DEFAULT NULL,
    `did`      int(11) DEFAULT NULL,
    PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into `t_emp` (`eid`, `emp_name`, `age`, `sex`, `email`, `did`) values(null,'山三','21','男','123456@qq.com','1');
insert into `t_emp` (`eid`, `emp_name`, `age`, `sex`, `email`, `did`) values(null,'李四','22','女','123456@qq.com','2');
insert into `t_emp` (`eid`, `emp_name`, `age`, `sex`, `email`, `did`) values(null,'王五','23','男','123456@qq.com','3');
insert into `t_emp` (`eid`, `emp_name`, `age`, `sex`, `email`, `did`) values(null,'赵六','23','女','123456@qq.com','1');
insert into `t_emp` (`eid`, `emp_name`, `age`, `sex`, `email`, `did`) values(null,'田七','22','男','123456@qq.com','2');

CREATE TABLE `t_dept`
(
    `did`       float NOT NULL AUTO_INCREMENT,
    `dept_name` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into `t_dept` (`did`, `dept_name`) values('1','A');
insert into `t_dept` (`did`, `dept_name`) values('2','B');
insert into `t_dept` (`did`, `dept_name`) values('3','C');
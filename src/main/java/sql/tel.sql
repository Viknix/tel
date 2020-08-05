CREATE TABLE `account` (
  `ACCOUNT_ID` int(11) NOT NULL COMMENT '�����˺�ID',
  `RECOMMENDRE_ID` int(11) DEFAULT NULL COMMENT '�Ƽ��������˺�ID',
  `LOGIN_NAME` varchar(255) NOT NULL COMMENT '��¼ϵͳ�����ƣ����ڡ��û��Է���ϵͳ',
  `LOGIN_PASSWD` varchar(255) NOT NULL COMMENT '��¼ϵͳ�Ŀ���',
  `STATUS` int(11) NOT NULL COMMENT '0����ͨ,1����ͣ,2��ɾ��',
  `CREATE_DATE` date DEFAULT NULL COMMENT '��������',
  `PAUSE_DATE` date DEFAULT NULL COMMENT '��ͣ���ڣ���ͨ״̬ʱΪ�գ�',
  `CLOSE_DATE` date DEFAULT NULL COMMENT 'ɾ������',
  `REAL_NAME` varchar(255) NOT NULL COMMENT '�ͻ�����',
  `IDCARD_NO` varchar(255) NOT NULL COMMENT '���֤����',
  `BIRTHDATE` date DEFAULT NULL COMMENT '��������',
  `GENDER` bit(1) NOT NULL COMMENT '�Ա� 0���� 1��Ů',
  `OCCUPATION` varchar(255) DEFAULT NULL COMMENT 'ְҵ',
  `TELEPHONE` varchar(255) NOT NULL COMMENT '��ϵ�绰���������ֻ���',
  `EMAIL` varchar(255) DEFAULT NULL COMMENT '�����ʼ�',
  `MAILADDRESS` varchar(255) DEFAULT NULL COMMENT 'ͨ�ŵ�ַ',
  `ZIPCODE` varchar(255) DEFAULT NULL COMMENT '�ʱ�',
  `QQ` varchar(255) DEFAULT NULL COMMENT 'QQ',
  `LAST_LOGIN_TIME` date DEFAULT NULL COMMENT '���һ�ε�¼ʱ��',
  `LAST_LOGIN_IP` varchar(255) DEFAULT NULL COMMENT '���һ�ε�¼IP��ַ',
  PRIMARY KEY (`ACCOUNT_ID`),
  UNIQUE KEY `actable_uni_LOGIN_NAME` (`LOGIN_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `admin_info` (
  `ADMIN_ID` int(11) NOT NULL COMMENT '����������ԱID',
  `ADMIN_CODE` varchar(255) NOT NULL COMMENT '����Ա�˺�',
  `PASSWORD` varchar(255) NOT NULL COMMENT '����',
  `NAME` varchar(255) NOT NULL COMMENT '����',
  `TELPHONE` varchar(255) DEFAULT NULL COMMENT '�绰',
  `EMAIL` varchar(255) DEFAULT NULL COMMENT '�����ʼ�',
  `ENROLLDATE` date NOT NULL COMMENT '��������',
  PRIMARY KEY (`ADMIN_ID`),
  UNIQUE KEY `actable_uni_ADMIN_CODE` (`ADMIN_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `admin_role` (
  `ADMIN_ID` int(11) NOT NULL COMMENT '����ID����������Ա����������',
  `ROLE_ID` int(11) NOT NULL COMMENT '��ɫID��������ɫ����������',
  PRIMARY KEY (`ADMIN_ID`),
  UNIQUE KEY `actable_uni_ROLE_ID` (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `bill` (
  `BILL_ID` int(11) NOT NULL COMMENT '�������˵�ID',
  `ACCOUNT_ID` int(11) NOT NULL COMMENT '�����˺�ID�����������˺ű�',
  `BILL_MONTH` varchar(255) NOT NULL COMMENT '�˵��·ݣ���ʽ�磺201701',
  `COST` decimal(10,2) NOT NULL COMMENT '����',
  `PAYMENT_MODE` int(11) DEFAULT NULL COMMENT '0���ֽ� 1������ת�ˣ�2���ʾֻ�3������',
  `PAY_STATE` bit(1) DEFAULT NULL COMMENT '֧��״̬,0��δ֧����1����֧����Ĭ��Ϊ0',
  PRIMARY KEY (`BILL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `bill_item` (
  `ITEM_ID` int(11) NOT NULL COMMENT '�������˵���ĿID',
  `BILL_ID` int(11) NOT NULL COMMENT '�˵�ID�������˵���Ϣ��',
  `SERVICE_ID` int(11) NOT NULL COMMENT 'ҵ���˺�ID������ҵ����Ϣ��',
  `COST` decimal(10,2) NOT NULL COMMENT '�����ѵķ���',
  PRIMARY KEY (`ITEM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cost` (
  `COST_ID` int(11) NOT NULL COMMENT '�������ʷ�ID',
  `NAME` varchar(255) NOT NULL COMMENT '�ʷ�����',
  `BASE_DURATION` int(11) DEFAULT NULL COMMENT '������ʱ��',
  `BASE_COST` decimal(10,2) DEFAULT NULL COMMENT '�¹̶��ѣ�������С��',
  `UNIT_COST` decimal(10,2) DEFAULT NULL COMMENT '��λ����(Ԫ/Сʱ)',
  `STATUS` bit(1) NOT NULL COMMENT '0:��ͨ��1����ͣ��',
  `DESR` varchar(255) DEFAULT NULL COMMENT '���ʷ���Ϣ��˵��',
  `CREATIME` date DEFAULT NULL COMMENT '��������',
  `STARTIME` date DEFAULT NULL COMMENT '��������',
  `COST_TYPE` varchar(255) DEFAULT NULL COMMENT '1-���£�2-�ײͣ�3-��ʱ',
  PRIMARY KEY (`COST_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `function_info` (
  `FUNCTION_ID` int(11) NOT NULL COMMENT '����ID',
  `FUNCTION_CODE` varchar(255) NOT NULL COMMENT '���ܱ��',
  `MODULE_ID` int(11) NOT NULL COMMENT '������ģ��ID������ģ���',
  `NAME` varchar(255) NOT NULL COMMENT '��������',
  `URL` varchar(255) NOT NULL COMMENT '���ܶ�Ӧ��URL��ַ',
  PRIMARY KEY (`FUNCTION_ID`),
  UNIQUE KEY `actable_uni_FUNCTION_CODE` (`FUNCTION_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `host` (
  `HOST_ID` varchar(255) NOT NULL COMMENT '��������¼UNIX��������ip��ַ',
  `NAME` varchar(255) NOT NULL COMMENT '������',
  `LOCATION` varchar(255) DEFAULT NULL COMMENT '��������λ��',
  PRIMARY KEY (`HOST_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `module_info` (
  `MODULE_ID` int(11) NOT NULL COMMENT 'ģ��ID',
  `NAME` varchar(255) NOT NULL COMMENT 'ģ������',
  PRIMARY KEY (`MODULE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `role_info` (
  `ROLE_ID` int(11) NOT NULL COMMENT '��������ɫID',
  `NAME` varchar(255) NOT NULL COMMENT '��ɫ����',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `role_module` (
  `ROLE_ID` int(11) NOT NULL COMMENT '��ɫID,������ɫ����������',
  `MODULE_ID` int(11) NOT NULL COMMENT 'ģ��ID�� ����ģ�����������',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `service` (
  `SERIVCE_ID` int(11) NOT NULL COMMENT 'ҵ���˺�_ID',
  `ACCOUNT_ID` int(11) NOT NULL COMMENT '�����˺�ID�� ���������˺ű�',
  `UNIX_HOST` varchar(255) NOT NULL COMMENT '��OS_USERNAME������Ψһ��NOT NULL  UNIX������IP��ַ',
  `OS_USERNAME` varchar(255) NOT NULL COMMENT '��UNIX_HOST������Ψһ�� NOT NULL	��¼UNIX��������OS�˺�',
  `STATUS` int(11) NOT NULL COMMENT '0����ͨ��1����ͣ��2��ɾ��',
  `CREATE_DATE` date DEFAULT NULL COMMENT '�������ڣ���������ͨ',
  `PAUSE_DATE` date DEFAULT NULL COMMENT '��ͣ����',
  `CLOSE_DATE` date DEFAULT NULL COMMENT 'ɾ������',
  `COST_ID` int(11) NOT NULL COMMENT '�ʷѱ��룬�����ʷ���Ϣ��',
  `LOGIN_PASSWD` varchar(255) NOT NULL COMMENT '��¼UNIX�������Ŀ���',
  PRIMARY KEY (`SERIVCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `service_detail` (
  `DETAIL_ID` int(11) NOT NULL COMMENT '������ҵ���굥_ID',
  `SERVICE_ID` int(11) NOT NULL COMMENT 'ҵ���˺�ID������ҵ���˺ű�',
  `CLIENT_HOST` varchar(255) DEFAULT NULL COMMENT 'OS�˺ŴӸ�IP��ַ��¼Unix������',
  `OS_USERNAME` varchar(255) DEFAULT NULL COMMENT '��¼UNIX��������OS�˺�',
  `PID` int(11) DEFAULT NULL COMMENT '���̺�',
  `LOGIN_TIME` date DEFAULT NULL COMMENT '��ʼ��¼ʱ��',
  `LOGOUT_TIME` date DEFAULT NULL COMMENT '�˳���¼ʱ��',
  `DURATION` decimal(10,2) DEFAULT NULL COMMENT 'ʱ�����룩',
  `COST` decimal(10,2) DEFAULT NULL COMMENT '����',
  PRIMARY KEY (`DETAIL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `service_update_bak` (
  `ID` int(11) NOT NULL COMMENT '����',
  `SERVICE_ID` int(11) NOT NULL COMMENT 'ҵ���˺�ID������ҵ���˺ű�',
  `COST_ID` int(11) NOT NULL COMMENT '�ʷѱ�ţ������ʷ���Ϣ��',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


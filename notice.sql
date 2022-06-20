CREATE TABLE notice(
	Nno 		 NUMBER,
    userId       VARCHAR2(300) NOT NULL,
    nTitle       VARCHAR2(300) NOT NULL,
    nContent     VARCHAR2(4000) NOT NULL,
    nWritedate   DATE DEFAULT SYSDATE,
 	nUpdatedate  DATE DEFAULT SYSDATE,
 	readCnt NUMBER DEFAULT 0,
 	CONSTRAINT pk_notice_Nno PRIMARY KEY(Nno)
);
CREATE SEQUENCE seq_notice_Nno;
SELECT * FROM notice;
drop sequence seq_notice_Nno;

Insert into NOTICE(Nno, userId, nTitle, nContent, nWritedate, nUpdatedate, readCnt) values(1,'관리자','공지사항','공지내용은 이렇습니다.', '2011-04-04', '2012-04-04', 3) 
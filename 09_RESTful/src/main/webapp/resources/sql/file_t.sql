DROP TABLE FILE_T;
DROP TABLE HISTORY_T;

CREATE TABLE HISTORY_T (
    HISTORY_NO  NUMBER NOT NULL,
    WRITER      VARCHAR2(100 BYTE) NOT NULL,
    IP          VARCHAR2(50 BYTE),
    CONSTRAINT PK_HISTORY PRIMARY KEY(HISTORY_NO)
);

CREATE TABLE FILE_T (
    FILE_NO           NUMBER NOT NULL,
    UPLOAD_PATH       VARCHAR2(300 BYTE),
    ORIGINAL_FILENAME VARCHAR2(300 BYTE),
    FILESYSTEM_NAME   VARCHAR2(40 BYTE),
    HISTORY_NO        NUMBER,
    CONSTRAINT PK_FILE PRIMARY KEY(FILE_NO),
    CONSTRAINT FK_FILE_HISTORY FOREIGN KEY(HISTORY_NO) 
        REFERENCES HISTORY_T(HISTORY_NO)
            ON DELETE CASCADE
);

DROP SEQUENCE HISTORY_SEQ;
DROP SEQUENCE FILE_SEQ;
CREATE SEQUENCE HISTORY_SEQ NOCACHE;
CREATE SEQUENCE FILE_SEQ NOCACHE;
package com.zerobase.fastlms.mail.entity;

public enum MailTemplateType {
    REGIST("REGIST_MEMBER"),
    PASS_INIT("PASSWORD_INIT");

    /*
    CREATE TABLE `mail_template` (
  `id` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) charset = utf8;

    CREATE mail_template

    INSERT INTO mail_template VALUES ("REGIST_MEMBER","fastlms 사이트 가입을 축하드립니다.",
"<p>{USER_NAME}님 fastlms 사이트 가입을 축하드립니다.<p>
<p>아래 링크를 클릭하셔서 가입을 완료 하세요.</p>
<div>
<a target='_blank' href='http://localhost:8080/member/email-auth?id={UUID}'>가입 완료</a>
</div>");

INSERT INTO mail_template VALUES ("PASSWORD_INIT","[fastlms] 비밀번호 초기화 메일 입니다.",
"<p>{USER_NAME}님 fastlms 비밀번호 초기화 메일 입니다.<p>
<p>아래 링크를 클릭하셔서 비밀번호를 초기화 해주세요.</p>
<div>
<a target='_blank' href='http://localhost:8080/member/reset/password?id={UUID}'>비밀번호 초기화 링크
</a>
</div>");
     */

    private final String value;

    MailTemplateType(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}

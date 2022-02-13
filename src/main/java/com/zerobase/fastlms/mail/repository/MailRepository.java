package com.zerobase.fastlms.mail.repository;

import com.zerobase.fastlms.mail.entity.MailTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MailRepository extends JpaRepository<MailTemplate, String> {

    Optional<MailTemplate> findByid(String id);

}

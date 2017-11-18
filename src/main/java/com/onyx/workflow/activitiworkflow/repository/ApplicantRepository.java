package com.onyx.workflow.activitiworkflow.repository;

import com.onyx.workflow.activitiworkflow.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

}
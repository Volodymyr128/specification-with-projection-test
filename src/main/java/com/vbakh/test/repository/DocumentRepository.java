package com.vbakh.test.repository;

import com.vbakh.test.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.springdata.jpa.repository.JpaSpecificationExecutorWithProjection;

/**
 * Created by volodymyr.bakhmatiuk on 11/30/17.
 */
public interface DocumentRepository extends JpaRepository<Document, Long>, JpaSpecificationExecutorWithProjection<Document> {
}

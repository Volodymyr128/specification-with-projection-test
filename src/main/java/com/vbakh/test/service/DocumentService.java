package com.vbakh.test.service;

import com.vbakh.test.domain.Document;
import com.vbakh.test.repository.DocumentRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by volodymyr.bakhmatiuk on 11/30/17.
 */
@Service
public class DocumentService {

    @Resource
    private DocumentRepository repository;

    public List<Document> findAll() {
        return repository.findAll();
    }
}

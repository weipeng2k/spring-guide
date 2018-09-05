package com.murdock.books.spring.guide.springboot.dao.impl;

import com.murdock.books.spring.guide.springboot.dao.AuthorDAO;
import com.murdock.books.spring.guide.springboot.dao.dataobject.AuthorDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;

/**
 * @author weipeng2k 2018年07月22日 下午14:32:19
 */
@Repository("authorDAO")
public class AuthorDAOImpl implements AuthorDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Optional<AuthorDO> queryAuthorById(Long id) {
        AuthorDO result = null;
        try {
            result = jdbcTemplate.queryForObject("select * from author WHERE id = ?", new Object[]{id},
                    (resultSet, i) -> {
                        long authorId = resultSet.getLong("id");
                        Date authorGmtCreate = resultSet.getDate("gmt_create");
                        Date authorGmtModified = resultSet.getDate("gmt_modified");
                        String authorName = resultSet.getString("name");
                        int authorRate = resultSet.getInt("rate");

                        AuthorDO authorDO = new AuthorDO();
                        authorDO.setId(authorId);
                        authorDO.setGmtCreate(authorGmtCreate);
                        authorDO.setGmtModified(authorGmtModified);
                        authorDO.setName(authorName);
                        authorDO.setRate(authorRate);

                        return authorDO;
                    });

        } catch (EmptyResultDataAccessException ignore) {
        }

        return Optional.ofNullable(result);
    }
}

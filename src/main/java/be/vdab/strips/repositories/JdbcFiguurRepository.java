package be.vdab.strips.repositories;

import be.vdab.strips.domain.Figuur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Birger Huysmans
 * @version 1.0
 */

@Repository
public class JdbcFiguurRepository implements FiguurRepository {
    private final JdbcTemplate template;
    private final RowMapper<Figuur> figuurRowMapper = (result, rowNum) ->
            new Figuur(result.getLong("id"), result.getString("naam"));

    public JdbcFiguurRepository(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Figuur> findAll() {
        var sql = "SELECT id, naam FROM figuren ORDER BY naam";
        return template.query(sql, figuurRowMapper);
    }
}

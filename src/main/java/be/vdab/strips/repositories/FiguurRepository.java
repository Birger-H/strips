package be.vdab.strips.repositories;

import be.vdab.strips.domain.Figuur;

import java.util.List;

/**
 * @author Birger Huysmans
 * @version 1.0
 */

public interface FiguurRepository {
    List<Figuur> findAll();
}

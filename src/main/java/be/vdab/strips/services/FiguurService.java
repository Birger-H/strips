package be.vdab.strips.services;

import be.vdab.strips.domain.Figuur;

import java.util.List;

/**
 * @author Birger Huysmans
 * @version 1.0
 */

public interface FiguurService {
    List<Figuur> findAll();
}

package com.devesuper.dslist.repositories;

import com.devesuper.dslist.entites.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

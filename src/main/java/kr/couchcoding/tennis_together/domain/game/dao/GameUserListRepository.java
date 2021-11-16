package kr.couchcoding.tennis_together.domain.game.dao;

import kr.couchcoding.tennis_together.domain.game.model.Game;
import kr.couchcoding.tennis_together.domain.game.model.GameUserList;
import kr.couchcoding.tennis_together.domain.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface GameUserListRepository extends JpaRepository<GameUserList, Long>, JpaSpecificationExecutor<GameUserList> {
    Optional<GameUserList> findByGameUserAndJoinedGame(User gameUser, Game joinedGame);

    Page<GameUserList> findByJoinedGame(Game joinedGame, Specification<GameUserList> spec, Pageable pageable);
}

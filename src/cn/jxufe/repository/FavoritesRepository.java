package cn.jxufe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.jxufe.entity.Favorites;

public interface FavoritesRepository extends JpaRepository<Favorites, Integer> {

	//通过用户id获取收藏夹
	Favorites getByUser_Id(Integer id);
}

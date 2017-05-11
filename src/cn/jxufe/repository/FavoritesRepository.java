package cn.jxufe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.jxufe.entity.Favorites;

public interface FavoritesRepository extends JpaRepository<Favorites, Integer> {

	//ͨ���û�id��ȡ�ղؼ�
	Favorites getByUser_Id(Integer id);
}

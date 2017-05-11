package cn.jxufe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jxufe.entity.Article;
import cn.jxufe.entity.Circle;
import cn.jxufe.repository.CircleRepository;

@Service
public class CircleService {

	@Autowired
	private CircleRepository circleRepository;
	
	//��ȡһ��Ȧ��
	@Transactional(readOnly=true)
	public List<Circle> getCircle()
	{
		return circleRepository.getLevel1Circle();
	}
	
	//��ȡ�����¼�Ȧ��
	@Transactional(readOnly=true)
	public List<Circle> getNextCircle(Integer id)
	{
		return circleRepository.getNextCircle(id);
	}
	
	//ͨ��Ȧ��ID��ȡȦ�Ӷ���
	@Transactional(readOnly=true)
	public Circle getByID(Integer id)
	{
		return circleRepository.findOne(id); 
	}
	
	//��ѯ�Ƿ�Ȧ���Ѿ�����
	@Transactional
	public String isCircleExist(Circle circle){   
		if(circleRepository.checkCircle(circle.getSuperior_circle_id(), circle.getCircleName())==null){
			return "1";  //������
		}
		return "0";     //����
	}  
	
	//��Ȧ�ӽ��з�ҳ
	@Transactional(readOnly=true)
	public Page<Circle> getPage(int pageNo, int pageSize){
			PageRequest pageable = new PageRequest(pageNo - 1, pageSize);
			return circleRepository.findAll(pageable);
		}
	
}

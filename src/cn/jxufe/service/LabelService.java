package cn.jxufe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jxufe.entity.Label;
import cn.jxufe.repository.LabelRepository;

@Service
public class LabelService {

	@Autowired
	private LabelRepository labelRepository;
	
	//通过标签名返回标签对象
	@Transactional(readOnly=true)
	public Label getByLabelName(String labelName)
	{
		return labelRepository.getByLabelName(labelName);
	}

	//得到所有的标签
	@Transactional(readOnly=true)
	public List<Label> getAllLabel(){
		return labelRepository.findAll();
	}
	
	
	//新建标签
	@Transactional
	public void saveLabel(Label label){   
		labelRepository.saveAndFlush(label);
	}

}

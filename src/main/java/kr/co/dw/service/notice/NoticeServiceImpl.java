package kr.co.dw.service.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dw.domain.NoticeDTO;
import kr.co.dw.repository.notice.NoticeDAO;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	private NoticeDAO nDao;

	@Override
	public List<NoticeDTO> list() {
		// TODO Auto-generated method stub
		return nDao.list();
	}

	@Override
	public void insert(NoticeDTO nDto) {
		// TODO Auto-generated method stub
		nDao.insert(nDto);
	}

	@Override
	public NoticeDTO read(int nno) {
		// TODO Auto-generated method stub
		NoticeDTO nDto = nDao.read(nno);
		//String nContent = nDto.getnContent().replaceAll("<br>",System.lineSeparator());
		//nDto.setnContent(nContent);
		
		
		return nDto;
	}

	@Override
	public void delete(int nno) {
		// TODO Auto-generated method stub
		nDao.delete(nno);
	}

	@Override
	public NoticeDTO updateUI(int nno) {
		// TODO Auto-generated method stub
		return nDao.updateUI(nno);
	}

	@Override
	public void update(NoticeDTO nDto) {
		// TODO Auto-generated method stub
		nDao.update(nDto);
		
	}


	
}

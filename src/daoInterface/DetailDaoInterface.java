package daoInterface;

import java.util.List;

import entity.Detail;

public interface DetailDaoInterface {
	public void AddDetail(Detail d);
	public List<Detail> FindAllDetail();
	public boolean DeleteDetail(Detail d);
	public Detail FindByIdDetail(Detail d);
	public List<Detail> FindByClaIdDetail(Detail d);
}

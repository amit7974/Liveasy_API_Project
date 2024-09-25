package coder_amit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import coder_amit.entity.Load;
@Service
public class LoadServiceImpl  implements LoadService{
List<Load> list;
public LoadServiceImpl() {
	list = new ArrayList<>();
	list.add(new Load(125,"Jaipur", "patna", "chemicals", "canter", "1","100", "comment", "uuid","1 june 2015"));
	list.add(new Load(198,"banglore", "hajipur", "liquid", "canter", "5","10", "comment", "uuid","5 june 2016"));

	
}
	@Override
	public List<Load> getLoades() {
		return list;
	}
	@Override
	public Load getLoad(long loadId) {
		
		Load l = null;
		for(Load load :list) {
			if(load.getLoadId()==loadId) {
				
				l=load;
				break;
			}
			
		}
		return l;
	}
	@Override
	public Load addLoad(Load load) {
		list.add(load);
		return load;
	}
	@Override
	public Load updateLoad(Load load) {
		return load;
	}
	@Override
	public Load deleteLoad(Load load) {
		return load;
	}
	
	
	}


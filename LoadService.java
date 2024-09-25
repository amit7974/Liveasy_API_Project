package coder_amit.services;

import java.util.List;

import coder_amit.entity.Load;

public interface LoadService {
	public List<Load> getLoades();
	
	public Load getLoad(long loadId);
	
	public Load addLoad(Load load);

	public Load updateLoad(Load load);

	public Load deleteLoad(Load load);
	
	

}

	

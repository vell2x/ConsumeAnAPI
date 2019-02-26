package com.example.consumeanapilab.consumeanapilab.model;

import java.util.List;

public class ListResponse {
	private List<CompleteList> complete;
	private List<TinyList> tiny;
	
	public List<CompleteList> getComplete() {
		return complete;
	}
	public void setComplete(List<CompleteList> complete) {
		this.complete = complete;
	}
	public List<TinyList> getTiny() {
		return tiny;
	}
	public void setTiny(List<TinyList> tiny) {
		this.tiny = tiny;
	}
}
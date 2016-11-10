package com.mtime.springboot.support.pager;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.json.JSONNull;
import net.sf.json.JSONObject;

public class DataObject<M> {
	private M object;
	
	public DataObject(M obj){
		this.object=obj;
	}
	/**
	 * 转成json数据
	 * @return
	 */
	public String toJson(DataFormat dataFormat){
		if(null==dataFormat){
			dataFormat=new DataFormat();
		}
		dataFormat.formatDate("createTime", "yyyy-MM-dd HH:mm:ss");
		dataFormat.formatDate("updateTime", "yyyy-MM-dd HH:mm:ss");
		dataFormat.formatCode("status");
		dataFormat.formatCode("type");
		
		String json=null;
		ObjectMapper mapper=new ObjectMapper();
		try {
			json=mapper.writeValueAsString(this.object);
			JsonNode node = mapper.readTree(json);
			String nodeJson=node.toString();
			JSONObject jsonObj=JSONObject.fromObject(nodeJson);
			for (Map.Entry<String, FormatParam> entry : dataFormat.paramMap.entrySet()) {
				String field=entry.getKey();
				if(!(jsonObj.get(field) instanceof JSONNull)&&jsonObj.get(field)!=null){
					String value=dataFormat.dataFormat(entry.getValue(), jsonObj.get(field).toString());
					jsonObj.element(field+"_name",value);
				}
			}
			json=jsonObj.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
}

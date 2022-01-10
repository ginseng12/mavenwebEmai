package servlet;

import lombok.Data;

@Data
public class IdCard {
	
	//数据库字段和对象字段就ok
	private String phone; //空
	
	private String idcard;
	
	
	private String color;


	@Override
	public String toString() {
		return "[phone=" + phone + ", idcard=" + idcard + ", color=" + color + "]";
	}
	
	

}

package com.kh.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * * 네트워크 : 여러대의 컴퓨터들이 연결되어있는 통신망
 * 			  => 네트워크를 통해서 서로 데이터를 교환하기 위해서
 * 
 *  IP 주소 : 네트워크상에 각 컴퓨터들을 식별해줄 수 있는 번호(실제 주소와 동일한 역할을 한다고 생각하면 된다.)
 *  
 *  * 서버와 클라이언트
 *  > 서버 :  클라이언트(고객)에게 서비스를 제공해주는 프로그램 또는 컴퓨터 (클라이언트의 요청에 응답을 해주는 것)
 *  > 클라이언트 : 서버에 요청을 하는 컴퓨터 (서비스를 제공받는 고객)
 *  
 *  - 서버에 요청하기위해서는 그 요청하고자하는 서버의 IP주소(또는 도메인), 포트번호를 알아야함
 *  
 *  * 현재 구동중인 서버가 있을 떄
 *    클라이언트는 그 서버로 요청을 보낼 수 있고 => 응답결과가 돌아옴
 *    
 *    -요청과 응답에 의해서 웹은 작동합니다. ("통신한다")
 *    -웹에서의 통신방식은 : HTTP 프로토콜을 사용한다.
 *    
 *    * 자바만가지고 서버와 클라이언트간에 간단한 통신 해보기!
 *    이때 데이터를 입출력하고자 한다면 서버와 클라이언트간에 스트림(연결통로)이 필요함
 *    
 *    * 소켓 : 프로세스간의 통신을 담당하는거다 
 *    
 *    *소켓 프로그래밍 (TCP / UDP)
 *    - TCP방식 : 데이터전송속도가 느림! 데이터가 정확하고 안정적으로 전달이 가능(신뢰성이 요구되는 프로그램)
 *    - UDP방식 : 데이터전송속도가 빠름! 신뢰성 없는 데이터 전달에 용이(데이터를 빠른속도로 전송하고하 할때)
 */

// InetAddress : 네트워크의 정보(ip주소 관련)를 확인할 수 있는 클래스


public class Run {

	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost(); //내PC(지역호스트)에 대한 정보를 반환 
			System.out.println(localhost); // 내PC명 + / + 내 ip주소
			
			System.out.println("내 PC명 : " + localhost.getHostName()); // 호스트의 이름을 반환
			System.out.println("내 IP주소 : " + localhost.getHostAddress()); // 호스트 IP주소 반환
			
			System.out.println("===========================================");
			
			InetAddress googleHost = InetAddress.getByName("www.google.com"); // 도메인명을 통해서 해당 호스트에 정보를 가져올 수 있다.
			System.out.println("구글의 서버명 : " + googleHost.getHostName());
			System.out.println("구글의 IP주소 : " + googleHost.getHostAddress());
			
			System.out.println("==============================================");
			InetAddress[] naverHost =  InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 호스트 개수 : " + naverHost.length);
			
			for (InetAddress n : naverHost) {
				System.out.println("네이버 서버명: " + n.getHostName());
				System.out.println("네이버 IP주소: " + n.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 

	}

}

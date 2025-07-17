package service;

import dto.TelDto;

import java.util.List;

public interface CrudInterface {
    int insertData(TelDto dto);

    int InsertData(TelDto dto);
    int UpdateData(TelDto dto);

    int deleteData(int id);

    List<TelDto> getListAll();// 전체 찾기

    TelDto findbyId(int id);//한 개 테이터 찾기

    List<TelDto> searcHList(String keyword); //이름검색
}

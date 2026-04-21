package service;

import dto.TelDTO;
import repository.TelBookRepository;

public class TelBookService {
    private final TelBookRepository repository;

    public TelBookService(TelBookRepository repository) {
        this.repository = repository;
    }

    public void insert(String name, int age, String address, String phone) {
        // 받은 자료로 TelDTO를 생성
        TelDTO dto =new TelDTO(0L, name, age, address, phone);
        // repo 호출
        int result = repository.insertData(dto);
        if (result > 0) {
            System.out.println("정상적으로 저장되었습니다.");
        }
    }
}

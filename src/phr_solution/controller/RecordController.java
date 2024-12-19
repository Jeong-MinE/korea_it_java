package phr_solution.controller;

import phr_solution.dto.request.RecordRequestDto;
import phr_solution.dto.response.RecordResponseDto;
import phr_solution.service.RecordService;


import java.util.List;

public class RecordController {
    private final RecordService service;

    public RecordController() {
        this.service = new RecordService();
    }

    public List<RecordResponseDto> getAllRecords() {
        return service.getAllRecords();
    }

    public List<RecordResponseDto> filterRecordsByDiagnosis(String diagnosisFilter) {
        return service.filterRecordsByDiagnosis(diagnosisFilter);
    }

    public void deleteRecord(long id) {
        service.deleteRecord(id);
    }

    public void createRecord(RecordRequestDto requestDto) {
        service.createRecord(requestDto);
    }
}

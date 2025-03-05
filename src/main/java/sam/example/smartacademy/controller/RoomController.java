package sam.example.smartacademy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sam.example.smartacademy.dto.RoomDto;
import sam.example.smartacademy.entity.Room;
import sam.example.smartacademy.repo.RoomRepository;
import sam.example.smartacademy.service.RoomService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/room")
public class RoomController {

    private final RoomService roomService;


    @GetMapping("/read")
    public List<RoomDto> read() {
        return roomService.findAll();
    }

    @GetMapping("/read/{id}")
    public RoomDto readOne(@PathVariable Long id) {
        return roomService.findById(id);
    }
    @PostMapping("/create")
    public RoomDto create(@RequestBody RoomDto roomDto) {
        return roomService.create(roomDto);
    }
    @PutMapping("update/{id}")
    public RoomDto update(@PathVariable Long id
            , @RequestBody RoomDto roomDto) {
        return roomService.update(roomDto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        roomService.deleteById(id);
    }


}

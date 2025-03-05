package sam.example.smartacademy.service;

import org.springframework.stereotype.Service;
import sam.example.smartacademy.dto.RoomDto;
import sam.example.smartacademy.entity.Room;
import sam.example.smartacademy.repo.RoomRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService{

    private RoomRepository roomRepository;

    public List<RoomDto> findAll() {
        List<Room> all = roomRepository.findAll();
        List<RoomDto> roomDTOs = new ArrayList<>();

        for (Room room : all) {
            roomDTOs.add(RoomDto.builder()
                    .capacity(room.getCapacity())
                    .countOfChair(room.getCountOfChair())
                    .roomName(room.getRoomName())
                    .countOfTable(room.getCountOfTable())
                    .build());
        }
        return roomDTOs;

    }


    public RoomDto findById(Long id) {
        Optional<Room> byId = roomRepository.findById(id);
        if (byId.isPresent()) {
            Room room = byId.get();
            return RoomDto.builder().roomName(room.getRoomName())
                    .capacity(room.getCapacity())
                    .countOfChair(room.getCountOfChair())
                    .countOfTable(room.getCountOfTable())
                    .build();
        }
        throw  new RuntimeException("Room not found");
    }

    public RoomDto create (RoomDto roomDto) {
        Room byName = roomRepository.findByName(roomDto.getRoomName());
        if (byName == null) {
            throw  new RuntimeException("Room already exists");
        }
        Room build = Room.builder().roomName(roomDto.getRoomName())
                .capacity(roomDto.getCapacity())
                .countOfChair(roomDto.getCountOfChair())
                .countOfTable(roomDto.getCountOfTable())
                .build();
        roomRepository.save(build);

        return roomDto;
    }

    public RoomDto update (RoomDto roomDto) {
        Optional<Room> byId = roomRepository.findById(roomDto.getId());
        if (byId.isPresent()) {
            Room room = byId.get();
            room.setRoomName(roomDto.getRoomName());
            room.setCapacity(roomDto.getCapacity());
            room.setCountOfChair(roomDto.getCountOfChair());
            room.setCountOfTable(roomDto.getCountOfTable());
            roomRepository.save(room);
            return roomDto;
        }
        throw  new RuntimeException("Room not found");
    }

    public void deleteById(Long id) {
        Optional<Room> byId = roomRepository.findById(id);
        if (byId.isPresent()) {
            Room room = byId.get();
            roomRepository.delete(room);
        }
        throw  new RuntimeException("Room not found");
    }
}









//RoomDto roomDto = RoomDto.builder()
//                    .capacity(room.getCapacity())
//                    .countOfChair(room.getCountOfChair())
//                    .roomName(room.getRoomName())
//                    .countOfTable(room.getCountOfTable())
//                    .build();
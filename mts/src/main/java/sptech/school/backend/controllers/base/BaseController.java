package sptech.school.backend.controllers.base;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.backend.dto.UserDTO;
import sptech.school.backend.dto.base.BaseDTO;
import sptech.school.backend.services.base.ICrudFacade;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public abstract class  BaseController<DTO extends BaseDTO> {

    protected final ICrudFacade<DTO> facade;

    @GetMapping()
    public ResponseEntity<List<DTO>> findAll(){
        List<DTO> list = facade.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<DTO>> findById(@PathVariable Long id){
        var res = facade.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @PostMapping
    public ResponseEntity<DTO> create(@RequestBody DTO dto) {
        var res = facade.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DTO> update(@PathVariable Long id, @RequestBody DTO dto) {
        if (this.facade.getById(id)) {
            facade.update(id, dto);
        }
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
         facade.delete(id);
         return ResponseEntity.status(HttpStatus.OK).build();
    }

}
package uz.elmurodov.spring_boot.utils.validators.column;

import org.springframework.stereotype.Component;
import uz.elmurodov.spring_boot.dto.column.ColumnCreateDto;
import uz.elmurodov.spring_boot.dto.column.ColumnUpdateDto;
import uz.elmurodov.spring_boot.exceptions.ValidationException;
import uz.elmurodov.spring_boot.utils.BaseUtils;
import uz.elmurodov.spring_boot.utils.validators.AbstractValidator;

@Component
public class ColumnValidator extends AbstractValidator<ColumnCreateDto, ColumnUpdateDto, Long> {

    protected ColumnValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(ColumnCreateDto columnCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(ColumnUpdateDto cd) throws ValidationException {

    }
}

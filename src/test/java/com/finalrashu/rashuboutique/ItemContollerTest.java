package com.finalrashu.rashuboutique;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

//import com.finalrashu.rashuboutique.Controller.Dto.ItemDto;
import com.finalrashu.rashuboutique.Controller.ItemsController;
import com.finalrashu.rashuboutique.Service.ItemService;
//import com.finalrashu.rashuboutique.Model.Item;

//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


@SpringBootTest
@TestInstance( TestInstance.Lifecycle.PER_CLASS )
public class ItemContollerTest {
    
    @Mock
    ItemService itemService;

    ItemsController itemController;

    @BeforeAll
    public void setup()
    {
        itemController = new ItemsController( itemService );
    }

    /*@Test
    public void saveCallsSaveOnItemService()
    {
        ItemDto itemDtoMock = mock( ItemDto.class );
        itemController.createItem( itemDtoMock );
        verify( itemService ).createItem(any(Item.class));
    }*/


    @Test
    public void getItemsCallsAllOnItemService(){
        itemController.getAllItems();
        verify( itemService ).getAllItems();
    }
}

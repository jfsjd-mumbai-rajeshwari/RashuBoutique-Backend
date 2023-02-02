package com.finalrashu.rashuboutique;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.finalrashu.rashuboutique.Model.Item;
import com.finalrashu.rashuboutique.Repository.ItemRepository;
import com.finalrashu.rashuboutique.Service.ItemService;
import com.finalrashu.rashuboutique.Service.ItemServiceimpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@SpringBootTest
@TestInstance( TestInstance.Lifecycle.PER_CLASS)
public class ItemServiceimplTest {

    @Mock
    ItemRepository itemRepository;

    ItemService itemService;

    @BeforeAll
    public void setup()
    {
        itemService = new ItemServiceimpl( itemRepository );
    }

    @Test
    public void saveCallsItemsRepositorySave()
    {
        Item itemMock = mock( Item.class );
        itemService.createItem( itemMock );
        verify( itemRepository ).save( itemMock );
    }

}

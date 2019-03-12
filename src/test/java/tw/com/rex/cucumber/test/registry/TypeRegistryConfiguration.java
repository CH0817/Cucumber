package tw.com.rex.cucumber.test.registry;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import tw.com.rex.cucumber.model.User;

import java.util.Locale;

/**
 * 自定義資料類型轉換 ( Data tables to User )
 */
@SuppressWarnings("unused")
public class TypeRegistryConfiguration
        implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(transformUser());
    }

    private DataTableType transformUser() {
        return new DataTableType(User.class, createUser());
    }

    private TableEntryTransformer<User> createUser() {
        return entry -> new User(entry.get("email"), entry.get("password"));
    }

}

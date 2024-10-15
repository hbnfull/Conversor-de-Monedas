import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class api {
    @SerializedName("conversion_result")
    public float conversion;
    @SerializedName("conversion_rate")
    public float cambio;
    @SerializedName("conversion_rates")
    public Map<String, Float> mapa = new HashMap<String, Float>();
}

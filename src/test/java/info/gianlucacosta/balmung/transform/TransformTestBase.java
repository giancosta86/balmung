package info.gianlucacosta.balmung.transform;

import java.util.function.BiFunction;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public abstract class TransformTestBase<T extends Transform> {
    private final BiFunction<String, String, T> transformRetriever;

    public TransformTestBase(BiFunction<String, String, T> transformRetriever) {
        this.transformRetriever = transformRetriever;
    }

    protected void testTransformRetrievalAndApplication(
            String origin,
            String result,
            T expectedTransform
    ) {
        T retrievedTransform =
                transformRetriever.apply(origin, result);

        assertThat(
                retrievedTransform,
                equalTo(expectedTransform)
        );

        String transformResult =
                retrievedTransform.apply(origin);

        assertThat(
                transformResult,
                equalTo(result)
        );
    }
}

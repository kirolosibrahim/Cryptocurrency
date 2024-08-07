import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.kit.cryptocurrency.presentation.theme.ColorPrimary
import com.kit.cryptocurrency.presentation.theme.DarkGray
import com.kit.cryptocurrency.presentation.theme.MediumGray
import com.kit.cryptocurrency.presentation.theme.Shapes
import com.kit.cryptocurrency.presentation.theme.TextWhite
import com.kit.cryptocurrency.presentation.theme.Typography


private val DarkColorPalette = darkColorScheme(
    primary = ColorPrimary,
    background = DarkGray,
    onBackground = TextWhite,
    onPrimary = DarkGray
)

private val LightColorPalette = lightColorScheme(
    primary = ColorPrimary,
    background = Color.White,
    onBackground = MediumGray,
    onPrimary = DarkGray
)

@Composable
fun CryptocurrencyAppYTTheme(darkTheme: Boolean = true, content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
    }
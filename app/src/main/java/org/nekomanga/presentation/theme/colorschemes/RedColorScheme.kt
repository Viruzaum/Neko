package org.nekomanga.presentation.theme.colorschemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Shades for hex colors https://noeldelgado.github.io/shadowlord/
// Color palette https://paletton.com/

internal object RedColorScheme : BaseColorScheme() {
    override val lightScheme =
        lightColorScheme(
            primary = Color(0xFFD31D3B),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFFE0475F),
            onPrimaryContainer = Color(0xFFFFFFFF),
            secondary = Color(0xFFED4A65),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFFF46D82),
            onSecondaryContainer = Color(0xFFFFFFFF),
            tertiary = Color(0xFFF3E7E7),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFFFFFBFB),
            onTertiaryContainer = Color(0xFF000000),
            error = Color(0xFFC14033),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFDC6559),
            onErrorContainer = Color(0xFFFFFFFF),
            background = Color(0xFFFAFAFA),
            onBackground = Color(0xFF000000),
            surface = Color(0xFFFAFAFA),
            onSurface = Color(0xFF000000),
            surfaceVariant = Color(0xFFFAFAFA),
            onSurfaceVariant = Color(0xFF000000),
            outline = Color(0xFFEDA5B1),
            outlineVariant = Color(0xFFF6D2D8),
            scrim = Color(0xFFFFFFFF),
            inverseSurface = Color(0xFFFFFFFF),
            inverseOnSurface = Color(0xFFFFFFFF),
            inversePrimary = Color(0xFFEF8E9E),
            surfaceDim = Color(0xFFFFFFFF),
            surfaceBright = Color(0xFFFFFFFF),
            surfaceContainerLowest = Color(0xFFFBFBFB),
            surfaceContainerLow = Color(0xFFFBFBFB),
            surfaceContainer = Color(0xFFFAFAFA),
            surfaceContainerHigh = Color(0xFFE1E1E1),
            surfaceContainerHighest = Color(0xFFC8C8C8),
        )

    override val darkScheme =
        darkColorScheme(
            primary = Color(0xFFE14E4E),
            onPrimary = Color(0xFF330303),
            primaryContainer = Color(0xFFFF7B7B),
            onPrimaryContainer = Color(0xFF330303),
            secondary = Color(0xFFCC4444),
            onSecondary = Color(0xFF330303),
            secondaryContainer = Color(0xFFEF7070),
            onSecondaryContainer = Color(0xFF330303),
            tertiary = Color(0xFF2B2320),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF5F534F),
            onTertiaryContainer = Color(0xFFFFFFFF),
            error = Color(0xFFC14033),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFDC6559),
            onErrorContainer = Color(0xFFFFFFFF),
            background = Color(0xFF1A1716),
            onBackground = Color(0xFFFFFFFF),
            surface = Color(0xFF1A1716),
            onSurface = Color(0xFFFFFFFF),
            surfaceVariant = Color(0xFF1A1716),
            onSurfaceVariant = Color(0xFFFFFFFF),
            outline = Color(0xFFF3B8B8),
            outlineVariant = Color(0xFFF9DCDC),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFF000000),
            inverseOnSurface = Color(0xFF000000),
            inversePrimary = Color(0xFF9F1414),
            surfaceDim = Color(0xFF000000),
            surfaceBright = Color(0xFF000000),
            surfaceContainerLowest = Color(0xFF443935),
            surfaceContainerLow = Color(0xFF4B3F3B),
            surfaceContainer = Color(0xFF5D524F),
            surfaceContainerHigh = Color(0xFF6F6562),
            surfaceContainerHighest = Color(0xFF817976),
        )
}

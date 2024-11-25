package org.nekomanga.presentation.theme.colorschemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Shades for hex colors https://noeldelgado.github.io/shadowlord/
// Color palette https://paletton.com/

internal object SeedColorScheme : BaseColorScheme() {
    override val lightScheme =
        lightColorScheme(
            primary = Color(0xFFFFFFFF),
            onPrimary = Color(0xFF000000),
            primaryContainer = Color(0xFFFFFFFF),
            onPrimaryContainer = Color(0xFF000000),
            secondary = Color(0xFFFFFFFF),
            onSecondary = Color(0xFF000000),
            secondaryContainer = Color(0xFFFFFFFF),
            onSecondaryContainer = Color(0xFF000000),
            tertiary = Color(0xFFFFFFFF),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFFFFFFFF),
            onTertiaryContainer = Color(0xFFFFFFFF),
            error = Color(0xFFC14033),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFDC6559),
            onErrorContainer = Color(0xFFFFFFFF),
            background = Color(0xFFFFFFFF),
            onBackground = Color(0xFF000000),
            surface = Color(0xFFFFFFFF),
            onSurface = Color(0xFF000000),
            surfaceVariant = Color(0xFFFFFFFF),
            onSurfaceVariant = Color(0xFF000000),
            outline = Color(0xFFFFFFFF), // 60% less than primary
            outlineVariant = Color(0xFFFFFFFF), // 80% less than primary
            scrim = Color(0xFFFFFFFF),
            inverseSurface = Color(0xFFFFFFFF),
            inverseOnSurface = Color(0xFFFFFFFF),
            inversePrimary = Color(0xFFFFFFFF),
            surfaceDim = Color(0xFFFFFFFF),
            surfaceBright = Color(0xFFFFFFFF),
            surfaceContainerLowest = Color(0xFFFFFFFF),
            surfaceContainerLow = Color(0xFFFFFFFF),
            surfaceContainer = Color(0xFFFFFFFF),
            surfaceContainerHigh = Color(0xFFFFFFFF),
            surfaceContainerHighest = Color(0xFFFFFFFF),
        )

    override val darkScheme =
        darkColorScheme(
            primary = Color(0xFF000000),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFF000000),
            onPrimaryContainer = Color(0xFFFFFFFF),
            secondary = Color(0xFF000000),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFF000000),
            onSecondaryContainer = Color(0xFFFFFFFF),
            tertiary = Color(0xFF000000),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF000000),
            onTertiaryContainer = Color(0xFFFFFFFF),
            error = Color(0xFFC14033),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFDC6559),
            onErrorContainer = Color(0xFFFFFFFF),
            background = Color(0xFF000000),
            onBackground = Color(0xFFFFFFFF),
            surface = Color(0xFF000000),
            onSurface = Color(0xFFFFFFFF),
            surfaceVariant = Color(0xFF000000),
            onSurfaceVariant = Color(0xFFFFFFFF),
            outline = Color(0xFF000000),
            outlineVariant = Color(0xFF000000),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFF000000),
            inverseOnSurface = Color(0xFF000000),
            inversePrimary = Color(0xFF000000),
            surfaceDim = Color(0xFF000000),
            surfaceBright = Color(0xFF000000),
            surfaceContainerLowest = Color(0xFF000000),
            surfaceContainerLow = Color(0xFF000000),
            surfaceContainer = Color(0xFF000000),
            surfaceContainerHigh = Color(0xFF000000),
            surfaceContainerHighest = Color(0xFF000000),
        )
}

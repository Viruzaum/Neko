package org.nekomanga.presentation.theme.schemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

internal class MangaDexColorScheme : BaseColorScheme() {
    override val darkScheme =
        darkColorScheme(
            primary = Color(0xFFFF6740),
            onPrimary = Color(0xFF29313A),
            primaryContainer = Color(0xFF091119),
            onPrimaryContainer = Color(0xFF979FAA),
            secondary = Color(0xFFFF6740),
            onSecondary = Color(0xFF29313A),
            secondaryContainer = Color(0xFF091119),
            onSecondaryContainer = Color(0xFF979FAA),
            tertiary = Color(0xFFBFC7D2),
            onTertiary = Color(0xFF29313A),
            tertiaryContainer = Color(0xFF091119),
            onTertiaryContainer = Color(0xFF979FAA),
            error = Color(0xFFFFB4AB),
            onError = Color(0xFF690005),
            errorContainer = Color(0xFF93000A),
            onErrorContainer = Color(0xFFFFDAD6),
            background = Color(0xFF131314),
            onBackground = Color(0xFFE4E2E2),
            surface = Color(0xFF131314),
            onSurface = Color(0xFFE4E2E2),
            surfaceVariant = Color(0xFF44474B),
            onSurfaceVariant = Color(0xFFC5C6CB),
            outline = Color(0xFF8E9195),
            outlineVariant = Color(0xFF44474B),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFFE4E2E2),
            inverseOnSurface = Color(0xFF303031),
            inversePrimary = Color(0xFF575F69),
            surfaceDim = Color(0xFF131314),
            surfaceBright = Color(0xFF39393A),
            surfaceContainerLowest = Color(0xFF0E0E0F),
            surfaceContainerLow = Color(0xFF1B1B1C),
            surfaceContainer = Color(0xFF1F1F20),
            surfaceContainerHigh = Color(0xFF2A2A2A),
            surfaceContainerHighest = Color(0xFF353535),
        )
    override val lightScheme =
        lightColorScheme(
            primary = Color(0xFFFF6740),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFF1F272F),
            onPrimaryContainer = Color(0xFFAAB2BD),
            secondary = Color(0xFFFF6740),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFF1F272F),
            onSecondaryContainer = Color(0xFFAAB2BD),
            tertiary = Color(0xFF000000),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF1F272F),
            onTertiaryContainer = Color(0xFFAAB2BD),
            error = Color(0xFFBA1A1A),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFFFDAD6),
            onErrorContainer = Color(0xFF410002),
            background = Color(0xFFFCF9F9),
            onBackground = Color(0xFF1B1B1C),
            surface = Color(0xFFFCF9F9),
            onSurface = Color(0xFF1B1B1C),
            surfaceVariant = Color(0xFFE1E2E7),
            onSurfaceVariant = Color(0xFF44474B),
            outline = Color(0xFF75777B),
            outlineVariant = Color(0xFFC5C6CB),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFF303031),
            inverseOnSurface = Color(0xFFF3F0F0),
            inversePrimary = Color(0xFFBFC7D2),
            surfaceDim = Color(0xFFDCD9DA),
            surfaceBright = Color(0xFFFCF9F9),
            surfaceContainerLowest = Color(0xFFFFFFFF),
            surfaceContainerLow = Color(0xFFF6F3F3),
            surfaceContainer = Color(0xFFF0EDEE),
            surfaceContainerHigh = Color(0xFFEAE7E8),
            surfaceContainerHighest = Color(0xFFE4E2E2),
        )
}

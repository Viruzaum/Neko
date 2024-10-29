package org.nekomanga.presentation.theme.schemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

internal object MidnightDuskColorScheme : BaseColorScheme() {
    override val darkScheme =
        darkColorScheme(
            primary = Color(0xFFFFB0CC),
            onPrimary = Color(0xFF630237),
            primaryContainer = Color(0xFFDE6A9A),
            onPrimaryContainer = Color(0xFF000000),
            secondary = Color(0xFFFFB1C2),
            onSecondary = Color(0xFF66002C),
            secondaryContainer = Color(0xFFE2126B),
            onSecondaryContainer = Color(0xFFFFFFFF),
            tertiary = Color(0xFFFFF7F8),
            onTertiary = Color(0xFF4C2337),
            tertiaryContainer = Color(0xFFFBBED6),
            onTertiaryContainer = Color(0xFF592E42),
            error = Color(0xFFFFB4AB),
            onError = Color(0xFF690005),
            errorContainer = Color(0xFF93000A),
            onErrorContainer = Color(0xFFFFDAD6),
            background = Color(0xFF1A1114),
            onBackground = Color(0xFFF0DEE2),
            surface = Color(0xFF141314),
            onSurface = Color(0xFFE5E1E2),
            surfaceVariant = Color(0xFF544248),
            onSurfaceVariant = Color(0xFFDAC0C7),
            outline = Color(0xFFA28B91),
            outlineVariant = Color(0xFF544248),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFFE5E1E2),
            inverseOnSurface = Color(0xFF313031),
            inversePrimary = Color(0xFF9F3867),
            surfaceDim = Color(0xFF141314),
            surfaceBright = Color(0xFF3A3939),
            surfaceContainerLowest = Color(0xFF0E0E0F),
            surfaceContainerLow = Color(0xFF1C1B1C),
            surfaceContainer = Color(0xFF201F20),
            surfaceContainerHigh = Color(0xFF2B2A2A),
            surfaceContainerHighest = Color(0xFF353435)
        )

    override val lightScheme =
        lightColorScheme(
            primary = Color(0xFF781E97),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFFA149BF),
            onPrimaryContainer = Color(0xFFFFFFFF),
            secondary = Color(0xFF950A70),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFFC43C97),
            onSecondaryContainer = Color(0xFFFFFFFF),
            tertiary = Color(0xFF360327),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF5D2449),
            onTertiaryContainer = Color(0xFFFFB4DD),
            error = Color(0xFFBA1A1A),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFFFDAD6),
            onErrorContainer = Color(0xFF410002),
            background = Color(0xFFFFF7FB),
            onBackground = Color(0xFF201921),
            surface = Color(0xFFFDF8F8),
            onSurface = Color(0xFF1C1B1C),
            surfaceVariant = Color(0xFFE9E0E6),
            onSurfaceVariant = Color(0xFF4A454A),
            outline = Color(0xFF7C757A),
            outlineVariant = Color(0xFFCCC4CA),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFF313030),
            inverseOnSurface = Color(0xFFF4F0EF),
            inversePrimary = Color(0xFFEFB0FF),
            surfaceDim = Color(0xFFDDD9D9),
            surfaceBright = Color(0xFFFDF8F8),
            surfaceContainerLowest = Color(0xFFFFFFFF),
            surfaceContainerLow = Color(0xFFF7F3F2),
            surfaceContainer = Color(0xFFF1EDED),
            surfaceContainerHigh = Color(0xFFEBE7E7),
            surfaceContainerHighest = Color(0xFFE5E2E1)
        )
}

package org.nekomanga.presentation.theme.schemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

internal object TealOceanColorScheme : BaseColorScheme() {
    override val darkScheme =
        darkColorScheme(
            primary = Color(0xFF94D2CB),
            onPrimary = Color(0xFF003734),
            primaryContainer = Color(0xFF1C5D59),
            onPrimaryContainer = Color(0xFFD8FFFA),
            secondary = Color(0xFF84D5CB),
            onSecondary = Color(0xFF003733),
            secondaryContainer = Color(0xFF005F58),
            onSecondaryContainer = Color(0xFFD8FFF8),
            tertiary = Color(0xFF9CD1C8),
            onTertiary = Color(0xFF003732),
            tertiaryContainer = Color(0xFF00332E),
            onTertiaryContainer = Color(0xFF90C4BB),
            error = Color(0xFFFFB4AB),
            onError = Color(0xFF690005),
            errorContainer = Color(0xFF93000A),
            onErrorContainer = Color(0xFFFFDAD6),
            background = Color(0xFF111413),
            onBackground = Color(0xFFE1E3E1),
            surface = Color(0xFF111413),
            onSurface = Color(0xFFE1E3E1),
            surfaceVariant = Color(0xFF3F4947),
            onSurfaceVariant = Color(0xFFBFC8C6),
            outline = Color(0xFF899391),
            outlineVariant = Color(0xFF3F4947),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFFE1E3E1),
            inverseOnSurface = Color(0xFF2E3130),
            inversePrimary = Color(0xFF296863),
            surfaceDim = Color(0xFF111413),
            surfaceBright = Color(0xFF373A39),
            surfaceContainerLowest = Color(0xFF0C0F0E),
            surfaceContainerLow = Color(0xFF191C1C),
            surfaceContainer = Color(0xFF1D2020),
            surfaceContainerHigh = Color(0xFF272B2A),
            surfaceContainerHighest = Color(0xFF323535),
        )

    override val lightScheme =
        lightColorScheme(
            primary = Color(0xFF0C534F),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFF3B7873),
            onPrimaryContainer = Color(0xFFFFFFFF),
            secondary = Color(0xFF00534D),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFF217A72),
            onSecondaryContainer = Color(0xFFFFFFFF),
            tertiary = Color(0xFF002B26),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF184E47),
            onTertiaryContainer = Color(0xFFB4E9E0),
            error = Color(0xFFBA1A1A),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFFFDAD6),
            onErrorContainer = Color(0xFF410002),
            background = Color(0xFFF8FAF8),
            onBackground = Color(0xFF191C1C),
            surface = Color(0xFFF8FAF8),
            onSurface = Color(0xFF191C1C),
            surfaceVariant = Color(0xFFDBE4E2),
            onSurfaceVariant = Color(0xFF3F4947),
            outline = Color(0xFF6F7977),
            outlineVariant = Color(0xFFBFC8C6),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFF2E3130),
            inverseOnSurface = Color(0xFFEFF1F0),
            inversePrimary = Color(0xFF94D2CB),
            surfaceDim = Color(0xFFD8DAD9),
            surfaceBright = Color(0xFFF8FAF8),
            surfaceContainerLowest = Color(0xFFFFFFFF),
            surfaceContainerLow = Color(0xFFF2F4F2),
            surfaceContainer = Color(0xFFECEEED),
            surfaceContainerHigh = Color(0xFFE7E9E7),
            surfaceContainerHighest = Color(0xFFE1E3E1),
        )
}

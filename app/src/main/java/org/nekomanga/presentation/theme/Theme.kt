package org.nekomanga.presentation.theme

import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalContext
import eu.kanade.tachiyomi.data.preference.PreferencesHelper
import eu.kanade.tachiyomi.util.system.Themes
import org.nekomanga.presentation.theme.Typefaces.appTypography
import org.nekomanga.presentation.theme.schemes.CrayolaBlueColorScheme
import org.nekomanga.presentation.theme.schemes.EmeraldBrightColorScheme
import org.nekomanga.presentation.theme.schemes.LavenderColorScheme
import org.nekomanga.presentation.theme.schemes.MangaDexColorScheme
import org.nekomanga.presentation.theme.schemes.MidnightDuskColorScheme
import org.nekomanga.presentation.theme.schemes.MonetColorScheme
import org.nekomanga.presentation.theme.schemes.NekoColorScheme
import org.nekomanga.presentation.theme.schemes.OutrunColorScheme
import org.nekomanga.presentation.theme.schemes.SapphireDuskTealOcean
import org.nekomanga.presentation.theme.schemes.StrawberriesColorScheme
import uy.kohesive.injekt.Injekt
import uy.kohesive.injekt.api.get

@Composable
fun NekoTheme(content: @Composable () -> Unit) {

    val colorScheme = nekoThemeColorScheme()

    MaterialTheme(colorScheme = colorScheme, typography = appTypography, content = content)
}

@Composable
@ReadOnlyComposable
fun nekoThemeColorScheme(): ColorScheme {
    val preferences = Injekt.get<PreferencesHelper>()

    val theme =
        if (
                (isSystemInDarkTheme() ||
                    preferences.nightMode().get() == AppCompatDelegate.MODE_NIGHT_YES) &&
                    preferences.nightMode().get() != AppCompatDelegate.MODE_NIGHT_NO
            ) {
                preferences.darkTheme()
            } else {
                preferences.lightTheme()
            }
            .get()

    return when (theme) {
        Themes.MONET -> MonetColorScheme(LocalContext.current)
        Themes.OUTRUN -> OutrunColorScheme
        Themes.SPRING_AND_DUSK -> MidnightDuskColorScheme
        Themes.MANGADEX -> MangaDexColorScheme
        Themes.TEAL_AND_SAPPHIRE -> SapphireDuskTealOcean
        Themes.LAVENDER -> LavenderColorScheme
        Themes.STRAWBERRIES -> StrawberriesColorScheme
        Themes.EMERALD_BRIGHT -> EmeraldBrightColorScheme
        Themes.CRAYOLA_BLUE -> CrayolaBlueColorScheme
        else -> NekoColorScheme
    }.getColorScheme(isSystemInDarkTheme())
}

package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.PlayingCards: ImageVector
    get() {
        if (_playingCards != null) {
            return _playingCards!!
        }
        _playingCards = Builder(name = "PlayingCards", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.17f, 2.0f)
                lineTo(14.9f, 0.243f)
                arcToRelative(5.523f, 5.523f, 0.0f, false, false, -6.864f, 3.62f)
                lineTo(8.0f, 4.0f)
                horizontalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 9.5f)
                verticalLineToRelative(9.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(5.493f, 5.493f, 0.0f, false, false, 4.268f, -2.037f)
                arcToRelative(5.456f, 5.456f, 0.0f, false, false, 5.945f, -3.857f)
                lineTo(23.8f, 8.8f)
                arcTo(5.513f, 5.513f, 0.0f, false, false, 20.17f, 2.0f)
                close()
                moveTo(13.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 21.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 7.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.0f, 9.5f)
                close()
                moveTo(20.936f, 7.9f)
                lineTo(17.85f, 17.211f)
                arcToRelative(2.491f, 2.491f, 0.0f, false, true, -1.872f, 1.733f)
                curveToRelative(0.011f, -0.147f, 0.022f, -0.294f, 0.022f, -0.444f)
                verticalLineToRelative(-9.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -4.74f, -5.441f)
                arcTo(2.483f, 2.483f, 0.0f, false, true, 13.987f, 3.1f)
                lineToRelative(5.268f, 1.757f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.936f, 7.9f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(0.0f, 1.45f, -1.544f, 3.391f, -2.714f, 4.378f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, true, -2.572f, 0.0f)
                curveTo(5.544f, 16.391f, 4.0f, 14.45f, 4.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _playingCards!!
    }

private var _playingCards: ImageVector? = null

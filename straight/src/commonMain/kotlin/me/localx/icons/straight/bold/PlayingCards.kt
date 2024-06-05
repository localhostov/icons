package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveToRelative(23.585f, 4.41f)
                arcToRelative(3.334f, 3.334f, 0.0f, false, false, -1.994f, -1.61f)
                lineToRelative(-8.81f, -2.665f)
                arcToRelative(3.366f, 3.366f, 0.0f, false, false, -4.17f, 2.278f)
                lineToRelative(-0.477f, 1.587f)
                horizontalLineToRelative(-4.634f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.333f)
                lineToRelative(3.234f, 1.2f)
                lineToRelative(4.63f, -15.9f)
                arcToRelative(3.338f, 3.338f, 0.0f, false, false, -0.279f, -2.557f)
                close()
                moveTo(13.0f, 21.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
                moveTo(20.984f, 6.132f)
                lineTo(17.256f, 18.932f)
                lineTo(16.0f, 18.467f)
                verticalLineToRelative(-10.967f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                horizontalLineToRelative(-1.233f)
                lineToRelative(0.221f, -0.736f)
                arcToRelative(0.365f, 0.365f, 0.0f, false, true, 0.175f, -0.219f)
                arcToRelative(0.345f, 0.345f, 0.0f, false, true, 0.264f, -0.034f)
                lineToRelative(8.809f, 2.666f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, true, 0.219f, 0.176f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, true, 0.029f, 0.279f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(0.0f, 2.333f, -4.0f, 5.0f, -4.0f, 5.0f)
                reflectiveCurveToRelative(-4.0f, -2.667f, -4.0f, -5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _playingCards!!
    }

private var _playingCards: ImageVector? = null

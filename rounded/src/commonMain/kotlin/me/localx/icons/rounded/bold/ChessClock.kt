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

public val Icons.Bold.ChessClock: ImageVector
    get() {
        if (_chessClock != null) {
            return _chessClock!!
        }
        _chessClock = Builder(name = "ChessClock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.658f, 5.442f)
                arcTo(1.481f, 1.481f, 0.0f, false, false, 21.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 3.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 4.5f)
                arcToRelative(1.483f, 1.483f, 0.0f, false, false, 0.092f, 0.5f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 5.025f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 10.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 3.0f, 4.893f)
                lineTo(3.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(6.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(21.0f, 21.393f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 24.0f, 16.5f)
                verticalLineToRelative(-6.0f)
                arcTo(5.508f, 5.508f, 0.0f, false, false, 20.658f, 5.442f)
                close()
                moveTo(21.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 19.0f)
                lineTo(5.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 16.5f)
                verticalLineToRelative(-6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 8.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 10.5f)
                close()
                moveTo(8.218f, 13.9f)
                lineToRelative(1.935f, 0.968f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, true, 0.163f, 0.687f)
                arcTo(3.469f, 3.469f, 0.0f, false, true, 7.5f, 17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 2.864f, -5.491f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, true, -0.166f, 0.682f)
                lineToRelative(-1.98f, 0.99f)
                arcTo(0.4f, 0.4f, 0.0f, false, false, 8.218f, 13.9f)
                close()
                moveTo(19.943f, 14.13f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, true, -0.6f, 0.365f)
                lineToRelative(-2.1f, -0.7f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.508f, 0.508f)
                lineToRelative(0.685f, 2.053f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, true, -0.372f, 0.6f)
                arcToRelative(3.481f, 3.481f, 0.0f, false, true, -4.038f, -3.437f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 6.933f, 0.61f)
                close()
            }
        }
        .build()
        return _chessClock!!
    }

private var _chessClock: ImageVector? = null

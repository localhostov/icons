package me.localx.icons.straight.filled

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

public val Icons.Filled.GasPumpSlash: ImageVector
    get() {
        if (_gasPumpSlash != null) {
            return _gasPumpSlash!!
        }
        _gasPumpSlash = Builder(name = "GasPumpSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.007f, 22.593f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-22.6f, -22.6f)
                lineTo(1.407f, -0.007f)
                lineTo(1.714f, 0.3f)
                arcTo(2.976f, 2.976f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(13.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(16.0f, 9.0f)
                lineTo(10.414f, 9.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(16.0f, 11.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(4.334f, 4.334f)
                curveToRelative(0.57f, 0.269f, 1.7f, -0.024f, 1.666f, -0.92f)
                lineTo(22.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(20.0f, 3.414f)
                lineTo(18.293f, 1.707f)
                lineTo(19.707f, 0.293f)
                lineTo(23.414f, 4.0f)
                arcTo(2.015f, 2.015f, 0.0f, false, true, 24.0f, 5.414f)
                lineTo(24.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.826f, 2.76f)
                close()
                moveTo(0.0f, 9.0f)
                lineTo(4.757f, 9.0f)
                lineTo(0.0f, 4.243f)
                close()
                moveTo(0.0f, 11.0f)
                lineTo(0.0f, 24.0f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 20.242f)
                lineTo(6.758f, 11.0f)
                close()
            }
        }
        .build()
        return _gasPumpSlash!!
    }

private var _gasPumpSlash: ImageVector? = null

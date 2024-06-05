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

public val Icons.Bold.TachometerSlow: ImageVector
    get() {
        if (_tachometerSlow != null) {
            return _tachometerSlow!!
        }
        _tachometerSlow = Builder(name = "TachometerSlow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.535f, 21.425f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, true, -4.751f, 0.258f)
                lineToRelative(-1.24f, -1.028f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.912f, -2.31f)
                lineTo(17.7f, 19.372f)
                arcToRelative(0.518f, 0.518f, 0.0f, false, false, 0.7f, -0.057f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -12.79f, 0.015f)
                arcToRelative(0.523f, 0.523f, 0.0f, false, false, 0.7f, 0.058f)
                lineToRelative(1.284f, -1.04f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.888f, 2.33f)
                lineTo(8.2f, 21.718f)
                arcToRelative(3.512f, 3.512f, 0.0f, false, true, -4.717f, -0.274f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.9f, -20.366f)
                arcToRelative(11.992f, 11.992f, 0.0f, false, true, 7.154f, 20.347f)
                close()
                moveTo(12.126f, 11.043f)
                lineTo(9.561f, 8.478f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.439f, 10.6f)
                lineTo(10.0f, 13.163f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.122f, -2.12f)
                close()
            }
        }
        .build()
        return _tachometerSlow!!
    }

private var _tachometerSlow: ImageVector? = null

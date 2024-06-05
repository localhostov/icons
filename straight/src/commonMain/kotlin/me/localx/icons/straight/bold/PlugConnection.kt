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

public val Icons.Bold.PlugConnection: ImageVector
    get() {
        if (_plugConnection != null) {
            return _plugConnection!!
        }
        _plugConnection = Builder(name = "PlugConnection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.439f, 11.939f)
                lineToRelative(-2.689f, 2.689f)
                lineToRelative(-1.379f, -1.379f)
                lineToRelative(2.689f, -2.689f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.689f, 2.689f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(0.912f, 0.912f)
                lineToRelative(-0.8f, 0.8f)
                curveToRelative(-1.609f, 1.609f, -1.724f, 4.156f, -0.345f, 5.899f)
                lineTo(0.049f, 21.83f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.908f, -2.908f)
                curveToRelative(0.805f, 0.636f, 1.78f, 0.955f, 2.756f, 0.954f)
                curveToRelative(1.139f, 0.0f, 2.276f, -0.433f, 3.144f, -1.299f)
                lineToRelative(0.8f, -0.8f)
                lineToRelative(0.912f, 0.912f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(2.689f, -2.689f)
                lineToRelative(-2.121f, -2.121f)
                close()
                moveTo(8.856f, 18.576f)
                curveToRelative(-0.562f, 0.564f, -1.48f, 0.563f, -2.045f, 0.0f)
                lineToRelative(-1.389f, -1.389f)
                curveToRelative(-0.563f, -0.563f, -0.563f, -1.481f, 0.0f, -2.045f)
                lineToRelative(0.8f, -0.8f)
                lineToRelative(3.433f, 3.433f)
                lineToRelative(-0.799f, 0.799f)
                close()
                moveTo(21.042f, 5.078f)
                lineToRelative(2.922f, -2.922f)
                lineTo(21.844f, 0.035f)
                lineToRelative(-2.922f, 2.922f)
                curveToRelative(-1.744f, -1.378f, -4.291f, -1.264f, -5.9f, 0.345f)
                lineToRelative(-0.8f, 0.8f)
                lineToRelative(-0.887f, -0.887f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(9.5f, 9.5f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-0.937f, -0.937f)
                lineToRelative(0.8f, -0.8f)
                curveToRelative(1.608f, -1.609f, 1.722f, -4.156f, 0.344f, -5.899f)
                close()
                moveTo(14.343f, 6.223f)
                lineToRelative(0.799f, -0.799f)
                curveToRelative(0.562f, -0.564f, 1.48f, -0.563f, 2.045f, 0.0f)
                lineToRelative(1.388f, 1.389f)
                curveToRelative(0.563f, 0.563f, 0.563f, 1.481f, 0.0f, 2.045f)
                lineToRelative(-0.8f, 0.8f)
                lineToRelative(-3.433f, -3.433f)
                close()
            }
        }
        .build()
        return _plugConnection!!
    }

private var _plugConnection: ImageVector? = null

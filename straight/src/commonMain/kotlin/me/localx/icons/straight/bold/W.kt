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

public val Icons.Bold.W: ImageVector
    get() {
        if (_w != null) {
            return _w!!
        }
        _w = Builder(name = "W", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.943f, 0.0f)
                lineToRelative(-3.665f, 20.914f)
                lineToRelative(-5.278f, -12.05f)
                lineToRelative(-5.31f, 12.133f)
                lineTo(3.054f, 0.0f)
                horizontalLineTo(0.0f)
                lineTo(3.744f, 21.56f)
                curveToRelative(0.24f, 1.26f, 1.214f, 2.202f, 2.48f, 2.401f)
                curveToRelative(0.164f, 0.025f, 0.326f, 0.039f, 0.486f, 0.038f)
                curveToRelative(1.099f, 0.0f, 2.088f, -0.604f, 2.671f, -1.68f)
                lineToRelative(2.621f, -5.981f)
                lineToRelative(2.677f, 6.101f)
                curveToRelative(0.604f, 1.104f, 1.843f, 1.724f, 3.098f, 1.522f)
                curveToRelative(1.267f, -0.199f, 2.24f, -1.142f, 2.48f, -2.4f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-3.057f)
                close()
            }
        }
        .build()
        return _w!!
    }

private var _w: ImageVector? = null

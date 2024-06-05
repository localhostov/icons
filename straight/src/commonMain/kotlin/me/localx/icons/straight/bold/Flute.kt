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

public val Icons.Bold.Flute: ImageVector
    get() {
        if (_flute != null) {
            return _flute!!
        }
        _flute = Builder(name = "Flute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.998f, 4.264f)
                lineTo(19.731f, -0.002f)
                reflectiveCurveToRelative(-1.72f, 2.157f, -4.219f, 1.369f)
                lineTo(0.007f, 16.872f)
                lineToRelative(7.087f, 7.087f)
                lineToRelative(15.537f, -15.473f)
                curveToRelative(-0.575f, -2.337f, 1.367f, -4.222f, 1.367f, -4.222f)
                close()
                moveTo(7.098f, 19.72f)
                lineToRelative(-2.849f, -2.849f)
                lineTo(15.513f, 5.609f)
                lineToRelative(2.872f, 2.872f)
                lineToRelative(-11.287f, 11.239f)
                close()
                moveTo(13.293f, 9.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                close()
                moveTo(10.793f, 11.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                close()
                moveTo(8.293f, 14.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _flute!!
    }

private var _flute: ImageVector? = null

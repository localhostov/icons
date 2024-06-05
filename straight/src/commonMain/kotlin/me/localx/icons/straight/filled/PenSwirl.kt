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

public val Icons.Filled.PenSwirl: ImageVector
    get() {
        if (_penSwirl != null) {
            return _penSwirl!!
        }
        _penSwirl = Builder(name = "PenSwirl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.295f, 22.126f)
                lineToRelative(-0.972f, 1.748f)
                curveTo(2.669f, 21.288f, 0.0f, 16.96f, 0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(1.646f, 0.0f, 3.215f, 0.333f, 4.645f, 0.936f)
                lineToRelative(-1.554f, 1.554f)
                curveToRelative(-0.974f, -0.317f, -2.013f, -0.49f, -3.091f, -0.49f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 4.213f, 2.294f, 7.903f, 6.295f, 10.126f)
                close()
                moveTo(11.998f, 12.0f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.667f, -7.667f)
                curveToRelative(0.479f, -0.48f, 0.744f, -1.117f, 0.744f, -1.795f)
                reflectiveCurveToRelative(-0.264f, -1.316f, -0.744f, -1.795f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-7.668f, 7.667f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(21.509f, 8.908f)
                curveToRelative(0.318f, 0.974f, 0.49f, 2.014f, 0.49f, 3.092f)
                curveToRelative(0.0f, 3.203f, -2.606f, 5.81f, -5.81f, 5.81f)
                reflectiveCurveToRelative(-5.81f, -2.606f, -5.81f, -5.81f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 4.307f, 3.503f, 7.81f, 7.81f, 7.81f)
                reflectiveCurveToRelative(7.81f, -3.503f, 7.81f, -7.81f)
                curveToRelative(0.0f, -1.647f, -0.334f, -3.217f, -0.936f, -4.646f)
                lineToRelative(-1.554f, 1.554f)
                close()
            }
        }
        .build()
        return _penSwirl!!
    }

private var _penSwirl: ImageVector? = null

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

public val Icons.Filled.SensorSmoke: ImageVector
    get() {
        if (_sensorSmoke != null) {
            return _sensorSmoke!!
        }
        _sensorSmoke = Builder(name = "SensorSmoke", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.5f)
                curveToRelative(0.0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.407f, 0.836f, -2.613f, 2.033f, -3.168f)
                curveToRelative(-0.007f, -0.112f, -0.033f, -0.218f, -0.033f, -0.332f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                curveToRelative(2.112f, 0.0f, 3.908f, 1.313f, 4.641f, 3.164f)
                curveToRelative(1.929f, 0.508f, 3.359f, 2.247f, 3.359f, 4.336f)
                close()
                moveTo(8.261f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                lineTo(24.0f, 14.849f)
                curveToRelative(-0.553f, -0.533f, -1.191f, -0.983f, -1.916f, -1.297f)
                curveToRelative(-1.23f, -2.186f, -3.526f, -3.553f, -6.084f, -3.553f)
                curveToRelative(-3.602f, 0.0f, -6.577f, 2.734f, -6.958f, 6.236f)
                curveToRelative(-1.27f, 1.03f, -2.042f, 2.594f, -2.042f, 4.264f)
                curveToRelative(0.0f, 1.328f, 0.474f, 2.548f, 1.261f, 3.5f)
                close()
                moveTo(7.0f, 4.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(5.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _sensorSmoke!!
    }

private var _sensorSmoke: ImageVector? = null

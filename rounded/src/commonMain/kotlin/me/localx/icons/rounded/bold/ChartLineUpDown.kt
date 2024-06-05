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

public val Icons.Bold.ChartLineUpDown: ImageVector
    get() {
        if (_chartLineUpDown != null) {
            return _chartLineUpDown!!
        }
        _chartLineUpDown = Builder(name = "ChartLineUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 1.5f)
                curveTo(0.0f, 0.672f, 0.672f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(23.0f, 2.0f)
                horizontalLineToRelative(-5.047f)
                curveToRelative(-0.848f, 0.0f, -1.272f, 1.025f, -0.673f, 1.624f)
                lineToRelative(1.471f, 1.471f)
                lineToRelative(-2.812f, 2.759f)
                curveToRelative(-0.128f, 0.127f, -0.276f, 0.146f, -0.354f, 0.146f)
                reflectiveCurveToRelative(-0.226f, -0.019f, -0.353f, -0.146f)
                curveToRelative(-0.061f, -0.061f, -1.277f, -0.93f, -1.277f, -0.93f)
                curveToRelative(-1.332f, -1.229f, -3.597f, -1.151f, -4.806f, 0.062f)
                lineToRelative(-3.672f, 3.414f)
                curveToRelative(-0.606f, 0.564f, -0.642f, 1.514f, -0.077f, 2.12f)
                curveToRelative(0.296f, 0.317f, 0.696f, 0.479f, 1.099f, 0.479f)
                curveToRelative(0.366f, 0.0f, 0.732f, -0.133f, 1.021f, -0.401f)
                lineToRelative(3.712f, -3.453f)
                curveToRelative(0.127f, -0.127f, 0.275f, -0.146f, 0.353f, -0.146f)
                reflectiveCurveToRelative(0.226f, 0.02f, 0.354f, 0.146f)
                curveToRelative(0.061f, 0.061f, 1.276f, 0.929f, 1.276f, 0.929f)
                curveToRelative(1.33f, 1.228f, 3.565f, 1.177f, 4.835f, -0.09f)
                lineToRelative(2.823f, -2.769f)
                lineToRelative(1.503f, 1.503f)
                curveToRelative(0.599f, 0.599f, 1.624f, 0.175f, 1.624f, -0.673f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(22.376f, 12.281f)
                lineToRelative(-1.487f, 1.487f)
                lineToRelative(-1.328f, -1.328f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                reflectiveCurveToRelative(-0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(1.328f, 1.328f)
                lineToRelative(-1.487f, 1.487f)
                curveToRelative(-0.599f, 0.599f, -0.175f, 1.624f, 0.673f, 1.624f)
                horizontalLineToRelative(5.047f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-5.047f)
                curveToRelative(0.0f, -0.848f, -1.025f, -1.272f, -1.624f, -0.673f)
                close()
            }
        }
        .build()
        return _chartLineUpDown!!
    }

private var _chartLineUpDown: ImageVector? = null

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

public val Icons.Bold.Socks: ImageVector
    get() {
        if (_socks != null) {
            return _socks!!
        }
        _socks = Builder(name = "Socks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.999f, 0.0f)
                lineTo(4.0f, 0.0f)
                lineToRelative(0.004f, 10.22f)
                lineToRelative(-2.427f, 3.034f)
                curveToRelative(-2.278f, 2.847f, -1.934f, 6.992f, 0.767f, 9.24f)
                curveToRelative(1.167f, 0.971f, 2.643f, 1.506f, 4.157f, 1.506f)
                curveToRelative(1.239f, 0.0f, 2.465f, -0.361f, 3.505f, -1.023f)
                curveToRelative(1.04f, 0.664f, 2.255f, 1.023f, 3.495f, 1.023f)
                curveToRelative(1.987f, 0.0f, 3.838f, -0.889f, 5.079f, -2.439f)
                lineToRelative(3.344f, -4.179f)
                curveToRelative(1.342f, -1.679f, 2.081f, -3.787f, 2.081f, -5.938f)
                lineToRelative(-0.005f, -11.444f)
                close()
                moveTo(21.001f, 3.0f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-6.999f, 0.0f, -6.999f, 0.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(6.999f, 0.0f, 6.999f, 0.0f)
                close()
                moveTo(11.001f, 3.0f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-3.999f, 0.0f, -3.999f, 0.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(3.999f, 0.0f, 3.999f, 0.0f)
                close()
                moveTo(4.263f, 20.188f)
                curveToRelative(-1.454f, -1.21f, -1.608f, -3.48f, -0.344f, -5.061f)
                lineToRelative(3.084f, -3.856f)
                verticalLineToRelative(-3.272f)
                reflectiveCurveToRelative(3.999f, 0.0f, 3.999f, 0.0f)
                verticalLineToRelative(2.22f)
                reflectiveCurveToRelative(-2.426f, 3.034f, -2.426f, 3.034f)
                curveToRelative(-1.763f, 2.203f, -1.955f, 5.182f, -0.701f, 7.46f)
                curveToRelative(-1.176f, 0.484f, -2.611f, 0.309f, -3.613f, -0.525f)
                close()
                moveTo(19.58f, 15.507f)
                lineToRelative(-3.343f, 4.178f)
                curveToRelative(-0.669f, 0.835f, -1.666f, 1.314f, -2.737f, 1.314f)
                curveToRelative(-0.826f, 0.0f, -1.6f, -0.281f, -2.237f, -0.812f)
                curveToRelative(-1.454f, -1.21f, -1.608f, -3.48f, -0.344f, -5.061f)
                lineToRelative(3.085f, -3.856f)
                verticalLineToRelative(-3.272f)
                reflectiveCurveToRelative(6.999f, 0.0f, 6.999f, 0.0f)
                verticalLineToRelative(3.445f)
                curveToRelative(0.001f, 1.472f, -0.505f, 2.915f, -1.423f, 4.063f)
                close()
            }
        }
        .build()
        return _socks!!
    }

private var _socks: ImageVector? = null

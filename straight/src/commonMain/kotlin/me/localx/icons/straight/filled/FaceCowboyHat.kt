package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.FaceCowboyHat: ImageVector
    get() {
        if (_faceCowboyHat != null) {
            return _faceCowboyHat!!
        }
        _faceCowboyHat = Builder(name = "FaceCowboyHat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.579f, 11.461f)
                curveToRelative(0.26f, 0.27f, 0.421f, 0.635f, 0.421f, 1.039f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.224f, 0.052f, -0.434f, 0.14f, -0.624f)
                curveToRelative(-0.689f, 0.074f, -1.397f, 0.124f, -2.14f, 0.124f)
                reflectiveCurveToRelative(-1.451f, -0.05f, -2.14f, -0.124f)
                curveToRelative(0.088f, 0.19f, 0.14f, 0.401f, 0.14f, 0.624f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.403f, 0.161f, -0.768f, 0.42f, -1.037f)
                curveToRelative(-1.733f, -0.407f, -3.248f, -0.997f, -4.504f, -1.625f)
                curveToRelative(-0.582f, 1.269f, -0.916f, 2.675f, -0.916f, 4.163f)
                curveToRelative(0.0f, 5.523f, 4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                curveToRelative(0.0f, -1.491f, -0.335f, -2.901f, -0.92f, -4.172f)
                curveToRelative(-1.253f, 0.631f, -2.767f, 1.224f, -4.501f, 1.633f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-2.778f, -0.003f, -4.487f, -2.101f, -4.999f, -4.0f)
                curveToRelative(0.0f, -0.001f, 2.501f, 1.0f, 5.0f, 1.0f)
                reflectiveCurveToRelative(5.0f, -1.001f, 5.0f, -1.0f)
                curveToRelative(-0.512f, 1.899f, -2.222f, 3.997f, -5.001f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.936f, 5.501f)
                lineToRelative(-1.408f, -1.42f)
                curveToRelative(-0.02f, 0.019f, -1.027f, 0.992f, -2.833f, 1.964f)
                curveToRelative(-0.372f, -0.926f, -1.089f, -2.697f, -1.417f, -3.447f)
                curveToRelative(-0.714f, -1.626f, -2.108f, -2.598f, -3.729f, -2.598f)
                curveToRelative(-0.893f, 0.0f, -1.855f, 0.397f, -2.556f, 1.024f)
                curveToRelative(-0.712f, -0.627f, -1.69f, -1.024f, -2.597f, -1.024f)
                curveToRelative(-1.154f, 0.0f, -2.729f, 0.451f, -3.672f, 2.599f)
                curveToRelative(-0.329f, 0.752f, -1.05f, 2.534f, -1.421f, 3.457f)
                curveToRelative(-1.832f, -0.976f, -2.859f, -1.958f, -2.879f, -1.978f)
                lineToRelative(-0.699f, 0.715f)
                lineTo(0.021f, 5.505f)
                curveToRelative(0.187f, 0.184f, 4.653f, 4.495f, 11.979f, 4.495f)
                reflectiveCurveToRelative(11.751f, -4.315f, 11.936f, -4.499f)
                close()
            }
        }
        .build()
        return _faceCowboyHat!!
    }

private var _faceCowboyHat: ImageVector? = null

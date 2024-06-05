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

public val Icons.Bold.FireFlameCurved: ImageVector
    get() {
        if (_fireFlameCurved != null) {
            return _fireFlameCurved!!
        }
        _fireFlameCurved = Builder(name = "FireFlameCurved", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                curveToRelative(0.0f, -3.372f, 1.503f, -5.475f, 3.759f, -7.594f)
                lineToRelative(3.674f, -3.451f)
                lineToRelative(-1.19f, 4.899f)
                curveToRelative(-0.295f, 1.214f, -0.408f, 4.039f, 0.647f, 5.381f)
                curveToRelative(0.258f, 0.328f, 0.723f, 0.765f, 1.776f, 0.765f)
                curveToRelative(0.738f, 0.0f, 1.324f, -0.594f, 1.333f, -1.352f)
                curveToRelative(0.014f, -1.064f, -0.224f, -1.853f, -0.475f, -2.687f)
                curveToRelative(-0.252f, -0.837f, -0.538f, -1.785f, -0.538f, -2.962f)
                curveToRelative(0.0f, -2.588f, 0.732f, -4.263f, 0.816f, -4.444f)
                lineTo(12.955f, 0.041f)
                lineToRelative(1.479f, 2.336f)
                curveToRelative(0.808f, 1.275f, 1.947f, 2.403f, 3.049f, 3.495f)
                curveToRelative(2.22f, 2.198f, 4.517f, 4.473f, 4.517f, 8.128f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(5.261f, 12.161f)
                curveToRelative(-0.171f, 0.555f, -0.261f, 1.158f, -0.261f, 1.839f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                curveToRelative(0.0f, -2.404f, -1.681f, -4.069f, -3.628f, -5.997f)
                curveToRelative(-0.458f, -0.454f, -0.923f, -0.914f, -1.377f, -1.395f)
                curveToRelative(-0.005f, 0.127f, -0.007f, 0.258f, -0.007f, 0.392f)
                curveToRelative(0.0f, 0.735f, 0.181f, 1.336f, 0.41f, 2.097f)
                curveToRelative(0.291f, 0.967f, 0.622f, 2.063f, 0.603f, 3.589f)
                curveToRelative(-0.03f, 2.379f, -1.974f, 4.314f, -4.333f, 4.314f)
                curveToRelative(-1.722f, 0.0f, -3.151f, -0.66f, -4.134f, -1.91f)
                curveToRelative(-0.667f, -0.85f, -1.059f, -1.883f, -1.271f, -2.929f)
                close()
            }
        }
        .build()
        return _fireFlameCurved!!
    }

private var _fireFlameCurved: ImageVector? = null

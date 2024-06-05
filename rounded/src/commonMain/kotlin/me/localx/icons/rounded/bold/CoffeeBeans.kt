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

public val Icons.Bold.CoffeeBeans: ImageVector
    get() {
        if (_coffeeBeans != null) {
            return _coffeeBeans!!
        }
        _coffeeBeans = Builder(name = "CoffeeBeans", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 9.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 3.364f, -6.0f, 7.5f)
                reflectiveCurveToRelative(2.691f, 7.5f, 6.0f, 7.5f)
                reflectiveCurveToRelative(6.0f, -3.364f, 6.0f, -7.5f)
                reflectiveCurveToRelative(-2.691f, -7.5f, -6.0f, -7.5f)
                close()
                moveTo(17.105f, 12.236f)
                curveToRelative(0.221f, 0.702f, 0.357f, 1.938f, -0.454f, 3.608f)
                curveToRelative(-0.644f, 1.328f, -0.888f, 2.516f, -0.918f, 3.534f)
                curveToRelative(-0.448f, -0.789f, -0.732f, -1.79f, -0.732f, -2.879f)
                curveToRelative(0.0f, -1.971f, 0.902f, -3.675f, 2.105f, -4.264f)
                close()
                moveTo(18.896f, 20.763f)
                curveToRelative(-0.221f, -0.702f, -0.356f, -1.938f, 0.454f, -3.608f)
                curveToRelative(0.644f, -1.328f, 0.888f, -2.516f, 0.918f, -3.534f)
                curveToRelative(0.448f, 0.789f, 0.732f, 1.79f, 0.732f, 2.879f)
                curveToRelative(0.0f, 1.971f, -0.902f, 3.675f, -2.105f, 4.264f)
                close()
                moveTo(12.461f, 1.54f)
                curveTo(11.255f, 0.334f, 9.472f, -0.198f, 7.565f, 0.07f)
                curveToRelative(-1.773f, 0.254f, -3.522f, 1.166f, -4.926f, 2.569f)
                curveTo(-0.371f, 5.65f, -0.865f, 10.056f, 1.539f, 12.46f)
                curveToRelative(1.0f, 1.0f, 2.397f, 1.539f, 3.931f, 1.539f)
                curveToRelative(0.316f, 0.0f, 0.639f, -0.023f, 0.964f, -0.069f)
                curveToRelative(1.773f, -0.254f, 3.522f, -1.166f, 4.926f, -2.569f)
                curveToRelative(3.011f, -3.011f, 3.504f, -7.416f, 1.101f, -9.82f)
                close()
                moveTo(7.99f, 3.04f)
                curveToRelative(0.153f, -0.021f, 0.342f, -0.039f, 0.551f, -0.039f)
                curveToRelative(0.312f, 0.0f, 0.666f, 0.049f, 1.012f, 0.175f)
                curveToRelative(-0.339f, 0.687f, -1.147f, 1.75f, -3.044f, 2.407f)
                curveToRelative(-1.531f, 0.53f, -2.616f, 1.275f, -3.39f, 2.045f)
                curveToRelative(0.225f, -0.975f, 0.78f, -2.005f, 1.642f, -2.868f)
                curveToRelative(0.934f, -0.934f, 2.11f, -1.561f, 3.229f, -1.721f)
                close()
                moveTo(6.011f, 10.96f)
                curveToRelative(-0.383f, 0.053f, -0.988f, 0.077f, -1.565f, -0.133f)
                curveToRelative(0.338f, -0.687f, 1.146f, -1.752f, 3.046f, -2.41f)
                curveToRelative(1.531f, -0.53f, 2.616f, -1.275f, 3.39f, -2.045f)
                curveToRelative(-0.225f, 0.975f, -0.78f, 2.005f, -1.642f, 2.868f)
                curveToRelative(-0.934f, 0.934f, -2.11f, 1.561f, -3.229f, 1.721f)
                close()
            }
        }
        .build()
        return _coffeeBeans!!
    }

private var _coffeeBeans: ImageVector? = null

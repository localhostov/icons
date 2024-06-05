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

public val Icons.Bold.FlagUsa: ImageVector
    get() {
        if (_flagUsa != null) {
            return _flagUsa!!
        }
        _flagUsa = Builder(name = "FlagUsa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.997f, -0.007f)
                lineToRelative(-2.113f, 0.946f)
                curveToRelative(-0.024f, 0.011f, -2.396f, 1.061f, -4.883f, 1.061f)
                curveToRelative(-1.21f, 0.0f, -2.79f, -0.476f, -4.317f, -0.937f)
                curveToRelative(-1.735f, -0.522f, -3.53f, -1.063f, -5.183f, -1.063f)
                curveTo(4.249f, 0.0f, 0.855f, 2.067f, 0.712f, 2.155f)
                lineTo(0.0f, 2.595f)
                lineTo(0.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-7.629f)
                curveToRelative(0.981f, -0.521f, 2.84f, -1.371f, 4.5f, -1.371f)
                curveToRelative(1.21f, 0.0f, 2.79f, 0.476f, 4.317f, 0.937f)
                curveToRelative(1.735f, 0.522f, 3.53f, 1.063f, 5.183f, 1.063f)
                curveToRelative(3.203f, 0.0f, 6.086f, -1.523f, 6.207f, -1.589f)
                lineToRelative(0.792f, -0.424f)
                lineToRelative(-0.002f, -14.994f)
                close()
                moveTo(17.0f, 5.0f)
                curveToRelative(1.485f, 0.0f, 2.903f, -0.282f, 3.999f, -0.587f)
                verticalLineToRelative(2.835f)
                curveToRelative(-0.916f, 0.32f, -2.441f, 0.752f, -3.999f, 0.752f)
                curveToRelative(-1.21f, 0.0f, -2.79f, -0.476f, -4.317f, -0.937f)
                curveToRelative(-0.557f, -0.168f, -1.12f, -0.337f, -1.683f, -0.49f)
                lineTo(11.0f, 3.692f)
                curveToRelative(0.273f, 0.08f, 0.546f, 0.162f, 0.817f, 0.244f)
                curveToRelative(1.735f, 0.522f, 3.53f, 1.063f, 5.183f, 1.063f)
                close()
                moveTo(17.0f, 14.0f)
                curveToRelative(-1.21f, 0.0f, -2.79f, -0.476f, -4.317f, -0.937f)
                curveToRelative(-1.735f, -0.522f, -3.53f, -1.063f, -5.183f, -1.063f)
                curveToRelative(-1.601f, 0.0f, -3.234f, 0.516f, -4.5f, 1.053f)
                verticalLineToRelative(-2.682f)
                curveToRelative(0.982f, -0.52f, 2.84f, -1.371f, 4.5f, -1.371f)
                curveToRelative(1.21f, 0.0f, 2.79f, 0.476f, 4.317f, 0.937f)
                curveToRelative(1.735f, 0.522f, 3.53f, 1.063f, 5.183f, 1.063f)
                curveToRelative(1.485f, 0.0f, 2.901f, -0.29f, 3.999f, -0.604f)
                verticalLineToRelative(2.729f)
                curveToRelative(-0.894f, 0.364f, -2.426f, 0.875f, -3.999f, 0.875f)
                close()
            }
        }
        .build()
        return _flagUsa!!
    }

private var _flagUsa: ImageVector? = null

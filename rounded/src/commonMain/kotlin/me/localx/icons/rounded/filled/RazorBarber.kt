package me.localx.icons.rounded.filled

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

public val Icons.Filled.RazorBarber: ImageVector
    get() {
        if (_razorBarber != null) {
            return _razorBarber!!
        }
        _razorBarber = Builder(name = "RazorBarber", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.333f, 0.057f)
                curveToRelative(-0.52f, -0.186f, -1.092f, 0.089f, -1.276f, 0.61f)
                curveToRelative(-0.282f, 0.797f, -1.04f, 1.333f, -1.886f, 1.333f)
                horizontalLineToRelative(-5.156f)
                curveToRelative(-0.011f, 0.0f, -0.021f, 0.0f, -0.032f, 0.0f)
                lineTo(3.993f, 2.0f)
                curveTo(2.005f, 2.0f, 0.342f, 3.426f, 0.04f, 5.392f)
                curveToRelative(-0.101f, 0.654f, 0.089f, 1.316f, 0.52f, 1.818f)
                reflectiveCurveToRelative(1.057f, 0.79f, 1.718f, 0.79f)
                horizontalLineToRelative(9.547f)
                curveToRelative(1.975f, 0.0f, 3.677f, -1.474f, 3.959f, -3.429f)
                lineToRelative(0.083f, -0.571f)
                horizontalLineToRelative(2.114f)
                curveToRelative(-0.205f, 3.696f, -2.628f, 9.671f, -6.971f, 14.042f)
                curveToRelative(-1.355f, 1.373f, -1.34f, 3.594f, 0.033f, 4.95f)
                curveToRelative(0.681f, 0.672f, 1.57f, 1.007f, 2.458f, 1.007f)
                curveToRelative(0.904f, 0.0f, 1.808f, -0.347f, 2.492f, -1.039f)
                curveToRelative(5.653f, -5.727f, 5.58f, -17.143f, 5.519f, -19.199f)
                curveToRelative(1.113f, -0.398f, 2.024f, -1.272f, 2.432f, -2.427f)
                curveToRelative(0.184f, -0.521f, -0.089f, -1.092f, -0.61f, -1.276f)
                close()
                moveTo(13.5f, 22.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _razorBarber!!
    }

private var _razorBarber: ImageVector? = null

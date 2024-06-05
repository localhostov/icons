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

public val Icons.Filled.Trumpet: ImageVector
    get() {
        if (_trumpet != null) {
            return _trumpet!!
        }
        _trumpet = Builder(name = "Trumpet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 3.0f)
                verticalLineToRelative(0.027f)
                curveToRelative(-1.413f, 5.194f, -5.261f, 7.009f, -8.0f, 7.641f)
                verticalLineToRelative(-1.668f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.973f)
                curveToRelative(-0.237f, 0.017f, -0.421f, 0.024f, -0.577f, 0.027f)
                horizontalLineToRelative(-0.08f)
                curveToRelative(-0.18f, -0.003f, -0.306f, -0.001f, -0.361f, 0.0f)
                horizontalLineToRelative(-0.982f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.026f)
                curveToRelative(-0.635f, 0.838f, -1.026f, 1.87f, -1.026f, 3.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                curveToRelative(0.0f, -0.808f, -0.211f, -1.561f, -0.553f, -2.237f)
                curveToRelative(2.508f, 0.908f, 5.376f, 2.881f, 6.549f, 7.192f)
                horizontalLineToRelative(0.004f)
                reflectiveCurveToRelative(0.0f, 0.045f, 0.0f, 0.045f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _trumpet!!
    }

private var _trumpet: ImageVector? = null

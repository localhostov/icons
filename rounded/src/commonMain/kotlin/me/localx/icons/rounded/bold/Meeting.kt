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

public val Icons.Bold.Meeting: ImageVector
    get() {
        if (_meeting != null) {
            return _meeting!!
        }
        _meeting = Builder(name = "Meeting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 15.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(4.0f, 20.0f)
                curveToRelative(-1.853f, 0.0f, -3.422f, 1.17f, -3.955f, 2.785f)
                curveToRelative(-0.199f, 0.601f, 0.29f, 1.215f, 0.945f, 1.215f)
                horizontalLineToRelative(6.02f)
                curveToRelative(0.655f, 0.0f, 1.144f, -0.613f, 0.945f, -1.215f)
                curveToRelative(-0.533f, -1.615f, -2.103f, -2.785f, -3.955f, -2.785f)
                close()
                moveTo(23.955f, 22.785f)
                curveToRelative(-0.533f, -1.615f, -2.103f, -2.785f, -3.955f, -2.785f)
                reflectiveCurveToRelative(-3.422f, 1.17f, -3.955f, 2.785f)
                curveToRelative(-0.199f, 0.601f, 0.29f, 1.215f, 0.945f, 1.215f)
                horizontalLineToRelative(6.02f)
                curveToRelative(0.655f, 0.0f, 1.144f, -0.613f, 0.945f, -1.215f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                close()
                moveTo(15.105f, 11.959f)
                lineToRelative(-1.784f, 1.543f)
                curveToRelative(-0.374f, 0.332f, -0.848f, 0.499f, -1.324f, 0.499f)
                curveToRelative(-0.481f, 0.0f, -0.965f, -0.17f, -1.351f, -0.513f)
                lineToRelative(-1.735f, -1.529f)
                curveToRelative(-2.223f, -0.295f, -3.919f, -2.179f, -3.919f, -4.451f)
                verticalLineToRelative(-3.017f)
                curveTo(4.992f, 2.015f, 7.007f, 0.0f, 9.483f, 0.0f)
                horizontalLineToRelative(5.017f)
                curveToRelative(2.477f, 0.0f, 4.492f, 2.015f, 4.492f, 4.492f)
                verticalLineToRelative(3.017f)
                curveToRelative(0.0f, 2.271f, -1.695f, 4.154f, -3.887f, 4.451f)
                close()
                moveTo(15.992f, 4.491f)
                curveToRelative(0.0f, -0.823f, -0.669f, -1.492f, -1.492f, -1.492f)
                horizontalLineToRelative(-5.017f)
                curveToRelative(-0.822f, 0.0f, -1.491f, 0.669f, -1.491f, 1.492f)
                verticalLineToRelative(3.017f)
                curveToRelative(0.0f, 0.823f, 0.669f, 1.492f, 1.491f, 1.492f)
                curveToRelative(0.365f, 0.0f, 0.758f, 0.133f, 1.031f, 0.375f)
                lineToRelative(1.483f, 1.306f)
                lineToRelative(1.521f, -1.315f)
                curveToRelative(0.272f, -0.235f, 0.621f, -0.365f, 0.981f, -0.365f)
                curveToRelative(0.823f, 0.0f, 1.492f, -0.669f, 1.492f, -1.492f)
                verticalLineToRelative(-3.017f)
                close()
            }
        }
        .build()
        return _meeting!!
    }

private var _meeting: ImageVector? = null

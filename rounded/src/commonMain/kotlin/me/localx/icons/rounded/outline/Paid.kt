package me.localx.icons.rounded.outline

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

public val Icons.Outline.Paid: ImageVector
    get() {
        if (_paid != null) {
            return _paid!!
        }
        _paid = Builder(name = "Paid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.7f, 9.6f)
                curveToRelative(0.386f, 0.0f, 0.7f, 0.314f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                curveToRelative(0.0f, 0.386f, -0.314f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, 0.0f, -0.7f, 0.0f)
                verticalLineToRelative(-4.802f)
                reflectiveCurveToRelative(0.314f, 0.0f, 0.7f, 0.0f)
                close()
                moveTo(5.999f, 10.5f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.496f, 0.0f, 0.9f, -0.404f, 0.9f, -0.9f)
                close()
                moveTo(9.611f, 13.001f)
                horizontalLineToRelative(1.261f)
                lineToRelative(-0.638f, -3.295f)
                lineToRelative(-0.624f, 3.295f)
                close()
                moveTo(23.999f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.043f, -0.533f, 1.959f, -1.34f, 2.497f)
                curveToRelative(-2.047f, 3.961f, -6.184f, 6.503f, -10.66f, 6.503f)
                reflectiveCurveToRelative(-8.613f, -2.542f, -10.66f, -6.503f)
                curveToRelative(-0.807f, -0.538f, -1.34f, -1.454f, -1.34f, -2.497f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.043f, 0.533f, -1.959f, 1.34f, -2.497f)
                curveTo(3.387f, 2.542f, 7.524f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(8.613f, 2.542f, 10.66f, 6.503f)
                curveToRelative(0.807f, 0.538f, 1.34f, 1.454f, 1.34f, 2.497f)
                close()
                moveTo(18.699f, 8.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.442f, 0.0f, -0.8f, 0.358f, -0.8f, 0.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0.0f, 0.442f, 0.358f, 0.8f, 0.8f, 0.8f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.27f, 0.0f, 2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                close()
                moveTo(4.034f, 6.0f)
                horizontalLineToRelative(15.929f)
                curveToRelative(-1.823f, -2.42f, -4.701f, -4.0f, -7.965f, -4.0f)
                reflectiveCurveToRelative(-6.142f, 1.58f, -7.965f, 4.0f)
                close()
                moveTo(14.599f, 8.0f)
                curveToRelative(-0.442f, 0.0f, -0.8f, 0.358f, -0.8f, 0.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0.0f, 0.442f, 0.358f, 0.8f, 0.8f, 0.8f)
                reflectiveCurveToRelative(0.8f, -0.358f, 0.8f, -0.8f)
                verticalLineToRelative(-6.4f)
                curveToRelative(0.0f, -0.442f, -0.358f, -0.8f, -0.8f, -0.8f)
                close()
                moveTo(11.601f, 9.193f)
                curveToRelative(-0.12f, -0.668f, -0.589f, -1.192f, -1.346f, -1.192f)
                reflectiveCurveToRelative(-1.281f, 0.587f, -1.385f, 1.167f)
                lineToRelative(-1.2f, 5.976f)
                curveToRelative(-0.089f, 0.443f, 0.25f, 0.857f, 0.702f, 0.857f)
                curveToRelative(0.345f, 0.0f, 0.641f, -0.246f, 0.704f, -0.585f)
                lineToRelative(0.166f, -0.889f)
                horizontalLineToRelative(2.006f)
                lineToRelative(0.157f, 0.883f)
                curveToRelative(0.061f, 0.342f, 0.358f, 0.591f, 0.705f, 0.591f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.453f, 0.0f, 0.793f, -0.416f, 0.701f, -0.86f)
                lineToRelative(-1.221f, -5.947f)
                close()
                moveTo(3.798f, 16.0f)
                curveToRelative(0.442f, 0.0f, 0.8f, -0.358f, 0.8f, -0.8f)
                verticalLineToRelative(-2.2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.365f, 0.0f, 2.474f, -1.093f, 2.5f, -2.452f)
                curveToRelative(0.026f, -1.401f, -1.154f, -2.548f, -2.556f, -2.548f)
                horizontalLineToRelative(-1.244f)
                curveToRelative(-0.442f, 0.0f, -0.8f, 0.358f, -0.8f, 0.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0.0f, 0.442f, 0.358f, 0.8f, 0.8f, 0.8f)
                close()
                moveTo(19.963f, 18.0f)
                lineTo(4.035f, 18.0f)
                curveToRelative(1.823f, 2.42f, 4.701f, 4.0f, 7.965f, 4.0f)
                reflectiveCurveToRelative(6.142f, -1.58f, 7.965f, -4.0f)
                close()
            }
        }
        .build()
        return _paid!!
    }

private var _paid: ImageVector? = null

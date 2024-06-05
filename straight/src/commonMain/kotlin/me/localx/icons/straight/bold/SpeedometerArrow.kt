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

public val Icons.Bold.SpeedometerArrow: ImageVector
    get() {
        if (_speedometerArrow != null) {
            return _speedometerArrow!!
        }
        _speedometerArrow = Builder(name = "SpeedometerArrow", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.992f, 20.079f)
                curveToRelative(-0.042f, 1.067f, -0.915f, 1.921f, -1.992f, 1.921f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.039f, 0.796f, -1.884f, 1.81f, -1.981f)
                lineToRelative(3.604f, -3.605f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-3.543f, 3.544f)
                close()
                moveTo(21.002f, 12.115f)
                lineToRelative(0.01f, -5.115f)
                horizontalLineToRelative(2.489f)
                lineToRelative(-3.157f, -3.65f)
                curveToRelative(-0.443f, -0.494f, -1.217f, -0.494f, -1.66f, 0.0f)
                lineToRelative(-3.183f, 3.65f)
                horizontalLineToRelative(2.511f)
                lineToRelative(-0.005f, 2.636f)
                curveToRelative(-1.356f, -0.793f, -2.878f, -1.326f, -4.504f, -1.531f)
                lineToRelative(0.009f, -4.084f)
                horizontalLineToRelative(2.489f)
                lineTo(12.843f, 0.371f)
                curveToRelative(-0.443f, -0.494f, -1.217f, -0.494f, -1.66f, 0.0f)
                lineToRelative(-3.183f, 3.65f)
                horizontalLineToRelative(2.511f)
                lineToRelative(-0.009f, 4.084f)
                curveToRelative(-1.622f, 0.204f, -3.141f, 0.734f, -4.495f, 1.524f)
                lineToRelative(0.005f, -2.628f)
                horizontalLineToRelative(2.488f)
                lineToRelative(-3.157f, -3.65f)
                curveToRelative(-0.443f, -0.494f, -1.217f, -0.494f, -1.66f, 0.0f)
                lineTo(0.5f, 7.0f)
                horizontalLineToRelative(2.512f)
                lineToRelative(-0.01f, 5.112f)
                curveTo(1.169f, 14.212f, 0.05f, 16.95f, 0.05f, 19.95f)
                curveToRelative(0.0f, 0.961f, 0.127f, 1.944f, 0.379f, 2.924f)
                lineToRelative(0.29f, 1.126f)
                horizontalLineToRelative(6.281f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.882f)
                curveToRelative(-0.045f, -0.354f, -0.068f, -0.704f, -0.068f, -1.05f)
                curveToRelative(0.0f, -4.936f, 4.015f, -8.95f, 8.95f, -8.95f)
                reflectiveCurveToRelative(8.95f, 4.015f, 8.95f, 8.95f)
                curveToRelative(0.0f, 0.346f, -0.022f, 0.696f, -0.067f, 1.05f)
                horizontalLineToRelative(-3.883f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.281f)
                lineToRelative(0.29f, -1.126f)
                curveToRelative(0.251f, -0.979f, 0.379f, -1.963f, 0.379f, -2.924f)
                curveToRelative(0.0f, -2.998f, -1.118f, -5.735f, -2.948f, -7.835f)
                close()
            }
        }
        .build()
        return _speedometerArrow!!
    }

private var _speedometerArrow: ImageVector? = null

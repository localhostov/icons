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

public val Icons.Filled.CircleB: ImageVector
    get() {
        if (_circleB != null) {
            return _circleB!!
        }
        _circleB = Builder(name = "CircleB", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.426f, 10.981f)
                horizontalLineToRelative(-3.426f)
                verticalLineToRelative(-2.231f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.269f)
                curveToRelative(0.457f, 0.0f, 0.884f, 0.179f, 1.205f, 0.504f)
                curveToRelative(0.321f, 0.325f, 0.494f, 0.756f, 0.488f, 1.213f)
                curveToRelative(-0.012f, 0.835f, -0.701f, 1.514f, -1.536f, 1.514f)
                close()
                moveTo(14.463f, 12.981f)
                horizontalLineToRelative(-5.463f)
                verticalLineToRelative(2.269f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.23f)
                curveToRelative(0.467f, 0.0f, 0.904f, -0.183f, 1.232f, -0.515f)
                curveToRelative(0.328f, -0.333f, 0.506f, -0.773f, 0.499f, -1.24f)
                curveToRelative(0.0f, -0.841f, -0.673f, -1.514f, -1.499f, -1.514f)
                close()
                moveTo(23.962f, 11.981f)
                curveToRelative(0.0f, 6.617f, -5.384f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(-0.039f, 18.598f, -0.039f, 11.981f)
                reflectiveCurveTo(5.345f, -0.019f, 11.961f, -0.019f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(17.962f, 14.481f)
                curveToRelative(0.0f, -1.561f, -1.026f, -2.886f, -2.439f, -3.336f)
                curveToRelative(0.272f, -0.492f, 0.431f, -1.054f, 0.439f, -1.65f)
                curveToRelative(0.014f, -0.997f, -0.364f, -1.936f, -1.064f, -2.645f)
                curveToRelative(-0.699f, -0.709f, -1.633f, -1.1f, -2.628f, -1.1f)
                horizontalLineToRelative(-2.269f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.23f)
                curveToRelative(1.006f, 0.0f, 1.949f, -0.395f, 2.656f, -1.111f)
                reflectiveCurveToRelative(1.089f, -1.665f, 1.075f, -2.658f)
                close()
            }
        }
        .build()
        return _circleB!!
    }

private var _circleB: ImageVector? = null

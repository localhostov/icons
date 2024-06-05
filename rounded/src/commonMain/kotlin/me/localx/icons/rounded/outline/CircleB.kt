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

public val Icons.Outline.CircleB: ImageVector
    get() {
        if (_circleB != null) {
            return _circleB!!
        }
        _circleB = Builder(name = "CircleB", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(15.561f, 11.164f)
                curveToRelative(0.272f, -0.491f, 0.431f, -1.053f, 0.439f, -1.65f)
                curveToRelative(0.014f, -0.996f, -0.363f, -1.935f, -1.063f, -2.645f)
                curveToRelative(-0.699f, -0.71f, -1.634f, -1.101f, -2.63f, -1.101f)
                horizontalLineToRelative(-2.269f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.23f)
                curveToRelative(1.007f, 0.0f, 1.951f, -0.395f, 2.657f, -1.112f)
                curveToRelative(0.707f, -0.717f, 1.088f, -1.666f, 1.074f, -2.657f)
                curveToRelative(0.0f, -1.561f, -1.026f, -2.886f, -2.439f, -3.336f)
                close()
                moveTo(9.039f, 8.769f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.269f)
                curveToRelative(0.457f, 0.0f, 0.885f, 0.179f, 1.205f, 0.504f)
                curveToRelative(0.321f, 0.325f, 0.494f, 0.756f, 0.487f, 1.212f)
                curveToRelative(-0.012f, 0.835f, -0.701f, 1.514f, -1.536f, 1.514f)
                horizontalLineToRelative(-3.426f)
                verticalLineToRelative(-2.231f)
                close()
                moveTo(15.502f, 15.753f)
                curveToRelative(-0.328f, 0.333f, -0.766f, 0.516f, -1.233f, 0.516f)
                horizontalLineToRelative(-4.23f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-2.269f)
                horizontalLineToRelative(5.462f)
                curveToRelative(0.826f, 0.0f, 1.499f, 0.673f, 1.499f, 1.514f)
                curveToRelative(0.007f, 0.466f, -0.17f, 0.906f, -0.498f, 1.239f)
                close()
            }
        }
        .build()
        return _circleB!!
    }

private var _circleB: ImageVector? = null

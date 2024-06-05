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
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.375f, 18.25f)
                horizontalLineToRelative(-4.875f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.875f)
                curveToRelative(1.999f, 0.0f, 3.625f, 1.626f, 3.625f, 3.625f)
                curveToRelative(0.0f, 0.658f, -0.177f, 1.276f, -0.484f, 1.809f)
                curveToRelative(1.441f, 0.479f, 2.484f, 1.841f, 2.484f, 3.441f)
                curveToRelative(0.0f, 1.999f, -1.626f, 3.625f, -3.625f, 3.625f)
                close()
                moveTo(9.0f, 8.25f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.875f)
                curveToRelative(0.896f, 0.0f, 1.625f, 0.729f, 1.625f, 1.625f)
                reflectiveCurveToRelative(-0.729f, 1.625f, -1.625f, 1.625f)
                horizontalLineToRelative(-3.375f)
                verticalLineToRelative(-2.75f)
                close()
                moveTo(14.375f, 16.25f)
                horizontalLineToRelative(-4.875f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-2.75f)
                horizontalLineToRelative(5.375f)
                curveToRelative(0.896f, 0.0f, 1.625f, 0.729f, 1.625f, 1.625f)
                reflectiveCurveToRelative(-0.729f, 1.625f, -1.625f, 1.625f)
                close()
            }
        }
        .build()
        return _circleB!!
    }

private var _circleB: ImageVector? = null

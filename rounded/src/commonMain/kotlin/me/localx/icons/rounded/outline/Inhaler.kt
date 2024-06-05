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

public val Icons.Outline.Inhaler: ImageVector
    get() {
        if (_inhaler != null) {
            return _inhaler!!
        }
        _inhaler = Builder(name = "Inhaler", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(0.0f, 13.328f, 0.0f, 12.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(1.5f, 16.0f)
                curveTo(0.672f, 16.0f, 0.0f, 16.672f, 0.0f, 17.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.5f, 21.0f)
                curveTo(0.672f, 21.0f, 0.0f, 21.672f, 0.0f, 22.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 13.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 18.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.947f, 3.56f)
                lineToRelative(-2.729f, 14.373f)
                curveToRelative(-0.447f, 2.357f, -2.513f, 4.067f, -4.912f, 4.067f)
                horizontalLineToRelative(-4.305f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.928f, -9.774f)
                curveToRelative(0.369f, -1.87f, 2.019f, -3.226f, 3.924f, -3.226f)
                horizontalLineToRelative(2.177f)
                curveToRelative(0.896f, 0.0f, 1.739f, 0.396f, 2.311f, 1.087f)
                curveToRelative(0.572f, 0.69f, 0.804f, 1.592f, 0.637f, 2.473f)
                close()
                moveTo(16.86f, 3.613f)
                lineToRelative(-0.668f, 3.387f)
                horizontalLineToRelative(5.066f)
                lineToRelative(0.724f, -3.813f)
                curveToRelative(0.076f, -0.402f, -0.1f, -0.689f, -0.212f, -0.824f)
                curveToRelative(-0.112f, -0.135f, -0.361f, -0.362f, -0.77f, -0.362f)
                horizontalLineToRelative(-2.177f)
                curveToRelative(-0.953f, 0.0f, -1.778f, 0.678f, -1.962f, 1.613f)
                close()
                moveTo(20.878f, 9.0f)
                horizontalLineToRelative(-5.081f)
                lineToRelative(-1.024f, 5.193f)
                curveToRelative(-0.092f, 0.469f, -0.503f, 0.807f, -0.981f, 0.807f)
                horizontalLineToRelative(-1.792f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.305f)
                curveToRelative(1.439f, 0.0f, 2.679f, -1.026f, 2.947f, -2.44f)
                lineToRelative(1.625f, -8.56f)
                close()
            }
        }
        .build()
        return _inhaler!!
    }

private var _inhaler: ImageVector? = null

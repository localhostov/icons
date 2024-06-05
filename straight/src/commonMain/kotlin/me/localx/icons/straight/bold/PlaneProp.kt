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

public val Icons.Bold.PlaneProp: ImageVector
    get() {
        if (_planeProp != null) {
            return _planeProp!!
        }
        _planeProp = Builder(name = "PlaneProp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.973f, 11.664f)
                curveToRelative(-0.16f, -0.983f, -1.083f, -1.664f, -2.08f, -1.664f)
                lineToRelative(-6.961f, 0.015f)
                lineToRelative(-0.976f, -5.015f)
                horizontalLineToRelative(2.043f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.627f)
                lineToRelative(-0.081f, -0.416f)
                curveTo(13.09f, 0.667f, 12.278f, 0.015f, 11.339f, 0.015f)
                lineToRelative(-2.339f, -0.015f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(4.0f)
                lineToRelative(-1.394f, -2.104f)
                curveToRelative(-0.37f, -0.559f, -0.997f, -0.896f, -1.667f, -0.896f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(0.952f)
                curveToRelative(0.674f, 0.0f, 1.302f, -0.339f, 1.672f, -0.903f)
                lineToRelative(1.376f, -2.097f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.339f)
                curveToRelative(0.938f, 0.0f, 1.751f, -0.638f, 1.953f, -1.554f)
                lineToRelative(0.087f, -0.446f)
                horizontalLineToRelative(2.621f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.039f)
                lineToRelative(0.971f, -5.0f)
                lineToRelative(7.068f, -0.015f)
                curveToRelative(1.215f, 0.0f, 2.176f, -1.068f, 1.973f, -2.321f)
                close()
            }
        }
        .build()
        return _planeProp!!
    }

private var _planeProp: ImageVector? = null

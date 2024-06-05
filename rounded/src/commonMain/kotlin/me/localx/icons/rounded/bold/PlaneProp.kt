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
                lineToRelative(-0.968f, -5.015f)
                horizontalLineToRelative(2.035f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineTo(1.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.614f)
                lineToRelative(-0.043f, -0.224f)
                curveToRelative(-0.199f, -1.031f, -1.101f, -1.776f, -2.152f, -1.776f)
                curveToRelative(-1.146f, 0.0f, -2.085f, 0.879f, -2.182f, 2.0f)
                horizontalLineToRelative(-1.009f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(4.0f)
                lineToRelative(-1.599f, -2.414f)
                curveToRelative(-0.243f, -0.366f, -0.653f, -0.586f, -1.092f, -0.586f)
                curveToRelative(-0.723f, 0.0f, -1.31f, 0.586f, -1.31f, 1.31f)
                verticalLineToRelative(7.381f)
                curveToRelative(0.0f, 0.723f, 0.586f, 1.31f, 1.31f, 1.31f)
                horizontalLineToRelative(0.015f)
                curveToRelative(0.441f, 0.0f, 0.853f, -0.222f, 1.095f, -0.591f)
                lineToRelative(1.581f, -2.409f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.51f)
                curveToRelative(0.103f, 1.121f, 1.045f, 2.0f, 2.193f, 2.0f)
                curveToRelative(1.058f, 0.0f, 1.966f, -0.752f, 2.164f, -1.79f)
                lineToRelative(0.04f, -0.21f)
                horizontalLineToRelative(2.593f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.021f)
                lineToRelative(0.953f, -5.0f)
                lineToRelative(7.068f, -0.015f)
                curveToRelative(1.215f, 0.0f, 2.176f, -1.068f, 1.973f, -2.321f)
                close()
            }
        }
        .build()
        return _planeProp!!
    }

private var _planeProp: ImageVector? = null

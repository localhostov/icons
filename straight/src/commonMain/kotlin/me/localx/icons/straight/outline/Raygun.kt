package me.localx.icons.straight.outline

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

public val Icons.Outline.Raygun: ImageVector
    get() {
        if (_raygun != null) {
            return _raygun!!
        }
        _raygun = Builder(name = "Raygun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 8.0f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.348f, 0.0f, -3.887f, 0.371f, -6.499f, 1.143f)
                curveTo(6.161f, 0.455f, 3.734f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 2.215f, 1.792f, 2.475f, 4.922f)
                curveTo(0.989f, 6.031f, 0.0f, 7.386f, 0.0f, 9.0f)
                curveToRelative(0.0f, 1.705f, 1.104f, 3.122f, 2.732f, 4.264f)
                lineTo(0.041f, 22.371f)
                lineToRelative(-0.041f, 1.629f)
                horizontalLineToRelative(7.01f)
                lineToRelative(2.116f, -7.965f)
                curveToRelative(2.385f, 0.651f, 4.634f, 0.965f, 5.873f, 0.965f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(2.414f, 1.185f, 4.0f, 3.0f, 4.0f, 3.0f)
                lineTo(23.999f, 5.0f)
                reflectiveCurveToRelative(-1.586f, 1.815f, -4.0f, 3.0f)
                close()
                moveTo(5.472f, 22.0f)
                horizontalLineToRelative(-3.236f)
                lineToRelative(2.271f, -7.686f)
                curveToRelative(0.854f, 0.43f, 1.773f, 0.806f, 2.708f, 1.131f)
                lineToRelative(-1.742f, 6.556f)
                close()
                moveTo(14.0f, 14.944f)
                curveToRelative(-3.889f, -0.381f, -12.0f, -2.684f, -12.0f, -5.944f)
                reflectiveCurveTo(10.111f, 3.437f, 14.0f, 3.056f)
                verticalLineToRelative(11.889f)
                close()
            }
        }
        .build()
        return _raygun!!
    }

private var _raygun: ImageVector? = null

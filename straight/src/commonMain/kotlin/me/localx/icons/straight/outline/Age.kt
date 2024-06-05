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

public val Icons.Outline.Age: ImageVector
    get() {
        if (_age != null) {
            return _age!!
        }
        _age = Builder(name = "Age", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.757f, 8.0f)
                curveToRelative(-0.757f, 0.0f, -1.281f, 0.587f, -1.385f, 1.167f)
                lineToRelative(-1.372f, 6.833f)
                horizontalLineToRelative(1.469f)
                lineToRelative(0.275f, -1.474f)
                horizontalLineToRelative(2.006f)
                lineToRelative(0.262f, 1.474f)
                horizontalLineToRelative(1.488f)
                lineToRelative(-1.397f, -6.807f)
                curveToRelative(-0.12f, -0.668f, -0.589f, -1.192f, -1.346f, -1.192f)
                close()
                moveTo(7.112f, 13.0f)
                lineToRelative(0.624f, -3.295f)
                lineToRelative(0.638f, 3.295f)
                horizontalLineToRelative(-1.261f)
                close()
                moveTo(12.6f, 10.493f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.496f, 0.404f, 0.9f, 0.9f, 0.9f)
                curveToRelative(0.458f, 0.0f, 0.823f, -0.349f, 0.878f, -0.793f)
                horizontalLineToRelative(-0.878f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-0.011f)
                curveToRelative(-0.057f, 1.33f, -1.145f, 2.393f, -2.489f, 2.393f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                reflectiveCurveToRelative(-0.9f, 0.404f, -0.9f, 0.9f)
                close()
                moveTo(18.6f, 9.6f)
                verticalLineToRelative(1.801f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                close()
                moveTo(23.377f, 18.0f)
                curveToRelative(-2.079f, 3.581f, -5.946f, 6.0f, -10.376f, 6.0f)
                curveToRelative(-6.617f, 0.0f, -12.0f, -5.383f, -12.0f, -12.0f)
                reflectiveCurveTo(6.383f, 0.0f, 13.0f, 0.0f)
                curveToRelative(2.528f, 0.0f, 4.968f, 0.799f, 7.0f, 2.261f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.997f)
                curveToRelative(-1.724f, -1.294f, -3.822f, -2.0f, -5.997f, -2.0f)
                curveTo(7.486f, 2.0f, 3.0f, 6.486f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(3.262f, 0.0f, 6.154f, -1.577f, 7.981f, -4.0f)
                horizontalLineToRelative(2.395f)
                close()
            }
        }
        .build()
        return _age!!
    }

private var _age: ImageVector? = null

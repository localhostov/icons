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

public val Icons.Bold.Age: ImageVector
    get() {
        if (_age != null) {
            return _age!!
        }
        _age = Builder(name = "Age", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.757f, 8.0f)
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
                moveTo(8.112f, 13.0f)
                lineToRelative(0.624f, -3.295f)
                lineToRelative(0.638f, 3.295f)
                horizontalLineToRelative(-1.261f)
                close()
                moveTo(13.6f, 10.493f)
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
                moveTo(19.6f, 9.6f)
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
                curveToRelative(2.462f, 0.0f, 4.838f, 0.762f, 6.837f, 2.151f)
                lineTo(21.981f, 0.007f)
                verticalLineToRelative(5.014f)
                curveToRelative(0.0f, 0.544f, -0.441f, 0.986f, -0.986f, 0.986f)
                horizontalLineToRelative(-5.014f)
                lineToRelative(1.697f, -1.697f)
                curveToRelative(-1.4f, -0.852f, -3.014f, -1.31f, -4.677f, -1.31f)
                curveToRelative(-4.962f, 0.0f, -9.0f, 4.038f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                curveToRelative(2.656f, 0.0f, 5.04f, -1.164f, 6.689f, -3.0f)
                horizontalLineToRelative(3.687f)
                close()
            }
        }
        .build()
        return _age!!
    }

private var _age: ImageVector? = null

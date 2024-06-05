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

public val Icons.Filled.Recipe: ImageVector
    get() {
        if (_recipe != null) {
            return _recipe!!
        }
        _recipe = Builder(name = "Recipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 10.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-2.171f)
                curveToRelative(-0.505f, -0.178f, -0.958f, -0.491f, -1.31f, -0.915f)
                curveTo(0.118f, 4.224f, -0.114f, 3.316f, 0.054f, 2.425f)
                curveTo(0.263f, 1.318f, 1.14f, 0.383f, 2.236f, 0.099f)
                curveToRelative(0.751f, -0.194f, 1.506f, -0.099f, 2.16f, 0.258f)
                curveTo(5.404f, -0.112f, 6.596f, -0.112f, 7.604f, 0.356f)
                curveTo(8.258f, 0.0f, 9.014f, -0.098f, 9.763f, 0.099f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.096f, 0.284f, 1.974f, 1.22f, 2.182f, 2.326f)
                curveToRelative(0.168f, 0.892f, -0.063f, 1.799f, -0.636f, 2.489f)
                curveToRelative(-0.352f, 0.424f, -0.805f, 0.737f, -1.31f, 0.915f)
                verticalLineToRelative(2.171f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(9.515f)
                curveToRelative(0.0f, 0.163f, -0.013f, 0.324f, -0.024f, 0.485f)
                horizontalLineToRelative(-5.976f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.976f)
                curveToRelative(-0.161f, 0.011f, -1.322f, 0.024f, -1.485f, 0.024f)
                horizontalLineToRelative(-4.515f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-8.382f)
                curveToRelative(0.597f, -0.521f, 1.035f, -1.21f, 1.24f, -2.0f)
                horizontalLineToRelative(7.142f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(0.312f, -0.234f, 0.598f, -0.506f, 0.85f, -0.81f)
                curveToRelative(0.954f, -1.15f, 1.34f, -2.658f, 1.061f, -4.136f)
                curveToRelative(-0.143f, -0.76f, -0.468f, -1.456f, -0.919f, -2.055f)
                horizontalLineToRelative(6.008f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(7.0f, -7.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _recipe!!
    }

private var _recipe: ImageVector? = null

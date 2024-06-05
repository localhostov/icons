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

public val Icons.Outline.SkiBootSki: ImageVector
    get() {
        if (_skiBootSki != null) {
            return _skiBootSki!!
        }
        _skiBootSki = Builder(name = "SkiBootSki", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(0.0f, 20.0f)
                lineToRelative(0.021f, -2.89f)
                lineTo(3.562f, -0.002f)
                reflectiveCurveToRelative(9.601f, 0.028f, 10.27f, 0.028f)
                reflectiveCurveToRelative(0.893f, 0.324f, 0.893f, 0.324f)
                curveToRelative(0.259f, 0.264f, 0.366f, 0.636f, 0.287f, 0.996f)
                lineToRelative(-1.731f, 8.238f)
                lineToRelative(0.68f, 0.219f)
                curveToRelative(2.925f, 0.613f, 5.041f, 3.214f, 5.041f, 6.208f)
                verticalLineToRelative(3.988f)
                close()
                moveTo(17.0f, 16.012f)
                curveToRelative(0.0f, -2.063f, -1.469f, -3.854f, -3.492f, -4.259f)
                lineToRelative(-2.354f, -0.753f)
                horizontalLineToRelative(-3.154f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.358f)
                lineToRelative(0.421f, -2.0f)
                horizontalLineToRelative(-3.779f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.199f)
                lineToRelative(0.626f, -2.977f)
                lineToRelative(-7.637f, -0.021f)
                lineToRelative(-3.188f, 15.413f)
                verticalLineToRelative(0.585f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.988f)
                close()
                moveTo(5.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _skiBootSki!!
    }

private var _skiBootSki: ImageVector? = null

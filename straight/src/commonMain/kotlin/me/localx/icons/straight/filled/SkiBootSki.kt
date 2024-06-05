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

public val Icons.Filled.SkiBootSki: ImageVector
    get() {
        if (_skiBootSki != null) {
            return _skiBootSki!!
        }
        _skiBootSki = Builder(name = "SkiBootSki", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(19.0f, 16.5f)
                verticalLineToRelative(3.5f)
                lineTo(0.0f, 20.0f)
                lineToRelative(0.021f, -2.89f)
                lineTo(3.562f, -0.002f)
                lineToRelative(10.27f, 0.028f)
                lineToRelative(0.432f, -0.087f)
                lineToRelative(0.461f, 0.411f)
                curveToRelative(0.259f, 0.264f, 0.366f, 0.636f, 0.287f, 0.996f)
                lineToRelative(-0.617f, 2.653f)
                horizontalLineToRelative(-5.394f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.929f)
                lineToRelative(-0.465f, 2.0f)
                horizontalLineToRelative(-4.465f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.959f, 0.292f)
                curveToRelative(2.925f, 0.613f, 5.041f, 3.214f, 5.041f, 6.208f)
                close()
                moveTo(7.0f, 14.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _skiBootSki!!
    }

private var _skiBootSki: ImageVector? = null

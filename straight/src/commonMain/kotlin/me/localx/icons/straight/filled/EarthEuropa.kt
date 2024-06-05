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

public val Icons.Filled.EarthEuropa: ImageVector
    get() {
        if (_earthEuropa != null) {
            return _earthEuropa!!
        }
        _earthEuropa = Builder(name = "EarthEuropa", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.962f, 9.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(1.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(6.808f, 9.846f)
                lineToRelative(1.154f, -2.769f)
                lineToRelative(-1.385f, -0.577f)
                lineToRelative(-1.615f, 2.577f)
                lineToRelative(1.846f, 0.769f)
                close()
                moveTo(20.817f, 16.714f)
                lineToRelative(-1.855f, -0.214f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-3.0f, -2.0f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-2.5f, 2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(2.0f, 0.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.013f, 0.0f, 0.026f, 0.0f, 0.038f, 0.0f)
                curveToRelative(3.811f, 0.0f, 7.13f, -2.143f, 8.817f, -5.286f)
                close()
                moveTo(21.418f, 15.361f)
                curveToRelative(0.376f, -1.051f, 0.582f, -2.182f, 0.582f, -3.361f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                curveToRelative(-0.183f, 0.0f, -0.365f, 0.005f, -0.546f, 0.015f)
                lineToRelative(-0.992f, 1.985f)
                lineToRelative(0.5f, 1.0f)
                lineToRelative(3.0f, -0.5f)
                verticalLineToRelative(1.0f)
                lineToRelative(-3.5f, 1.5f)
                lineToRelative(-1.5f, 3.5f)
                lineToRelative(1.0f, 1.5f)
                horizontalLineToRelative(1.0f)
                lineToRelative(1.5f, -2.0f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(1.0f, -0.5f)
                lineToRelative(-0.5f, -1.5f)
                lineToRelative(1.5f, -0.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(3.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(3.457f, 1.861f)
                close()
            }
        }
        .build()
        return _earthEuropa!!
    }

private var _earthEuropa: ImageVector? = null

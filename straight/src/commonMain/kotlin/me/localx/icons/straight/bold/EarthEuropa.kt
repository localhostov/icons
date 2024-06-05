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

public val Icons.Bold.EarthEuropa: ImageVector
    get() {
        if (_earthEuropa != null) {
            return _earthEuropa!!
        }
        _earthEuropa = Builder(name = "EarthEuropa", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 7.077f)
                lineToRelative(-1.154f, 2.769f)
                lineToRelative(-1.846f, -0.769f)
                lineToRelative(1.615f, -2.577f)
                lineToRelative(1.385f, 0.577f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 21.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-2.0f, -0.5f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(2.5f, -2.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(3.0f, 2.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(0.741f, 0.086f)
                curveToRelative(0.321f, -0.54f, 0.588f, -1.117f, 0.792f, -1.722f)
                lineToRelative(-2.533f, -1.364f)
                lineToRelative(1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-3.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-1.5f, 0.5f)
                lineToRelative(0.5f, 1.5f)
                lineToRelative(-1.0f, 0.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-1.5f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-1.0f, -1.5f)
                lineToRelative(1.5f, -3.5f)
                lineToRelative(3.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-3.0f, 0.5f)
                lineToRelative(-0.5f, -1.0f)
                lineToRelative(0.47f, -0.941f)
                curveToRelative(-4.479f, 0.513f, -7.97f, 4.327f, -7.97f, 8.941f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _earthEuropa!!
    }

private var _earthEuropa: ImageVector? = null

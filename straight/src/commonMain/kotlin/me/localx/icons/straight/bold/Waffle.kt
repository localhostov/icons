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

public val Icons.Bold.Waffle: ImageVector
    get() {
        if (_waffle != null) {
            return _waffle!!
        }
        _waffle = Builder(name = "Waffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.962f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(18.921f, 12.975f)
                horizontalLineToRelative(-2.946f)
                reflectiveCurveToRelative(0.0f, -1.95f, 0.0f, -1.95f)
                horizontalLineToRelative(2.946f)
                curveToRelative(-0.148f, -1.058f, -0.534f, -2.087f, -1.165f, -3.0f)
                horizontalLineToRelative(-1.781f)
                reflectiveCurveToRelative(0.0f, -1.781f, 0.0f, -1.781f)
                curveToRelative(-0.913f, -0.631f, -1.942f, -1.017f, -3.0f, -1.165f)
                verticalLineToRelative(2.946f)
                reflectiveCurveToRelative(-1.95f, 0.0f, -1.95f, 0.0f)
                verticalLineToRelative(-2.946f)
                curveToRelative(-1.058f, 0.148f, -2.087f, 0.535f, -3.0f, 1.165f)
                verticalLineToRelative(1.781f)
                reflectiveCurveToRelative(-1.781f, 0.0f, -1.781f, 0.0f)
                curveToRelative(-0.631f, 0.913f, -1.017f, 1.942f, -1.165f, 3.0f)
                horizontalLineToRelative(2.946f)
                reflectiveCurveToRelative(0.0f, 1.95f, 0.0f, 1.95f)
                horizontalLineToRelative(-2.946f)
                curveToRelative(0.148f, 1.058f, 0.534f, 2.087f, 1.165f, 3.0f)
                horizontalLineToRelative(1.781f)
                reflectiveCurveToRelative(0.0f, 1.781f, 0.0f, 1.781f)
                curveToRelative(0.913f, 0.631f, 1.942f, 1.017f, 3.0f, 1.165f)
                verticalLineToRelative(-2.946f)
                reflectiveCurveToRelative(1.95f, 0.0f, 1.95f, 0.0f)
                verticalLineToRelative(2.946f)
                curveToRelative(1.058f, -0.148f, 2.087f, -0.534f, 3.0f, -1.165f)
                verticalLineToRelative(-1.781f)
                reflectiveCurveToRelative(1.781f, 0.0f, 1.781f, 0.0f)
                curveToRelative(0.631f, -0.913f, 1.018f, -1.942f, 1.165f, -3.0f)
                close()
                moveTo(11.025f, 12.975f)
                verticalLineToRelative(-1.95f)
                reflectiveCurveToRelative(1.95f, 0.0f, 1.95f, 0.0f)
                verticalLineToRelative(1.95f)
                reflectiveCurveToRelative(-1.95f, 0.0f, -1.95f, 0.0f)
                close()
            }
        }
        .build()
        return _waffle!!
    }

private var _waffle: ImageVector? = null

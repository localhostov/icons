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

public val Icons.Outline.Bonus: ImageVector
    get() {
        if (_bonus != null) {
            return _bonus!!
        }
        _bonus = Builder(name = "Bonus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.613f, 9.472f)
                curveToRelative(0.246f, -0.435f, 0.387f, -0.937f, 0.387f, -1.472f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.061f, -0.554f, -1.995f, -1.387f, -2.528f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(20.402f, 15.402f)
                curveToRelative(1.006f, -1.56f, 1.598f, -3.412f, 1.598f, -5.402f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.0f, 4.486f, 2.0f, 10.0f)
                curveToRelative(0.0f, 1.99f, 0.591f, 3.842f, 1.598f, 5.402f)
                lineToRelative(-3.598f, 3.598f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(4.364f, -4.364f)
                curveToRelative(0.841f, 0.231f, 1.722f, 0.364f, 2.636f, 0.364f)
                reflectiveCurveToRelative(1.794f, -0.134f, 2.636f, -0.364f)
                lineToRelative(4.364f, 4.364f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-3.598f, -3.598f)
                close()
                moveTo(4.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _bonus!!
    }

private var _bonus: ImageVector? = null

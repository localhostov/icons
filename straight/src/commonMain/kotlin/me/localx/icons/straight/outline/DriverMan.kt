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

public val Icons.Outline.DriverMan: ImageVector
    get() {
        if (_driverMan != null) {
            return _driverMan!!
        }
        _driverMan = Builder(name = "DriverMan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(15.309f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(18.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(22.5f, 24.0f)
                horizontalLineToRelative(-1.961f)
                lineToRelative(-1.965f, -6.462f)
                curveToRelative(-0.427f, -1.494f, -1.811f, -2.538f, -3.365f, -2.538f)
                horizontalLineToRelative(-6.353f)
                curveToRelative(-1.554f, 0.0f, -2.938f, 1.044f, -3.366f, 2.538f)
                lineToRelative(-1.749f, 6.462f)
                lineTo(1.564f, 24.0f)
                lineToRelative(2.003f, -7.011f)
                curveToRelative(0.671f, -2.349f, 2.846f, -3.989f, 5.289f, -3.989f)
                horizontalLineToRelative(6.353f)
                curveToRelative(2.442f, 0.0f, 4.617f, 1.64f, 5.289f, 3.989f)
                lineToRelative(2.003f, 7.011f)
                close()
            }
        }
        .build()
        return _driverMan!!
    }

private var _driverMan: ImageVector? = null

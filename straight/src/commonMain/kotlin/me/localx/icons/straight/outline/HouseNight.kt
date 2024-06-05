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

public val Icons.Outline.HouseNight: ImageVector
    get() {
        if (_houseNight != null) {
            return _houseNight!!
        }
        _houseNight = Builder(name = "HouseNight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.785f, 13.064f)
                lineToRelative(-4.333f, -3.392f)
                curveToRelative(-1.149f, -0.898f, -2.754f, -0.898f, -3.903f, 0.0f)
                lineToRelative(-4.333f, 3.391f)
                curveToRelative(-0.772f, 0.604f, -1.216f, 1.513f, -1.216f, 2.494f)
                verticalLineToRelative(8.442f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-8.442f)
                curveToRelative(0.0f, -0.981f, -0.443f, -1.891f, -1.215f, -2.493f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-6.442f)
                curveToRelative(0.0f, -0.356f, 0.167f, -0.699f, 0.448f, -0.919f)
                lineToRelative(4.333f, -3.391f)
                curveToRelative(0.424f, -0.331f, 1.015f, -0.331f, 1.438f, 0.0f)
                lineToRelative(4.333f, 3.392f)
                curveToRelative(0.28f, 0.219f, 0.447f, 0.562f, 0.447f, 0.918f)
                verticalLineToRelative(6.442f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(8.592f, 11.403f)
                curveToRelative(-0.784f, 0.38f, -1.661f, 0.597f, -2.592f, 0.597f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveTo(2.686f, 0.0f, 6.0f, 0.0f)
                curveToRelative(0.93f, 0.0f, 1.807f, 0.217f, 2.591f, 0.597f)
                curveToRelative(-2.544f, 0.483f, -4.468f, 2.718f, -4.468f, 5.403f)
                reflectiveCurveToRelative(1.924f, 4.921f, 4.469f, 5.403f)
                close()
                moveTo(12.334f, 4.666f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-1.167f, -2.333f)
                close()
                moveTo(4.501f, 17.499f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(1.0f, 2.0f)
                close()
                moveTo(20.667f, 7.333f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(0.833f, 1.667f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(-1.667f, 0.833f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-0.833f, -1.667f)
                close()
            }
        }
        .build()
        return _houseNight!!
    }

private var _houseNight: ImageVector? = null

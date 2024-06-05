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

public val Icons.Bold.HouseNight: ImageVector
    get() {
        if (_houseNight != null) {
            return _houseNight!!
        }
        _houseNight = Builder(name = "HouseNight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.657f, 12.874f)
                lineToRelative(-4.0f, -3.13f)
                curveToRelative(-1.271f, -0.993f, -3.044f, -0.994f, -4.313f, 0.0f)
                lineToRelative(-4.001f, 3.131f)
                curveToRelative(-0.853f, 0.668f, -1.342f, 1.673f, -1.342f, 2.755f)
                verticalLineToRelative(8.37f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-8.37f)
                curveToRelative(0.0f, -1.082f, -0.489f, -2.087f, -1.343f, -2.756f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-5.37f)
                curveToRelative(0.0f, -0.154f, 0.07f, -0.299f, 0.192f, -0.394f)
                lineToRelative(4.0f, -3.13f)
                curveToRelative(0.182f, -0.143f, 0.435f, -0.142f, 0.616f, 0.0f)
                lineToRelative(3.999f, 3.129f)
                curveToRelative(0.123f, 0.096f, 0.193f, 0.24f, 0.193f, 0.395f)
                verticalLineToRelative(5.37f)
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

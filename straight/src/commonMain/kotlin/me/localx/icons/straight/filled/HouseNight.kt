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

public val Icons.Filled.HouseNight: ImageVector
    get() {
        if (_houseNight != null) {
            return _houseNight!!
        }
        _houseNight = Builder(name = "HouseNight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.592f, 11.403f)
                curveToRelative(-0.784f, 0.38f, -1.661f, 0.597f, -2.592f, 0.597f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveTo(2.686f, 0.0f, 6.0f, 0.0f)
                curveToRelative(0.93f, 0.0f, 1.807f, 0.217f, 2.591f, 0.597f)
                curveToRelative(-2.544f, 0.483f, -4.468f, 2.718f, -4.468f, 5.403f)
                reflectiveCurveToRelative(1.924f, 4.921f, 4.469f, 5.403f)
                close()
                moveTo(9.0f, 3.5f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-2.333f, 1.167f)
                close()
                moveTo(0.5f, 18.5f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                close()
                moveTo(19.0f, 5.5f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(0.833f, 1.667f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-1.667f, 0.833f)
                close()
                moveTo(24.0f, 15.109f)
                verticalLineToRelative(8.891f)
                lineTo(8.0f, 24.0f)
                verticalLineToRelative(-8.891f)
                curveToRelative(0.0f, -0.929f, 0.42f, -1.79f, 1.151f, -2.363f)
                lineToRelative(5.448f, -4.263f)
                curveToRelative(0.824f, -0.646f, 1.977f, -0.646f, 2.801f, 0.0f)
                lineToRelative(5.448f, 4.264f)
                curveToRelative(0.731f, 0.572f, 1.151f, 1.434f, 1.151f, 2.362f)
                close()
                moveTo(18.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _houseNight!!
    }

private var _houseNight: ImageVector? = null

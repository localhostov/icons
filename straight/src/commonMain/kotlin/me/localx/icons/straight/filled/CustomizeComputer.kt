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

public val Icons.Filled.CustomizeComputer: ImageVector
    get() {
        if (_customizeComputer != null) {
            return _customizeComputer!!
        }
        _customizeComputer = Builder(name = "CustomizeComputer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 9.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                reflectiveCurveToRelative(1.0f, -6.0f, 5.0f, -6.0f)
                close()
                moveTo(17.166f, 10.246f)
                lineToRelative(6.126f, -6.126f)
                curveToRelative(0.943f, -0.942f, 0.945f, -2.47f, 0.003f, -3.413f)
                curveToRelative(-0.941f, -0.942f, -2.467f, -0.943f, -3.409f, -0.002f)
                curveToRelative(-0.032f, 0.032f, -0.063f, 0.065f, -0.093f, 0.099f)
                lineToRelative(-5.859f, 6.431f)
                curveToRelative(1.491f, 0.45f, 2.686f, 1.564f, 3.232f, 3.011f)
                close()
                moveTo(12.5f, 17.0f)
                horizontalLineToRelative(-7.361f)
                lineToRelative(0.388f, -2.329f)
                curveToRelative(0.43f, -2.581f, 2.121f, -6.769f, 5.777f, -7.536f)
                lineToRelative(4.663f, -5.135f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                lineTo(24.0f, 6.24f)
                lineToRelative(-6.583f, 6.583f)
                curveToRelative(-0.396f, 2.364f, -2.442f, 4.177f, -4.917f, 4.177f)
                close()
            }
        }
        .build()
        return _customizeComputer!!
    }

private var _customizeComputer: ImageVector? = null

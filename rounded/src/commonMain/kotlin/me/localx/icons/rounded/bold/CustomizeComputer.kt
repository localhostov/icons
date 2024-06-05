package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.CustomizeComputer: ImageVector
    get() {
        if (_customizeComputer != null) {
            return _customizeComputer!!
        }
        _customizeComputer = Builder(name = "CustomizeComputer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.488f, 10.726f)
                curveToRelative(0.158f, 1.78f, -1.24f, 3.274f, -2.988f, 3.274f)
                horizontalLineToRelative(-3.294f)
                curveToRelative(-0.812f, 0.0f, -1.402f, -0.791f, -1.144f, -1.562f)
                curveToRelative(0.538f, -1.612f, 1.533f, -3.949f, 3.727f, -4.371f)
                curveToRelative(1.755f, -0.338f, 3.542f, 0.879f, 3.7f, 2.659f)
                close()
                moveTo(18.166f, 9.246f)
                lineToRelative(5.126f, -5.126f)
                curveToRelative(0.943f, -0.942f, 0.945f, -2.47f, 0.003f, -3.413f)
                curveToRelative(-0.941f, -0.942f, -2.467f, -0.943f, -3.409f, -0.002f)
                curveToRelative(-0.032f, 0.032f, -4.953f, 5.53f, -4.953f, 5.53f)
                curveToRelative(1.491f, 0.45f, 2.686f, 1.564f, 3.232f, 3.011f)
                close()
                moveTo(22.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 16.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.0f)
                curveTo(2.467f, 2.0f, 0.0f, 4.468f, 0.0f, 7.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _customizeComputer!!
    }

private var _customizeComputer: ImageVector? = null

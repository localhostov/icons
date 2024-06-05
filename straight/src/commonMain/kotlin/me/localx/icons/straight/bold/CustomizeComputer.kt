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
                moveToRelative(21.0f, 9.24f)
                lineToRelative(3.0f, -3.0f)
                verticalLineToRelative(12.76f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.5f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12.539f)
                lineToRelative(-2.684f, 3.0f)
                lineTo(3.5f, 5.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-6.76f)
                close()
                moveTo(8.5f, 14.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-4.0f, 0.0f, -5.0f, 6.0f, -5.0f, 6.0f)
                close()
                moveTo(18.166f, 9.246f)
                lineToRelative(5.126f, -5.126f)
                curveToRelative(0.943f, -0.942f, 0.945f, -2.47f, 0.003f, -3.413f)
                curveToRelative(-0.941f, -0.942f, -2.467f, -0.943f, -3.409f, -0.002f)
                curveToRelative(-0.032f, 0.032f, -4.953f, 5.53f, -4.953f, 5.53f)
                curveToRelative(1.491f, 0.45f, 2.686f, 1.564f, 3.232f, 3.011f)
                close()
            }
        }
        .build()
        return _customizeComputer!!
    }

private var _customizeComputer: ImageVector? = null

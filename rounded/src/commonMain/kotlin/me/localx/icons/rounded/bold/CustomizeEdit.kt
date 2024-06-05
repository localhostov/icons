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

public val Icons.Bold.CustomizeEdit: ImageVector
    get() {
        if (_customizeEdit != null) {
            return _customizeEdit!!
        }
        _customizeEdit = Builder(name = "CustomizeEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.488f, 11.726f)
                curveToRelative(0.158f, 1.78f, -1.24f, 3.274f, -2.988f, 3.274f)
                horizontalLineToRelative(-3.353f)
                curveToRelative(-0.773f, 0.0f, -1.33f, -0.749f, -1.09f, -1.483f)
                curveToRelative(0.527f, -1.613f, 1.502f, -4.02f, 3.732f, -4.45f)
                curveToRelative(1.755f, -0.338f, 3.542f, 0.879f, 3.7f, 2.659f)
                close()
                moveTo(23.295f, 0.707f)
                curveToRelative(-0.941f, -0.942f, -2.467f, -0.943f, -3.409f, -0.002f)
                curveToRelative(-0.032f, 0.032f, -5.953f, 6.53f, -5.953f, 6.53f)
                curveToRelative(1.491f, 0.45f, 2.686f, 1.564f, 3.232f, 3.011f)
                lineToRelative(6.126f, -6.126f)
                curveToRelative(0.943f, -0.942f, 0.945f, -2.47f, 0.003f, -3.413f)
                close()
                moveTo(19.5f, 12.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                curveTo(2.467f, 3.0f, 0.0f, 5.468f, 0.0f, 8.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _customizeEdit!!
    }

private var _customizeEdit: ImageVector? = null

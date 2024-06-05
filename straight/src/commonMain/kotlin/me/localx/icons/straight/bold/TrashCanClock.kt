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

public val Icons.Bold.TrashCanClock: ImageVector
    get() {
        if (_trashCanClock != null) {
            return _trashCanClock!!
        }
        _trashCanClock = Builder(name = "TrashCanClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.023f, 24.0f)
                horizontalLineToRelative(-7.523f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(2.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.374f)
                curveToRelative(-0.79f, -0.243f, -1.63f, -0.374f, -2.5f, -0.374f)
                curveToRelative(-0.168f, 0.0f, -0.334f, 0.005f, -0.5f, 0.015f)
                verticalLineToRelative(-3.015f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(4.752f)
                curveToRelative(0.526f, 1.163f, 1.307f, 2.187f, 2.272f, 3.0f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(20.904f, 18.783f)
                lineToRelative(-1.904f, -1.904f)
                verticalLineToRelative(-2.879f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.121f)
                lineToRelative(2.783f, 2.783f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(10.0f, 9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.015f)
                curveToRelative(-0.01f, -0.166f, -0.015f, -0.332f, -0.015f, -0.5f)
                curveToRelative(0.0f, -1.447f, 0.362f, -2.81f, 1.0f, -4.003f)
                verticalLineToRelative(-4.497f)
                close()
            }
        }
        .build()
        return _trashCanClock!!
    }

private var _trashCanClock: ImageVector? = null

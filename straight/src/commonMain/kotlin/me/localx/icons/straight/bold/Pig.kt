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

public val Icons.Bold.Pig: ImageVector
    get() {
        if (_pig != null) {
            return _pig!!
        }
        _pig = Builder(name = "Pig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.916f, 9.0f)
                curveToRelative(-0.88f, -2.166f, -2.681f, -3.863f, -4.916f, -4.599f)
                lineTo(17.0f, 1.0f)
                curveToRelative(-1.867f, -0.106f, -3.434f, 1.246f, -3.876f, 3.0f)
                horizontalLineToRelative(-5.125f)
                curveToRelative(-1.802f, 0.0f, -3.467f, 0.599f, -4.806f, 1.609f)
                curveToRelative(-0.129f, -0.458f, -0.193f, -0.995f, -0.193f, -1.609f)
                lineTo(0.0f, 4.0f)
                curveToRelative(0.0f, 1.637f, 0.346f, 3.001f, 1.031f, 4.074f)
                curveTo(0.375f, 9.235f, 0.0f, 10.574f, 0.0f, 12.0f)
                curveTo(0.0f, 14.955f, 1.611f, 17.541f, 4.0f, 18.926f)
                verticalLineToRelative(3.074f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.807f)
                curveToRelative(1.768f, -0.864f, 3.172f, -2.36f, 3.916f, -4.193f)
                horizontalLineToRelative(2.084f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.084f)
                close()
                moveTo(14.5f, 17.0f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(17.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pig!!
    }

private var _pig: ImageVector? = null

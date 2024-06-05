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

public val Icons.Bold.AirFreshener: ImageVector
    get() {
        if (_airFreshener != null) {
            return _airFreshener!!
        }
        _airFreshener = Builder(name = "AirFreshener", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(22.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 14.5f)
                verticalLineToRelative(9.5f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 14.5f)
                curveToRelative(0.0f, -3.175f, 2.093f, -6.239f, 5.0f, -7.416f)
                lineTo(5.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.084f)
                curveToRelative(2.907f, 1.177f, 5.0f, 4.241f, 5.0f, 7.416f)
                close()
                moveTo(14.0f, 14.5f)
                curveToRelative(0.0f, -1.861f, -1.169f, -3.708f, -2.815f, -4.5f)
                lineTo(5.815f, 10.0f)
                curveToRelative(-1.646f, 0.792f, -2.815f, 2.639f, -2.815f, 4.5f)
                verticalLineToRelative(6.5f)
                lineTo(14.0f, 21.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(22.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _airFreshener!!
    }

private var _airFreshener: ImageVector? = null

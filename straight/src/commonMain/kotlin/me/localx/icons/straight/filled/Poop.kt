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

public val Icons.Filled.Poop: ImageVector
    get() {
        if (_poop != null) {
            return _poop!!
        }
        _poop = Builder(name = "Poop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.517f, 17.034f)
                horizontalLineToRelative(-3.517f)
                verticalLineToRelative(-2.034f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.145f)
                curveToRelative(-0.487f, -1.868f, -2.169f, -4.0f, -3.855f, -4.0f)
                curveToRelative(0.0f, 2.0f, -0.75f, 3.25f, -1.5f, 4.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.625f)
                verticalLineToRelative(0.034f)
                horizontalLineTo(3.483f)
                curveToRelative(-1.924f, 0.0f, -3.483f, 1.559f, -3.483f, 3.483f)
                reflectiveCurveToRelative(1.559f, 3.483f, 3.483f, 3.483f)
                horizontalLineToRelative(17.034f)
                curveToRelative(1.924f, 0.0f, 3.483f, -1.56f, 3.483f, -3.483f)
                reflectiveCurveToRelative(-1.559f, -3.483f, -3.483f, -3.483f)
                close()
            }
        }
        .build()
        return _poop!!
    }

private var _poop: ImageVector? = null

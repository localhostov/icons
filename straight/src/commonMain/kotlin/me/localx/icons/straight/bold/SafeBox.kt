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

public val Icons.Bold.SafeBox: ImageVector
    get() {
        if (_safeBox != null) {
            return _safeBox!!
        }
        _safeBox = Builder(name = "SafeBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(0.911f)
                curveToRelative(-1.172f, 0.336f, -2.191f, 0.867f, -3.0f, 1.547f)
                verticalLineToRelative(-2.76f)
                curveTo(0.0f, 1.5f, 1.674f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(14.0f, 14.667f)
                curveToRelative(1.893f, -0.712f, 3.246f, -2.525f, 3.246f, -4.667f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-0.469f, 0.0f, -0.916f, 0.078f, -1.344f, 0.199f)
                curveToRelative(1.905f, 1.076f, 3.098f, 2.791f, 3.098f, 4.801f)
                verticalLineToRelative(4.667f)
                close()
                moveTo(12.0f, 10.0f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 2.173f, -2.523f, 3.75f, -6.0f, 3.75f)
                reflectiveCurveToRelative(-6.0f, -1.577f, -6.0f, -3.75f)
                verticalLineToRelative(-10.25f)
                curveToRelative(0.0f, -2.28f, 2.58f, -4.0f, 6.0f, -4.0f)
                reflectiveCurveToRelative(6.0f, 1.72f, 6.0f, 4.0f)
                close()
                moveTo(3.0f, 10.014f)
                verticalLineToRelative(0.006f)
                curveToRelative(0.086f, 0.248f, 1.127f, 0.98f, 3.0f, 0.98f)
                curveToRelative(1.842f, 0.0f, 2.881f, -0.708f, 2.996f, -1.0f)
                curveToRelative(-0.115f, -0.292f, -1.154f, -1.0f, -2.996f, -1.0f)
                curveToRelative(-1.873f, 0.0f, -2.914f, 0.732f, -3.0f, 1.014f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.078f, 0.263f, 1.121f, 1.0f, 3.0f, 1.0f)
                reflectiveCurveToRelative(2.914f, -0.732f, 3.0f, -1.014f)
                verticalLineToRelative(-1.491f)
                curveToRelative(-0.873f, 0.322f, -1.891f, 0.505f, -3.0f, 0.505f)
                reflectiveCurveToRelative(-2.127f, -0.183f, -3.0f, -0.505f)
                verticalLineToRelative(1.505f)
                close()
                moveTo(9.0f, 20.162f)
                verticalLineToRelative(-1.667f)
                curveToRelative(-0.873f, 0.322f, -1.891f, 0.505f, -3.0f, 0.505f)
                reflectiveCurveToRelative(-2.127f, -0.183f, -3.0f, -0.505f)
                verticalLineToRelative(1.667f)
                curveToRelative(0.217f, 0.275f, 1.275f, 0.838f, 3.0f, 0.838f)
                reflectiveCurveToRelative(2.783f, -0.563f, 3.0f, -0.838f)
                close()
            }
        }
        .build()
        return _safeBox!!
    }

private var _safeBox: ImageVector? = null

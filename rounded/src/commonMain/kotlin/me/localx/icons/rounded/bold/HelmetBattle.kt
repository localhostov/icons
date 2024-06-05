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

public val Icons.Bold.HelmetBattle: ImageVector
    get() {
        if (_helmetBattle != null) {
            return _helmetBattle!!
        }
        _helmetBattle = Builder(name = "HelmetBattle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.327f, 0.689f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.414f, -0.92f, -3.24f, -0.921f, -4.654f, 0.0f)
                curveTo(6.173f, 2.968f, 2.0f, 6.501f, 2.0f, 10.393f)
                verticalLineToRelative(6.212f)
                curveToRelative(0.0f, 2.237f, 1.337f, 4.233f, 3.405f, 5.086f)
                lineToRelative(4.696f, 1.934f)
                curveToRelative(0.612f, 0.252f, 1.255f, 0.378f, 1.898f, 0.378f)
                reflectiveCurveToRelative(1.286f, -0.126f, 1.898f, -0.378f)
                lineToRelative(4.696f, -1.934f)
                curveToRelative(2.068f, -0.852f, 3.405f, -2.848f, 3.405f, -5.085f)
                verticalLineToRelative(-6.212f)
                curveToRelative(0.0f, -3.891f, -4.173f, -7.425f, -7.673f, -9.704f)
                close()
                moveTo(19.0f, 16.605f)
                curveToRelative(0.0f, 1.017f, -0.607f, 1.924f, -1.548f, 2.312f)
                lineToRelative(-3.952f, 1.627f)
                verticalLineToRelative(-5.794f)
                lineToRelative(2.475f, -1.238f)
                curveToRelative(0.628f, -0.314f, 1.025f, -0.956f, 1.025f, -1.658f)
                curveToRelative(0.0f, -1.024f, -0.83f, -1.854f, -1.854f, -1.854f)
                horizontalLineToRelative(-6.292f)
                curveToRelative(-1.024f, 0.0f, -1.854f, 0.83f, -1.854f, 1.854f)
                curveToRelative(0.0f, 0.702f, 0.397f, 1.344f, 1.025f, 1.658f)
                lineToRelative(2.475f, 1.238f)
                verticalLineToRelative(5.794f)
                lineToRelative(-3.952f, -1.627f)
                curveToRelative(-0.94f, -0.388f, -1.548f, -1.295f, -1.548f, -2.312f)
                verticalLineToRelative(-6.212f)
                curveToRelative(0.0f, -1.929f, 2.358f, -4.617f, 6.31f, -7.189f)
                curveToRelative(0.213f, -0.139f, 0.451f, -0.208f, 0.69f, -0.208f)
                reflectiveCurveToRelative(0.478f, 0.069f, 0.69f, 0.208f)
                curveToRelative(3.951f, 2.572f, 6.31f, 5.26f, 6.31f, 7.189f)
                verticalLineToRelative(6.212f)
                close()
            }
        }
        .build()
        return _helmetBattle!!
    }

private var _helmetBattle: ImageVector? = null

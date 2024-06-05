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

public val Icons.Bold.Monkey: ImageVector
    get() {
        if (_monkey != null) {
            return _monkey!!
        }
        _monkey = Builder(name = "Monkey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 4.0f)
                curveToRelative(-0.114f, 0.0f, -0.225f, 0.01f, -0.333f, 0.028f)
                curveToRelative(-0.817f, -2.343f, -3.049f, -4.028f, -5.667f, -4.028f)
                reflectiveCurveToRelative(-4.849f, 1.685f, -5.667f, 4.028f)
                curveToRelative(-0.108f, -0.018f, -0.22f, -0.028f, -0.333f, -0.028f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.114f, 0.0f, 0.225f, -0.01f, 0.333f, -0.028f)
                curveToRelative(0.201f, 0.576f, 0.487f, 1.111f, 0.843f, 1.592f)
                curveToRelative(-4.505f, 1.449f, -6.581f, 5.432f, -7.329f, 8.865f)
                curveToRelative(-0.536f, -0.849f, -0.847f, -1.853f, -0.847f, -2.929f)
                lineTo(3.0f, 6.793f)
                curveToRelative(0.0f, -1.782f, 1.196f, -3.365f, 2.908f, -3.85f)
                curveToRelative(0.797f, -0.226f, 1.261f, -1.054f, 1.035f, -1.852f)
                reflectiveCurveTo(5.888f, -0.168f, 5.092f, 0.057f)
                curveTo(2.094f, 0.904f, 0.0f, 3.674f, 0.0f, 6.793f)
                verticalLineToRelative(8.707f)
                curveToRelative(0.0f, 4.687f, 3.813f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.021f, 0.0f, -0.031f)
                curveToRelative(0.749f, -0.671f, 1.329f, -1.528f, 1.668f, -2.497f)
                curveToRelative(0.108f, 0.018f, 0.22f, 0.028f, 0.333f, 0.028f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(15.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.17f, 0.012f, 0.337f, 0.036f, 0.5f)
                horizontalLineToRelative(-2.036f)
                close()
                moveTo(17.0f, 12.0f)
                verticalLineToRelative(3.127f)
                curveToRelative(-0.32f, -0.083f, -0.655f, -0.127f, -1.0f, -0.127f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.686f, 0.0f, -1.342f, -0.126f, -1.948f, -0.357f)
                curveToRelative(0.233f, -2.351f, 1.504f, -8.643f, 8.448f, -8.643f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _monkey!!
    }

private var _monkey: ImageVector? = null

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
                curveToRelative(-4.743f, 1.526f, -6.794f, 5.86f, -7.437f, 9.404f)
                curveToRelative(-0.467f, -0.709f, -0.739f, -1.557f, -0.739f, -2.468f)
                lineTo(3.0f, 7.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                lineTo(7.0f, 0.0f)
                curveTo(3.14f, 0.0f, 0.0f, 3.14f, 0.0f, 7.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 4.136f, 3.364f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-10.532f)
                curveToRelative(0.749f, -0.671f, 1.329f, -1.528f, 1.667f, -2.496f)
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
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 12.0f)
                verticalLineToRelative(3.127f)
                curveToRelative(-0.32f, -0.083f, -0.655f, -0.127f, -1.0f, -0.127f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.333f, 0.0f, -0.658f, -0.037f, -0.97f, -0.106f)
                curveToRelative(0.166f, -2.114f, 1.262f, -8.894f, 8.47f, -8.894f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _monkey!!
    }

private var _monkey: ImageVector? = null

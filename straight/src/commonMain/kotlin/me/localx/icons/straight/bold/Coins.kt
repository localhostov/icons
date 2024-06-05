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

public val Icons.Bold.Coins: ImageVector
    get() {
        if (_coins != null) {
            return _coins!!
        }
        _coins = Builder(name = "Coins", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 0.0f)
                curveToRelative(-4.276f, 0.0f, -7.5f, 1.935f, -7.5f, 4.5f)
                curveToRelative(0.0f, 0.2f, 0.02f, 0.397f, 0.058f, 0.589f)
                curveToRelative(-0.5f, -0.059f, -1.021f, -0.089f, -1.558f, -0.089f)
                curveTo(3.224f, 5.0f, 0.0f, 6.935f, 0.0f, 9.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.565f, 3.224f, 4.5f, 7.5f, 4.5f)
                reflectiveCurveToRelative(7.5f, -1.935f, 7.5f, -4.5f)
                verticalLineToRelative(-0.585f)
                curveToRelative(0.491f, 0.056f, 0.994f, 0.085f, 1.5f, 0.085f)
                curveToRelative(4.276f, 0.0f, 7.5f, -1.935f, 7.5f, -4.5f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -2.565f, -3.224f, -4.5f, -7.5f, -4.5f)
                close()
                moveTo(16.5f, 3.0f)
                curveToRelative(2.904f, 0.0f, 4.5f, 1.126f, 4.5f, 1.5f)
                reflectiveCurveToRelative(-1.596f, 1.5f, -4.5f, 1.5f)
                reflectiveCurveToRelative(-4.5f, -1.126f, -4.5f, -1.5f)
                reflectiveCurveToRelative(1.596f, -1.5f, 4.5f, -1.5f)
                close()
                moveTo(7.5f, 8.0f)
                curveToRelative(2.904f, 0.0f, 4.5f, 1.126f, 4.5f, 1.5f)
                reflectiveCurveToRelative(-1.596f, 1.5f, -4.5f, 1.5f)
                reflectiveCurveToRelative(-4.5f, -1.126f, -4.5f, -1.5f)
                reflectiveCurveToRelative(1.596f, -1.5f, 4.5f, -1.5f)
                close()
                moveTo(3.0f, 13.149f)
                curveToRelative(1.237f, 0.539f, 2.784f, 0.851f, 4.5f, 0.851f)
                reflectiveCurveToRelative(3.263f, -0.312f, 4.5f, -0.851f)
                verticalLineToRelative(1.351f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                reflectiveCurveToRelative(-4.5f, -1.126f, -4.5f, -1.5f)
                verticalLineToRelative(-1.351f)
                close()
                moveTo(7.5f, 21.0f)
                curveToRelative(-2.904f, 0.0f, -4.5f, -1.126f, -4.5f, -1.5f)
                verticalLineToRelative(-1.351f)
                curveToRelative(1.237f, 0.539f, 2.784f, 0.851f, 4.5f, 0.851f)
                reflectiveCurveToRelative(3.263f, -0.312f, 4.5f, -0.851f)
                verticalLineToRelative(1.351f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                close()
                moveTo(16.5f, 16.0f)
                curveToRelative(-0.513f, 0.0f, -1.018f, -0.037f, -1.5f, -0.109f)
                verticalLineToRelative(-1.976f)
                curveToRelative(0.491f, 0.056f, 0.994f, 0.085f, 1.5f, 0.085f)
                curveToRelative(1.716f, 0.0f, 3.263f, -0.312f, 4.5f, -0.851f)
                verticalLineToRelative(1.351f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                close()
                moveTo(16.5f, 11.0f)
                curveToRelative(-0.513f, 0.0f, -1.018f, -0.037f, -1.5f, -0.109f)
                verticalLineToRelative(-1.391f)
                curveToRelative(0.0f, -0.2f, -0.02f, -0.397f, -0.058f, -0.589f)
                curveToRelative(0.5f, 0.059f, 1.021f, 0.089f, 1.558f, 0.089f)
                curveToRelative(1.716f, 0.0f, 3.263f, -0.312f, 4.5f, -0.851f)
                verticalLineToRelative(1.351f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                close()
            }
        }
        .build()
        return _coins!!
    }

private var _coins: ImageVector? = null

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

public val Icons.Bold.CoinUpArrow: ImageVector
    get() {
        if (_coinUpArrow != null) {
            return _coinUpArrow!!
        }
        _coinUpArrow = Builder(name = "CoinUpArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 0.0f)
                curveToRelative(-4.275f, 0.0f, -7.5f, 1.935f, -7.5f, 4.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.351f)
                curveToRelative(1.237f, 0.539f, 2.784f, 0.851f, 4.5f, 0.851f)
                reflectiveCurveToRelative(3.263f, -0.312f, 4.5f, -0.851f)
                verticalLineToRelative(1.351f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                curveToRelative(-0.298f, 0.0f, -0.59f, -0.012f, -0.874f, -0.036f)
                curveToRelative(-0.829f, -0.074f, -1.551f, 0.544f, -1.621f, 1.369f)
                curveToRelative(-0.069f, 0.825f, 0.544f, 1.551f, 1.369f, 1.62f)
                curveToRelative(0.366f, 0.031f, 0.742f, 0.047f, 1.126f, 0.047f)
                curveToRelative(1.716f, 0.0f, 3.263f, -0.312f, 4.5f, -0.851f)
                verticalLineToRelative(1.351f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(1.716f, 0.0f, 3.263f, -0.312f, 4.5f, -0.851f)
                verticalLineToRelative(1.351f)
                curveToRelative(0.0f, 0.374f, -1.596f, 1.5f, -4.5f, 1.5f)
                curveToRelative(-0.298f, 0.0f, -0.59f, -0.012f, -0.874f, -0.036f)
                curveToRelative(-0.829f, -0.076f, -1.551f, 0.544f, -1.621f, 1.369f)
                curveToRelative(-0.069f, 0.825f, 0.544f, 1.551f, 1.369f, 1.62f)
                curveToRelative(0.366f, 0.031f, 0.742f, 0.047f, 1.126f, 0.047f)
                curveToRelative(4.275f, 0.0f, 7.5f, -1.935f, 7.5f, -4.5f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -2.565f, -3.225f, -4.5f, -7.5f, -4.5f)
                close()
                moveTo(16.5f, 6.0f)
                curveToRelative(-2.904f, 0.0f, -4.5f, -1.126f, -4.5f, -1.5f)
                reflectiveCurveToRelative(1.596f, -1.5f, 4.5f, -1.5f)
                reflectiveCurveToRelative(4.5f, 1.126f, 4.5f, 1.5f)
                reflectiveCurveToRelative(-1.596f, 1.5f, -4.5f, 1.5f)
                close()
                moveTo(6.5f, 11.0f)
                curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(9.563f, 17.999f)
                horizontalLineToRelative(-1.563f)
                verticalLineToRelative(2.501f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.501f)
                horizontalLineToRelative(-1.563f)
                curveToRelative(-0.863f, 0.0f, -1.295f, -1.043f, -0.685f, -1.653f)
                lineToRelative(3.063f, -3.063f)
                curveToRelative(0.378f, -0.378f, 0.991f, -0.378f, 1.369f, 0.0f)
                lineToRelative(3.063f, 3.063f)
                curveToRelative(0.61f, 0.61f, 0.178f, 1.653f, -0.685f, 1.653f)
                close()
            }
        }
        .build()
        return _coinUpArrow!!
    }

private var _coinUpArrow: ImageVector? = null

package me.localx.icons.straight.outline

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

public val Icons.Outline.MapPoint: ImageVector
    get() {
        if (_mapPoint != null) {
            return _mapPoint!!
        }
        _mapPoint = Builder(name = "MapPoint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.994f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.465f, -3.536f)
                curveToRelative(-0.945f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.592f, 0.52f, -3.535f, 1.464f)
                curveToRelative(-0.944f, 0.944f, -1.465f, 2.2f, -1.465f, 3.536f)
                reflectiveCurveToRelative(0.523f, 2.595f, 1.48f, 3.551f)
                lineToRelative(3.52f, 3.442f)
                close()
                moveTo(9.879f, 2.878f)
                curveToRelative(0.565f, -0.566f, 1.319f, -0.878f, 2.121f, -0.878f)
                reflectiveCurveToRelative(1.555f, 0.312f, 2.121f, 0.879f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.319f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.312f, 1.555f, -0.871f, 2.114f)
                lineToRelative(-2.129f, 2.082f)
                lineToRelative(-2.113f, -2.067f)
                curveToRelative(-0.572f, -0.571f, -0.887f, -1.327f, -0.887f, -2.129f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.879f, -2.122f)
                close()
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-0.212f, 0.715f, -0.549f, 1.385f, -0.979f, 2.0f)
                horizontalLineToRelative(4.27f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.086f)
                lineToRelative(-3.707f, -3.707f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(4.293f, 4.293f)
                horizontalLineToRelative(3.914f)
                verticalLineToRelative(3.0f)
                lineTo(10.0f, 21.0f)
                verticalLineToRelative(-3.414f)
                lineToRelative(-4.586f, -4.586f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-4.0f)
                lineTo(6.274f, 9.0f)
                curveToRelative(-0.432f, -0.618f, -0.77f, -1.287f, -0.982f, -2.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                lineTo(22.0f, 23.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(3.414f, 3.414f)
                verticalLineToRelative(2.586f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(10.5f, 5.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _mapPoint!!
    }

private var _mapPoint: ImageVector? = null

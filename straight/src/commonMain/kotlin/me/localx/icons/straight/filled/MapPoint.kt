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

public val Icons.Filled.MapPoint: ImageVector
    get() {
        if (_mapPoint != null) {
            return _mapPoint!!
        }
        _mapPoint = Builder(name = "MapPoint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.535f, 1.464f)
                curveToRelative(-0.945f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.592f, 0.52f, -3.535f, 1.464f)
                curveToRelative(-0.944f, 0.944f, -1.465f, 2.2f, -1.465f, 3.536f)
                reflectiveCurveToRelative(0.523f, 2.595f, 1.48f, 3.551f)
                lineToRelative(3.52f, 3.442f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.465f, -3.536f)
                close()
                moveTo(12.0f, 6.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-0.327f, 1.103f, -0.924f, 2.114f, -1.76f, 2.95f)
                lineToRelative(-2.065f, 2.02f)
                lineToRelative(4.03f, 4.03f)
                horizontalLineToRelative(3.086f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.914f)
                lineToRelative(-4.632f, -4.632f)
                lineToRelative(-1.454f, 1.423f)
                lineToRelative(-4.918f, -4.81f)
                curveToRelative(-0.854f, -0.852f, -1.459f, -1.873f, -1.79f, -2.981f)
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
                moveTo(10.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.586f)
                lineToRelative(-3.414f, -3.414f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.414f)
                lineToRelative(4.586f, 4.586f)
                verticalLineToRelative(3.414f)
                close()
            }
        }
        .build()
        return _mapPoint!!
    }

private var _mapPoint: ImageVector? = null

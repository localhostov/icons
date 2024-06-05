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

public val Icons.Filled.Track: ImageVector
    get() {
        if (_track != null) {
            return _track!!
        }
        _track = Builder(name = "Track", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 11.994f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.122f, 0.0f, -7.071f)
                curveToRelative(-0.944f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.591f, 0.52f, -3.536f, 1.464f)
                curveToRelative(-1.949f, 1.95f, -1.949f, 5.122f, 0.008f, 7.079f)
                lineToRelative(3.528f, 3.45f)
                close()
                moveTo(4.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(12.5f, 14.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(24.0f, 19.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                lineTo(5.874f, 23.0f)
                curveToRelative(0.082f, -0.32f, 0.126f, -0.655f, 0.126f, -1.0f)
                reflectiveCurveToRelative(-0.044f, -0.68f, -0.126f, -1.0f)
                horizontalLineToRelative(14.126f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.626f)
                curveToRelative(0.082f, -0.32f, 0.126f, -0.655f, 0.126f, -1.0f)
                reflectiveCurveToRelative(-0.044f, -0.68f, -0.126f, -1.0f)
                horizontalLineToRelative(3.626f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(2.0f, 13.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(7.26f)
                curveToRelative(0.237f, 0.342f, 0.508f, 0.668f, 0.814f, 0.973f)
                lineToRelative(1.05f, 1.027f)
                lineTo(6.0f, 11.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.626f)
                curveToRelative(-0.082f, 0.32f, -0.126f, 0.655f, -0.126f, 1.0f)
                reflectiveCurveToRelative(0.044f, 0.68f, 0.126f, 1.0f)
                horizontalLineToRelative(-2.626f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _track!!
    }

private var _track: ImageVector? = null

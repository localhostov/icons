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

public val Icons.Filled.PigFace: ImageVector
    get() {
        if (_pigFace != null) {
            return _pigFace!!
        }
        _pigFace = Builder(name = "PigFace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 16.5f)
                curveToRelative(0.0f, 0.813f, -0.916f, 1.5f, -2.0f, 1.5f)
                reflectiveCurveToRelative(-2.0f, -0.687f, -2.0f, -1.5f)
                reflectiveCurveToRelative(0.916f, -1.5f, 2.0f, -1.5f)
                reflectiveCurveToRelative(2.0f, 0.687f, 2.0f, 1.5f)
                close()
                moveTo(23.0f, 13.0f)
                curveToRelative(0.0f, 6.065f, -4.935f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 19.065f, 1.0f, 13.0f)
                reflectiveCurveTo(5.935f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(11.0f, 4.935f, 11.0f, 11.0f)
                close()
                moveTo(8.5f, 12.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(16.0f, 16.5f)
                curveToRelative(0.0f, -1.93f, -1.794f, -3.5f, -4.0f, -3.5f)
                reflectiveCurveToRelative(-4.0f, 1.57f, -4.0f, 3.5f)
                reflectiveCurveToRelative(1.794f, 3.5f, 4.0f, 3.5f)
                reflectiveCurveToRelative(4.0f, -1.57f, 4.0f, -3.5f)
                close()
                moveTo(17.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(7.308f, 0.876f)
                curveTo(5.573f, 0.0f, 3.461f, 0.0f, 1.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.124f, 0.015f, 2.392f, 0.99f, 5.094f)
                curveTo(2.471f, 3.742f, 4.684f, 1.895f, 7.308f, 0.876f)
                close()
                moveTo(23.01f, 6.094f)
                curveToRelative(0.975f, -2.702f, 0.99f, -4.971f, 0.99f, -5.094f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.461f, 0.0f, -4.573f, 0.0f, -6.308f, 0.876f)
                curveToRelative(2.623f, 1.019f, 4.837f, 2.866f, 6.318f, 5.218f)
                close()
            }
        }
        .build()
        return _pigFace!!
    }

private var _pigFace: ImageVector? = null

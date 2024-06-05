package me.localx.icons.rounded.filled

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
                moveTo(0.961f, 6.132f)
                curveTo(2.433f, 3.77f, 4.642f, 1.915f, 7.266f, 0.889f)
                curveTo(5.805f, 0.167f, 4.15f, 0.047f, 2.621f, 0.013f)
                curveTo(1.882f, -0.001f, 1.145f, 0.311f, 0.649f, 0.877f)
                curveTo(0.161f, 1.437f, -0.053f, 2.179f, 0.062f, 2.913f)
                curveToRelative(0.09f, 0.573f, 0.327f, 1.757f, 0.898f, 3.219f)
                close()
                moveTo(23.057f, 6.16f)
                curveToRelative(0.471f, -1.138f, 0.809f, -2.264f, 0.965f, -3.247f)
                curveToRelative(0.115f, -0.735f, -0.1f, -1.477f, -0.589f, -2.036f)
                curveToRelative(-0.495f, -0.566f, -1.213f, -0.881f, -1.97f, -0.864f)
                curveToRelative(-1.558f, 0.035f, -3.241f, 0.156f, -4.72f, 0.88f)
                curveToRelative(2.63f, 1.031f, 4.843f, 2.895f, 6.314f, 5.267f)
                close()
            }
        }
        .build()
        return _pigFace!!
    }

private var _pigFace: ImageVector? = null

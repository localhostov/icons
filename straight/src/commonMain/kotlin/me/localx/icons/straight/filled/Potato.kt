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

public val Icons.Filled.Potato: ImageVector
    get() {
        if (_potato != null) {
            return _potato!!
        }
        _potato = Builder(name = "Potato", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.568f, 1.105f)
                curveToRelative(-2.353f, -1.502f, -5.394f, -1.492f, -7.747f, 0.022f)
                curveToRelative(-1.086f, 0.698f, -1.936f, 1.614f, -2.524f, 2.72f)
                curveToRelative(-0.762f, 1.427f, -1.898f, 2.358f, -3.201f, 2.621f)
                curveToRelative(-2.438f, 0.493f, -4.504f, 1.947f, -5.817f, 4.096f)
                curveToRelative(-2.126f, 3.481f, -1.533f, 8.075f, 1.41f, 10.925f)
                curveToRelative(1.667f, 1.614f, 3.861f, 2.504f, 6.177f, 2.504f)
                curveToRelative(8.2f, 0.0f, 15.128f, -7.648f, 15.128f, -16.703f)
                curveToRelative(0.0f, -2.504f, -1.28f, -4.816f, -3.425f, -6.186f)
                close()
                moveTo(7.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 15.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _potato!!
    }

private var _potato: ImageVector? = null

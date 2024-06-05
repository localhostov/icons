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

public val Icons.Outline.Potato: ImageVector
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
                moveTo(8.865f, 21.993f)
                curveToRelative(-1.794f, 0.0f, -3.493f, -0.689f, -4.786f, -1.941f)
                curveToRelative(-2.276f, -2.204f, -2.736f, -5.756f, -1.094f, -8.445f)
                curveToRelative(1.02f, -1.668f, 2.62f, -2.797f, 4.507f, -3.179f)
                curveToRelative(1.898f, -0.383f, 3.521f, -1.676f, 4.569f, -3.64f)
                curveToRelative(0.427f, -0.801f, 1.046f, -1.467f, 1.842f, -1.979f)
                curveToRelative(0.843f, -0.542f, 1.829f, -0.813f, 2.814f, -0.813f)
                curveToRelative(0.974f, 0.0f, 1.945f, 0.265f, 2.774f, 0.794f)
                curveToRelative(1.589f, 1.015f, 2.501f, 2.655f, 2.501f, 4.5f)
                curveToRelative(0.0f, 7.969f, -6.012f, 14.703f, -13.128f, 14.703f)
                close()
                moveTo(18.0f, 7.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(9.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(18.0f, 13.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _potato!!
    }

private var _potato: ImageVector? = null

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

public val Icons.Filled.HandHoldingMagic: ImageVector
    get() {
        if (_handHoldingMagic != null) {
            return _handHoldingMagic!!
        }
        _handHoldingMagic = Builder(name = "HandHoldingMagic", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.451f, 10.0f)
                curveToRelative(1.517f, -0.89f, 2.549f, -2.38f, 2.549f, -4.0f)
                curveToRelative(0.0f, -2.0f, -2.047f, -2.961f, -3.5f, -2.992f)
                curveToRelative(-1.212f, -0.025f, -3.5f, -0.008f, -3.5f, 1.992f)
                curveToRelative(0.0f, 0.842f, 0.906f, 1.5f, 2.0f, 1.5f)
                curveToRelative(1.0f, 0.0f, 2.067f, -0.398f, 2.451f, -1.5f)
                curveToRelative(0.144f, 0.589f, -0.451f, 3.027f, -3.451f, 3.027f)
                reflectiveCurveToRelative(-3.976f, -1.991f, -4.0f, -3.527f)
                curveToRelative(-0.024f, -1.627f, 1.023f, -3.326f, 3.011f, -3.942f)
                curveToRelative(3.371f, -1.493f, 8.988f, 0.205f, 8.988f, 4.442f)
                curveToRelative(0.0f, 3.0f, -2.309f, 4.798f, -4.549f, 5.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(23.338f, 12.345f)
                lineToRelative(-10.674f, 11.655f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.787f)
                curveToRelative(1.22f, 0.0f, 2.213f, 0.993f, 2.213f, 2.213f)
                curveToRelative(0.0f, 1.094f, -0.816f, 2.036f, -1.9f, 2.191f)
                lineToRelative(-4.241f, 0.606f)
                lineToRelative(0.283f, 1.979f)
                lineToRelative(4.241f, -0.606f)
                curveToRelative(2.062f, -0.294f, 3.617f, -2.087f, 3.617f, -4.17f)
                curveToRelative(0.0f, -0.219f, -0.032f, -0.429f, -0.065f, -0.638f)
                lineToRelative(3.541f, -3.737f)
                curveToRelative(0.455f, -0.5f, 1.097f, -0.803f, 1.794f, -0.835f)
                curveToRelative(0.692f, -0.034f, 1.363f, 0.209f, 1.878f, 0.678f)
                curveToRelative(1.052f, 0.958f, 1.138f, 2.602f, 0.189f, 3.665f)
                close()
            }
        }
        .build()
        return _handHoldingMagic!!
    }

private var _handHoldingMagic: ImageVector? = null

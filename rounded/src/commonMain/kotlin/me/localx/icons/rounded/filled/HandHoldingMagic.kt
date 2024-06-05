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
                moveToRelative(15.0f, 4.974f)
                curveToRelative(0.0f, 2.385f, -1.459f, 4.01f, -3.183f, 4.678f)
                curveToRelative(-0.292f, 0.113f, -0.531f, -0.258f, -0.304f, -0.473f)
                curveToRelative(0.916f, -0.868f, 1.486f, -2.0f, 1.486f, -3.205f)
                curveToRelative(0.0f, -2.0f, -2.047f, -2.961f, -3.5f, -2.992f)
                curveToRelative(-1.212f, -0.025f, -3.5f, -0.008f, -3.5f, 1.992f)
                curveToRelative(0.0f, 0.842f, 0.906f, 1.5f, 2.0f, 1.5f)
                curveToRelative(0.583f, 0.0f, 1.188f, -0.135f, 1.668f, -0.466f)
                curveToRelative(0.262f, -0.181f, 0.595f, 0.113f, 0.438f, 0.39f)
                curveToRelative(-0.451f, 0.797f, -1.381f, 1.604f, -3.106f, 1.604f)
                curveToRelative(-3.0f, 0.0f, -3.976f, -1.991f, -4.0f, -3.527f)
                curveToRelative(-0.024f, -1.627f, 1.023f, -3.326f, 3.011f, -3.942f)
                curveToRelative(3.371f, -1.493f, 8.988f, 0.205f, 8.988f, 4.442f)
                close()
                moveTo(23.338f, 12.345f)
                lineToRelative(-7.702f, 8.409f)
                curveToRelative(-1.894f, 2.068f, -4.57f, 3.246f, -7.374f, 3.246f)
                horizontalLineToRelative(-4.262f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(7.787f)
                curveToRelative(1.374f, 0.0f, 2.46f, 1.26f, 2.164f, 2.685f)
                curveToRelative(-0.193f, 0.926f, -1.004f, 1.598f, -1.94f, 1.732f)
                lineToRelative(-4.162f, 0.583f)
                curveToRelative(-0.547f, 0.078f, -0.927f, 0.585f, -0.848f, 1.131f)
                curveToRelative(0.078f, 0.547f, 0.585f, 0.926f, 1.131f, 0.848f)
                lineToRelative(4.252f, -0.596f)
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

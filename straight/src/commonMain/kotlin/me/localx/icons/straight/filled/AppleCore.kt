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

public val Icons.Filled.AppleCore: ImageVector
    get() {
        if (_appleCore != null) {
            return _appleCore!!
        }
        _appleCore = Builder(name = "AppleCore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.004f, 5.996f)
                reflectiveCurveToRelative(-0.158f, -2.861f, 1.51f, -4.529f)
                reflectiveCurveTo(20.992f, 0.008f, 20.992f, 0.008f)
                curveToRelative(0.0f, 0.0f, 0.209f, 2.81f, -1.459f, 4.478f)
                curveToRelative(-1.668f, 1.668f, -4.529f, 1.51f, -4.529f, 1.51f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(0.0f, -2.978f, 1.379f, -5.616f, 3.491f, -7.255f)
                curveToRelative(-0.344f, -0.265f, -0.702f, -0.51f, -1.082f, -0.719f)
                curveToRelative(-1.65f, 0.87f, -3.424f, 0.975f, -4.178f, 0.975f)
                curveToRelative(-0.103f, 0.0f, -1.321f, 0.0f, -2.231f, 0.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.862f, -0.943f, -4.466f, -1.568f, -5.527f)
                curveToRelative(-0.088f, -0.149f, -0.17f, -0.288f, -0.242f, -0.42f)
                lineToRelative(-1.756f, 0.958f)
                curveToRelative(0.082f, 0.149f, 0.174f, 0.308f, 0.274f, 0.477f)
                curveToRelative(0.575f, 0.978f, 1.292f, 2.195f, 1.292f, 4.513f)
                verticalLineToRelative(0.409f)
                curveToRelative(-0.809f, -0.264f, -1.652f, -0.409f, -2.5f, -0.409f)
                curveToRelative(-1.874f, 0.0f, -3.602f, 0.653f, -5.009f, 1.745f)
                curveToRelative(2.121f, 1.635f, 3.509f, 4.27f, 3.509f, 7.255f)
                reflectiveCurveToRelative(-1.383f, 5.624f, -3.5f, 7.262f)
                curveToRelative(1.405f, 1.088f, 3.13f, 1.738f, 5.0f, 1.738f)
                curveToRelative(1.204f, 0.0f, 2.403f, -0.275f, 3.5f, -0.8f)
                curveToRelative(1.097f, 0.525f, 2.296f, 0.8f, 3.5f, 0.8f)
                curveToRelative(1.87f, 0.0f, 3.595f, -0.65f, 5.0f, -1.738f)
                curveToRelative(-2.117f, -1.639f, -3.5f, -4.279f, -3.5f, -7.262f)
                close()
            }
        }
        .build()
        return _appleCore!!
    }

private var _appleCore: ImageVector? = null

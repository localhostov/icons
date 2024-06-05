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

public val Icons.Filled.DiamondTurnRight: ImageVector
    get() {
        if (_diamondTurnRight != null) {
            return _diamondTurnRight!!
        }
        _diamondTurnRight = Builder(name = "DiamondTurnRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.833f, 8.872f)
                lineTo(13.839f, 0.877f)
                curveToRelative(-1.171f, -1.171f, -3.071f, -1.171f, -4.242f, 0.0f)
                lineTo(1.651f, 8.823f)
                curveToRelative(-0.345f, 0.345f, -0.638f, 0.753f, -0.782f, 1.22f)
                curveToRelative(-0.35f, 1.136f, -0.054f, 2.285f, 0.733f, 3.071f)
                lineToRelative(10.115f, 10.116f)
                lineToRelative(10.062f, -10.062f)
                curveToRelative(0.345f, -0.345f, 0.638f, -0.751f, 0.783f, -1.217f)
                curveToRelative(0.355f, -1.137f, 0.059f, -2.29f, -0.73f, -3.08f)
                close()
                moveTo(17.464f, 11.292f)
                lineToRelative(-2.757f, 2.758f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.635f, -1.636f)
                horizontalLineToRelative(-3.928f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(5.586f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-3.585f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.928f)
                lineToRelative(-1.635f, -1.636f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.758f, 2.759f)
                curveToRelative(0.345f, 0.344f, 0.535f, 0.803f, 0.535f, 1.291f)
                reflectiveCurveToRelative(-0.19f, 0.947f, -0.536f, 1.292f)
                close()
            }
        }
        .build()
        return _diamondTurnRight!!
    }

private var _diamondTurnRight: ImageVector? = null

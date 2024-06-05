package me.localx.icons.rounded.bold

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

public val Icons.Bold.DiamondTurnRight: ImageVector
    get() {
        if (_diamondTurnRight != null) {
            return _diamondTurnRight!!
        }
        _diamondTurnRight = Builder(name = "DiamondTurnRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.449f, 8.256f)
                lineTo(15.744f, 1.551f)
                curveToRelative(-2.064f, -2.063f, -5.424f, -2.065f, -7.488f, 0.0f)
                lineTo(1.551f, 8.256f)
                curveToRelative(-2.063f, 2.064f, -2.063f, 5.424f, 0.0f, 7.488f)
                lineToRelative(6.705f, 6.705f)
                curveToRelative(1.032f, 1.032f, 2.388f, 1.548f, 3.744f, 1.548f)
                reflectiveCurveToRelative(2.712f, -0.516f, 3.744f, -1.548f)
                lineToRelative(6.705f, -6.705f)
                curveToRelative(2.063f, -2.064f, 2.063f, -5.424f, 0.0f, -7.488f)
                close()
                moveTo(20.328f, 13.623f)
                lineToRelative(-6.705f, 6.705f)
                curveToRelative(-0.895f, 0.895f, -2.352f, 0.895f, -3.246f, 0.0f)
                lineTo(3.672f, 13.623f)
                curveToRelative(-0.894f, -0.895f, -0.894f, -2.352f, 0.0f, -3.246f)
                lineTo(10.377f, 3.672f)
                curveToRelative(0.895f, -0.895f, 2.352f, -0.895f, 3.246f, 0.0f)
                lineToRelative(6.705f, 6.705f)
                curveToRelative(0.894f, 0.895f, 0.894f, 2.352f, 0.0f, 3.246f)
                close()
                moveTo(17.716f, 10.815f)
                curveToRelative(0.378f, 0.378f, 0.378f, 0.991f, 0.0f, 1.369f)
                lineToRelative(-3.063f, 3.063f)
                curveToRelative(-0.61f, 0.61f, -1.653f, 0.178f, -1.653f, -0.685f)
                verticalLineToRelative(-1.563f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.563f)
                curveToRelative(0.0f, -0.863f, 1.043f, -1.295f, 1.653f, -0.685f)
                lineToRelative(3.063f, 3.063f)
                close()
            }
        }
        .build()
        return _diamondTurnRight!!
    }

private var _diamondTurnRight: ImageVector? = null

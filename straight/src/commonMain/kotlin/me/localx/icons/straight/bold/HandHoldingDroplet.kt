package me.localx.icons.straight.bold

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

public val Icons.Bold.HandHoldingDroplet: ImageVector
    get() {
        if (_handHoldingDroplet != null) {
            return _handHoldingDroplet!!
        }
        _handHoldingDroplet = Builder(name = "HandHoldingDroplet", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.733f, 9.014f)
                curveToRelative(-0.766f, -0.698f, -1.752f, -1.055f, -2.795f, -1.01f)
                curveToRelative(-1.037f, 0.049f, -1.993f, 0.498f, -2.692f, 1.266f)
                lineToRelative(-2.438f, 2.68f)
                curveToRelative(-0.647f, -0.59f, -1.507f, -0.949f, -2.449f, -0.949f)
                lineTo(3.5f, 11.001f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11.181f)
                lineToRelative(8.333f, -9.531f)
                curveToRelative(1.411f, -1.581f, 1.284f, -4.028f, -0.281f, -5.455f)
                close()
                moveTo(20.766f, 12.483f)
                lineToRelative(-7.447f, 8.518f)
                lineTo(3.5f, 21.001f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.858f)
                curveToRelative(0.354f, 0.0f, 0.642f, 0.288f, 0.642f, 0.643f)
                curveToRelative(0.0f, 0.317f, -0.237f, 0.591f, -0.551f, 0.635f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.424f, 2.971f)
                lineToRelative(5.16f, -0.737f)
                curveToRelative(1.619f, -0.231f, 2.876f, -1.53f, 3.094f, -3.115f)
                lineToRelative(3.498f, -3.844f)
                curveToRelative(0.159f, -0.175f, 0.376f, -0.277f, 0.612f, -0.288f)
                curveToRelative(0.233f, -0.017f, 0.46f, 0.07f, 0.635f, 0.229f)
                curveToRelative(0.356f, 0.325f, 0.385f, 0.881f, 0.054f, 1.252f)
                close()
                moveTo(4.979f, 5.625f)
                curveToRelative(0.0f, -2.25f, 3.51f, -5.625f, 3.51f, -5.625f)
                curveToRelative(0.0f, 0.0f, 3.51f, 3.375f, 3.51f, 5.625f)
                curveToRelative(0.0f, 1.864f, -1.572f, 3.375f, -3.51f, 3.375f)
                reflectiveCurveToRelative(-3.51f, -1.511f, -3.51f, -3.375f)
                close()
            }
        }
        .build()
        return _handHoldingDroplet!!
    }

private var _handHoldingDroplet: ImageVector? = null

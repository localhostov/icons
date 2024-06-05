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

public val Icons.Bold.HandHoldingWater: ImageVector
    get() {
        if (_handHoldingWater != null) {
            return _handHoldingWater!!
        }
        _handHoldingWater = Builder(name = "HandHoldingWater", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.733f, 9.014f)
                curveToRelative(-0.766f, -0.698f, -1.755f, -1.058f, -2.795f, -1.01f)
                curveToRelative(-1.037f, 0.049f, -1.993f, 0.498f, -2.692f, 1.266f)
                lineToRelative(-2.438f, 2.68f)
                curveToRelative(-0.647f, -0.59f, -1.507f, -0.949f, -2.449f, -0.949f)
                lineTo(3.5f, 11.001f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(14.681f, 24.001f)
                lineToRelative(8.333f, -9.531f)
                curveToRelative(1.411f, -1.581f, 1.284f, -4.028f, -0.281f, -5.455f)
                close()
                moveTo(20.766f, 12.483f)
                lineToRelative(-7.447f, 8.518f)
                lineTo(3.5f, 21.001f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                lineTo(12.358f, 14.001f)
                curveToRelative(0.354f, 0.0f, 0.642f, 0.288f, 0.642f, 0.643f)
                curveToRelative(0.0f, 0.317f, -0.237f, 0.591f, -0.551f, 0.635f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.424f, 2.971f)
                lineToRelative(5.16f, -0.737f)
                curveToRelative(1.619f, -0.231f, 2.876f, -1.53f, 3.094f, -3.115f)
                lineToRelative(3.498f, -3.844f)
                curveToRelative(0.159f, -0.175f, 0.376f, -0.277f, 0.612f, -0.288f)
                curveToRelative(0.23f, -0.018f, 0.46f, 0.07f, 0.635f, 0.229f)
                curveToRelative(0.356f, 0.325f, 0.385f, 0.881f, 0.054f, 1.252f)
                close()
                moveTo(6.025f, 7.972f)
                curveToRelative(-0.681f, -0.681f, -1.022f, -1.576f, -1.023f, -2.472f)
                curveToRelative(0.0f, -0.898f, 0.421f, -1.788f, 1.024f, -2.479f)
                lineTo(8.5f, 0.0f)
                lineToRelative(2.467f, 3.014f)
                curveToRelative(0.706f, 0.823f, 1.031f, 1.587f, 1.031f, 2.486f)
                curveToRelative(0.0f, 0.896f, -0.341f, 1.79f, -1.022f, 2.472f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.661f, 0.661f, -1.54f, 1.025f, -2.475f, 1.025f)
                reflectiveCurveToRelative(-1.814f, -0.364f, -2.475f, -1.025f)
                close()
            }
        }
        .build()
        return _handHoldingWater!!
    }

private var _handHoldingWater: ImageVector? = null

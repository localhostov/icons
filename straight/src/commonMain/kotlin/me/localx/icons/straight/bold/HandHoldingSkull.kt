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

public val Icons.Bold.HandHoldingSkull: ImageVector
    get() {
        if (_handHoldingSkull != null) {
            return _handHoldingSkull!!
        }
        _handHoldingSkull = Builder(name = "HandHoldingSkull", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(22.732f, 9.013f)
                curveToRelative(-0.768f, -0.699f, -1.765f, -1.052f, -2.797f, -1.008f)
                curveToRelative(-1.036f, 0.048f, -1.991f, 0.498f, -2.69f, 1.265f)
                lineToRelative(-2.438f, 2.679f)
                curveToRelative(-0.646f, -0.589f, -1.507f, -0.949f, -2.449f, -0.949f)
                lineTo(3.5f, 11.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(14.681f, 24.0f)
                lineToRelative(8.334f, -9.532f)
                curveToRelative(1.41f, -1.581f, 1.283f, -4.027f, -0.282f, -5.455f)
                close()
                moveTo(20.766f, 12.482f)
                lineToRelative(-7.447f, 8.518f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(12.357f, 14.0f)
                curveToRelative(0.354f, 0.0f, 0.643f, 0.288f, 0.643f, 0.642f)
                curveToRelative(0.0f, 0.317f, -0.237f, 0.591f, -0.551f, 0.636f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.424f, 2.97f)
                lineToRelative(5.162f, -0.737f)
                curveToRelative(1.618f, -0.231f, 2.875f, -1.531f, 3.093f, -3.115f)
                lineToRelative(3.497f, -3.843f)
                curveToRelative(0.159f, -0.175f, 0.376f, -0.277f, 0.612f, -0.288f)
                curveToRelative(0.231f, -0.006f, 0.463f, 0.071f, 0.636f, 0.229f)
                curveToRelative(0.356f, 0.325f, 0.385f, 0.881f, 0.055f, 1.252f)
                close()
            }
        }
        .build()
        return _handHoldingSkull!!
    }

private var _handHoldingSkull: ImageVector? = null

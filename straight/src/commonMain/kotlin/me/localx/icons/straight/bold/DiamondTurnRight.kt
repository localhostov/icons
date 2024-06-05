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
                moveTo(21.934f, 8.551f)
                lineTo(14.475f, 1.092f)
                curveToRelative(-1.365f, -1.365f, -3.584f, -1.365f, -4.949f, 0.0f)
                lineTo(2.066f, 8.551f)
                curveToRelative(-0.661f, 0.661f, -1.025f, 1.54f, -1.025f, 2.475f)
                reflectiveCurveToRelative(0.364f, 1.814f, 1.025f, 2.475f)
                lineToRelative(9.934f, 9.935f)
                lineToRelative(9.933f, -9.934f)
                curveToRelative(0.662f, -0.661f, 1.026f, -1.54f, 1.026f, -2.476f)
                reflectiveCurveToRelative(-0.364f, -1.813f, -1.025f, -2.475f)
                close()
                moveTo(19.813f, 11.379f)
                lineToRelative(-7.812f, 7.813f)
                lineToRelative(-7.813f, -7.814f)
                curveToRelative(-0.127f, -0.127f, -0.146f, -0.275f, -0.146f, -0.353f)
                reflectiveCurveToRelative(0.02f, -0.226f, 0.146f, -0.354f)
                lineTo(11.646f, 3.213f)
                curveToRelative(0.098f, -0.098f, 0.226f, -0.146f, 0.354f, -0.146f)
                reflectiveCurveToRelative(0.256f, 0.049f, 0.354f, 0.146f)
                lineToRelative(7.459f, 7.459f)
                curveToRelative(0.127f, 0.128f, 0.146f, 0.276f, 0.146f, 0.354f)
                reflectiveCurveToRelative(-0.019f, 0.226f, -0.146f, 0.354f)
                close()
                moveTo(8.001f, 12.5f)
                verticalLineToRelative(-0.002f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(16.159f, 9.652f)
                curveToRelative(0.456f, 0.456f, 0.456f, 1.194f, 0.0f, 1.65f)
                lineToRelative(-3.158f, 3.231f)
                verticalLineToRelative(-2.533f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                lineToRelative(-3.0f, -3.002f)
                curveToRelative(0.001f, -1.929f, 1.571f, -3.498f, 3.5f, -3.498f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.579f)
                lineToRelative(3.158f, 3.231f)
                close()
            }
        }
        .build()
        return _diamondTurnRight!!
    }

private var _diamondTurnRight: ImageVector? = null

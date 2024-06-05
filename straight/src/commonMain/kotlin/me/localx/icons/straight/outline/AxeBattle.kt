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

public val Icons.Outline.AxeBattle: ImageVector
    get() {
        if (_axeBattle != null) {
            return _axeBattle!!
        }
        _axeBattle = Builder(name = "AxeBattle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.391f, 1.007f)
                lineToRelative(-0.7f, -0.685f)
                lineToRelative(-0.7f, 0.685f)
                curveToRelative(-1.712f, 1.676f, -3.809f, 2.697f, -5.992f, 2.938f)
                verticalLineToRelative(-1.944f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.944f)
                curveToRelative(-2.183f, -0.24f, -4.28f, -1.262f, -5.992f, -2.938f)
                lineToRelative(-0.7f, -0.685f)
                lineToRelative(-0.7f, 0.685f)
                curveTo(1.383f, 3.187f, 0.0f, 6.634f, 0.0f, 10.004f)
                curveToRelative(0.0f, 3.298f, 1.349f, 6.588f, 3.609f, 8.8f)
                lineToRelative(0.7f, 0.685f)
                lineToRelative(0.7f, -0.685f)
                curveToRelative(1.614f, -1.58f, 3.713f, -2.54f, 5.992f, -2.757f)
                verticalLineToRelative(7.952f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.952f)
                curveToRelative(2.279f, 0.217f, 4.378f, 1.177f, 5.992f, 2.757f)
                lineToRelative(0.7f, 0.685f)
                lineToRelative(0.7f, -0.685f)
                curveToRelative(2.26f, -2.212f, 3.609f, -5.502f, 3.609f, -8.8f)
                curveToRelative(0.0f, -3.371f, -1.383f, -6.818f, -3.609f, -8.997f)
                close()
                moveTo(4.375f, 16.688f)
                curveToRelative(-1.5f, -1.805f, -2.375f, -4.238f, -2.375f, -6.684f)
                curveToRelative(0.0f, -2.47f, 0.914f, -5.065f, 2.376f, -6.872f)
                curveToRelative(1.943f, 1.63f, 4.239f, 2.608f, 6.624f, 2.822f)
                verticalLineToRelative(8.085f)
                curveToRelative(-2.459f, 0.196f, -4.756f, 1.114f, -6.625f, 2.648f)
                close()
                moveTo(19.624f, 16.688f)
                curveToRelative(-1.869f, -1.534f, -4.165f, -2.452f, -6.625f, -2.648f)
                lineTo(12.999f, 5.955f)
                curveToRelative(2.384f, -0.215f, 4.681f, -1.193f, 6.624f, -2.822f)
                curveToRelative(1.463f, 1.807f, 2.376f, 4.402f, 2.376f, 6.872f)
                curveToRelative(0.0f, 2.445f, -0.875f, 4.878f, -2.375f, 6.684f)
                close()
            }
        }
        .build()
        return _axeBattle!!
    }

private var _axeBattle: ImageVector? = null

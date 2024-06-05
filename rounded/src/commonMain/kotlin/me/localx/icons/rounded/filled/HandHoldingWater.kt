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

public val Icons.Filled.HandHoldingWater: ImageVector
    get() {
        if (_handHoldingWater != null) {
            return _handHoldingWater!!
        }
        _handHoldingWater = Builder(name = "HandHoldingWater", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 7.997f)
                curveToRelative(-0.935f, 0.0f, -1.814f, -0.364f, -2.475f, -1.025f)
                curveToRelative(-1.364f, -1.364f, -1.364f, -3.586f, 0.0f, -4.95f)
                lineTo(7.801f, 0.285f)
                curveToRelative(0.389f, -0.381f, 1.01f, -0.381f, 1.398f, 0.0f)
                lineToRelative(1.768f, 1.729f)
                curveToRelative(1.373f, 1.372f, 1.373f, 3.593f, 0.008f, 4.958f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.661f, 0.661f, -1.54f, 1.025f, -2.475f, 1.025f)
                close()
                moveTo(23.152f, 8.681f)
                curveToRelative(-0.515f, -0.469f, -1.186f, -0.712f, -1.878f, -0.678f)
                curveToRelative(-0.697f, 0.032f, -1.339f, 0.334f, -1.794f, 0.835f)
                lineToRelative(-3.541f, 3.737f)
                curveToRelative(0.032f, 0.21f, 0.065f, 0.42f, 0.065f, 0.638f)
                curveToRelative(0.0f, 2.083f, -1.555f, 3.876f, -3.617f, 4.17f)
                lineToRelative(-4.252f, 0.596f)
                curveToRelative(-0.547f, 0.078f, -1.053f, -0.302f, -1.131f, -0.848f)
                curveToRelative(-0.078f, -0.547f, 0.302f, -1.053f, 0.848f, -1.131f)
                lineToRelative(4.162f, -0.583f)
                curveToRelative(0.936f, -0.134f, 1.748f, -0.806f, 1.94f, -1.732f)
                curveToRelative(0.296f, -1.425f, -0.79f, -2.685f, -2.164f, -2.685f)
                lineTo(4.003f, 11.0f)
                curveTo(1.794f, 11.0f, 0.003f, 12.791f, 0.003f, 15.0f)
                verticalLineToRelative(5.0f)
                curveTo(0.003f, 22.209f, 1.794f, 24.0f, 4.003f, 24.0f)
                horizontalLineToRelative(4.262f)
                curveToRelative(2.805f, 0.0f, 5.48f, -1.178f, 7.374f, -3.246f)
                lineToRelative(7.702f, -8.409f)
                curveToRelative(0.948f, -1.062f, 0.862f, -2.707f, -0.189f, -3.665f)
                close()
            }
        }
        .build()
        return _handHoldingWater!!
    }

private var _handHoldingWater: ImageVector? = null

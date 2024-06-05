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

public val Icons.Filled.HandHoldingDroplet: ImageVector
    get() {
        if (_handHoldingDroplet != null) {
            return _handHoldingDroplet!!
        }
        _handHoldingDroplet = Builder(name = "HandHoldingDroplet", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 8.96f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.742f, -4.0f, -3.884f)
                curveToRelative(0.0f, -1.163f, 0.73f, -2.59f, 2.171f, -4.242f)
                curveToRelative(0.923f, -1.061f, 2.735f, -1.062f, 3.659f, 0.0f)
                curveToRelative(1.44f, 1.651f, 2.17f, 3.078f, 2.17f, 4.241f)
                curveToRelative(0.0f, 2.142f, -1.794f, 3.884f, -4.0f, 3.884f)
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
                horizontalLineToRelative(-7.787f)
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
        return _handHoldingDroplet!!
    }

private var _handHoldingDroplet: ImageVector? = null

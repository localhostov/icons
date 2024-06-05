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

public val Icons.Outline.FireSmoke: ImageVector
    get() {
        if (_fireSmoke != null) {
            return _fireSmoke!!
        }
        _fireSmoke = Builder(name = "FireSmoke", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 24.0f)
                horizontalLineTo(4.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                curveToRelative(0.0f, -2.249f, 1.612f, -4.09f, 3.771f, -4.435f)
                curveToRelative(1.054f, -1.88f, 3.046f, -3.065f, 5.229f, -3.065f)
                curveToRelative(1.059f, 0.0f, 2.083f, 0.282f, 3.0f, 0.822f)
                curveToRelative(0.917f, -0.54f, 1.942f, -0.822f, 3.0f, -0.822f)
                curveToRelative(2.183f, 0.0f, 4.175f, 1.185f, 5.229f, 3.065f)
                curveToRelative(2.158f, 0.345f, 3.771f, 2.186f, 3.771f, 4.435f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(9.0f, 14.0f)
                curveToRelative(-1.59f, 0.0f, -3.028f, 0.945f, -3.665f, 2.407f)
                lineToRelative(-0.255f, 0.585f)
                lineToRelative(-0.638f, 0.015f)
                curveToRelative(-1.369f, 0.033f, -2.442f, 1.127f, -2.442f, 2.492f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.365f, -1.072f, -2.459f, -2.441f, -2.492f)
                lineToRelative(-0.638f, -0.015f)
                lineToRelative(-0.255f, -0.585f)
                curveToRelative(-0.637f, -1.462f, -2.075f, -2.407f, -3.666f, -2.407f)
                curveToRelative(-0.858f, 0.0f, -1.687f, 0.284f, -2.397f, 0.821f)
                lineToRelative(-0.603f, 0.456f)
                lineToRelative(-0.603f, -0.456f)
                curveToRelative(-0.71f, -0.537f, -1.539f, -0.82f, -2.397f, -0.82f)
                close()
                moveTo(12.0f, 0.0f)
                reflectiveCurveToRelative(-1.0f, 1.284f, -1.0f, 2.284f)
                curveToRelative(0.0f, 1.5f, 1.0f, 1.954f, 1.0f, 2.954f)
                curveToRelative(0.0f, 0.828f, -0.462f, 1.75f, -1.741f, 1.75f)
                reflectiveCurveToRelative(-1.759f, -0.922f, -1.759f, -1.75f)
                curveToRelative(0.0f, -1.0f, 1.0f, -2.75f, 1.0f, -2.75f)
                curveToRelative(0.0f, 0.0f, -4.5f, 1.532f, -4.5f, 6.512f)
                curveToRelative(0.0f, 0.67f, 0.1f, 1.315f, 0.276f, 1.929f)
                curveToRelative(0.596f, -0.315f, 1.23f, -0.555f, 1.892f, -0.712f)
                curveToRelative(-0.099f, -0.392f, -0.168f, -0.795f, -0.168f, -1.217f)
                curveToRelative(0.0f, -0.558f, 0.077f, -1.055f, 0.208f, -1.496f)
                curveToRelative(0.621f, 0.872f, 1.645f, 1.484f, 3.051f, 1.484f)
                curveToRelative(2.167f, 0.0f, 3.741f, -1.577f, 3.741f, -3.75f)
                curveToRelative(0.0f, -0.792f, -0.266f, -1.403f, -0.517f, -1.858f)
                curveToRelative(0.892f, 0.645f, 3.51f, 2.781f, 3.517f, 5.621f)
                curveToRelative(0.0f, 0.418f, -0.068f, 0.822f, -0.167f, 1.217f)
                curveToRelative(0.661f, 0.156f, 1.296f, 0.397f, 1.892f, 0.712f)
                curveToRelative(0.176f, -0.613f, 0.276f, -1.259f, 0.275f, -1.929f)
                curveToRelative(-0.009f, -4.167f, -3.895f, -6.957f, -4.675f, -7.47f)
                lineToRelative(-2.325f, -1.53f)
            }
        }
        .build()
        return _fireSmoke!!
    }

private var _fireSmoke: ImageVector? = null

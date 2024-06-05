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

public val Icons.Filled.UserHeadset: ImageVector
    get() {
        if (_userHeadset != null) {
            return _userHeadset!!
        }
        _userHeadset = Builder(name = "UserHeadset", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.638f, 9.0f)
                curveToRelative(-0.618f, 0.0f, -1.098f, -0.558f, -0.989f, -1.166f)
                curveToRelative(0.359f, -2.001f, 1.356f, -3.861f, 2.855f, -5.266f)
                curveTo(7.439f, 0.753f, 9.966f, -0.152f, 12.63f, 0.021f)
                curveToRelative(5.021f, 0.324f, 8.943f, 4.695f, 8.869f, 9.917f)
                curveToRelative(-0.04f, 2.818f, -2.389f, 5.063f, -5.208f, 5.063f)
                horizontalLineToRelative(-2.932f)
                curveToRelative(-0.36f, 0.346f, -0.846f, 0.561f, -1.384f, 0.561f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.908f, 0.0f, 1.666f, 0.609f, 1.91f, 1.439f)
                horizontalLineToRelative(2.406f)
                curveToRelative(1.736f, 0.0f, 3.189f, -1.383f, 3.208f, -3.118f)
                curveToRelative(0.046f, -4.146f, -3.045f, -7.609f, -6.998f, -7.865f)
                curveToRelative(-2.099f, -0.13f, -4.101f, 0.578f, -5.63f, 2.011f)
                curveToRelative(-1.209f, 1.133f, -1.988f, 2.584f, -2.261f, 4.178f)
                curveToRelative(-0.08f, 0.466f, -0.5f, 0.795f, -0.972f, 0.795f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-3.695f, 0.0f, -6.892f, 2.292f, -7.955f, 5.702f)
                curveToRelative(-0.095f, 0.304f, -0.04f, 0.635f, 0.149f, 0.891f)
                reflectiveCurveToRelative(0.488f, 0.407f, 0.806f, 0.407f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.318f, 0.0f, 0.617f, -0.151f, 0.806f, -0.407f)
                reflectiveCurveToRelative(0.244f, -0.587f, 0.149f, -0.891f)
                curveToRelative(-1.063f, -3.41f, -4.26f, -5.702f, -7.955f, -5.702f)
                close()
                moveTo(14.934f, 11.0f)
                horizontalLineToRelative(2.354f)
                curveToRelative(0.135f, -0.477f, 0.212f, -0.979f, 0.212f, -1.5f)
                curveToRelative(0.0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.462f, -5.5f, 5.5f)
                curveToRelative(0.0f, 1.491f, 0.596f, 2.841f, 1.559f, 3.832f)
                curveToRelative(0.121f, -2.066f, 1.819f, -3.709f, 3.916f, -3.709f)
                curveToRelative(1.191f, 0.0f, 2.241f, 0.541f, 2.96f, 1.377f)
                close()
            }
        }
        .build()
        return _userHeadset!!
    }

private var _userHeadset: ImageVector? = null

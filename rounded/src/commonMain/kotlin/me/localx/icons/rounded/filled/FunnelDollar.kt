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

public val Icons.Filled.FunnelDollar: ImageVector
    get() {
        if (_funnelDollar != null) {
            return _funnelDollar!!
        }
        _funnelDollar = Builder(name = "FunnelDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.005f, 1.308f, -1.995f, 1.307f, -2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.268f)
                curveToRelative(-1.067f, 0.0f, -2.063f, -0.574f, -2.598f, -1.499f)
                curveToRelative(-0.277f, -0.479f, -0.113f, -1.09f, 0.364f, -1.366f)
                curveToRelative(0.479f, -0.279f, 1.091f, -0.114f, 1.366f, 0.364f)
                curveToRelative(0.179f, 0.31f, 0.511f, 0.501f, 0.867f, 0.501f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.998f, 0.065f, 1.443f, -1.55f, 0.355f, -1.761f)
                lineToRelative(-3.04f, -0.506f)
                curveToRelative(-3.501f, -0.651f, -2.748f, -5.753f, 0.685f, -5.733f)
                lineTo(10.999f, 1.0f)
                curveToRelative(0.005f, -1.308f, 1.995f, -1.307f, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.268f)
                curveToRelative(1.067f, 0.0f, 2.063f, 0.574f, 2.598f, 1.499f)
                curveToRelative(0.277f, 0.479f, 0.113f, 1.09f, -0.364f, 1.366f)
                curveToRelative(-0.48f, 0.277f, -1.091f, 0.113f, -1.366f, -0.364f)
                curveToRelative(-0.179f, -0.31f, -0.511f, -0.501f, -0.867f, -0.501f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.998f, -0.065f, -1.443f, 1.55f, -0.355f, 1.761f)
                lineToRelative(3.04f, 0.506f)
                curveToRelative(1.342f, 0.224f, 2.315f, 1.374f, 2.315f, 2.733f)
                close()
                moveTo(19.102f, 3.0f)
                horizontalLineToRelative(-1.276f)
                curveToRelative(0.202f, 0.566f, 0.232f, 1.18f, 0.073f, 1.774f)
                curveToRelative(-0.145f, 0.54f, -0.429f, 1.018f, -0.824f, 1.394f)
                curveToRelative(1.906f, 2.424f, 0.67f, 6.387f, -2.137f, 7.441f)
                curveToRelative(-0.617f, 3.087f, -5.12f, 3.167f, -5.851f, 0.11f)
                curveToRelative(-1.114f, -0.39f, -2.077f, -1.169f, -2.684f, -2.219f)
                curveToRelative(-0.401f, -0.691f, -0.509f, -1.5f, -0.302f, -2.275f)
                curveToRelative(0.145f, -0.54f, 0.429f, -1.018f, 0.824f, -1.394f)
                curveToRelative(-1.01f, -1.307f, -1.208f, -3.322f, -0.497f, -4.832f)
                horizontalLineToRelative(-1.53f)
                curveTo(1.621f, 2.904f, -0.255f, 7.109f, 1.985f, 9.487f)
                lineToRelative(7.015f, 7.893f)
                verticalLineToRelative(2.62f)
                curveToRelative(0.0f, 0.314f, 0.148f, 0.611f, 0.4f, 0.8f)
                lineToRelative(4.0f, 3.0f)
                curveToRelative(0.303f, 0.229f, 0.709f, 0.263f, 1.047f, 0.095f)
                curveToRelative(0.339f, -0.17f, 0.553f, -0.516f, 0.553f, -0.895f)
                verticalLineToRelative(-5.62f)
                lineToRelative(7.015f, -7.892f)
                curveToRelative(2.24f, -2.38f, 0.365f, -6.584f, -2.913f, -6.488f)
                close()
            }
        }
        .build()
        return _funnelDollar!!
    }

private var _funnelDollar: ImageVector? = null

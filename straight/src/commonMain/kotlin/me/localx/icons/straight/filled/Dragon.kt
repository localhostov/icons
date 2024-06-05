package me.localx.icons.straight.filled

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

public val Icons.Filled.Dragon: ImageVector
    get() {
        if (_dragon != null) {
            return _dragon!!
        }
        _dragon = Builder(name = "Dragon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.522f, 6.203f)
                curveToRelative(3.096f, 0.639f, 4.68f, 2.574f, 4.759f, 2.672f)
                lineToRelative(-1.558f, 1.255f)
                curveToRelative(-0.072f, -0.087f, -1.79f, -2.13f, -5.224f, -2.13f)
                curveToRelative(-1.826f, 0.0f, -4.428f, 1.797f, -4.5f, 2.0f)
                curveToRelative(0.0f, -1.046f, 0.35f, -2.365f, 1.144f, -3.386f)
                curveToRelative(-3.478f, -0.988f, -5.033f, -3.54f, -5.144f, -3.614f)
                curveToRelative(0.019f, 0.013f, 2.609f, 0.525f, 5.171f, 0.811f)
                curveToRelative(-0.823f, -1.182f, -1.171f, -2.636f, -1.171f, -3.811f)
                curveToRelative(0.0f, 0.212f, 1.47f, 1.567f, 3.18f, 2.381f)
                curveToRelative(-0.123f, -0.669f, -0.18f, -1.458f, -0.18f, -2.381f)
                curveToRelative(0.0f, 0.156f, 0.808f, 1.196f, 1.837f, 2.0f)
                horizontalLineToRelative(0.663f)
                curveToRelative(0.818f, 0.0f, 1.566f, 0.393f, 2.037f, 1.0f)
                horizontalLineToRelative(4.463f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.001f)
                curveToRelative(-0.042f, 0.0f, -1.296f, 0.021f, -1.477f, 1.203f)
                close()
                moveTo(16.804f, 10.728f)
                curveToRelative(-0.279f, -0.207f, -0.454f, -0.435f, -0.731f, -0.668f)
                curveToRelative(-0.754f, 0.18f, -5.573f, 2.941f, -5.573f, 2.941f)
                curveToRelative(-0.261f, -0.837f, -0.5f, -2.0f, -0.5f, -3.0f)
                curveToRelative(0.0f, -0.782f, 0.135f, -1.587f, 0.384f, -2.352f)
                curveToRelative(-0.695f, -0.367f, -1.422f, -0.843f, -2.135f, -1.458f)
                curveToRelative(-0.697f, 0.892f, -1.207f, 1.987f, -1.246f, 3.165f)
                lineToRelative(-3.003f, 2.145f)
                lineToRelative(3.495f, 0.437f)
                curveToRelative(0.157f, 0.358f, 0.346f, 0.692f, 0.561f, 1.006f)
                lineToRelative(-2.057f, 2.057f)
                horizontalLineToRelative(4.086f)
                curveToRelative(0.221f, 0.169f, 0.445f, 0.331f, 0.671f, 0.486f)
                lineToRelative(-1.257f, 2.514f)
                lineToRelative(3.838f, -0.853f)
                curveToRelative(0.941f, 0.63f, 1.662f, 1.241f, 1.662f, 1.853f)
                curveToRelative(0.0f, 1.187f, -2.29f, 1.5f, -3.5f, 1.5f)
                curveToRelative(-3.973f, 0.0f, -9.5f, -4.031f, -9.5f, -8.0f)
                curveToRelative(0.0f, -2.5f, 0.5f, -5.0f, 1.683f, -6.98f)
                lineToRelative(1.317f, 2.48f)
                curveToRelative(0.499f, -2.205f, 1.148f, -4.774f, 0.962f, -8.0f)
                curveTo(4.07f, 0.762f, 1.893f, 2.714f, 0.0f, 5.0f)
                horizontalLineToRelative(2.076f)
                curveTo(0.424f, 7.755f, 0.0f, 10.446f, 0.0f, 12.5f)
                curveToRelative(0.0f, 5.589f, 6.425f, 11.5f, 12.5f, 11.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(3.015f, 0.0f, 7.5f, -1.465f, 7.5f, -5.5f)
                curveToRelative(0.0f, -3.919f, -3.003f, -6.146f, -5.196f, -7.772f)
                close()
            }
        }
        .build()
        return _dragon!!
    }

private var _dragon: ImageVector? = null

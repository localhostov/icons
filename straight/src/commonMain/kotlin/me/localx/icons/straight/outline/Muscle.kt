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

public val Icons.Outline.Muscle: ImageVector
    get() {
        if (_muscle != null) {
            return _muscle!!
        }
        _muscle = Builder(name = "Muscle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 8.0f)
                curveToRelative(-2.866f, 0.0f, -5.22f, 2.815f, -5.62f, 3.322f)
                curveToRelative(-0.562f, -0.19f, -1.184f, -0.322f, -1.88f, -0.322f)
                curveToRelative(-1.345f, 0.0f, -2.586f, 0.477f, -3.618f, 1.079f)
                curveToRelative(0.2f, -1.297f, 0.171f, -2.498f, 0.14f, -3.489f)
                curveToRelative(-0.02f, -0.61f, -0.038f, -1.197f, 0.01f, -1.64f)
                lineToRelative(2.988f, -0.95f)
                verticalLineToRelative(-1.034f)
                lineToRelative(1.98f, -0.788f)
                verticalLineToRelative(-0.679f)
                curveToRelative(0.0f, -1.721f, -1.496f, -3.5f, -4.0f, -3.5f)
                curveToRelative(-1.825f, 0.0f, -3.223f, 1.187f, -3.323f, 1.278f)
                curveTo(-0.105f, 6.496f, -0.037f, 13.701f, -0.004f, 17.164f)
                lineToRelative(0.004f, 0.938f)
                curveToRelative(0.162f, 0.231f, 4.051f, 5.922f, 12.0f, 5.922f)
                reflectiveCurveToRelative(11.839f, -3.544f, 12.0f, -3.683f)
                verticalLineToRelative(-11.597f)
                curveToRelative(-0.115f, -0.064f, -1.712f, -0.744f, -4.0f, -0.744f)
                close()
                moveTo(22.0f, 19.381f)
                curveToRelative(-1.032f, 0.711f, -4.355f, 2.643f, -10.0f, 2.643f)
                curveToRelative(-5.914f, 0.0f, -9.219f, -3.605f, -10.002f, -4.578f)
                curveToRelative(-0.032f, -3.38f, -0.095f, -9.972f, 5.946f, -14.621f)
                curveToRelative(0.009f, -0.008f, 0.967f, -0.824f, 2.056f, -0.824f)
                curveToRelative(0.998f, 0.0f, 1.567f, 0.432f, 1.827f, 0.891f)
                lineToRelative(-1.808f, 0.719f)
                verticalLineToRelative(0.929f)
                lineToRelative(-2.617f, 0.832f)
                lineToRelative(-0.165f, 0.469f)
                curveToRelative(-0.279f, 0.788f, -0.249f, 1.728f, -0.215f, 2.815f)
                curveToRelative(0.051f, 1.625f, -0.022f, 3.846f, -1.053f, 5.848f)
                lineToRelative(1.535f, 1.282f)
                curveToRelative(0.023f, -0.027f, 2.369f, -2.784f, 4.995f, -2.784f)
                curveToRelative(2.065f, 0.0f, 3.381f, 1.683f, 3.394f, 1.7f)
                lineToRelative(1.597f, -1.204f)
                curveToRelative(-0.037f, -0.05f, -0.493f, -0.637f, -1.295f, -1.229f)
                curveToRelative(0.743f, -0.847f, 2.303f, -2.267f, 3.805f, -2.267f)
                curveToRelative(0.935f, 0.0f, 1.592f, 0.109f, 2.0f, 0.209f)
                verticalLineToRelative(9.172f)
                close()
            }
        }
        .build()
        return _muscle!!
    }

private var _muscle: ImageVector? = null

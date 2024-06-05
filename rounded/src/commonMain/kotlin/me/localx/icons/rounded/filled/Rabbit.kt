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

public val Icons.Filled.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.231f, 5.065f)
                curveToRelative(-1.717f, 0.801f, -3.825f, 1.74f, -7.16f, 1.908f)
                curveToRelative(-0.578f, 0.029f, -1.07f, -0.421f, -1.07f, -0.999f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.525f, 0.408f, -0.971f, 0.933f, -0.996f)
                curveToRelative(3.082f, -0.149f, 4.957f, -1.026f, 6.63f, -1.808f)
                curveToRelative(0.116f, -0.054f, 0.231f, -0.108f, 0.346f, -0.161f)
                curveToRelative(-1.852f, -0.442f, -4.32f, -0.896f, -6.927f, -0.991f)
                curveToRelative(-0.544f, -0.02f, -0.981f, -0.455f, -0.981f, -0.999f)
                horizontalLineToRelative(0.0f)
                curveTo(6.0f, 0.459f, 6.46f, -0.002f, 7.019f, 0.018f)
                curveToRelative(5.494f, 0.191f, 10.27f, 1.846f, 10.784f, 2.029f)
                curveToRelative(0.209f, -0.031f, 0.423f, -0.047f, 0.641f, -0.047f)
                curveToRelative(3.333f, 0.0f, 5.556f, 3.375f, 5.556f, 5.625f)
                curveToRelative(0.0f, 2.485f, -3.101f, 3.375f, -5.556f, 3.375f)
                reflectiveCurveToRelative(-4.444f, -2.015f, -4.444f, -4.5f)
                curveToRelative(0.0f, -0.502f, 0.081f, -0.984f, 0.231f, -1.435f)
                close()
                moveTo(23.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.258f)
                curveToRelative(-0.782f, 0.169f, -1.638f, 0.258f, -2.556f, 0.258f)
                curveToRelative(-2.723f, 0.0f, -5.058f, -1.713f, -6.0f, -4.127f)
                curveToRelative(-7.408f, 2.366f, -9.004f, 8.84f, -9.347f, 11.456f)
                curveToRelative(-0.425f, -0.28f, -0.962f, -0.402f, -1.529f, -0.284f)
                curveToRelative(-0.758f, 0.159f, -1.38f, 0.79f, -1.529f, 1.55f)
                curveToRelative(-0.251f, 1.282f, 0.723f, 2.405f, 1.96f, 2.405f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null

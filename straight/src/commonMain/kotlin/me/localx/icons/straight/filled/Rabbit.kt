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
                curveToRelative(-1.893f, 0.884f, -4.264f, 1.935f, -8.231f, 1.935f)
                verticalLineToRelative(-2.0f)
                curveToRelative(3.648f, 0.0f, 5.728f, -0.973f, 7.562f, -1.83f)
                curveToRelative(0.116f, -0.054f, 0.231f, -0.108f, 0.346f, -0.161f)
                curveToRelative(-2.083f, -0.498f, -4.945f, -1.009f, -7.908f, -1.009f)
                lineTo(6.0f, 0.0f)
                curveToRelative(5.911f, 0.0f, 11.258f, 1.852f, 11.804f, 2.047f)
                curveToRelative(0.209f, -0.031f, 0.423f, -0.047f, 0.641f, -0.047f)
                curveToRelative(3.333f, 0.0f, 5.556f, 3.375f, 5.556f, 5.625f)
                curveToRelative(0.0f, 2.485f, -3.101f, 3.375f, -5.556f, 3.375f)
                reflectiveCurveToRelative(-4.444f, -2.015f, -4.444f, -4.5f)
                curveToRelative(0.0f, -0.502f, 0.081f, -0.984f, 0.231f, -1.435f)
                close()
                moveTo(21.0f, 12.742f)
                curveToRelative(-0.782f, 0.169f, -1.638f, 0.258f, -2.556f, 0.258f)
                curveToRelative(-2.723f, 0.0f, -5.058f, -1.713f, -6.0f, -4.127f)
                curveToRelative(-7.408f, 2.366f, -9.004f, 8.84f, -9.347f, 11.456f)
                curveToRelative(-0.315f, -0.208f, -0.692f, -0.329f, -1.098f, -0.329f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.258f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null

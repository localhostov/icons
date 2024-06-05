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

public val Icons.Filled.BalanceScaleLeft: ImageVector
    get() {
        if (_balanceScaleLeft != null) {
            return _balanceScaleLeft!!
        }
        _balanceScaleLeft = Builder(name = "BalanceScaleLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.938f, 10.654f)
                lineToRelative(-3.071f, -8.335f)
                curveToRelative(-0.423f, -1.151f, -1.634f, -1.781f, -2.824f, -1.465f)
                lineToRelative(-5.043f, 1.345f)
                verticalLineTo(1.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.307f, -2.0f, 0.0f)
                verticalLineToRelative(1.732f)
                lineToRelative(-5.254f, 1.401f)
                curveToRelative(-1.255f, 0.335f, -2.273f, 1.263f, -2.723f, 2.482f)
                lineTo(0.062f, 14.654f)
                curveToRelative(-0.041f, 0.111f, -0.062f, 0.647f, -0.062f, 0.647f)
                curveToRelative(-0.078f, 3.924f, 4.749f, 6.267f, 7.598f, 3.462f)
                curveToRelative(0.891f, -0.846f, 1.402f, -2.036f, 1.402f, -3.264f)
                curveToRelative(0.0f, 0.0f, -0.021f, -0.732f, -0.06f, -0.842f)
                lineTo(5.87f, 6.216f)
                curveToRelative(0.124f, -0.063f, 0.255f, -0.114f, 0.392f, -0.15f)
                lineToRelative(4.738f, -1.264f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.308f, 0.006f, -1.307f, 1.994f, 0.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.994f, 0.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(4.268f)
                lineToRelative(4.896f, -1.306f)
                lineToRelative(-2.834f, 7.691f)
                curveToRelative(-0.041f, 0.111f, -0.062f, 0.647f, -0.062f, 0.647f)
                curveToRelative(0.0f, 2.506f, 1.871f, 4.567f, 4.26f, 4.692f)
                curveToRelative(1.249f, 0.066f, 2.434f, -0.371f, 3.338f, -1.229f)
                curveToRelative(0.891f, -0.846f, 1.402f, -2.036f, 1.402f, -3.264f)
                curveToRelative(0.0f, 0.0f, -0.021f, -0.735f, -0.062f, -0.846f)
                close()
                moveTo(6.572f, 14.0f)
                horizontalLineTo(2.434f)
                lineToRelative(2.083f, -5.653f)
                lineToRelative(2.056f, 5.653f)
                close()
                moveTo(19.5f, 4.393f)
                lineToRelative(2.066f, 5.607f)
                horizontalLineToRelative(-4.132f)
                lineToRelative(2.066f, -5.607f)
                close()
            }
        }
        .build()
        return _balanceScaleLeft!!
    }

private var _balanceScaleLeft: ImageVector? = null

package me.localx.icons.rounded.bold

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

public val Icons.Bold.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.498f, 6.244f)
                lineToRelative(-0.387f, -1.356f)
                lineToRelative(-1.356f, -0.387f)
                curveToRelative(-1.007f, -0.288f, -1.007f, -1.715f, 0.0f, -2.003f)
                lineToRelative(1.356f, -0.387f)
                lineToRelative(0.387f, -1.356f)
                curveToRelative(0.288f, -1.007f, 1.715f, -1.007f, 2.003f, 0.0f)
                lineToRelative(0.387f, 1.356f)
                lineToRelative(1.356f, 0.387f)
                curveToRelative(1.007f, 0.288f, 1.007f, 1.715f, 0.0f, 2.003f)
                lineToRelative(-1.356f, 0.387f)
                lineToRelative(-0.387f, 1.356f)
                curveToRelative(-0.288f, 1.007f, -1.715f, 1.007f, -2.003f, 0.0f)
                close()
                moveTo(19.996f, 10.872f)
                curveToRelative(0.641f, 1.237f, 1.004f, 2.64f, 1.004f, 4.127f)
                curveToRelative(0.0f, 4.962f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.962f, 3.0f, 15.0f)
                reflectiveCurveTo(7.038f, 6.0f, 12.0f, 6.0f)
                curveToRelative(1.497f, 0.0f, 2.911f, 0.368f, 4.154f, 1.018f)
                curveToRelative(0.0f, 0.0f, 0.287f, -0.328f, 0.312f, -0.352f)
                curveToRelative(0.885f, -0.885f, 2.326f, -0.886f, 3.212f, 0.0f)
                lineToRelative(0.657f, 0.657f)
                curveToRelative(0.886f, 0.887f, 0.885f, 2.328f, 0.0f, 3.213f)
                lineToRelative(-0.338f, 0.339f)
                close()
                moveTo(18.0f, 14.999f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(24.0f, 3.5f)
                curveTo(24.0f, 1.887f, 22.69f, 0.002f, 19.0f, 0.002f)
                curveTo(14.273f, 0.002f, 10.296f, 1.004f, 10.129f, 1.046f)
                curveToRelative(-0.802f, 0.205f, -1.287f, 1.021f, -1.082f, 1.824f)
                curveToRelative(0.205f, 0.803f, 1.023f, 1.286f, 1.823f, 1.083f)
                curveToRelative(0.038f, -0.009f, 3.796f, -0.951f, 8.13f, -0.951f)
                curveToRelative(1.475f, 0.0f, 1.961f, 0.407f, 2.0f, 0.498f)
                curveToRelative(0.0f, 0.334f, 0.008f, 0.323f, -0.167f, 0.561f)
                curveToRelative(-0.243f, 0.266f, -0.391f, 0.621f, -0.391f, 1.009f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.482f, 0.0f, 0.91f, -0.227f, 1.185f, -0.58f)
                curveToRelative(0.242f, -0.269f, 0.873f, -1.105f, 0.873f, -2.49f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null

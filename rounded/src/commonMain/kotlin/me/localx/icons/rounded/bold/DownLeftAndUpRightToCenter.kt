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

public val Icons.Bold.DownLeftAndUpRightToCenter: ImageVector
    get() {
        if (_downLeftAndUpRightToCenter != null) {
            return _downLeftAndUpRightToCenter!!
        }
        _downLeftAndUpRightToCenter = Builder(name = "DownLeftAndUpRightToCenter", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.561f, 2.561f)
                lineToRelative(-4.286f, 4.286f)
                lineToRelative(2.537f, 2.537f)
                curveToRelative(0.574f, 0.574f, 0.158f, 1.564f, -0.659f, 1.569f)
                lineToRelative(-7.242f, 0.047f)
                curveToRelative(-0.506f, 0.003f, -0.914f, -0.404f, -0.911f, -0.911f)
                lineToRelative(0.047f, -7.242f)
                curveToRelative(0.005f, -0.817f, 0.996f, -1.232f, 1.569f, -0.659f)
                lineToRelative(2.537f, 2.537f)
                lineTo(21.439f, 0.439f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
                moveTo(10.089f, 13.0f)
                lineToRelative(-7.242f, 0.047f)
                curveToRelative(-0.817f, 0.005f, -1.232f, 0.995f, -0.659f, 1.569f)
                lineToRelative(2.537f, 2.537f)
                lineTo(0.439f, 21.439f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(4.286f, -4.286f)
                lineToRelative(2.537f, 2.537f)
                curveToRelative(0.574f, 0.574f, 1.564f, 0.158f, 1.569f, -0.659f)
                lineToRelative(0.047f, -7.242f)
                curveToRelative(0.003f, -0.506f, -0.404f, -0.914f, -0.911f, -0.911f)
                close()
            }
        }
        .build()
        return _downLeftAndUpRightToCenter!!
    }

private var _downLeftAndUpRightToCenter: ImageVector? = null

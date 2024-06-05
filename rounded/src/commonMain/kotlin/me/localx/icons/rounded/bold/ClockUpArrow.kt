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

public val Icons.Bold.ClockUpArrow: ImageVector
    get() {
        if (_clockUpArrow != null) {
            return _clockUpArrow!!
        }
        _clockUpArrow = Builder(name = "ClockUpArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.291f, 17.999f)
                curveToRelative(0.553f, 0.617f, 0.501f, 1.565f, -0.116f, 2.118f)
                curveToRelative(-0.287f, 0.257f, -0.645f, 0.383f, -1.0f, 0.383f)
                curveToRelative(-0.412f, 0.0f, -0.822f, -0.169f, -1.118f, -0.499f)
                curveToRelative(-1.972f, -2.201f, -3.057f, -5.043f, -3.057f, -8.001f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.549f, 0.0f, 10.343f, 3.76f, 11.657f, 9.145f)
                curveToRelative(0.196f, 0.805f, -0.297f, 1.616f, -1.102f, 1.812f)
                curveToRelative(-0.808f, 0.196f, -1.617f, -0.297f, -1.812f, -1.102f)
                curveToRelative(-0.985f, -4.036f, -4.581f, -6.855f, -8.743f, -6.855f)
                curveTo(7.037f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                curveToRelative(0.0f, 2.219f, 0.813f, 4.35f, 2.291f, 5.999f)
                close()
                moveTo(11.0f, 6.5f)
                verticalLineToRelative(4.634f)
                lineToRelative(-2.714f, 1.567f)
                curveToRelative(-0.718f, 0.414f, -0.963f, 1.331f, -0.549f, 2.049f)
                curveToRelative(0.277f, 0.481f, 0.782f, 0.75f, 1.3f, 0.75f)
                curveToRelative(0.255f, 0.0f, 0.513f, -0.064f, 0.749f, -0.201f)
                lineToRelative(3.464f, -2.0f)
                curveToRelative(0.464f, -0.268f, 0.75f, -0.763f, 0.75f, -1.299f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(23.073f, 13.0f)
                horizontalLineToRelative(-4.145f)
                curveToRelative(-0.825f, 0.0f, -1.239f, 0.998f, -0.655f, 1.582f)
                lineToRelative(1.003f, 1.003f)
                lineToRelative(-3.35f, 3.35f)
                curveToRelative(-0.029f, 0.029f, -0.074f, 0.028f, -0.102f, 0.0f)
                lineToRelative(-1.029f, -1.029f)
                curveToRelative(-1.197f, -1.195f, -3.146f, -1.196f, -4.343f, 0.0f)
                lineToRelative(-3.532f, 3.532f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(3.531f, -3.531f)
                curveToRelative(0.027f, -0.028f, 0.072f, -0.03f, 0.102f, 0.0f)
                lineToRelative(1.029f, 1.029f)
                curveToRelative(1.197f, 1.195f, 3.146f, 1.196f, 4.343f, 0.0f)
                lineToRelative(3.351f, -3.351f)
                lineToRelative(1.021f, 1.021f)
                curveToRelative(0.584f, 0.584f, 1.582f, 0.17f, 1.582f, -0.655f)
                verticalLineToRelative(-4.145f)
                curveToRelative(0.0f, -0.512f, -0.415f, -0.926f, -0.927f, -0.926f)
                close()
            }
        }
        .build()
        return _clockUpArrow!!
    }

private var _clockUpArrow: ImageVector? = null

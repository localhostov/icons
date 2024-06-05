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

public val Icons.Bold.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 7.439f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-4.879f, -4.879f)
                lineToRelative(1.439f, -1.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-2.282f, 2.282f)
                lineToRelative(-5.333f, 2.133f)
                curveToRelative(-1.626f, 0.651f, -2.841f, 1.988f, -3.334f, 3.668f)
                lineTo(0.129f, 19.98f)
                curveToRelative(-0.324f, 1.101f, -0.021f, 2.289f, 0.791f, 3.1f)
                curveToRelative(0.597f, 0.597f, 1.397f, 0.918f, 2.216f, 0.918f)
                curveToRelative(0.295f, 0.0f, 0.592f, -0.042f, 0.884f, -0.127f)
                lineToRelative(11.458f, -3.361f)
                curveToRelative(1.68f, -0.493f, 3.018f, -1.708f, 3.668f, -3.334f)
                lineToRelative(2.133f, -5.333f)
                lineToRelative(2.282f, -2.282f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                close()
                moveTo(16.361f, 16.06f)
                curveToRelative(-0.307f, 0.766f, -0.936f, 1.338f, -1.728f, 1.57f)
                lineToRelative(-8.693f, 2.55f)
                lineToRelative(4.216f, -4.216f)
                curveToRelative(0.114f, 0.016f, 0.226f, 0.035f, 0.344f, 0.035f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.118f, 0.019f, 0.231f, 0.035f, 0.344f)
                lineToRelative(-4.216f, 4.216f)
                lineToRelative(2.55f, -8.693f)
                curveToRelative(0.232f, -0.791f, 0.804f, -1.42f, 1.57f, -1.727f)
                lineToRelative(4.7f, -1.88f)
                lineToRelative(5.601f, 5.601f)
                lineToRelative(-1.88f, 4.699f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null

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

public val Icons.Bold.AngleRight: ImageVector
    get() {
        if (_angleRight != null) {
            return _angleRight!!
        }
        _angleRight = Builder(name = "AngleRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.079f, 22.5f)
                curveTo(6.0794f, 22.1023f, 6.2377f, 21.7211f, 6.519f, 21.44f)
                lineTo(14.191f, 13.768f)
                curveTo(14.4233f, 13.5359f, 14.6075f, 13.2602f, 14.7331f, 12.9569f)
                curveTo(14.8588f, 12.6535f, 14.9235f, 12.3284f, 14.9235f, 12.0f)
                curveTo(14.9235f, 11.6717f, 14.8588f, 11.3465f, 14.7331f, 11.0432f)
                curveTo(14.6075f, 10.7398f, 14.4233f, 10.4642f, 14.191f, 10.232f)
                lineTo(6.529f, 2.565f)
                curveTo(6.2558f, 2.2821f, 6.1046f, 1.9032f, 6.108f, 1.5099f)
                curveTo(6.1115f, 1.1166f, 6.2692f, 0.7404f, 6.5473f, 0.4623f)
                curveTo(6.8254f, 0.1842f, 7.2016f, 0.0264f, 7.5949f, 0.023f)
                curveTo(7.9882f, 0.0196f, 8.3671f, 0.1708f, 8.65f, 0.444f)
                lineTo(16.312f, 8.105f)
                curveTo(17.3423f, 9.1373f, 17.9209f, 10.5361f, 17.9209f, 11.9945f)
                curveTo(17.9209f, 13.4529f, 17.3423f, 14.8518f, 16.312f, 15.884f)
                lineTo(8.64f, 23.556f)
                curveTo(8.4306f, 23.7656f, 8.1637f, 23.9085f, 7.8731f, 23.9666f)
                curveTo(7.5825f, 24.0247f, 7.2812f, 23.9954f, 7.0072f, 23.8824f)
                curveTo(6.7333f, 23.7695f, 6.4989f, 23.5779f, 6.3337f, 23.3319f)
                curveTo(6.1685f, 23.0858f, 6.0799f, 22.7964f, 6.079f, 22.5f)
                close()
            }
        }
        .build()
        return _angleRight!!
    }

private var _angleRight: ImageVector? = null

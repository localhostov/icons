package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.5f, 6.0f)
                    horizontalLineTo(14.5f)
                    curveTo(13.3069f, 6.0013f, 12.1631f, 6.4759f, 11.3195f, 7.3195f)
                    curveTo(10.4759f, 8.1631f, 10.0013f, 9.3069f, 10.0f, 10.5f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.5f)
                    curveTo(3.0f, 3.1022f, 2.842f, 2.7206f, 2.5607f, 2.4393f)
                    curveTo(2.2794f, 2.158f, 1.8978f, 2.0f, 1.5f, 2.0f)
                    curveTo(1.1022f, 2.0f, 0.7206f, 2.158f, 0.4393f, 2.4393f)
                    curveTo(0.158f, 2.7206f, 0.0f, 3.1022f, 0.0f, 3.5f)
                    lineTo(0.0f, 20.5f)
                    curveTo(0.0f, 20.8978f, 0.158f, 21.2794f, 0.4393f, 21.5607f)
                    curveTo(0.7206f, 21.842f, 1.1022f, 22.0f, 1.5f, 22.0f)
                    curveTo(1.8978f, 22.0f, 2.2794f, 21.842f, 2.5607f, 21.5607f)
                    curveTo(2.842f, 21.2794f, 3.0f, 20.8978f, 3.0f, 20.5f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(20.5f)
                    curveTo(21.0f, 20.8978f, 21.158f, 21.2794f, 21.4393f, 21.5607f)
                    curveTo(21.7206f, 21.842f, 22.1022f, 22.0f, 22.5f, 22.0f)
                    curveTo(22.8978f, 22.0f, 23.2794f, 21.842f, 23.5607f, 21.5607f)
                    curveTo(23.842f, 21.2794f, 24.0f, 20.8978f, 24.0f, 20.5f)
                    verticalLineTo(10.5f)
                    curveTo(23.9987f, 9.3069f, 23.5241f, 8.1631f, 22.6805f, 7.3195f)
                    curveTo(21.8369f, 6.4759f, 20.6931f, 6.0013f, 19.5f, 6.0f)
                    close()
                    moveTo(21.0f, 14.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(10.5f)
                    curveTo(13.0f, 10.1022f, 13.158f, 9.7206f, 13.4393f, 9.4393f)
                    curveTo(13.7206f, 9.158f, 14.1022f, 9.0f, 14.5f, 9.0f)
                    horizontalLineTo(19.5f)
                    curveTo(19.8978f, 9.0f, 20.2794f, 9.158f, 20.5607f, 9.4393f)
                    curveTo(20.842f, 9.7206f, 21.0f, 10.1022f, 21.0f, 10.5f)
                    verticalLineTo(14.0f)
                    close()
                    moveTo(6.5f, 14.0f)
                    curveTo(6.0055f, 14.0f, 5.5222f, 13.8534f, 5.1111f, 13.5787f)
                    curveTo(4.7f, 13.304f, 4.3795f, 12.9135f, 4.1903f, 12.4567f)
                    curveTo(4.0011f, 11.9999f, 3.9516f, 11.4972f, 4.048f, 11.0123f)
                    curveTo(4.1445f, 10.5273f, 4.3826f, 10.0819f, 4.7322f, 9.7322f)
                    curveTo(5.0819f, 9.3826f, 5.5273f, 9.1445f, 6.0123f, 9.048f)
                    curveTo(6.4972f, 8.9516f, 6.9999f, 9.0011f, 7.4567f, 9.1903f)
                    curveTo(7.9135f, 9.3795f, 8.304f, 9.7f, 8.5787f, 10.1111f)
                    curveTo(8.8534f, 10.5222f, 9.0f, 11.0055f, 9.0f, 11.5f)
                    curveTo(9.0f, 12.163f, 8.7366f, 12.7989f, 8.2678f, 13.2678f)
                    curveTo(7.7989f, 13.7366f, 7.163f, 14.0f, 6.5f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null

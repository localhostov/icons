package me.localx.icons.rounded.filled

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

public val Icons.Filled.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) {
            return _shieldPlus!!
        }
        _shieldPlus = Builder(name = "ShieldPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5811f, 2.1407f)
                    lineTo(12.3161f, 0.0517f)
                    curveTo(12.111f, -0.0167f, 11.8893f, -0.0167f, 11.6841f, 0.0517f)
                    lineTo(5.4191f, 2.1407f)
                    curveTo(4.423f, 2.4715f, 3.5565f, 3.1079f, 2.9428f, 3.9594f)
                    curveTo(2.329f, 4.8108f, 1.9992f, 5.8341f, 2.0001f, 6.8837f)
                    verticalLineTo(12.0007f)
                    curveTo(2.0001f, 19.5637f, 11.2001f, 23.7407f, 11.5941f, 23.9147f)
                    curveTo(11.7219f, 23.9715f, 11.8603f, 24.0008f, 12.0001f, 24.0008f)
                    curveTo(12.14f, 24.0008f, 12.2783f, 23.9715f, 12.4061f, 23.9147f)
                    curveTo(12.8001f, 23.7407f, 22.0001f, 19.5637f, 22.0001f, 12.0007f)
                    verticalLineTo(6.8837f)
                    curveTo(22.0011f, 5.8341f, 21.6713f, 4.8108f, 21.0575f, 3.9594f)
                    curveTo(20.4437f, 3.1079f, 19.5772f, 2.4715f, 18.5811f, 2.1407f)
                    close()
                    moveTo(15.0001f, 12.0007f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(14.0007f)
                    curveTo(13.0001f, 14.2659f, 12.8948f, 14.5202f, 12.7072f, 14.7078f)
                    curveTo(12.5197f, 14.8953f, 12.2653f, 15.0007f, 12.0001f, 15.0007f)
                    curveTo(11.7349f, 15.0007f, 11.4806f, 14.8953f, 11.293f, 14.7078f)
                    curveTo(11.1055f, 14.5202f, 11.0001f, 14.2659f, 11.0001f, 14.0007f)
                    verticalLineTo(12.0007f)
                    horizontalLineTo(9.0001f)
                    curveTo(8.7349f, 12.0007f, 8.4805f, 11.8953f, 8.293f, 11.7078f)
                    curveTo(8.1055f, 11.5202f, 8.0001f, 11.2659f, 8.0001f, 11.0007f)
                    curveTo(8.0001f, 10.7355f, 8.1055f, 10.4811f, 8.293f, 10.2936f)
                    curveTo(8.4805f, 10.106f, 8.7349f, 10.0007f, 9.0001f, 10.0007f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(8.0007f)
                    curveTo(11.0001f, 7.7354f, 11.1055f, 7.4811f, 11.293f, 7.2936f)
                    curveTo(11.4806f, 7.106f, 11.7349f, 7.0007f, 12.0001f, 7.0007f)
                    curveTo(12.2653f, 7.0007f, 12.5197f, 7.106f, 12.7072f, 7.2936f)
                    curveTo(12.8948f, 7.4811f, 13.0001f, 7.7354f, 13.0001f, 8.0007f)
                    verticalLineTo(10.0007f)
                    horizontalLineTo(15.0001f)
                    curveTo(15.2653f, 10.0007f, 15.5197f, 10.106f, 15.7072f, 10.2936f)
                    curveTo(15.8948f, 10.4811f, 16.0001f, 10.7355f, 16.0001f, 11.0007f)
                    curveTo(16.0001f, 11.2659f, 15.8948f, 11.5202f, 15.7072f, 11.7078f)
                    curveTo(15.5197f, 11.8953f, 15.2653f, 12.0007f, 15.0001f, 12.0007f)
                    close()
                }
            }
        }
        .build()
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null

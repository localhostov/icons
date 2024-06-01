package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Network: ImageVector
    get() {
        if (_network != null) {
            return _network!!
        }
        _network = Builder(name = "Network", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 19.0f)
                    horizontalLineTo(15.15f)
                    curveTo(14.8049f, 18.2775f, 14.2225f, 17.6951f, 13.5f, 17.35f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 14.0f, 20.5587f, 13.6839f, 21.1213f, 13.1213f)
                    curveTo(21.6839f, 12.5587f, 22.0f, 11.7956f, 22.0f, 11.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(3.5f)
                    curveTo(21.0f, 2.5717f, 20.6313f, 1.6815f, 19.9749f, 1.0251f)
                    curveTo(19.3185f, 0.3687f, 18.4283f, 0.0f, 17.5f, 0.0f)
                    horizontalLineTo(6.5f)
                    curveTo(5.5717f, 0.0f, 4.6815f, 0.3687f, 4.0251f, 1.0251f)
                    curveTo(3.3688f, 1.6815f, 3.0f, 2.5717f, 3.0f, 3.5f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(11.0f)
                    curveTo(2.0f, 11.7956f, 2.3161f, 12.5587f, 2.8787f, 13.1213f)
                    curveTo(3.4413f, 13.6839f, 4.2043f, 14.0f, 5.0f, 14.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(17.35f)
                    curveTo(9.7774f, 17.6951f, 9.1951f, 18.2775f, 8.85f, 19.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(8.85f)
                    curveTo(9.1312f, 22.5979f, 9.5767f, 23.1033f, 10.1345f, 23.4574f)
                    curveTo(10.6923f, 23.8115f, 11.3393f, 23.9995f, 12.0f, 23.9995f)
                    curveTo(12.6607f, 23.9995f, 13.3077f, 23.8115f, 13.8655f, 23.4574f)
                    curveTo(14.4233f, 23.1033f, 14.8688f, 22.5979f, 15.15f, 22.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(9.414f, 9.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(3.5f)
                    curveTo(6.0f, 3.3674f, 6.0527f, 3.2402f, 6.1465f, 3.1465f)
                    curveTo(6.2402f, 3.0527f, 6.3674f, 3.0f, 6.5f, 3.0f)
                    horizontalLineTo(17.5f)
                    curveTo(17.6326f, 3.0f, 17.7598f, 3.0527f, 17.8536f, 3.1465f)
                    curveTo(17.9473f, 3.2402f, 18.0f, 3.3674f, 18.0f, 3.5f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(14.586f)
                    lineTo(13.586f, 10.0f)
                    horizontalLineTo(10.414f)
                    lineTo(9.414f, 9.0f)
                    close()
                }
            }
        }
        .build()
        return _network!!
    }

private var _network: ImageVector? = null

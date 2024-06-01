package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.5f, 9.0f)
                    horizontalLineTo(7.5f)
                    curveTo(6.6716f, 9.0f, 6.0f, 9.6716f, 6.0f, 10.5f)
                    curveTo(6.0f, 11.3284f, 6.6716f, 12.0f, 7.5f, 12.0f)
                    horizontalLineTo(13.5f)
                    curveTo(14.3284f, 12.0f, 15.0f, 11.3284f, 15.0f, 10.5f)
                    curveTo(15.0f, 9.6716f, 14.3284f, 9.0f, 13.5f, 9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.5623f, 21.4478f)
                    lineTo(18.9196f, 16.804f)
                    curveTo(22.3967f, 12.1606f, 21.4513f, 5.5775f, 16.8078f, 2.1004f)
                    curveTo(12.1644f, -1.3768f, 5.5814f, -0.4314f, 2.1042f, 4.212f)
                    curveTo(-1.373f, 8.8555f, -0.4275f, 15.4386f, 4.2159f, 18.9157f)
                    curveTo(7.9465f, 21.7093f, 13.072f, 21.7106f, 16.8039f, 18.9187f)
                    lineTo(21.4487f, 23.5634f)
                    curveTo(22.0323f, 24.1471f, 22.9787f, 24.1471f, 23.5623f, 23.5634f)
                    curveTo(24.146f, 22.9797f, 24.146f, 22.0334f, 23.5623f, 21.4497f)
                    verticalLineTo(21.4478f)
                    close()
                    moveTo(10.5524f, 18.0222f)
                    curveTo(6.4265f, 18.0222f, 3.0818f, 14.6775f, 3.0818f, 10.5516f)
                    curveTo(3.0818f, 6.4256f, 6.4265f, 3.0809f, 10.5524f, 3.0809f)
                    curveTo(14.6783f, 3.0809f, 18.0231f, 6.4256f, 18.0231f, 10.5516f)
                    curveTo(18.0187f, 14.6757f, 14.6766f, 18.0179f, 10.5524f, 18.0222f)
                    close()
                }
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null

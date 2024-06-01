package me.localx.icons.straight.outline

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

public val Icons.Outline.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0069f, 23.9992f)
                    horizontalLineTo(0.0069f)
                    verticalLineTo(15.9992f)
                    curveTo(0.0087f, 13.614f, 0.9566f, 11.327f, 2.6425f, 9.6398f)
                    curveTo(4.3284f, 7.9525f, 6.6147f, 7.0029f, 8.9999f, 6.9992f)
                    lineTo(13.8429f, 6.8452f)
                    verticalLineTo(0.4312f)
                    lineTo(23.1299f, 9.7242f)
                    curveTo(23.6923f, 10.2868f, 24.0083f, 11.0497f, 24.0083f, 11.8452f)
                    curveTo(24.0083f, 12.6407f, 23.6923f, 13.4036f, 23.1299f, 13.9662f)
                    lineTo(13.8449f, 23.2592f)
                    verticalLineTo(16.8452f)
                    lineTo(8.9999f, 16.9992f)
                    curveTo(7.1451f, 17.0026f, 5.3673f, 17.7415f, 4.0564f, 19.0537f)
                    curveTo(2.7455f, 20.3659f, 2.0085f, 22.1444f, 2.0069f, 23.9992f)
                    close()
                    moveTo(9.0069f, 14.9992f)
                    lineTo(15.8489f, 14.8452f)
                    verticalLineTo(18.4312f)
                    lineTo(21.7229f, 12.5522f)
                    curveTo(21.9104f, 12.3647f, 22.0157f, 12.1104f, 22.0157f, 11.8452f)
                    curveTo(22.0157f, 11.58f, 21.9104f, 11.3257f, 21.7229f, 11.1382f)
                    lineTo(15.8439f, 5.2592f)
                    verticalLineTo(8.8452f)
                    lineTo(8.9999f, 8.9992f)
                    curveTo(7.1439f, 9.0008f, 5.3643f, 9.7388f, 4.0519f, 11.0512f)
                    curveTo(2.7395f, 12.3636f, 2.0015f, 14.1432f, 1.9999f, 15.9992f)
                    verticalLineTo(18.3482f)
                    curveTo(2.842f, 17.3021f, 3.908f, 16.4581f, 5.1195f, 15.8786f)
                    curveTo(6.3309f, 15.299f, 7.6569f, 14.9985f, 8.9999f, 14.9992f)
                    horizontalLineTo(9.0069f)
                    close()
                }
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null

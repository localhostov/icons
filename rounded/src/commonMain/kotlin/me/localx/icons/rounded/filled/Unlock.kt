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

public val Icons.Filled.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.9993f, 8.0022f)
                    horizontalLineTo(7.0009f)
                    verticalLineTo(7.0023f)
                    curveTo(7.0001f, 4.2414f, 9.2377f, 2.0025f, 11.9987f, 2.0017f)
                    curveTo(13.8179f, 2.0012f, 15.4937f, 2.989f, 16.3744f, 4.5807f)
                    curveTo(16.6425f, 5.0636f, 17.2513f, 5.2378f, 17.7342f, 4.9697f)
                    curveTo(18.2171f, 4.7016f, 18.3913f, 4.0928f, 18.1232f, 3.6099f)
                    curveTo(16.2509f, 0.2282f, 11.9916f, -0.9953f, 8.6099f, 0.877f)
                    curveTo(6.3823f, 2.1103f, 5.0003f, 4.4562f, 5.0011f, 7.0024f)
                    verticalLineTo(8.4262f)
                    curveTo(3.1814f, 9.2204f, 2.0042f, 11.0161f, 2.0016f, 13.0015f)
                    verticalLineTo(19.0006f)
                    curveTo(2.0049f, 21.7602f, 4.2412f, 23.9965f, 7.0009f, 23.9999f)
                    horizontalLineTo(16.9993f)
                    curveTo(19.759f, 23.9966f, 21.9953f, 21.7602f, 21.9986f, 19.0006f)
                    verticalLineTo(13.0015f)
                    curveTo(21.9953f, 10.2418f, 19.759f, 8.0055f, 16.9993f, 8.0022f)
                    close()
                    moveTo(12.9999f, 17.0008f)
                    curveTo(12.9999f, 17.553f, 12.5523f, 18.0007f, 12.0001f, 18.0007f)
                    curveTo(11.4479f, 18.0007f, 11.0003f, 17.553f, 11.0003f, 17.0008f)
                    verticalLineTo(15.0011f)
                    curveTo(11.0003f, 14.4489f, 11.4479f, 14.0013f, 12.0001f, 14.0013f)
                    curveTo(12.5523f, 14.0013f, 12.9999f, 14.4489f, 12.9999f, 15.0011f)
                    verticalLineTo(17.0008f)
                    close()
                }
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null

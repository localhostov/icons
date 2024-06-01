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

public val Icons.Filled.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.0f, 23.0003f)
                    curveTo(6.3256f, 22.9987f, 7.5964f, 22.4714f, 8.5338f, 21.5341f)
                    curveTo(9.4711f, 20.5967f, 9.9984f, 19.3259f, 10.0f, 18.0003f)
                    verticalLineTo(6.0003f)
                    curveTo(10.0f, 5.2047f, 10.3161f, 4.4416f, 10.8787f, 3.879f)
                    curveTo(11.4413f, 3.3164f, 12.2044f, 3.0003f, 13.0f, 3.0003f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 3.0003f, 20.5587f, 3.3164f, 21.1213f, 3.879f)
                    curveTo(21.6839f, 4.4416f, 22.0f, 5.2047f, 22.0f, 6.0003f)
                    verticalLineTo(14.0263f)
                    curveTo(21.1396f, 13.3645f, 20.0855f, 13.004f, 19.0f, 13.0003f)
                    curveTo(18.0111f, 13.0003f, 17.0444f, 13.2936f, 16.2221f, 13.843f)
                    curveTo(15.3999f, 14.3924f, 14.759f, 15.1733f, 14.3806f, 16.0869f)
                    curveTo(14.0022f, 17.0005f, 13.9031f, 18.0059f, 14.0961f, 18.9758f)
                    curveTo(14.289f, 19.9457f, 14.7652f, 20.8366f, 15.4645f, 21.5358f)
                    curveTo(16.1637f, 22.2351f, 17.0546f, 22.7113f, 18.0245f, 22.9042f)
                    curveTo(18.9945f, 23.0972f, 19.9998f, 22.9981f, 20.9134f, 22.6197f)
                    curveTo(21.827f, 22.2413f, 22.6079f, 21.6004f, 23.1573f, 20.7782f)
                    curveTo(23.7068f, 19.9559f, 24.0f, 18.9892f, 24.0f, 18.0003f)
                    verticalLineTo(6.0003f)
                    curveTo(23.9984f, 4.6747f, 23.4711f, 3.4039f, 22.5338f, 2.4665f)
                    curveTo(21.5964f, 1.5292f, 20.3256f, 1.0019f, 19.0f, 1.0003f)
                    horizontalLineTo(13.0f)
                    curveTo(11.6744f, 1.0019f, 10.4036f, 1.5292f, 9.4662f, 2.4665f)
                    curveTo(8.5289f, 3.4039f, 8.0016f, 4.6747f, 8.0f, 6.0003f)
                    verticalLineTo(14.0263f)
                    curveTo(7.1396f, 13.3645f, 6.0855f, 13.004f, 5.0f, 13.0003f)
                    curveTo(3.6739f, 13.0003f, 2.4021f, 13.5271f, 1.4645f, 14.4648f)
                    curveTo(0.5268f, 15.4025f, 0.0f, 16.6742f, 0.0f, 18.0003f)
                    curveTo(0.0f, 19.3264f, 0.5268f, 20.5982f, 1.4645f, 21.5358f)
                    curveTo(2.4021f, 22.4735f, 3.6739f, 23.0003f, 5.0f, 23.0003f)
                    close()
                }
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null

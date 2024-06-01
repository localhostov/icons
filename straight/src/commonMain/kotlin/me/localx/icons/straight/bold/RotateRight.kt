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

public val Icons.Bold.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0001f, 12.0008f)
                    curveTo(21.0088f, 14.0934f, 20.2912f, 16.1242f, 18.9695f, 17.7466f)
                    curveTo(17.6479f, 19.3691f, 15.8042f, 20.4826f, 13.7531f, 20.8973f)
                    curveTo(11.702f, 21.312f, 9.5705f, 21.002f, 7.7225f, 20.0204f)
                    curveTo(5.8744f, 19.0388f, 4.4242f, 17.4462f, 3.6194f, 15.5146f)
                    curveTo(2.8145f, 13.5829f, 2.7049f, 11.4319f, 3.3093f, 9.4284f)
                    curveTo(3.9136f, 7.425f, 5.1944f, 5.6933f, 6.9332f, 4.5289f)
                    curveTo(8.6719f, 3.3645f, 10.7608f, 2.8396f, 12.8435f, 3.0436f)
                    curveTo(14.9261f, 3.2476f, 16.8734f, 4.1681f, 18.3531f, 5.6478f)
                    lineTo(16.0001f, 8.0008f)
                    horizontalLineTo(21.9091f)
                    curveTo(22.0524f, 8.0009f, 22.1943f, 7.9728f, 22.3267f, 7.918f)
                    curveTo(22.4592f, 7.8632f, 22.5795f, 7.7829f, 22.6808f, 7.6815f)
                    curveTo(22.7822f, 7.5802f, 22.8625f, 7.4599f, 22.9173f, 7.3274f)
                    curveTo(22.9721f, 7.195f, 23.0002f, 7.0531f, 23.0001f, 6.9098f)
                    verticalLineTo(1.0008f)
                    lineTo(20.4711f, 3.5298f)
                    curveTo(18.5068f, 1.5749f, 15.9256f, 0.3614f, 13.167f, 0.0961f)
                    curveTo(10.4085f, -0.1693f, 7.6433f, 0.53f, 5.3424f, 2.0747f)
                    curveTo(3.0416f, 3.6195f, 1.3475f, 5.9141f, 0.5486f, 8.5677f)
                    curveTo(-0.2502f, 11.2214f, -0.1044f, 14.0699f, 0.9614f, 16.6281f)
                    curveTo(2.0271f, 19.1862f, 3.9468f, 21.2958f, 6.3934f, 22.5974f)
                    curveTo(8.8399f, 23.899f, 11.6621f, 24.3122f, 14.3792f, 23.7665f)
                    curveTo(17.0962f, 23.2208f, 19.54f, 21.75f, 21.2943f, 19.6046f)
                    curveTo(23.0485f, 17.4593f, 24.0048f, 14.7721f, 24.0001f, 12.0008f)
                    horizontalLineTo(21.0001f)
                    close()
                }
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null

package me.localx.icons.rounded.outline

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

public val Icons.Outline.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.494f, 7.9676f)
                lineTo(10.954f, 0.9676f)
                curveTo(10.2089f, 0.422f, 9.3272f, 0.0934f, 8.4068f, 0.0183f)
                curveTo(7.4863f, -0.0568f, 6.563f, 0.1244f, 5.7393f, 0.542f)
                curveTo(4.9156f, 0.9595f, 4.2236f, 1.5971f, 3.7401f, 2.3839f)
                curveTo(3.2565f, 3.1707f, 3.0004f, 4.0761f, 3.0f, 4.9996f)
                verticalLineTo(18.9996f)
                curveTo(3.0002f, 19.9236f, 3.2563f, 20.8294f, 3.7401f, 21.6166f)
                curveTo(4.2238f, 22.4037f, 4.9162f, 23.0415f, 5.7404f, 23.459f)
                curveTo(6.5646f, 23.8766f, 7.4884f, 24.0576f, 8.4093f, 23.982f)
                curveTo(9.3301f, 23.9063f, 10.212f, 23.577f, 10.957f, 23.0306f)
                lineTo(20.497f, 16.0306f)
                curveTo(21.1303f, 15.5662f, 21.6452f, 14.9592f, 22.0002f, 14.2587f)
                curveTo(22.3552f, 13.5582f, 22.5401f, 12.7839f, 22.5401f, 11.9986f)
                curveTo(22.5401f, 11.2133f, 22.3552f, 10.4391f, 22.0002f, 9.7386f)
                curveTo(21.6452f, 9.0381f, 21.1303f, 8.431f, 20.497f, 7.9666f)
                lineTo(20.494f, 7.9676f)
                close()
                moveTo(19.31f, 14.4176f)
                lineTo(9.77f, 21.4176f)
                curveTo(9.323f, 21.7442f, 8.7944f, 21.9408f, 8.2426f, 21.9856f)
                curveTo(7.6908f, 22.0304f, 7.1374f, 21.9216f, 6.6436f, 21.6712f)
                curveTo(6.1498f, 21.4209f, 5.7349f, 21.0389f, 5.4448f, 20.5674f)
                curveTo(5.1547f, 20.0958f, 5.0008f, 19.5532f, 5.0f, 18.9996f)
                verticalLineTo(4.9996f)
                curveTo(4.9945f, 4.445f, 5.1455f, 3.9f, 5.4358f, 3.4273f)
                curveTo(5.7261f, 2.9547f, 6.1438f, 2.5735f, 6.641f, 2.3276f)
                curveTo(7.0639f, 2.1125f, 7.5315f, 2.0001f, 8.006f, 1.9996f)
                curveTo(8.6419f, 2.002f, 9.2602f, 2.2085f, 9.77f, 2.5886f)
                lineTo(19.31f, 9.5886f)
                curveTo(19.6895f, 9.8673f, 19.9981f, 10.2314f, 20.2107f, 10.6515f)
                curveTo(20.4234f, 11.0716f, 20.5343f, 11.5358f, 20.5343f, 12.0066f)
                curveTo(20.5343f, 12.4775f, 20.4234f, 12.9417f, 20.2107f, 13.3618f)
                curveTo(19.9981f, 13.7818f, 19.6895f, 14.1459f, 19.31f, 14.4246f)
                verticalLineTo(14.4176f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null

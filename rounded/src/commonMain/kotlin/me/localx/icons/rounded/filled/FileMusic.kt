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

public val Icons.Filled.FileMusic: ImageVector
    get() {
        if (_fileMusic != null) {
            return _fileMusic!!
        }
        _fileMusic = Builder(name = "FileMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0001f, 7.0f)
                    verticalLineTo(0.46f)
                    curveTo(14.9252f, 0.8093f, 15.7654f, 1.3513f, 16.4651f, 2.05f)
                    lineTo(19.9491f, 5.536f)
                    curveTo(20.6486f, 6.2349f, 21.191f, 7.0749f, 21.5401f, 8.0f)
                    horizontalLineTo(15.0001f)
                    curveTo(14.7349f, 8.0f, 14.4806f, 7.8946f, 14.293f, 7.7071f)
                    curveTo(14.1055f, 7.5196f, 14.0001f, 7.2652f, 14.0001f, 7.0f)
                    close()
                    moveTo(21.9761f, 10.0f)
                    horizontalLineTo(15.0001f)
                    curveTo(14.2045f, 10.0f, 13.4414f, 9.6839f, 12.8788f, 9.1213f)
                    curveTo(12.3162f, 8.5587f, 12.0001f, 7.7957f, 12.0001f, 7.0f)
                    verticalLineTo(0.024f)
                    curveTo(11.8391f, 0.013f, 11.6781f, 0.0f, 11.5151f, 0.0f)
                    horizontalLineTo(7.0001f)
                    curveTo(5.6745f, 0.0016f, 4.4037f, 0.5289f, 3.4663f, 1.4662f)
                    curveTo(2.529f, 2.4036f, 2.0017f, 3.6744f, 2.0001f, 5.0f)
                    verticalLineTo(19.0f)
                    curveTo(2.0017f, 20.3256f, 2.529f, 21.5964f, 3.4663f, 22.5338f)
                    curveTo(4.4037f, 23.4711f, 5.6745f, 23.9984f, 7.0001f, 24.0f)
                    horizontalLineTo(17.0001f)
                    curveTo(18.3257f, 23.9984f, 19.5966f, 23.4711f, 20.5339f, 22.5338f)
                    curveTo(21.4712f, 21.5964f, 21.9985f, 20.3256f, 22.0001f, 19.0f)
                    verticalLineTo(10.485f)
                    curveTo(22.0001f, 10.322f, 21.9871f, 10.161f, 21.9761f, 10.0f)
                    close()
                    moveTo(14.0001f, 14.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(18.5f)
                    curveTo(13.0001f, 18.9945f, 12.8535f, 19.4778f, 12.5788f, 19.8889f)
                    curveTo(12.3041f, 20.3f, 11.9136f, 20.6205f, 11.4568f, 20.8097f)
                    curveTo(11.0f, 20.9989f, 10.4973f, 21.0484f, 10.0124f, 20.952f)
                    curveTo(9.5274f, 20.8555f, 9.082f, 20.6174f, 8.7324f, 20.2678f)
                    curveTo(8.3827f, 19.9181f, 8.1446f, 19.4727f, 8.0482f, 18.9877f)
                    curveTo(7.9517f, 18.5028f, 8.0012f, 18.0001f, 8.1904f, 17.5433f)
                    curveTo(8.3796f, 17.0865f, 8.7001f, 16.696f, 9.1112f, 16.4213f)
                    curveTo(9.5223f, 16.1466f, 10.0057f, 16.0f, 10.5001f, 16.0f)
                    curveTo(10.668f, 16.0003f, 10.8355f, 16.0171f, 11.0001f, 16.05f)
                    verticalLineTo(14.0f)
                    curveTo(11.0001f, 13.4696f, 11.2108f, 12.9609f, 11.5859f, 12.5858f)
                    curveTo(11.961f, 12.2107f, 12.4697f, 12.0f, 13.0001f, 12.0f)
                    horizontalLineTo(14.0001f)
                    curveTo(14.2653f, 12.0f, 14.5197f, 12.1054f, 14.7072f, 12.2929f)
                    curveTo(14.8948f, 12.4804f, 15.0001f, 12.7348f, 15.0001f, 13.0f)
                    curveTo(15.0001f, 13.2652f, 14.8948f, 13.5196f, 14.7072f, 13.7071f)
                    curveTo(14.5197f, 13.8946f, 14.2653f, 14.0f, 14.0001f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _fileMusic!!
    }

private var _fileMusic: ImageVector? = null

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

public val Icons.Bold.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0861f, 10.6841f)
                    curveTo(3.8103f, 5.7631f, 8.3866f, 2.3608f, 13.3076f, 3.085f)
                    curveTo(14.9866f, 3.332f, 16.5615f, 4.0484f, 17.8511f, 5.1516f)
                    lineTo(16.6902f, 6.3125f)
                    curveTo(16.3011f, 6.7017f, 16.3012f, 7.3327f, 16.6905f, 7.7218f)
                    curveTo(16.8773f, 7.9085f, 17.1306f, 8.0135f, 17.3948f, 8.0135f)
                    horizontalLineTo(21.9647f)
                    curveTo(22.515f, 8.0135f, 22.9611f, 7.5674f, 22.9611f, 7.017f)
                    verticalLineTo(2.4471f)
                    curveTo(22.961f, 1.8968f, 22.5148f, 1.4508f, 21.9644f, 1.4509f)
                    curveTo(21.7003f, 1.4509f, 21.4469f, 1.5559f, 21.2601f, 1.7426f)
                    lineTo(19.9646f, 3.038f)
                    curveTo(15.0245f, -1.3656f, 7.45f, -0.9307f, 3.0464f, 4.0094f)
                    curveTo(1.4863f, 5.7595f, 0.4739f, 7.9288f, 0.1346f, 10.2486f)
                    curveTo(8.0E-4f, 11.071f, 0.559f, 11.8462f, 1.3814f, 11.98f)
                    curveTo(1.4555f, 11.992f, 1.5303f, 11.9985f, 1.6054f, 11.9994f)
                    curveTo(2.3578f, 11.9913f, 2.9894f, 11.4303f, 3.0861f, 10.6841f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.3939f, 11.9992f)
                    curveTo(21.6415f, 12.0073f, 21.0099f, 12.5684f, 20.9131f, 13.3146f)
                    curveTo(20.189f, 18.2356f, 15.6127f, 21.6378f, 10.6917f, 20.9137f)
                    curveTo(9.0127f, 20.6666f, 7.4377f, 19.9503f, 6.1481f, 18.8471f)
                    lineTo(7.309f, 17.6862f)
                    curveTo(7.6981f, 17.297f, 7.698f, 16.666f, 7.3088f, 16.2769f)
                    curveTo(7.122f, 16.0902f, 6.8687f, 15.9852f, 6.6045f, 15.9852f)
                    horizontalLineTo(2.0347f)
                    curveTo(1.4844f, 15.9852f, 1.0382f, 16.4313f, 1.0382f, 16.9816f)
                    verticalLineTo(21.5515f)
                    curveTo(1.0384f, 22.1019f, 1.4846f, 22.5479f, 2.0349f, 22.5478f)
                    curveTo(2.2991f, 22.5478f, 2.5524f, 22.4428f, 2.7392f, 22.2561f)
                    lineTo(4.0346f, 20.9606f)
                    curveTo(8.9736f, 25.3647f, 16.5476f, 24.9312f, 20.9517f, 19.9922f)
                    curveTo(22.5126f, 18.2418f, 23.5255f, 16.0717f, 23.8647f, 13.7511f)
                    curveTo(23.999f, 12.9287f, 23.4413f, 12.1532f, 22.619f, 12.0189f)
                    curveTo(22.5446f, 12.0067f, 22.4693f, 12.0001f, 22.3939f, 11.9992f)
                    close()
                }
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null

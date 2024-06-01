package me.localx.icons.straight.filled

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

public val Icons.Filled.VenusMars: ImageVector
    get() {
        if (_venusMars != null) {
            return _venusMars!!
        }
        _venusMars = Builder(name = "VenusMars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9999f, 2.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(3.414f)
                    lineTo(19.5999f, 5.814f)
                    curveTo(20.6658f, 7.236f, 21.1535f, 9.0089f, 20.9647f, 10.776f)
                    curveTo(20.7759f, 12.5431f, 19.9247f, 14.173f, 18.5824f, 15.3377f)
                    curveTo(17.2402f, 16.5024f, 15.5065f, 17.1153f, 13.7305f, 17.0531f)
                    curveTo(11.9545f, 16.9909f, 10.2679f, 16.2582f, 9.0104f, 15.0025f)
                    curveTo(7.7529f, 13.7467f, 7.0178f, 12.0612f, 6.9531f, 10.2853f)
                    curveTo(6.8884f, 8.5094f, 7.4989f, 6.7748f, 8.6617f, 5.4309f)
                    curveTo(9.8245f, 4.087f, 11.4532f, 3.2335f, 13.22f, 3.0422f)
                    curveTo(14.9868f, 2.851f, 16.7605f, 3.3361f, 18.1839f, 4.4f)
                    lineTo(20.5839f, 2.0f)
                    horizontalLineTo(17.9999f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(21.9999f)
                    curveTo(22.5303f, 0.0f, 23.039f, 0.2107f, 23.4141f, 0.5858f)
                    curveTo(23.7892f, 0.9609f, 23.9999f, 1.4696f, 23.9999f, 2.0f)
                    close()
                    moveTo(7.9999f, 16.683f)
                    curveTo(7.0386f, 15.8265f, 6.2731f, 14.7729f, 5.7557f, 13.594f)
                    curveTo(5.2382f, 12.415f, 4.9808f, 11.1384f, 5.0011f, 9.851f)
                    curveTo(5.0215f, 8.5636f, 5.3189f, 7.2958f, 5.8734f, 6.1337f)
                    curveTo(6.4278f, 4.9717f, 7.2261f, 3.9427f, 8.2139f, 3.117f)
                    curveTo(7.8134f, 3.0428f, 7.4072f, 3.0037f, 6.9999f, 3.0f)
                    curveTo(5.2396f, 3.0136f, 3.549f, 3.6899f, 2.265f, 4.8942f)
                    curveTo(0.9811f, 6.0985f, 0.198f, 7.7424f, 0.0718f, 9.4982f)
                    curveTo(-0.0543f, 11.2541f, 0.4858f, 12.993f, 1.5844f, 14.3685f)
                    curveTo(2.683f, 15.7439f, 4.2596f, 16.655f, 5.9999f, 16.92f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(2.9999f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(5.9999f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(10.9999f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(16.683f)
                    close()
                }
            }
        }
        .build()
        return _venusMars!!
    }

private var _venusMars: ImageVector? = null

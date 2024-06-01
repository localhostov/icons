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

public val Icons.Filled.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.9965f, 9.2288f)
                    curveTo(12.9965f, 10.3007f, 11.3997f, 11.9924f, 10.0024f, 13.1022f)
                    curveTo(8.6052f, 11.9924f, 7.0083f, 10.3007f, 7.0083f, 9.2288f)
                    curveTo(6.9584f, 8.6242f, 7.4026f, 8.0912f, 8.0063f, 8.0311f)
                    curveTo(8.5216f, 7.9951f, 8.9684f, 8.3837f, 9.0044f, 8.8989f)
                    curveTo(9.0074f, 8.9423f, 9.0074f, 8.9858f, 9.0044f, 9.0292f)
                    horizontalLineTo(11.0005f)
                    curveTo(10.9645f, 8.514f, 11.353f, 8.0671f, 11.8682f, 8.0311f)
                    curveTo(11.9116f, 8.0281f, 11.9551f, 8.0281f, 11.9985f, 8.0311f)
                    curveTo(12.602f, 8.0917f, 13.0458f, 8.6243f, 12.9965f, 9.2288f)
                    close()
                    moveTo(24.0f, 22.5887f)
                    lineTo(22.5888f, 23.9999f)
                    lineTo(16.339f, 17.7501f)
                    curveTo(12.065f, 21.2448f, 5.7672f, 20.6129f, 2.2725f, 16.3389f)
                    curveTo(-1.2222f, 12.0648f, -0.5904f, 5.767f, 3.6837f, 2.2724f)
                    curveTo(7.9579f, -1.2223f, 14.2556f, -0.5905f, 17.7503f, 3.6836f)
                    curveTo(20.7604f, 7.365f, 20.7604f, 12.6574f, 17.7503f, 16.3388f)
                    lineTo(24.0f, 22.5887f)
                    close()
                    moveTo(14.9926f, 9.2288f)
                    curveTo(15.0436f, 7.5216f, 13.7054f, 6.0942f, 11.9985f, 6.035f)
                    curveTo(11.2529f, 6.0384f, 10.5375f, 6.3302f, 10.0024f, 6.8494f)
                    curveTo(9.4667f, 6.331f, 8.7517f, 6.0393f, 8.0063f, 6.035f)
                    curveTo(6.2991f, 6.0936f, 4.9606f, 7.5214f, 5.0122f, 9.2288f)
                    curveTo(5.0122f, 11.9654f, 8.9734f, 14.8468f, 9.4256f, 15.1662f)
                    lineTo(10.0025f, 15.5743f)
                    lineTo(10.5783f, 15.1662f)
                    curveTo(11.0304f, 14.8468f, 14.9926f, 11.9654f, 14.9926f, 9.2288f)
                    close()
                }
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null

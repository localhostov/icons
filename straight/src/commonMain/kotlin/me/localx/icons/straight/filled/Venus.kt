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

public val Icons.Filled.Venus: ImageVector
    get() {
        if (_venus != null) {
            return _venus!!
        }
        _venus = Builder(name = "Venus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9999f, 7.9993f)
                    curveTo(20.0011f, 6.4595f, 19.5579f, 4.952f, 18.7234f, 3.6579f)
                    curveTo(17.889f, 2.3637f, 16.6988f, 1.3379f, 15.2957f, 0.7035f)
                    curveTo(13.8926f, 0.0691f, 12.3362f, -0.1468f, 10.8134f, 0.0816f)
                    curveTo(9.2906f, 0.3099f, 7.866f, 0.9729f, 6.7107f, 1.991f)
                    curveTo(5.5554f, 3.0091f, 4.7185f, 4.3389f, 4.3004f, 5.8209f)
                    curveTo(3.8823f, 7.3029f, 3.9008f, 8.8741f, 4.3537f, 10.3458f)
                    curveTo(4.8065f, 11.8176f, 5.6745f, 13.1274f, 6.8534f, 14.118f)
                    curveTo(8.0323f, 15.1085f, 9.4721f, 15.7379f, 10.9999f, 15.9303f)
                    verticalLineTo(18.9993f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(20.9993f)
                    horizontalLineTo(10.9999f)
                    verticalLineTo(23.9993f)
                    horizontalLineTo(12.9999f)
                    verticalLineTo(20.9993f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(18.9993f)
                    horizontalLineTo(12.9999f)
                    verticalLineTo(15.9303f)
                    curveTo(14.9314f, 15.6853f, 16.7074f, 14.7449f, 17.9958f, 13.2852f)
                    curveTo(19.2842f, 11.8254f, 19.9966f, 9.9463f, 19.9999f, 7.9993f)
                    close()
                }
            }
        }
        .build()
        return _venus!!
    }

private var _venus: ImageVector? = null

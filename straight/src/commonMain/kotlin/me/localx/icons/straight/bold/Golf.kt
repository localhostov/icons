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

public val Icons.Bold.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 10.0001f)
                    curveTo(10.9963f, 10.0009f, 9.9939f, 10.0714f, 9.0f, 10.2111f)
                    verticalLineTo(7.0221f)
                    lineTo(14.0f, 4.5001f)
                    lineTo(8.0f, 0.1341f)
                    curveTo(7.777f, 0.0208f, 7.5276f, -0.0299f, 7.2781f, -0.0126f)
                    curveTo(7.0286f, 0.0047f, 6.7885f, 0.0893f, 6.5833f, 0.2323f)
                    curveTo(6.3781f, 0.3752f, 6.2155f, 0.5711f, 6.1128f, 0.7991f)
                    curveTo(6.01f, 1.0271f, 5.9711f, 1.2787f, 6.0f, 1.5271f)
                    verticalLineTo(10.8841f)
                    curveTo(2.361f, 12.0591f, 0.0f, 14.3001f, 0.0f, 17.0001f)
                    curveTo(0.0f, 20.9911f, 5.159f, 24.0001f, 12.0f, 24.0001f)
                    curveTo(18.841f, 24.0001f, 24.0f, 20.9911f, 24.0f, 17.0001f)
                    curveTo(24.0f, 13.0091f, 18.841f, 10.0001f, 12.0f, 10.0001f)
                    close()
                    moveTo(12.0f, 21.0001f)
                    curveTo(6.849f, 21.0001f, 3.0f, 18.8881f, 3.0f, 17.0001f)
                    curveTo(3.0f, 15.9751f, 4.14f, 14.8871f, 6.0f, 14.1001f)
                    verticalLineTo(17.0001f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(13.2541f)
                    curveTo(9.991f, 13.0844f, 10.9946f, 12.9994f, 12.0f, 13.0001f)
                    curveTo(17.151f, 13.0001f, 21.0f, 15.1121f, 21.0f, 17.0001f)
                    curveTo(21.0f, 18.8881f, 17.151f, 21.0001f, 12.0f, 21.0001f)
                    close()
                    moveTo(17.0f, 17.0001f)
                    curveTo(17.0f, 17.3956f, 16.8827f, 17.7823f, 16.6629f, 18.1112f)
                    curveTo(16.4432f, 18.4401f, 16.1308f, 18.6964f, 15.7654f, 18.8478f)
                    curveTo(15.3999f, 18.9992f, 14.9978f, 19.0388f, 14.6098f, 18.9616f)
                    curveTo(14.2219f, 18.8845f, 13.8655f, 18.694f, 13.5858f, 18.4143f)
                    curveTo(13.3061f, 18.1346f, 13.1156f, 17.7782f, 13.0384f, 17.3902f)
                    curveTo(12.9613f, 17.0023f, 13.0009f, 16.6001f, 13.1522f, 16.2347f)
                    curveTo(13.3036f, 15.8692f, 13.56f, 15.5569f, 13.8889f, 15.3371f)
                    curveTo(14.2178f, 15.1174f, 14.6044f, 15.0001f, 15.0f, 15.0001f)
                    curveTo(15.5304f, 15.0001f, 16.0391f, 15.2108f, 16.4142f, 15.5858f)
                    curveTo(16.7893f, 15.9609f, 17.0f, 16.4696f, 17.0f, 17.0001f)
                    close()
                }
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null

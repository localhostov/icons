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

public val Icons.Bold.Picture: ImageVector
    get() {
        if (_picture != null) {
            return _picture!!
        }
        _picture = Builder(name = "Picture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.5f, 0.0f)
                    horizontalLineTo(4.5f)
                    curveTo(3.3069f, 0.0013f, 2.1631f, 0.4759f, 1.3195f, 1.3195f)
                    curveTo(0.4759f, 2.1631f, 0.0013f, 3.3069f, 0.0f, 4.5f)
                    lineTo(0.0f, 19.5f)
                    curveTo(0.0013f, 20.6931f, 0.4759f, 21.8369f, 1.3195f, 22.6805f)
                    curveTo(2.1631f, 23.5241f, 3.3069f, 23.9987f, 4.5f, 24.0f)
                    horizontalLineTo(19.5f)
                    curveTo(20.6931f, 23.9987f, 21.8369f, 23.5241f, 22.6805f, 22.6805f)
                    curveTo(23.5241f, 21.8369f, 23.9987f, 20.6931f, 24.0f, 19.5f)
                    verticalLineTo(4.5f)
                    curveTo(23.9987f, 3.3069f, 23.5241f, 2.1631f, 22.6805f, 1.3195f)
                    curveTo(21.8369f, 0.4759f, 20.6931f, 0.0013f, 19.5f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(4.5f, 3.0f)
                    horizontalLineTo(19.5f)
                    curveTo(19.8978f, 3.0f, 20.2794f, 3.158f, 20.5607f, 3.4393f)
                    curveTo(20.842f, 3.7206f, 21.0f, 4.1022f, 21.0f, 4.5f)
                    verticalLineTo(19.5f)
                    curveTo(21.0003f, 19.697f, 20.9615f, 19.8921f, 20.886f, 20.074f)
                    curveTo(20.8105f, 20.2559f, 20.6997f, 20.4211f, 20.56f, 20.56f)
                    lineTo(11.828f, 11.828f)
                    curveTo(11.0779f, 11.0781f, 10.0607f, 10.6569f, 9.0f, 10.6569f)
                    curveTo(7.9393f, 10.6569f, 6.9221f, 11.0781f, 6.172f, 11.828f)
                    lineTo(3.0f, 15.0f)
                    verticalLineTo(4.5f)
                    curveTo(3.0f, 4.1022f, 3.158f, 3.7206f, 3.4393f, 3.4393f)
                    curveTo(3.7206f, 3.158f, 4.1022f, 3.0f, 4.5f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.4999f, 9.9997f)
                    curveTo(16.8806f, 9.9997f, 17.9999f, 8.8804f, 17.9999f, 7.4997f)
                    curveTo(17.9999f, 6.119f, 16.8806f, 4.9997f, 15.4999f, 4.9997f)
                    curveTo(14.1192f, 4.9997f, 12.9999f, 6.119f, 12.9999f, 7.4997f)
                    curveTo(12.9999f, 8.8804f, 14.1192f, 9.9997f, 15.4999f, 9.9997f)
                    close()
                }
            }
        }
        .build()
        return _picture!!
    }

private var _picture: ImageVector? = null

package me.localx.icons.rounded.filled

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

public val Icons.Filled.ChartPieAlt: ImageVector
    get() {
        if (_chartPieAlt != null) {
            return _chartPieAlt!!
        }
        _chartPieAlt = Builder(name = "ChartPieAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.7132f, 11.9999f)
                    horizontalLineTo(14.0002f)
                    curveTo(12.8957f, 11.9999f, 12.0002f, 11.1045f, 12.0002f, 9.9999f)
                    verticalLineTo(5.2739f)
                    curveTo(12.003f, 4.3416f, 11.5721f, 3.4609f, 10.8342f, 2.891f)
                    curveTo(10.135f, 2.3373f, 9.2182f, 2.1399f, 8.3532f, 2.357f)
                    curveTo(2.4737f, 3.8165f, -1.1095f, 9.766f, 0.35f, 15.6455f)
                    curveTo(1.3783f, 19.788f, 4.7162f, 22.9578f, 8.9062f, 23.771f)
                    curveTo(14.6301f, 24.8666f, 20.2152f, 21.3078f, 21.6402f, 15.6569f)
                    curveTo(21.8581f, 14.7908f, 21.6611f, 13.8726f, 21.1072f, 13.172f)
                    curveTo(20.5307f, 12.4354f, 19.6486f, 12.0035f, 18.7132f, 11.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.6508f, 7.4461f)
                    curveTo(23.4225f, 6.5975f, 23.0826f, 5.7831f, 22.6398f, 5.0241f)
                    curveTo(21.3081f, 2.7395f, 19.1327f, 1.069f, 16.5818f, 0.372f)
                    curveTo(16.4138f, 0.3267f, 16.0378f, 0.3f, 16.0378f, 0.3f)
                    curveTo(15.9034f, 0.3001f, 15.3248f, 0.3f, 14.8668f, 0.6711f)
                    curveTo(14.1936f, 1.2008f, 14.0878f, 1.8031f, 14.0778f, 1.8501f)
                    curveTo(14.0429f, 1.9975f, 14.0247f, 2.1485f, 14.0238f, 2.3001f)
                    verticalLineTo(7.0001f)
                    curveTo(14.0238f, 8.6569f, 15.367f, 10.0001f, 17.0238f, 10.0001f)
                    horizontalLineTo(21.7428f)
                    curveTo(22.3689f, 10.0019f, 22.9581f, 9.7046f, 23.3288f, 9.2001f)
                    curveTo(23.603f, 8.8305f, 23.744f, 8.379f, 23.7288f, 7.9191f)
                    curveTo(23.7209f, 7.7589f, 23.6947f, 7.6002f, 23.6508f, 7.4461f)
                    close()
                }
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null

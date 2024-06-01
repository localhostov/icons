package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0003f, 2.4163f)
                    verticalLineTo(4.5163f)
                    curveTo(17.0019f, 5.224f, 18.6889f, 6.6165f, 19.7632f, 8.4478f)
                    curveTo(20.8374f, 10.279f, 21.2297f, 12.431f, 20.8707f, 14.5235f)
                    curveTo(20.5116f, 16.616f, 19.4245f, 18.5142f, 17.8013f, 19.8826f)
                    curveTo(16.178f, 21.2511f, 14.1233f, 22.0016f, 12.0003f, 22.0016f)
                    curveTo(9.8772f, 22.0016f, 7.8225f, 21.2511f, 6.1993f, 19.8826f)
                    curveTo(4.5761f, 18.5142f, 3.4889f, 16.616f, 3.1299f, 14.5235f)
                    curveTo(2.7709f, 12.431f, 3.1631f, 10.279f, 4.2374f, 8.4478f)
                    curveTo(5.3116f, 6.6165f, 6.9986f, 5.224f, 9.0003f, 4.5163f)
                    verticalLineTo(2.4163f)
                    curveTo(6.4459f, 3.1404f, 4.2396f, 4.764f, 2.7885f, 6.9874f)
                    curveTo(1.3374f, 9.2108f, 0.7395f, 11.884f, 1.105f, 14.5137f)
                    curveTo(1.4705f, 17.1435f, 2.7749f, 19.5523f, 4.7773f, 21.2957f)
                    curveTo(6.7798f, 23.039f, 9.3452f, 23.9993f, 12.0003f, 23.9993f)
                    curveTo(14.6553f, 23.9993f, 17.2207f, 23.039f, 19.2232f, 21.2957f)
                    curveTo(21.2257f, 19.5523f, 22.53f, 17.1435f, 22.8955f, 14.5137f)
                    curveTo(23.2611f, 11.884f, 22.6631f, 9.2108f, 21.212f, 6.9874f)
                    curveTo(19.7609f, 4.764f, 17.5547f, 3.1404f, 15.0003f, 2.4163f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0001f, 0.0f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null

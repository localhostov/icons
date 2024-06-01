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

public val Icons.Bold.TrainSide: ImageVector
    get() {
        if (_trainSide != null) {
            return _trainSide!!
        }
        _trainSide = Builder(name = "TrainSide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.5f, 0.9994f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.9994f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(6.9994f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.9994f)
                    horizontalLineTo(19.161f)
                    curveTo(20.0973f, 11.5206f, 20.6939f, 13.2262f, 20.91f, 14.9994f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(17.9994f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(16.4994f)
                    curveTo(23.9955f, 12.3899f, 22.361f, 8.45f, 19.4552f, 5.5442f)
                    curveTo(16.5493f, 2.6384f, 12.6095f, 1.0039f, 8.5f, 0.9994f)
                    close()
                    moveTo(16.6f, 6.9994f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(4.4994f)
                    curveTo(13.6929f, 4.998f, 15.2607f, 5.8501f, 16.6f, 6.9994f)
                    close()
                    moveTo(6.0f, 3.9994f)
                    horizontalLineTo(8.5f)
                    curveTo(8.669f, 3.9994f, 8.833f, 4.0164f, 9.0f, 4.0224f)
                    verticalLineTo(6.9994f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(3.9994f)
                    close()
                    moveTo(0.0f, 19.9994f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(22.9994f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(19.9994f)
                    close()
                }
            }
        }
        .build()
        return _trainSide!!
    }

private var _trainSide: ImageVector? = null

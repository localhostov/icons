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

public val Icons.Filled.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.252f, 6.334f)
                    curveTo(14.7736f, 4.6278f, 13.9723f, 2.4385f, 14.0f, 0.181f)
                    curveTo(16.1183f, 0.5369f, 18.1015f, 1.4572f, 19.741f, 2.845f)
                    lineTo(16.252f, 6.334f)
                    close()
                    moveTo(7.752f, 14.834f)
                    lineTo(10.586f, 12.0f)
                    lineTo(2.845f, 4.259f)
                    curveTo(1.0076f, 6.4197f, -9.0E-4f, 9.1637f, 0.0f, 12.0f)
                    horizontalLineTo(0.323f)
                    curveTo(3.0555f, 12.04f, 5.6859f, 13.0449f, 7.749f, 14.837f)
                    lineTo(7.752f, 14.834f)
                    close()
                    moveTo(21.155f, 4.259f)
                    lineTo(17.666f, 7.748f)
                    curveTo(19.3864f, 9.2022f, 21.5663f, 10.0001f, 23.819f, 10.0f)
                    curveTo(23.4631f, 7.8817f, 22.5428f, 5.8985f, 21.155f, 4.259f)
                    close()
                    moveTo(14.837f, 7.749f)
                    curveTo(13.0451f, 5.6858f, 12.0402f, 3.0555f, 12.0f, 0.323f)
                    verticalLineTo(0.0f)
                    curveTo(9.1637f, -9.0E-4f, 6.4197f, 1.0076f, 4.259f, 2.845f)
                    lineTo(12.0f, 10.586f)
                    lineTo(14.837f, 7.749f)
                    close()
                    moveTo(23.677f, 12.0f)
                    curveTo(20.9445f, 11.9599f, 18.3142f, 10.955f, 16.251f, 9.163f)
                    lineTo(13.414f, 12.0f)
                    lineTo(21.155f, 19.741f)
                    curveTo(22.9924f, 17.5803f, 24.0009f, 14.8363f, 24.0f, 12.0f)
                    horizontalLineTo(23.677f)
                    close()
                    moveTo(9.163f, 16.251f)
                    curveTo(10.9232f, 18.3218f, 11.924f, 20.9313f, 12.0f, 23.648f)
                    verticalLineTo(24.0f)
                    curveTo(14.8363f, 24.0009f, 17.5803f, 22.9924f, 19.741f, 21.155f)
                    lineTo(12.0f, 13.414f)
                    lineTo(9.163f, 16.251f)
                    close()
                    moveTo(7.746f, 17.668f)
                    lineTo(4.259f, 21.155f)
                    curveTo(5.8985f, 22.5428f, 7.8817f, 23.4631f, 10.0f, 23.819f)
                    curveTo(10.0022f, 21.5662f, 9.2032f, 19.386f, 7.746f, 17.668f)
                    close()
                    moveTo(0.181f, 14.0f)
                    curveTo(0.5369f, 16.1183f, 1.4572f, 18.1015f, 2.845f, 19.741f)
                    lineTo(6.334f, 16.252f)
                    curveTo(4.6171f, 14.7917f, 2.4349f, 13.993f, 0.181f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null

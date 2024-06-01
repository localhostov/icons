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

public val Icons.Filled.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.081f, 5.5053f)
                    lineTo(11.007f, 2.5783f)
                    lineTo(11.0f, 18.0161f)
                    curveTo(11.0f, 18.5683f, 11.4477f, 19.016f, 11.9999f, 19.016f)
                    curveTo(12.5522f, 19.016f, 12.9999f, 18.5683f, 12.9999f, 18.0161f)
                    lineTo(13.0069f, 2.5953f)
                    lineTo(15.9189f, 5.5083f)
                    curveTo(16.3161f, 5.892f, 16.9492f, 5.881f, 17.3328f, 5.4837f)
                    curveTo(17.7071f, 5.0962f, 17.7071f, 4.4818f, 17.3328f, 4.0943f)
                    lineTo(14.1219f, 0.8794f)
                    curveTo(12.9507f, -0.2926f, 11.0513f, -0.2932f, 9.8793f, 0.878f)
                    curveTo(9.8788f, 0.8785f, 9.8784f, 0.8789f, 9.8779f, 0.8794f)
                    lineTo(6.667f, 4.0913f)
                    curveTo(6.2833f, 4.4886f, 6.2943f, 5.1216f, 6.6916f, 5.5053f)
                    curveTo(7.0791f, 5.8796f, 7.6935f, 5.8796f, 8.081f, 5.5053f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.9997f, 15.9998f)
                    curveTo(22.4475f, 15.9998f, 21.9998f, 16.4475f, 21.9998f, 16.9998f)
                    verticalLineTo(20.9997f)
                    curveTo(21.9998f, 21.552f, 21.5521f, 21.9997f, 20.9998f, 21.9997f)
                    horizontalLineTo(3.0001f)
                    curveTo(2.4478f, 21.9997f, 2.0001f, 21.552f, 2.0001f, 20.9997f)
                    verticalLineTo(16.9998f)
                    curveTo(2.0001f, 16.4475f, 1.5524f, 15.9998f, 1.0001f, 15.9998f)
                    curveTo(0.4479f, 15.9998f, 2.0E-4f, 16.4475f, 2.0E-4f, 16.9998f)
                    verticalLineTo(20.9997f)
                    curveTo(2.0E-4f, 22.6566f, 1.3433f, 23.9997f, 3.0001f, 23.9997f)
                    horizontalLineTo(20.9999f)
                    curveTo(22.6567f, 23.9997f, 23.9998f, 22.6566f, 23.9998f, 20.9997f)
                    verticalLineTo(16.9998f)
                    curveTo(23.9997f, 16.4475f, 23.552f, 15.9998f, 22.9997f, 15.9998f)
                    close()
                }
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null

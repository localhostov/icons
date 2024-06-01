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

public val Icons.Bold.DocumentSigned: ImageVector
    get() {
        if (_documentSigned != null) {
            return _documentSigned!!
        }
        _documentSigned = Builder(name = "DocumentSigned", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.6819f, 3.561f)
                    lineTo(18.4399f, 1.319f)
                    curveTo(17.5946f, 0.4771f, 16.451f, 0.0031f, 15.2579f, 0.0f)
                    lineTo(5.4999f, 0.0f)
                    curveTo(4.5717f, 0.0f, 3.6814f, 0.3687f, 3.0251f, 1.0251f)
                    curveTo(2.3687f, 1.6815f, 1.9999f, 2.5717f, 1.9999f, 3.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(6.743f)
                    curveTo(22.0014f, 6.1518f, 21.8856f, 5.5663f, 21.6594f, 5.0201f)
                    curveTo(21.4332f, 4.4739f, 21.101f, 3.978f, 20.6819f, 3.561f)
                    close()
                    moveTo(4.9999f, 21.0f)
                    verticalLineTo(3.5f)
                    curveTo(4.9999f, 3.3674f, 5.0526f, 3.2402f, 5.1464f, 3.1465f)
                    curveTo(5.2401f, 3.0527f, 5.3673f, 3.0f, 5.4999f, 3.0f)
                    horizontalLineTo(14.9999f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(18.9999f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(4.9999f)
                    close()
                    moveTo(15.9999f, 13.0f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(13.8679f, 15.023f)
                    lineTo(16.7159f, 15.969f)
                    curveTo(16.3469f, 17.1f, 15.1769f, 19.0f, 13.1349f, 19.0f)
                    curveTo(12.3083f, 18.9962f, 11.507f, 18.7144f, 10.8599f, 18.2f)
                    curveTo(10.7664f, 18.1202f, 10.6629f, 18.0529f, 10.5519f, 18.0f)
                    curveTo(10.2382f, 18.225f, 9.9672f, 18.5044f, 9.7519f, 18.825f)
                    lineTo(7.2519f, 17.161f)
                    curveTo(7.5909f, 16.659f, 8.8259f, 15.0f, 10.4869f, 15.0f)
                    curveTo(11.2558f, 15.0066f, 11.9997f, 15.273f, 12.5979f, 15.756f)
                    curveTo(12.8979f, 15.973f, 12.9519f, 16.0f, 13.1349f, 16.0f)
                    curveTo(13.3389f, 16.0f, 13.7209f, 15.45f, 13.8679f, 15.023f)
                    close()
                }
            }
        }
        .build()
        return _documentSigned!!
    }

private var _documentSigned: ImageVector? = null

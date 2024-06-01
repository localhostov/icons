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

public val Icons.Filled.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9998f, 2.0003f)
                    curveTo(14.6791f, 2.0091f, 17.2435f, 3.0893f, 19.1216f, 5.0002f)
                    horizontalLineTo(15.9997f)
                    curveTo(15.4474f, 5.0002f, 14.9997f, 5.4479f, 14.9997f, 6.0002f)
                    curveTo(14.9997f, 6.5525f, 15.4474f, 7.0001f, 15.9997f, 7.0001f)
                    horizontalLineTo(20.1425f)
                    curveTo(21.1678f, 6.9996f, 21.9989f, 6.1685f, 21.9995f, 5.1432f)
                    verticalLineTo(1.0003f)
                    curveTo(21.9995f, 0.4481f, 21.5518f, 4.0E-4f, 20.9995f, 4.0E-4f)
                    curveTo(20.4472f, 4.0E-4f, 19.9996f, 0.4481f, 19.9996f, 1.0003f)
                    verticalLineTo(3.0783f)
                    curveTo(15.0828f, -1.3497f, 7.5075f, -0.9535f, 3.0795f, 3.9632f)
                    curveTo(1.3466f, 5.8873f, 0.2837f, 8.3211f, 0.0502f, 10.9f)
                    curveTo(-0.0012f, 11.4538f, 0.4061f, 11.9443f, 0.9599f, 11.9957f)
                    curveTo(0.9899f, 11.9985f, 1.02f, 11.9999f, 1.0502f, 12.0f)
                    curveTo(1.557f, 12.0065f, 1.9855f, 11.6261f, 2.0392f, 11.122f)
                    curveTo(2.5005f, 5.9629f, 6.8201f, 2.0071f, 11.9998f, 2.0003f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.9505f, 12.0002f)
                    curveTo(22.4436f, 11.9937f, 22.0152f, 12.3741f, 21.9615f, 12.8782f)
                    curveTo(21.4843f, 18.3724f, 16.6435f, 22.4396f, 11.1492f, 21.9623f)
                    curveTo(8.772f, 21.7559f, 6.5473f, 20.7049f, 4.878f, 19.0f)
                    horizontalLineTo(8.0f)
                    curveTo(8.5522f, 19.0f, 8.9999f, 18.5523f, 8.9999f, 18.0f)
                    curveTo(8.9999f, 17.4478f, 8.5522f, 17.0001f, 8.0f, 17.0001f)
                    horizontalLineTo(3.8571f)
                    curveTo(2.8321f, 16.9995f, 2.0007f, 17.83f, 2.0001f, 18.855f)
                    curveTo(2.0001f, 18.8556f, 2.0001f, 18.8563f, 2.0001f, 18.857f)
                    verticalLineTo(22.9999f)
                    curveTo(2.0001f, 23.5521f, 2.4478f, 23.9998f, 3.0001f, 23.9998f)
                    curveTo(3.5524f, 23.9998f, 4.0001f, 23.5521f, 4.0001f, 22.9999f)
                    verticalLineTo(20.9219f)
                    curveTo(8.9168f, 25.3499f, 16.4921f, 24.9538f, 20.9201f, 20.037f)
                    curveTo(22.653f, 18.1129f, 23.7159f, 15.6791f, 23.9494f, 13.1001f)
                    curveTo(24.0008f, 12.5464f, 23.5935f, 12.0558f, 23.0398f, 12.0045f)
                    curveTo(23.0101f, 12.0018f, 22.9803f, 12.0003f, 22.9505f, 12.0002f)
                    close()
                }
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null

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

public val Icons.Filled.DocumentSigned: ImageVector
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
                    moveTo(14.0f, 7.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.2043f, 0.0f, 4.4413f, 0.3161f, 3.8787f, 0.8787f)
                    curveTo(3.3161f, 1.4413f, 3.0f, 2.2043f, 3.0f, 3.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(14.0f)
                    close()
                    moveTo(7.0f, 10.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(7.0f, 14.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(14.0f)
                    close()
                    moveTo(13.135f, 21.0f)
                    curveTo(12.4116f, 20.9994f, 11.7105f, 20.7501f, 11.149f, 20.294f)
                    curveTo(10.835f, 20.071f, 10.725f, 20.0f, 10.487f, 20.0f)
                    curveTo(9.8269f, 20.0227f, 9.1953f, 20.2749f, 8.701f, 20.713f)
                    lineTo(7.293f, 19.293f)
                    curveTo(8.159f, 18.4785f, 9.2983f, 18.0173f, 10.487f, 18.0f)
                    curveTo(11.1518f, 18.0079f, 11.7941f, 18.2421f, 12.308f, 18.664f)
                    curveTo(12.5321f, 18.8752f, 12.8271f, 18.995f, 13.135f, 19.0f)
                    curveTo(13.86f, 19.0f, 14.823f, 17.945f, 15.176f, 17.434f)
                    lineTo(16.826f, 18.564f)
                    curveTo(16.655f, 18.813f, 15.106f, 21.0f, 13.135f, 21.0f)
                    close()
                    moveTo(16.0f, 0.219f)
                    curveTo(16.5959f, 0.4083f, 17.1391f, 0.7347f, 17.586f, 1.172f)
                    lineTo(19.828f, 3.414f)
                    curveTo(20.2676f, 3.8598f, 20.5956f, 4.4033f, 20.785f, 5.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(0.219f)
                    close()
                }
            }
        }
        .build()
        return _documentSigned!!
    }

private var _documentSigned: ImageVector? = null

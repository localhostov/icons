package me.localx.icons.straight.outline

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

public val Icons.Outline.DocumentSigned: ImageVector
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
                    moveTo(21.0f, 6.243f)
                    curveTo(21.0014f, 5.7174f, 20.8985f, 5.1967f, 20.6973f, 4.7111f)
                    curveTo(20.4962f, 4.2255f, 20.2007f, 3.7846f, 19.828f, 3.414f)
                    lineTo(17.586f, 1.172f)
                    curveTo(16.8347f, 0.4238f, 15.8183f, 0.0026f, 14.758f, 0.0f)
                    lineTo(6.0f, 0.0f)
                    curveTo(5.2043f, 0.0f, 4.4413f, 0.3161f, 3.8787f, 0.8787f)
                    curveTo(3.3161f, 1.4413f, 3.0f, 2.2043f, 3.0f, 3.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(6.243f)
                    close()
                    moveTo(18.414f, 4.828f)
                    curveTo(18.4643f, 4.8826f, 18.5114f, 4.94f, 18.555f, 5.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(2.445f)
                    curveTo(16.06f, 2.4886f, 16.1174f, 2.5357f, 16.172f, 2.586f)
                    lineTo(18.414f, 4.828f)
                    close()
                    moveTo(5.0f, 22.0f)
                    verticalLineTo(3.0f)
                    curveTo(5.0f, 2.7348f, 5.1054f, 2.4804f, 5.2929f, 2.2929f)
                    curveTo(5.4804f, 2.1054f, 5.7348f, 2.0f, 6.0f, 2.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(5.0f)
                    close()
                    moveTo(8.0f, 9.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(8.0f, 13.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(14.018f, 16.814f)
                    lineTo(15.983f, 17.18f)
                    curveTo(15.792f, 18.227f, 14.978f, 20.0f, 13.135f, 20.0f)
                    curveTo(12.4116f, 19.9994f, 11.7105f, 19.7501f, 11.149f, 19.294f)
                    curveTo(10.835f, 19.071f, 10.725f, 19.0f, 10.487f, 19.0f)
                    curveTo(10.129f, 19.1357f, 9.8131f, 19.3634f, 9.571f, 19.66f)
                    lineTo(8.071f, 18.343f)
                    curveTo(8.6759f, 17.6039f, 9.54f, 17.1236f, 10.487f, 17.0f)
                    curveTo(11.1518f, 17.0079f, 11.7941f, 17.2421f, 12.308f, 17.664f)
                    curveTo(12.5321f, 17.8752f, 12.8271f, 17.995f, 13.135f, 18.0f)
                    curveTo(13.758f, 18.0f, 14.015f, 16.827f, 14.018f, 16.814f)
                    close()
                }
            }
        }
        .build()
        return _documentSigned!!
    }

private var _documentSigned: ImageVector? = null

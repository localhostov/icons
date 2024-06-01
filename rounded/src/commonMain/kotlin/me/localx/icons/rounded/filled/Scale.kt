package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 5.0f)
                    curveTo(7.0f, 3.6739f, 7.5268f, 2.4021f, 8.4645f, 1.4645f)
                    curveTo(9.4022f, 0.5268f, 10.6739f, 0.0f, 12.0f, 0.0f)
                    curveTo(13.3261f, 0.0f, 14.5979f, 0.5268f, 15.5355f, 1.4645f)
                    curveTo(16.4732f, 2.4021f, 17.0f, 3.6739f, 17.0f, 5.0f)
                    curveTo(17.0f, 5.5304f, 16.7893f, 6.0391f, 16.4142f, 6.4142f)
                    curveTo(16.0391f, 6.7893f, 15.5304f, 7.0f, 15.0f, 7.0f)
                    horizontalLineTo(12.2f)
                    lineTo(13.83f, 4.555f)
                    curveTo(13.9772f, 4.3343f, 14.0307f, 4.0642f, 13.9788f, 3.8041f)
                    curveTo(13.9268f, 3.544f, 13.7737f, 3.3152f, 13.553f, 3.168f)
                    curveTo(13.3323f, 3.0208f, 13.0622f, 2.9673f, 12.8021f, 3.0192f)
                    curveTo(12.542f, 3.0712f, 12.3132f, 3.2243f, 12.166f, 3.445f)
                    lineTo(9.8f, 7.0f)
                    horizontalLineTo(9.0f)
                    curveTo(8.4696f, 7.0f, 7.9609f, 6.7893f, 7.5858f, 6.4142f)
                    curveTo(7.2107f, 6.0391f, 7.0f, 5.5304f, 7.0f, 5.0f)
                    close()
                    moveTo(19.0f, 2.0f)
                    horizontalLineTo(18.326f)
                    curveTo(18.7706f, 2.9376f, 19.0009f, 3.9624f, 19.0f, 5.0f)
                    curveTo(19.0f, 6.0609f, 18.5786f, 7.0783f, 17.8284f, 7.8284f)
                    curveTo(17.0783f, 8.5786f, 16.0609f, 9.0f, 15.0f, 9.0f)
                    horizontalLineTo(8.466f)
                    lineTo(8.474f, 8.987f)
                    curveTo(7.5277f, 8.9078f, 6.6455f, 8.4763f, 6.0022f, 7.7778f)
                    curveTo(5.3589f, 7.0792f, 5.0012f, 6.1646f, 5.0f, 5.215f)
                    curveTo(5.0049f, 4.1009f, 5.2602f, 3.0021f, 5.747f, 2.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6739f, 2.0f, 2.4021f, 2.5268f, 1.4645f, 3.4645f)
                    curveTo(0.5268f, 4.4022f, 0.0f, 5.6739f, 0.0f, 7.0f)
                    lineTo(0.0f, 19.0f)
                    curveTo(0.0f, 19.6566f, 0.1293f, 20.3068f, 0.3806f, 20.9134f)
                    curveTo(0.6319f, 21.52f, 1.0002f, 22.0712f, 1.4645f, 22.5355f)
                    curveTo(2.4021f, 23.4732f, 3.6739f, 24.0f, 5.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.6566f, 24.0f, 20.3068f, 23.8707f, 20.9134f, 23.6194f)
                    curveTo(21.52f, 23.3681f, 22.0712f, 22.9998f, 22.5355f, 22.5355f)
                    curveTo(22.9998f, 22.0712f, 23.3681f, 21.52f, 23.6194f, 20.9134f)
                    curveTo(23.8707f, 20.3068f, 24.0f, 19.6566f, 24.0f, 19.0f)
                    verticalLineTo(7.0f)
                    curveTo(24.0f, 6.3434f, 23.8707f, 5.6932f, 23.6194f, 5.0866f)
                    curveTo(23.3681f, 4.4799f, 22.9998f, 3.9288f, 22.5355f, 3.4645f)
                    curveTo(22.0712f, 3.0002f, 21.52f, 2.6319f, 20.9134f, 2.3806f)
                    curveTo(20.3068f, 2.1293f, 19.6566f, 2.0f, 19.0f, 2.0f)
                    close()
                }
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null

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

public val Icons.Filled.Sphere: ImageVector
    get() {
        if (_sphere != null) {
            return _sphere!!
        }
        _sphere = Builder(name = "Sphere", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 17.9992f)
                    curveTo(7.4391f, 17.9992f, 2.6361f, 16.9992f, 0.3581f, 14.8622f)
                    curveTo(0.9955f, 17.4689f, 2.4892f, 19.7862f, 4.6f, 21.4431f)
                    curveTo(6.7109f, 23.0999f, 9.3167f, 24.0005f, 12.0001f, 24.0005f)
                    curveTo(14.6835f, 24.0005f, 17.2893f, 23.0999f, 19.4002f, 21.4431f)
                    curveTo(21.511f, 19.7862f, 23.0047f, 17.4689f, 23.6421f, 14.8622f)
                    curveTo(21.3641f, 16.9992f, 16.5611f, 17.9992f, 12.0001f, 17.9992f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 6.0009f)
                    curveTo(16.5611f, 6.0009f, 21.3641f, 7.0009f, 23.6421f, 9.1379f)
                    curveTo(23.0047f, 6.5313f, 21.511f, 4.214f, 19.4002f, 2.5571f)
                    curveTo(17.2893f, 0.9002f, 14.6835f, -3.0E-4f, 12.0001f, -3.0E-4f)
                    curveTo(9.3167f, -3.0E-4f, 6.7109f, 0.9002f, 4.6f, 2.5571f)
                    curveTo(2.4892f, 4.214f, 0.9955f, 6.5313f, 0.3581f, 9.1379f)
                    curveTo(2.6361f, 7.0009f, 7.4391f, 6.0009f, 12.0001f, 6.0009f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 16.0006f)
                    curveTo(18.0752f, 16.0006f, 23.0001f, 14.2097f, 23.0001f, 12.0006f)
                    curveTo(23.0001f, 9.7915f, 18.0752f, 8.0006f, 12.0001f, 8.0006f)
                    curveTo(5.9249f, 8.0006f, 1.0001f, 9.7915f, 1.0001f, 12.0006f)
                    curveTo(1.0001f, 14.2097f, 5.9249f, 16.0006f, 12.0001f, 16.0006f)
                    close()
                }
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null

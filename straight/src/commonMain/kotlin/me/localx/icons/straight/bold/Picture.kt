package me.localx.icons.straight.bold

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

public val Icons.Bold.Picture: ImageVector
    get() {
        if (_picture != null) {
            return _picture!!
        }
        _picture = Builder(name = "Picture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.591f, 0.0f)
                    horizontalLineTo(3.409f)
                    curveTo(2.5052f, 0.0011f, 1.6387f, 0.3606f, 0.9996f, 0.9996f)
                    curveTo(0.3606f, 1.6387f, 0.0011f, 2.5052f, 0.0f, 3.409f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.409f)
                    curveTo(23.9989f, 2.5052f, 23.6394f, 1.6387f, 23.0004f, 0.9996f)
                    curveTo(22.3613f, 0.3606f, 21.4948f, 0.0011f, 20.591f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(3.409f, 3.0f)
                    horizontalLineTo(20.591f)
                    curveTo(20.6994f, 3.0003f, 20.8033f, 3.0434f, 20.8799f, 3.1201f)
                    curveTo(20.9566f, 3.1967f, 20.9997f, 3.3006f, 21.0f, 3.409f)
                    verticalLineTo(21.0f)
                    lineTo(10.414f, 10.414f)
                    curveTo(10.0389f, 10.0391f, 9.5303f, 9.8284f, 9.0f, 9.8284f)
                    curveTo(8.4697f, 9.8284f, 7.9611f, 10.0391f, 7.586f, 10.414f)
                    lineTo(3.0f, 15.0f)
                    verticalLineTo(3.409f)
                    curveTo(3.0003f, 3.3006f, 3.0434f, 3.1967f, 3.1201f, 3.1201f)
                    curveTo(3.1967f, 3.0434f, 3.3006f, 3.0003f, 3.409f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.4998f, 9.9997f)
                    curveTo(16.8805f, 9.9997f, 17.9998f, 8.8804f, 17.9998f, 7.4997f)
                    curveTo(17.9998f, 6.119f, 16.8805f, 4.9997f, 15.4998f, 4.9997f)
                    curveTo(14.1191f, 4.9997f, 12.9998f, 6.119f, 12.9998f, 7.4997f)
                    curveTo(12.9998f, 8.8804f, 14.1191f, 9.9997f, 15.4998f, 9.9997f)
                    close()
                }
            }
        }
        .build()
        return _picture!!
    }

private var _picture: ImageVector? = null

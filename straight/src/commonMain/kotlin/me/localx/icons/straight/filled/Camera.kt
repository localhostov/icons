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

public val Icons.Filled.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 18.9999f)
                    curveTo(14.2092f, 18.9999f, 16.0001f, 17.209f, 16.0001f, 14.9999f)
                    curveTo(16.0001f, 12.7907f, 14.2092f, 10.9999f, 12.0001f, 10.9999f)
                    curveTo(9.791f, 10.9999f, 8.0001f, 12.7907f, 8.0001f, 14.9999f)
                    curveTo(8.0001f, 17.209f, 9.791f, 18.9999f, 12.0001f, 18.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 4.9999f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 4.9999f, 1.4413f, 5.3159f, 0.8787f, 5.8786f)
                    curveTo(0.3161f, 6.4412f, 0.0f, 7.2042f, 0.0f, 7.9999f)
                    lineTo(0.0f, 23.9998f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.9999f)
                    curveTo(24.0f, 7.2042f, 23.6839f, 6.4412f, 23.1213f, 5.8786f)
                    curveTo(22.5587f, 5.3159f, 21.7956f, 4.9999f, 21.0f, 4.9999f)
                    close()
                    moveTo(12.0f, 20.9999f)
                    curveTo(10.8133f, 20.9999f, 9.6533f, 20.648f, 8.6666f, 19.9887f)
                    curveTo(7.6799f, 19.3294f, 6.9109f, 18.3923f, 6.4567f, 17.296f)
                    curveTo(6.0026f, 16.1996f, 5.8838f, 14.9932f, 6.1153f, 13.8293f)
                    curveTo(6.3468f, 12.6654f, 6.9182f, 11.5963f, 7.7574f, 10.7572f)
                    curveTo(8.5965f, 9.9181f, 9.6656f, 9.3467f, 10.8295f, 9.1152f)
                    curveTo(11.9933f, 8.8836f, 13.1997f, 9.0025f, 14.2961f, 9.4566f)
                    curveTo(15.3925f, 9.9107f, 16.3295f, 10.6798f, 16.9888f, 11.6664f)
                    curveTo(17.6481f, 12.6531f, 18.0f, 13.8132f, 18.0f, 14.9999f)
                    curveTo(17.9984f, 16.5907f, 17.3658f, 18.1159f, 16.2409f, 19.2407f)
                    curveTo(15.116f, 20.3656f, 13.5908f, 20.9983f, 12.0f, 20.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.7201f, 3.0f)
                    lineTo(15.4062f, 0.0f)
                    horizontalLineTo(8.5932f)
                    lineTo(6.2801f, 3.0f)
                    horizontalLineTo(17.7201f)
                    close()
                }
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null

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
                    moveTo(17.7209f, 3.0f)
                    lineTo(16.3079f, 1.168f)
                    curveTo(16.0264f, 0.8058f, 15.6662f, 0.5124f, 15.2545f, 0.3101f)
                    curveTo(14.8429f, 0.1077f, 14.3906f, 0.0017f, 13.9319f, 0.0f)
                    lineTo(10.0679f, 0.0f)
                    curveTo(9.6091f, 0.0017f, 9.1568f, 0.1077f, 8.7452f, 0.3101f)
                    curveTo(8.3335f, 0.5124f, 7.9733f, 0.8058f, 7.6919f, 1.168f)
                    lineTo(6.2789f, 3.0f)
                    horizontalLineTo(17.7209f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 18.0001f)
                    curveTo(14.2093f, 18.0001f, 16.0001f, 16.2092f, 16.0001f, 14.0001f)
                    curveTo(16.0001f, 11.791f, 14.2093f, 10.0001f, 12.0001f, 10.0001f)
                    curveTo(9.791f, 10.0001f, 8.0001f, 11.791f, 8.0001f, 14.0001f)
                    curveTo(8.0001f, 16.2092f, 9.791f, 18.0001f, 12.0001f, 18.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 4.9999f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 5.0015f, 2.4036f, 5.5288f, 1.4662f, 6.4661f)
                    curveTo(0.5289f, 7.4034f, 0.0016f, 8.6743f, 0.0f, 9.9999f)
                    lineTo(0.0f, 18.9999f)
                    curveTo(0.0016f, 20.3254f, 0.5289f, 21.5963f, 1.4662f, 22.5336f)
                    curveTo(2.4036f, 23.471f, 3.6744f, 23.9983f, 5.0f, 23.9998f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9983f, 21.5964f, 23.471f, 22.5338f, 22.5336f)
                    curveTo(23.4711f, 21.5963f, 23.9984f, 20.3254f, 24.0f, 18.9999f)
                    verticalLineTo(9.9999f)
                    curveTo(23.9984f, 8.6743f, 23.4711f, 7.4034f, 22.5338f, 6.4661f)
                    curveTo(21.5964f, 5.5288f, 20.3256f, 5.0015f, 19.0f, 4.9999f)
                    close()
                    moveTo(12.0f, 19.9999f)
                    curveTo(10.8133f, 19.9999f, 9.6533f, 19.648f, 8.6666f, 18.9887f)
                    curveTo(7.6799f, 18.3294f, 6.9109f, 17.3923f, 6.4567f, 16.296f)
                    curveTo(6.0026f, 15.1996f, 5.8838f, 13.9932f, 6.1153f, 12.8293f)
                    curveTo(6.3468f, 11.6654f, 6.9182f, 10.5963f, 7.7574f, 9.7572f)
                    curveTo(8.5965f, 8.9181f, 9.6656f, 8.3467f, 10.8295f, 8.1152f)
                    curveTo(11.9933f, 7.8836f, 13.1997f, 8.0025f, 14.2961f, 8.4566f)
                    curveTo(15.3925f, 8.9107f, 16.3295f, 9.6798f, 16.9888f, 10.6664f)
                    curveTo(17.6481f, 11.6531f, 18.0f, 12.8132f, 18.0f, 13.9999f)
                    curveTo(17.9984f, 15.5907f, 17.3658f, 17.1159f, 16.2409f, 18.2407f)
                    curveTo(15.116f, 19.3656f, 13.5908f, 19.9983f, 12.0f, 19.9999f)
                    close()
                }
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null

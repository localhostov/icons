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

public val Icons.Filled.SignIn: ImageVector
    get() {
        if (_signIn != null) {
            return _signIn!!
        }
        _signIn = Builder(name = "SignIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 22.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.3431f, 22.0f, 2.0f, 20.6568f, 2.0f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(2.0f, 3.3432f, 3.3431f, 2.0f, 5.0f, 2.0f)
                    horizontalLineTo(7.0f)
                    curveTo(7.5523f, 2.0f, 8.0f, 1.5523f, 8.0f, 1.0f)
                    curveTo(8.0f, 0.4478f, 7.5523f, 0.0f, 7.0f, 0.0f)
                    horizontalLineTo(5.0f)
                    curveTo(2.24f, 0.0033f, 0.0033f, 2.24f, 0.0f, 5.0f)
                    verticalLineTo(19.0f)
                    curveTo(0.0033f, 21.76f, 2.24f, 23.9967f, 5.0f, 24.0f)
                    horizontalLineTo(7.0f)
                    curveTo(7.5523f, 24.0f, 8.0f, 23.5523f, 8.0f, 23.0f)
                    curveTo(8.0f, 22.4477f, 7.5523f, 22.0f, 7.0f, 22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0002f, 11.0005f)
                    lineTo(7.2232f, 11.0325f)
                    curveTo(7.3109f, 10.8696f, 7.4206f, 10.7195f, 7.5493f, 10.5865f)
                    lineTo(11.4283f, 6.7074f)
                    curveTo(11.8255f, 6.3238f, 11.8365f, 5.6907f, 11.4529f, 5.2935f)
                    curveTo(11.0692f, 4.8962f, 10.4361f, 4.8852f, 10.0389f, 5.2689f)
                    curveTo(10.0305f, 5.2769f, 10.0223f, 5.2851f, 10.0143f, 5.2935f)
                    lineTo(6.1333f, 9.1725f)
                    curveTo(4.5717f, 10.7345f, 4.5717f, 13.2665f, 6.1333f, 14.8285f)
                    lineTo(10.0123f, 18.7075f)
                    curveTo(10.3959f, 19.1047f, 11.029f, 19.1157f, 11.4262f, 18.732f)
                    curveTo(11.8235f, 18.3483f, 11.8345f, 17.7152f, 11.4508f, 17.318f)
                    curveTo(11.4427f, 17.3097f, 11.4346f, 17.3015f, 11.4262f, 17.2935f)
                    lineTo(7.5472f, 13.4145f)
                    curveTo(7.4353f, 13.2992f, 7.3376f, 13.171f, 7.2562f, 13.0325f)
                    lineTo(23.0002f, 13.0005f)
                    curveTo(23.5525f, 13.0005f, 24.0002f, 12.5528f, 24.0002f, 12.0005f)
                    curveTo(24.0002f, 11.4482f, 23.5525f, 11.0005f, 23.0002f, 11.0005f)
                    close()
                }
            }
        }
        .build()
        return _signIn!!
    }

private var _signIn: ImageVector? = null

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

public val Icons.Filled.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.6989f, 1.7182f)
                    lineTo(5.189f, 20.2231f)
                    curveTo(5.5892f, 20.4181f, 6.0281f, 20.5206f, 6.4732f, 20.5229f)
                    horizontalLineTo(9.6433f)
                    curveTo(9.9085f, 20.5222f, 10.1629f, 20.6277f, 10.3499f, 20.8158f)
                    lineTo(12.0679f, 22.5327f)
                    curveTo(12.9995f, 23.4708f, 14.2667f, 23.9988f, 15.5887f, 23.9998f)
                    curveTo(16.1346f, 23.9993f, 16.6767f, 23.9098f, 17.1938f, 23.735f)
                    curveTo(18.9763f, 23.1506f, 20.2728f, 21.6054f, 20.5388f, 19.7484f)
                    lineTo(23.9157f, 3.708f)
                    curveTo(24.077f, 3.0397f, 24.0003f, 2.3361f, 23.6989f, 1.7182f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.3208f, 0.0772f)
                    lineTo(4.3195f, 3.4482f)
                    curveTo(1.5854f, 3.8238f, -0.3265f, 6.3447f, 0.0491f, 9.0788f)
                    curveTo(0.1974f, 10.1585f, 0.6947f, 11.1602f, 1.4652f, 11.931f)
                    lineTo(3.1821f, 13.648f)
                    curveTo(3.3698f, 13.8356f, 3.4752f, 14.0902f, 3.475f, 14.3556f)
                    verticalLineTo(17.5257f)
                    curveTo(3.4773f, 17.9708f, 3.5798f, 18.4098f, 3.7748f, 18.8099f)
                    lineTo(22.2817f, 0.3001f)
                    curveTo(21.6735f, 0.0012f, 20.9805f, -0.0776f, 20.3208f, 0.0772f)
                    close()
                }
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null

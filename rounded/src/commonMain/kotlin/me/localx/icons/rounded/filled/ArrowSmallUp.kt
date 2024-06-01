package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.ArrowSmallUp: ImageVector
    get() {
        if (_arrowSmallUp != null) {
            return _arrowSmallUp!!
        }
        _arrowSmallUp = Builder(name = "ArrowSmallUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0611f, 9.5249f)
                lineTo(14.4751f, 5.9389f)
                curveTo(13.8082f, 5.3026f, 12.9218f, 4.9475f, 12.0001f, 4.9475f)
                curveTo(11.0783f, 4.9475f, 10.1919f, 5.3026f, 9.5251f, 5.9389f)
                lineTo(5.9391f, 9.5249f)
                curveTo(5.6578f, 9.8063f, 5.4998f, 10.1879f, 5.4999f, 10.5858f)
                curveTo(5.5f, 10.9837f, 5.6582f, 11.3652f, 5.9396f, 11.6464f)
                curveTo(6.221f, 11.9277f, 6.6026f, 12.0857f, 7.0004f, 12.0856f)
                curveTo(7.3983f, 12.0855f, 7.7798f, 11.9273f, 8.0611f, 11.6459f)
                lineTo(10.5001f, 9.2069f)
                verticalLineTo(18.9999f)
                curveTo(10.5001f, 19.3978f, 10.6581f, 19.7793f, 10.9394f, 20.0606f)
                curveTo(11.2207f, 20.3419f, 11.6022f, 20.4999f, 12.0001f, 20.4999f)
                curveTo(12.3979f, 20.4999f, 12.7794f, 20.3419f, 13.0607f, 20.0606f)
                curveTo(13.342f, 19.7793f, 13.5001f, 19.3978f, 13.5001f, 18.9999f)
                verticalLineTo(9.2069f)
                lineTo(15.9391f, 11.6459f)
                curveTo(16.0783f, 11.7853f, 16.2437f, 11.8958f, 16.4257f, 11.9712f)
                curveTo(16.6077f, 12.0467f, 16.8027f, 12.0855f, 16.9997f, 12.0856f)
                curveTo(17.1967f, 12.0856f, 17.3918f, 12.0469f, 17.5738f, 11.9715f)
                curveTo(17.7558f, 11.8962f, 17.9212f, 11.7857f, 18.0606f, 11.6464f)
                curveTo(18.1999f, 11.5072f, 18.3104f, 11.3418f, 18.3859f, 11.1598f)
                curveTo(18.4613f, 10.9779f, 18.5001f, 10.7828f, 18.5002f, 10.5858f)
                curveTo(18.5002f, 10.3888f, 18.4615f, 10.1937f, 18.3861f, 10.0117f)
                curveTo(18.3108f, 9.8297f, 18.2003f, 9.6643f, 18.0611f, 9.5249f)
                close()
            }
        }
        .build()
        return _arrowSmallUp!!
    }

private var _arrowSmallUp: ImageVector? = null

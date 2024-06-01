package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0406f, 9.9998f)
                curveTo(12.5996f, 3.7887f, 21.6996f, 3.2717f, 21.9996f, 9.4998f)
                verticalLineTo(9.5227f)
                verticalLineTo(9.5378f)
                curveTo(21.9996f, 9.6927f, 21.9806f, 9.8457f, 21.9666f, 9.9998f)
                horizontalLineTo(13.0406f)
                close()
                moveTo(10.9656f, 9.9998f)
                curveTo(11.3786f, 3.3858f, 1.6196f, 3.3888f, 2.0336f, 9.9998f)
                horizontalLineTo(10.9656f)
                close()
                moveTo(2.6326f, 11.9998f)
                curveTo(2.6766f, 12.0838f, 11.9996f, 23.9898f, 11.9996f, 23.9898f)
                curveTo(11.9996f, 23.9898f, 21.3236f, 12.0838f, 21.3666f, 11.9998f)
                horizontalLineTo(2.6326f)
                close()
                moveTo(12.0236f, 6.0908f)
                curveTo(12.5254f, 5.287f, 13.1973f, 4.6031f, 13.9921f, 4.0871f)
                curveTo(14.7869f, 3.5712f, 15.6851f, 3.2359f, 16.6236f, 3.1047f)
                curveTo(16.241f, 2.1985f, 15.6007f, 1.4246f, 14.782f, 0.8791f)
                curveTo(13.9633f, 0.3337f, 13.0025f, 0.0408f, 12.0188f, 0.0369f)
                curveTo(11.0351f, 0.033f, 10.0719f, 0.3181f, 9.2489f, 0.857f)
                curveTo(8.4259f, 1.3958f, 7.7793f, 2.1646f, 7.3896f, 3.0677f)
                curveTo(8.3368f, 3.1997f, 9.2433f, 3.539f, 10.0443f, 4.0616f)
                curveTo(10.8453f, 4.5841f, 11.5211f, 5.277f, 12.0236f, 6.0908f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null

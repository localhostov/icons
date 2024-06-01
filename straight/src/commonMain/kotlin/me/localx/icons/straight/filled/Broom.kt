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

public val Icons.Filled.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5259f, 16.3001f)
                    curveTo(21.0553f, 14.8357f, 21.3463f, 13.2958f, 21.3879f, 11.7391f)
                    curveTo(21.3961f, 11.4606f, 21.3463f, 11.1835f, 21.2416f, 10.9252f)
                    curveTo(21.1369f, 10.667f, 20.9797f, 10.4334f, 20.7799f, 10.2391f)
                    lineTo(18.9609f, 8.4691f)
                    lineTo(24.0059f, 3.4241f)
                    lineTo(22.5759f, 1.9941f)
                    lineTo(17.5139f, 7.0561f)
                    lineTo(15.3069f, 4.9001f)
                    curveTo(14.9472f, 4.5506f, 14.4693f, 4.349f, 13.9679f, 4.3353f)
                    curveTo(13.4665f, 4.3216f, 12.9782f, 4.4968f, 12.5999f, 4.8261f)
                    curveTo(11.934f, 5.4084f, 11.2363f, 5.9533f, 10.5099f, 6.4581f)
                    lineTo(20.5259f, 16.3001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.7709f, 7.5569f)
                    curveTo(7.9685f, 8.0308f, 7.1151f, 8.4122f, 6.2269f, 8.6939f)
                    lineTo(-1.0E-4f, 10.5209f)
                    verticalLineTo(11.2699f)
                    curveTo(-0.0017f, 12.8921f, 0.3142f, 14.499f, 0.9299f, 15.9999f)
                    lineTo(2.6379f, 15.7209f)
                    curveTo(4.259f, 15.2986f, 5.7415f, 14.4595f, 6.9379f, 13.2869f)
                    lineTo(8.3379f, 14.7169f)
                    curveTo(6.8654f, 16.1542f, 5.0384f, 17.1759f, 3.0429f, 17.6779f)
                    lineTo(1.8869f, 17.8689f)
                    curveTo(2.5694f, 18.9633f, 3.4121f, 19.9492f, 4.3869f, 20.7939f)
                    lineTo(6.4129f, 20.0419f)
                    lineTo(7.8129f, 19.3419f)
                    curveTo(9.2551f, 18.6149f, 10.4893f, 17.5339f, 11.3999f, 16.1999f)
                    lineTo(11.9189f, 15.4389f)
                    lineTo(13.5709f, 16.5649f)
                    lineTo(13.0529f, 17.3259f)
                    curveTo(11.9494f, 18.9406f, 10.4536f, 20.2482f, 8.7059f, 21.1259f)
                    lineTo(7.1559f, 21.8989f)
                    lineTo(6.3409f, 22.1989f)
                    curveTo(8.3626f, 23.3827f, 10.6641f, 24.0045f, 13.0069f, 23.9999f)
                    horizontalLineTo(14.2449f)
                    lineTo(14.5029f, 23.8199f)
                    curveTo(16.6275f, 22.3857f, 18.3887f, 20.4762f, 19.6469f, 18.2429f)
                    lineTo(8.7709f, 7.5569f)
                    close()
                }
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null

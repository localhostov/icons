package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0001f, 8.0009f)
                    verticalLineTo(7.0009f)
                    curveTo(6.9998f, 5.8923f, 7.3679f, 4.815f, 8.0466f, 3.9385f)
                    curveTo(8.7253f, 3.0619f, 9.6761f, 2.4357f, 10.7495f, 2.1584f)
                    curveTo(11.8228f, 1.8811f, 12.9579f, 1.9684f, 13.9762f, 2.4066f)
                    curveTo(14.9946f, 2.8447f, 15.8384f, 3.6089f, 16.3751f, 4.5789f)
                    lineTo(18.1241f, 3.6079f)
                    curveTo(17.3724f, 2.2502f, 16.1908f, 1.1808f, 14.7652f, 0.5678f)
                    curveTo(13.3395f, -0.0452f, 11.7505f, -0.1671f, 10.248f, 0.2214f)
                    curveTo(8.7455f, 0.6098f, 7.4147f, 1.4865f, 6.4647f, 2.7137f)
                    curveTo(5.5148f, 3.9409f, 4.9996f, 5.449f, 5.0001f, 7.0009f)
                    verticalLineTo(8.0009f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(21.0009f)
                    curveTo(2.0001f, 21.7965f, 2.3162f, 22.5596f, 2.8788f, 23.1222f)
                    curveTo(3.4414f, 23.6848f, 4.2045f, 24.0009f, 5.0001f, 24.0009f)
                    horizontalLineTo(19.0001f)
                    curveTo(19.7958f, 24.0009f, 20.5588f, 23.6848f, 21.1214f, 23.1222f)
                    curveTo(21.6841f, 22.5596f, 22.0001f, 21.7965f, 22.0001f, 21.0009f)
                    verticalLineTo(8.0009f)
                    horizontalLineTo(7.0001f)
                    close()
                    moveTo(13.0001f, 18.0009f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(14.0009f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(18.0009f)
                    close()
                }
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null

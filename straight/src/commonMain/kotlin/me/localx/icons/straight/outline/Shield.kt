package me.localx.icons.straight.outline

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

public val Icons.Outline.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9492f, 2.6446f)
                    lineTo(12.0002f, 0.0096f)
                    lineTo(4.0511f, 2.6446f)
                    curveTo(3.4547f, 2.8406f, 2.9353f, 3.2199f, 2.567f, 3.7284f)
                    curveTo(2.1987f, 4.2369f, 2.0003f, 4.8487f, 2.0001f, 5.4766f)
                    verticalLineTo(12.0006f)
                    curveTo(2.0001f, 19.5246f, 11.2002f, 23.6796f, 11.5942f, 23.8526f)
                    lineTo(11.9482f, 24.0096f)
                    lineTo(12.3162f, 23.8876f)
                    curveTo(12.7112f, 23.7556f, 22.0002f, 20.5776f, 22.0002f, 12.0006f)
                    verticalLineTo(5.4766f)
                    curveTo(21.9998f, 4.8488f, 21.8014f, 4.237f, 21.4331f, 3.7286f)
                    curveTo(21.0649f, 3.2201f, 20.5456f, 2.8407f, 19.9492f, 2.6446f)
                    close()
                    moveTo(20.0002f, 12.0006f)
                    curveTo(20.0002f, 18.2636f, 13.6512f, 21.2166f, 12.0472f, 21.8616f)
                    curveTo(10.4402f, 21.0586f, 4.0002f, 17.4946f, 4.0002f, 12.0006f)
                    verticalLineTo(5.4766f)
                    curveTo(4.0002f, 5.2673f, 4.0664f, 5.0633f, 4.1892f, 4.8938f)
                    curveTo(4.3121f, 4.7243f, 4.4853f, 4.5979f, 4.6842f, 4.5326f)
                    lineTo(12.0002f, 2.1066f)
                    lineTo(19.3162f, 4.5326f)
                    curveTo(19.5152f, 4.5976f, 19.6886f, 4.7239f, 19.8114f, 4.8935f)
                    curveTo(19.9343f, 5.0631f, 20.0004f, 5.2672f, 20.0002f, 5.4766f)
                    verticalLineTo(12.0006f)
                    close()
                }
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null

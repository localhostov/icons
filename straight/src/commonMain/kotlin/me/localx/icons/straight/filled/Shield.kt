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

public val Icons.Filled.Shield: ImageVector
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
                    moveTo(19.9442f, 2.6426f)
                    lineTo(12.0002f, 0.0096f)
                    lineTo(4.0561f, 2.6436f)
                    curveTo(3.4578f, 2.8419f, 2.9371f, 3.2238f, 2.568f, 3.7348f)
                    curveTo(2.199f, 4.2459f, 2.0003f, 4.8602f, 2.0001f, 5.4906f)
                    verticalLineTo(12.0006f)
                    curveTo(2.0001f, 19.5246f, 11.2002f, 23.6796f, 11.5942f, 23.8526f)
                    lineTo(11.9482f, 24.0096f)
                    lineTo(12.3162f, 23.8876f)
                    curveTo(12.7112f, 23.7556f, 22.0002f, 20.5776f, 22.0002f, 12.0006f)
                    verticalLineTo(5.4906f)
                    curveTo(22.0002f, 4.86f, 21.8016f, 4.2455f, 21.4326f, 3.7342f)
                    curveTo(21.0635f, 3.223f, 20.5427f, 2.841f, 19.9442f, 2.6426f)
                    close()
                }
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null

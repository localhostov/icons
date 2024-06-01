package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Shield: ImageVector
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
                    moveTo(11.9999f, 23.9991f)
                    curveTo(11.7902f, 23.9991f, 11.5827f, 23.9552f, 11.3909f, 23.8701f)
                    curveTo(10.9999f, 23.6991f, 1.9089f, 19.5681f, 1.9089f, 11.9991f)
                    verticalLineTo(7.2461f)
                    curveTo(1.9077f, 6.0914f, 2.2704f, 4.9656f, 2.9456f, 4.0289f)
                    curveTo(3.6208f, 3.0921f, 4.5741f, 2.392f, 5.6699f, 2.0281f)
                    lineTo(11.5249f, 0.0761f)
                    curveTo(11.8334f, -0.0259f, 12.1665f, -0.0259f, 12.4749f, 0.0761f)
                    lineTo(18.3299f, 2.0281f)
                    curveTo(19.4257f, 2.3921f, 20.3789f, 3.0923f, 21.0541f, 4.029f)
                    curveTo(21.7292f, 4.9657f, 22.092f, 6.0914f, 22.0909f, 7.2461f)
                    verticalLineTo(11.9991f)
                    curveTo(22.0909f, 20.6171f, 12.8669f, 23.7911f, 12.4749f, 23.9221f)
                    curveTo(12.3218f, 23.9733f, 12.1614f, 23.9993f, 11.9999f, 23.9991f)
                    close()
                    moveTo(11.9999f, 3.0801f)
                    lineTo(6.6189f, 4.8741f)
                    curveTo(6.121f, 5.0399f, 5.6879f, 5.3583f, 5.381f, 5.784f)
                    curveTo(5.0741f, 6.2097f, 4.9089f, 6.7212f, 4.9089f, 7.2461f)
                    verticalLineTo(11.9991f)
                    curveTo(4.9089f, 16.7341f, 10.3299f, 19.9511f, 12.0769f, 20.8641f)
                    curveTo(13.8339f, 20.1311f, 19.0909f, 17.4811f, 19.0909f, 11.9991f)
                    verticalLineTo(7.2461f)
                    curveTo(19.091f, 6.7212f, 18.9258f, 6.2097f, 18.6189f, 5.784f)
                    curveTo(18.312f, 5.3583f, 17.8789f, 5.0399f, 17.3809f, 4.8741f)
                    lineTo(11.9999f, 3.0801f)
                    close()
                }
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null

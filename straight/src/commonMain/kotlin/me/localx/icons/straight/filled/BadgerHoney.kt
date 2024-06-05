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

public val Icons.Filled.BadgerHoney: ImageVector
    get() {
        if (_badgerHoney != null) {
            return _badgerHoney!!
        }
        _badgerHoney = Builder(name = "BadgerHoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.383f, 11.0f)
                curveToRelative(-0.242f, 0.578f, -0.383f, 1.243f, -0.383f, 2.0f)
                lineTo(0.0f, 13.0f)
                curveToRelative(0.0f, -4.382f, 3.56f, -7.0f, 7.0f, -7.0f)
                lineToRelative(3.749f, 0.027f)
                curveToRelative(1.178f, 0.0f, 2.66f, -0.361f, 3.268f, -1.374f)
                curveToRelative(1.326f, -2.213f, 3.961f, -3.188f, 6.41f, -2.373f)
                lineToRelative(1.682f, 0.561f)
                curveToRelative(0.14f, 0.047f, 0.275f, 0.104f, 0.403f, 0.171f)
                curveToRelative(-2.659f, 0.053f, -4.182f, 0.339f, -5.313f, 1.889f)
                lineToRelative(-3.139f, 4.197f)
                curveToRelative(-1.007f, 1.208f, -2.487f, 1.902f, -4.061f, 1.902f)
                lineTo(2.383f, 11.0f)
                close()
                moveTo(23.961f, 5.001f)
                curveToRelative(-3.579f, 0.01f, -4.46f, 0.139f, -5.153f, 1.089f)
                lineToRelative(-3.178f, 4.248f)
                curveToRelative(-1.421f, 1.707f, -3.461f, 2.663f, -5.63f, 2.663f)
                lineTo(2.0f, 13.001f)
                lineToRelative(1.568f, 9.0f)
                horizontalLineToRelative(4.641f)
                lineToRelative(-0.709f, -4.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.283f)
                curveToRelative(0.0f, -1.814f, 0.2f, -4.437f, 1.152f, -6.633f)
                curveToRelative(0.543f, -1.253f, 1.5f, -2.307f, 2.696f, -2.968f)
                curveToRelative(1.327f, -0.735f, 2.151f, -2.133f, 2.151f, -3.65f)
                curveToRelative(0.0f, -0.158f, -0.014f, -0.313f, -0.039f, -0.465f)
                close()
            }
        }
        .build()
        return _badgerHoney!!
    }

private var _badgerHoney: ImageVector? = null

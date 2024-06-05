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

public val Icons.Filled.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.414f, 14.0f)
                horizontalLineToRelative(-5.828f)
                lineToRelative(-4.586f, -4.586f)
                lineTo(10.0f, 3.586f)
                lineTo(13.5f, 0.086f)
                lineToRelative(10.414f, 10.414f)
                lineToRelative(-3.5f, 3.5f)
                close()
                moveTo(8.782f, 10.859f)
                lineTo(0.626f, 19.016f)
                curveToRelative(-0.834f, 0.834f, -0.834f, 2.187f, 0.0f, 3.021f)
                lineToRelative(1.337f, 1.337f)
                curveToRelative(0.834f, 0.834f, 2.187f, 0.834f, 3.021f, 0.0f)
                lineToRelative(8.156f, -8.157f)
                lineToRelative(-4.359f, -4.359f)
                close()
                moveTo(6.741f, 15.844f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null

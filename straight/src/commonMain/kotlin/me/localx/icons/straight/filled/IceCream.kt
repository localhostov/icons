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
        _iceCream = Builder(name = "IceCream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.041f, 10.0f)
                curveTo(12.6f, 3.789f, 21.7f, 3.272f, 22.0f, 9.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.023f)
                lineToRelative(0.0f, 0.015f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.155f, -0.019f, 0.308f, -0.033f, 0.462f)
                close()
                moveTo(10.966f, 10.0f)
                curveToRelative(0.413f, -6.614f, -9.346f, -6.611f, -8.932f, 0.0f)
                close()
                moveTo(2.633f, 12.0f)
                curveTo(2.677f, 12.084f, 12.0f, 23.99f, 12.0f, 23.99f)
                reflectiveCurveTo(21.324f, 12.084f, 21.367f, 12.0f)
                close()
                moveTo(12.024f, 6.091f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, 4.6f, -2.986f)
                arcTo(5.02f, 5.02f, 0.0f, false, false, 7.39f, 3.068f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.024f, 6.091f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null

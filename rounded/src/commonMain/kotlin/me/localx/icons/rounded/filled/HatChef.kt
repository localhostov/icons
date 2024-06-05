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

public val Icons.Filled.HatChef: ImageVector
    get() {
        if (_hatChef != null) {
            return _hatChef!!
        }
        _hatChef = Builder(name = "HatChef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.164f, 4.705f)
                curveTo(0.928f, 1.592f, 5.211f, -0.055f, 7.84f, 1.621f)
                arcToRelative(6.16f, 6.16f, 0.0f, false, true, 8.32f, 0.0f)
                curveToRelative(6.436f, -3.279f, 11.424f, 6.113f, 4.514f, 9.092f)
                arcToRelative(0.934f, 0.934f, 0.0f, false, false, -0.674f, 0.851f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.564f)
                arcToRelative(0.934f, 0.934f, 0.0f, false, false, -0.674f, -0.851f)
                arcTo(5.017f, 5.017f, 0.0f, false, true, 0.164f, 4.705f)
                close()
                moveTo(4.0f, 19.0f)
                arcToRelative(4.559f, 4.559f, 0.0f, false, false, 4.5f, 5.0f)
                horizontalLineToRelative(7.0f)
                arcTo(4.559f, 4.559f, 0.0f, false, false, 20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _hatChef!!
    }

private var _hatChef: ImageVector? = null

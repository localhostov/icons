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

public val Icons.Filled.CheeseAlt: ImageVector
    get() {
        if (_cheeseAlt != null) {
            return _cheeseAlt!!
        }
        _cheeseAlt = Builder(name = "CheeseAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.14f, 8.04f)
                curveToRelative(1.0f, -1.98f, 2.81f, -4.77f, 5.9f, -7.08f)
                curveToRelative(1.66f, -1.24f, 3.95f, -1.28f, 5.71f, -0.11f)
                lineToRelative(9.58f, 7.15f)
                lineTo(2.67f, 8.0f)
                curveToRelative(-0.18f, 0.0f, -0.36f, 0.02f, -0.53f, 0.04f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(14.0f)
                reflectiveCurveToRelative(-19.17f, 0.0f, -19.17f, 0.0f)
                curveToRelative(-1.63f, 0.0f, -3.07f, -0.96f, -3.69f, -2.46f)
                curveTo(0.62f, 20.28f, 0.0f, 18.3f, 0.0f, 16.0f)
                curveToRelative(0.0f, -1.93f, 0.44f, -3.63f, 0.88f, -4.87f)
                curveToRelative(0.33f, -0.69f, 1.01f, -1.13f, 1.79f, -1.13f)
                lineTo(24.0f, 10.0f)
                close()
            }
        }
        .build()
        return _cheeseAlt!!
    }

private var _cheeseAlt: ImageVector? = null

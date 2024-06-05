package me.localx.icons.straight.bold

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

public val Icons.Bold.N: ImageVector
    get() {
        if (_n != null) {
            return _n!!
        }
        _n = Builder(name = "N", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.312f, 24.0f)
                curveToRelative(-0.893f, 0.0f, -1.736f, -0.447f, -2.24f, -1.232f)
                lineTo(5.0f, 3.789f)
                verticalLineTo(24.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.679f)
                curveTo(2.0f, 1.48f, 2.772f, 0.448f, 3.923f, 0.11f)
                curveToRelative(1.15f, -0.336f, 2.358f, 0.113f, 3.006f, 1.121f)
                lineToRelative(12.071f, 18.979f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(21.32f)
                curveToRelative(0.0f, 1.199f, -0.773f, 2.231f, -1.924f, 2.569f)
                curveToRelative(-0.254f, 0.074f, -0.512f, 0.11f, -0.765f, 0.11f)
                close()
            }
        }
        .build()
        return _n!!
    }

private var _n: ImageVector? = null

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

public val Icons.Filled.Seedling: ImageVector
    get() {
        if (_seedling != null) {
            return _seedling!!
        }
        _seedling = Builder(name = "Seedling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.97f, 0.942f)
                lineToRelative(-0.055f, -0.957f)
                lineToRelative(-0.959f, 0.015f)
                curveToRelative(-6.707f, 0.104f, -9.661f, 4.231f, -10.956f, 7.605f)
                curveTo(10.705f, 4.231f, 7.751f, 0.104f, 1.044f, 0.0f)
                lineTo(0.085f, -0.015f)
                lineTo(0.03f, 0.942f)
                curveToRelative(-0.219f, 3.798f, 0.749f, 6.791f, 2.874f, 8.893f)
                curveToRelative(2.632f, 2.603f, 6.301f, 3.085f, 8.096f, 3.155f)
                verticalLineToRelative(11.01f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.01f)
                curveToRelative(1.795f, -0.07f, 5.463f, -0.552f, 8.096f, -3.155f)
                curveToRelative(2.125f, -2.103f, 3.093f, -5.095f, 2.874f, -8.893f)
                close()
            }
        }
        .build()
        return _seedling!!
    }

private var _seedling: ImageVector? = null

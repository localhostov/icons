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

public val Icons.Filled.BreadLoaf: ImageVector
    get() {
        if (_breadLoaf != null) {
            return _breadLoaf!!
        }
        _breadLoaf = Builder(name = "BreadLoaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 3.0f)
                lineTo(12.5f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.37f, -0.8f, 2.59f, -2.0f, 3.16f)
                verticalLineToRelative(11.34f)
                lineTo(2.0f, 21.0f)
                lineTo(2.0f, 9.66f)
                curveToRelative(-1.2f, -0.57f, -2.0f, -1.79f, -2.0f, -3.16f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(20.5f, 3.0f)
                horizontalLineToRelative(-3.76f)
                curveToRelative(0.79f, 0.95f, 1.26f, 2.17f, 1.26f, 3.5f)
                curveToRelative(0.0f, 1.65f, -0.76f, 3.21f, -2.0f, 4.24f)
                verticalLineToRelative(10.26f)
                horizontalLineToRelative(6.0f)
                lineTo(22.0f, 9.66f)
                curveToRelative(1.2f, -0.57f, 2.0f, -1.79f, 2.0f, -3.16f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _breadLoaf!!
    }

private var _breadLoaf: ImageVector? = null

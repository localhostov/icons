package me.localx.icons.rounded.bold

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

public val Icons.Bold.B: ImageVector
    get() {
        if (_b != null) {
            return _b!!
        }
        _b = Builder(name = "B", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 24.0f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(2.0f, 5.5f)
                curveTo(2.0f, 2.467f, 4.467f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(5.322f, -0.116f, 8.467f, 6.442f, 5.115f, 10.507f)
                curveToRelative(7.023f, 2.847f, 5.065f, 13.44f, -2.615f, 13.493f)
                close()
                moveTo(5.0f, 13.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(5.276f, -0.139f, 5.272f, -7.863f, 0.0f, -8.0f)
                lineTo(5.0f, 13.0f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(4.616f, -0.122f, 4.613f, -6.879f, 0.0f, -7.0f)
                lineTo(7.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                close()
            }
        }
        .build()
        return _b!!
    }

private var _b: ImageVector? = null

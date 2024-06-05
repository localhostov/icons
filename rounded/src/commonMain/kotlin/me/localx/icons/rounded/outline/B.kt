package me.localx.icons.rounded.outline

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

public val Icons.Outline.B: ImageVector
    get() {
        if (_b != null) {
            return _b!!
        }
        _b = Builder(name = "B", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 24.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.243f, 4.243f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(5.786f, -0.075f, 8.693f, 7.283f, 4.51f, 11.177f)
                curveToRelative(7.371f, 1.84f, 6.167f, 12.716f, -1.51f, 12.823f)
                close()
                moveTo(4.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(15.5f, 22.0f)
                curveToRelative(5.935f, -0.156f, 5.931f, -8.846f, 0.0f, -9.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(4.0f, 11.0f)
                lineTo(12.5f, 11.0f)
                curveToRelative(5.935f, -0.156f, 5.931f, -8.846f, 0.0f, -9.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _b!!
    }

private var _b: ImageVector? = null

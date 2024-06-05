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

public val Icons.Filled.WindowFrame: ImageVector
    get() {
        if (_windowFrame != null) {
            return _windowFrame!!
        }
        _windowFrame = Builder(name = "WindowFrame", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 4.5f)
                curveToRelative(0.0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(-4.5f)
                curveTo(4.015f, 0.0f, 2.0f, 2.015f, 2.0f, 4.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(9.0f)
                lineTo(11.0f, 0.0f)
                close()
            }
        }
        .build()
        return _windowFrame!!
    }

private var _windowFrame: ImageVector? = null

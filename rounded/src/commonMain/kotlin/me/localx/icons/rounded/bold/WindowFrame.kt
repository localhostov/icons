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

public val Icons.Bold.WindowFrame: ImageVector
    get() {
        if (_windowFrame != null) {
            return _windowFrame!!
        }
        _windowFrame = Builder(name = "WindowFrame", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 21.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(22.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                lineTo(7.5f, 0.0f)
                curveTo(4.467f, 0.0f, 2.0f, 2.467f, 2.0f, 5.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(19.0f, 5.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.5f)
                lineTo(13.5f, 3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                close()
                moveTo(7.5f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(5.0f, 13.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _windowFrame!!
    }

private var _windowFrame: ImageVector? = null

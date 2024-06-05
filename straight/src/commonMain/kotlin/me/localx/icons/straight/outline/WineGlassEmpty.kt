package me.localx.icons.straight.outline

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

public val Icons.Outline.WineGlassEmpty: ImageVector
    get() {
        if (_wineGlassEmpty != null) {
            return _wineGlassEmpty!!
        }
        _wineGlassEmpty = Builder(name = "WineGlassEmpty", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 0.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 4.072f, 3.06f, 7.436f, 7.0f, 7.931f)
                verticalLineToRelative(4.069f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.069f)
                curveToRelative(3.94f, -0.495f, 7.0f, -3.859f, 7.0f, -7.931f)
                lineTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _wineGlassEmpty!!
    }

private var _wineGlassEmpty: ImageVector? = null

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

public val Icons.Bold.WineGlassEmpty: ImageVector
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
                curveToRelative(0.0f, 3.898f, 2.804f, 7.149f, 6.5f, 7.854f)
                verticalLineToRelative(3.146f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.146f)
                curveToRelative(3.696f, -0.705f, 6.5f, -3.956f, 6.5f, -7.854f)
                lineTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _wineGlassEmpty!!
    }

private var _wineGlassEmpty: ImageVector? = null

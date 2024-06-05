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
                moveToRelative(15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.228f)
                curveToRelative(0.0f, 3.989f, 2.819f, 7.392f, 6.5f, 8.125f)
                verticalLineToRelative(3.147f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.139f)
                curveToRelative(1.524f, -0.287f, 2.93f, -1.012f, 4.071f, -2.119f)
                curveToRelative(1.566f, -1.52f, 2.429f, -3.559f, 2.429f, -5.741f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(0.0f, 1.364f, -0.539f, 2.639f, -1.518f, 3.589f)
                curveToRelative(-0.979f, 0.949f, -2.272f, 1.432f, -3.637f, 1.409f)
                curveToRelative(-2.671f, -0.08f, -4.845f, -2.444f, -4.845f, -5.271f)
                verticalLineToRelative(-5.228f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }
        .build()
        return _wineGlassEmpty!!
    }

private var _wineGlassEmpty: ImageVector? = null

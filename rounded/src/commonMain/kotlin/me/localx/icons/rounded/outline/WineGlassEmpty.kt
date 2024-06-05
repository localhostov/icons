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
                moveToRelative(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.706f)
                curveToRelative(0.0f, 4.178f, 3.077f, 7.716f, 7.0f, 8.23f)
                verticalLineToRelative(4.064f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.061f)
                curveToRelative(1.716f, -0.212f, 3.306f, -0.969f, 4.571f, -2.197f)
                curveToRelative(1.566f, -1.521f, 2.429f, -3.56f, 2.429f, -5.742f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(0.0f, 1.637f, -0.647f, 3.166f, -1.822f, 4.307f)
                curveToRelative(-1.174f, 1.14f, -2.731f, 1.732f, -4.363f, 1.69f)
                curveToRelative(-3.207f, -0.096f, -5.815f, -2.918f, -5.815f, -6.291f)
                lineTo(6.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _wineGlassEmpty!!
    }

private var _wineGlassEmpty: ImageVector? = null

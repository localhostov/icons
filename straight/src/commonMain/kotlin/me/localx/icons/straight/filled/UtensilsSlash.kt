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

public val Icons.Filled.UtensilsSlash: ImageVector
    get() {
        if (_utensilsSlash != null) {
            return _utensilsSlash!!
        }
        _utensilsSlash = Builder(name = "UtensilsSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.829f, 17.415f)
                curveToRelative(1.554f, -2.15f, 3.171f, -5.111f, 3.171f, -8.149f)
                curveToRelative(0.0f, -3.224f, -1.844f, -6.377f, -3.391f, -8.455f)
                curveToRelative(-0.526f, -0.707f, -1.407f, -0.981f, -2.241f, -0.708f)
                curveToRelative(-0.831f, 0.275f, -1.368f, 1.021f, -1.368f, 1.897f)
                verticalLineToRelative(11.585f)
                lineToRelative(-3.302f, -3.302f)
                curveToRelative(0.19f, -0.399f, 0.302f, -0.834f, 0.302f, -1.284f)
                lineTo(12.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.586f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.586f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.128f, -5.128f)
                close()
                moveTo(15.0f, 19.243f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(2.757f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.757f)
                close()
                moveTo(5.757f, 10.0f)
                lineToRelative(2.243f, 2.243f)
                verticalLineToRelative(11.757f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-2.757f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(0.757f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.757f)
                close()
            }
        }
        .build()
        return _utensilsSlash!!
    }

private var _utensilsSlash: ImageVector? = null

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

public val Icons.Outline.UtensilsSlash: ImageVector
    get() {
        if (_utensilsSlash != null) {
            return _utensilsSlash!!
        }
        _utensilsSlash = Builder(name = "UtensilsSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 19.243f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(2.757f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.757f)
                close()
                moveTo(5.0f, 10.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-0.757f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(2.757f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.757f)
                lineToRelative(-2.243f, -2.243f)
                horizontalLineToRelative(-0.757f)
                close()
                moveTo(23.957f, 22.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(0.543f, 0.543f)
                verticalLineToRelative(-0.586f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(2.0f, 2.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.586f)
                lineToRelative(2.0f, 2.0f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.45f, -0.112f, 0.885f, -0.302f, 1.284f)
                lineToRelative(3.302f, 3.302f)
                lineTo(15.0f, 2.001f)
                curveToRelative(0.0f, -0.877f, 0.537f, -1.622f, 1.368f, -1.897f)
                curveToRelative(0.834f, -0.273f, 1.715f, 0.001f, 2.241f, 0.708f)
                curveToRelative(1.547f, 2.078f, 3.391f, 5.23f, 3.391f, 8.455f)
                curveToRelative(0.0f, 3.038f, -1.617f, 5.999f, -3.171f, 8.149f)
                lineToRelative(5.128f, 5.128f)
                close()
                moveTo(17.393f, 15.979f)
                curveToRelative(1.186f, -1.699f, 2.607f, -4.24f, 2.607f, -6.713f)
                curveToRelative(0.0f, -2.676f, -1.628f, -5.425f, -2.995f, -7.26f)
                lineToRelative(-0.005f, 13.58f)
                lineToRelative(0.393f, 0.393f)
                close()
            }
        }
        .build()
        return _utensilsSlash!!
    }

private var _utensilsSlash: ImageVector? = null

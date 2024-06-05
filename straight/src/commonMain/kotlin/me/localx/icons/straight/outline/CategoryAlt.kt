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

public val Icons.Outline.CategoryAlt: ImageVector
    get() {
        if (_categoryAlt != null) {
            return _categoryAlt!!
        }
        _categoryAlt = Builder(name = "CategoryAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _categoryAlt!!
    }

private var _categoryAlt: ImageVector? = null

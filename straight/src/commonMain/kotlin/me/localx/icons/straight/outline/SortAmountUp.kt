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

public val Icons.Outline.SortAmountUp: ImageVector
    get() {
        if (_sortAmountUp != null) {
            return _sortAmountUp!!
        }
        _sortAmountUp = Builder(name = "SortAmountUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(10.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.586f, 0.586f)
                lineTo(0.086f, 4.086f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.5f, -2.5f)
                lineTo(4.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 3.0f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(1.414f, -1.414f)
                lineTo(6.414f, 0.586f)
                curveTo(5.635f, -0.193f, 4.365f, -0.193f, 3.586f, 0.586f)
                close()
            }
        }
        .build()
        return _sortAmountUp!!
    }

private var _sortAmountUp: ImageVector? = null

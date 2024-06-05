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

public val Icons.Outline.SortAmountDownAlt: ImageVector
    get() {
        if (_sortAmountDownAlt != null) {
            return _sortAmountDownAlt!!
        }
        _sortAmountDownAlt = Builder(name = "SortAmountDownAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineTo(24.0f, 2.0f)
                lineTo(10.0f, 2.0f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(10.0f, 7.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                lineTo(10.0f, 5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(10.0f, 10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 21.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.0f, 21.0f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(0.086f, 19.914f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _sortAmountDownAlt!!
    }

private var _sortAmountDownAlt: ImageVector? = null

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

public val Icons.Filled.SortAmountDown: ImageVector
    get() {
        if (_sortAmountDown != null) {
            return _sortAmountDown!!
        }
        _sortAmountDown = Builder(name = "SortAmountDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(15.0f, 0.0f)
                close()
                moveTo(21.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                lineTo(10.0f, 15.0f)
                close()
                moveTo(6.0f, 21.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.0f, 21.0f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(0.086f, 19.914f)
                lineToRelative(3.499f, 3.499f)
                curveToRelative(0.377f, 0.378f, 0.879f, 0.587f, 1.413f, 0.587f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.534f, 0.0f, 1.036f, -0.208f, 1.414f, -0.586f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _sortAmountDown!!
    }

private var _sortAmountDown: ImageVector? = null

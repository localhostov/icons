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

public val Icons.Filled.SortAmountUpAlt: ImageVector
    get() {
        if (_sortAmountUpAlt != null) {
            return _sortAmountUpAlt!!
        }
        _sortAmountUpAlt = Builder(name = "SortAmountUpAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.5f)
                lineToRelative(1.414f, -1.414f)
                lineTo(6.414f, 0.586f)
                curveToRelative(-0.378f, -0.378f, -0.88f, -0.586f, -1.414f, -0.586f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.534f, 0.0f, -1.036f, 0.209f, -1.413f, 0.587f)
                lineTo(0.086f, 4.086f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.5f, -2.5f)
                lineTo(4.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 3.0f)
                lineToRelative(2.5f, 2.5f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                lineTo(10.0f, 12.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(10.0f, 17.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _sortAmountUpAlt!!
    }

private var _sortAmountUpAlt: ImageVector? = null

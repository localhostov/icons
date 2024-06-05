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

public val Icons.Filled.RectangleBarcode: ImageVector
    get() {
        if (_rectangleBarcode != null) {
            return _rectangleBarcode!!
        }
        _rectangleBarcode = Builder(name = "RectangleBarcode", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.346f, 2.0f, 0.0f, 3.346f, 0.0f, 5.0f)
                lineTo(0.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(6.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(10.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _rectangleBarcode!!
    }

private var _rectangleBarcode: ImageVector? = null

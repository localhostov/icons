package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.RectangleBarcode: ImageVector
    get() {
        if (_rectangleBarcode != null) {
            return _rectangleBarcode!!
        }
        _rectangleBarcode = Builder(name = "RectangleBarcode", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                lineTo(24.0f, 22.0f)
                close()
                moveTo(2.0f, 20.0f)
                lineTo(22.0f, 20.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(10.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 6.0f)
                close()
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 6.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(0.0f, 12.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, -12.0f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _rectangleBarcode!!
    }

private var _rectangleBarcode: ImageVector? = null

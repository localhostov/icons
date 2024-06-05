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

public val Icons.Outline.Barcode: ImageVector
    get() {
        if (_barcode != null) {
            return _barcode!!
        }
        _barcode = Builder(name = "Barcode", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(6.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 2.0f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 2.0f)
                close()
                moveTo(13.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 2.0f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 22.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 2.0f)
                close()
                moveTo(18.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(24.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 2.0f)
                close()
            }
        }
        .build()
        return _barcode!!
    }

private var _barcode: ImageVector? = null

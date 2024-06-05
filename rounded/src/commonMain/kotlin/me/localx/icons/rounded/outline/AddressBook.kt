package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 3.424f, 3.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                lineTo(3.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(3.424f, 21.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(23.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 18.0f, 0.0f)
                close()
                moveTo(21.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(8.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(5.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 2.0f)
                lineTo(18.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(13.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 12.0f)
                close()
                moveTo(18.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveTo(8.211f, 11.392f, 17.791f, 11.394f, 18.0f, 18.0f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null

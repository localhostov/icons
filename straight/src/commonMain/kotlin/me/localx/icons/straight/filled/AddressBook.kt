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

public val Icons.Filled.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 3.0f)
                lineTo(1.0f, 3.0f)
                lineTo(1.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                lineTo(3.0f, 7.0f)
                lineTo(1.0f, 7.0f)
                lineTo(1.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(20.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(23.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.0f, 0.0f)
                close()
                moveTo(13.0f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 9.5f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 13.0f, 4.0f)
                close()
                moveTo(19.0f, 18.0f)
                lineTo(17.0f, 18.0f)
                lineTo(17.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(10.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(11.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 13.0f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 7.5f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null

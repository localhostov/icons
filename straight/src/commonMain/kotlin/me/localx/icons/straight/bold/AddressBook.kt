package me.localx.icons.straight.bold

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

public val Icons.Bold.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 3.0f)
                lineTo(1.0f, 3.0f)
                lineTo(1.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 8.0f)
                lineTo(1.0f, 8.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 13.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 18.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(19.5f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 23.0f, 20.5f)
                lineTo(23.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.5f, 0.0f)
                close()
                moveTo(20.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 3.0f)
                lineTo(19.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
                moveTo(10.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 13.0f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 9.5f)
                close()
                moveTo(17.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 15.0f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null

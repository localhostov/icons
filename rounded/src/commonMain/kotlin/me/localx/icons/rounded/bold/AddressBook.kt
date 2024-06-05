package me.localx.icons.rounded.bold

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
                moveTo(17.5f, 0.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 3.607f, 3.0f)
                lineTo(2.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 8.0f)
                lineTo(2.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.5f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(3.607f, 21.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(9.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 23.0f, 18.5f)
                lineTo(23.0f, 5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 17.5f, 0.0f)
                close()
                moveTo(20.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 21.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 18.5f)
                lineTo(6.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.0f, 5.5f)
                close()
                moveTo(10.5f, 9.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 9.5f)
                close()
                moveTo(16.988f, 16.232f)
                arcToRelative(0.665f, 0.665f, 0.0f, false, true, -0.673f, 0.768f)
                lineTo(9.654f, 17.0f)
                arcToRelative(0.665f, 0.665f, 0.0f, false, true, -0.673f, -0.768f)
                curveTo(9.842f, 11.965f, 16.128f, 11.968f, 16.988f, 16.232f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null

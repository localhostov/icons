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

public val Icons.Filled.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.82f, 14.0f)
                lineToRelative(-2.0f, 10.0f)
                horizontalLineToRelative(-3.7f)
                lineTo(17.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
                moveTo(7.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(2.18f, 14.0f)
                lineToRelative(2.0f, 10.0f)
                horizontalLineToRelative(3.7f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(0.022f)
                arcTo(2.057f, 2.057f, 0.0f, false, true, 21.908f, 12.0f)
                lineTo(19.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.293f, 1.732f)
                arcToRelative(4.833f, 4.833f, 0.0f, false, false, -7.414f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 5.0f, 12.0f)
                lineTo(2.092f, 12.0f)
                arcTo(2.057f, 2.057f, 0.0f, false, true, 0.0f, 10.022f)
                lineTo(0.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 2.027f, 6.533f)
                arcTo(4.007f, 4.007f, 0.0f, false, true, 5.311f, 3.06f)
                arcToRelative(3.456f, 3.456f, 0.0f, false, true, 3.7f, -2.016f)
                arcTo(3.489f, 3.489f, 0.0f, false, true, 14.66f, 2.0f)
                arcToRelative(3.479f, 3.479f, 0.0f, false, true, 2.392f, 1.115f)
                arcTo(3.854f, 3.854f, 0.0f, false, true, 18.0f, 3.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, 3.973f, 3.533f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 10.0f)
                close()
                moveTo(10.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
                moveTo(18.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(14.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -2.9f, 2.872f)
                lineTo(9.9f, 24.0f)
                horizontalLineToRelative(4.21f)
                lineToRelative(0.792f, -7.128f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null

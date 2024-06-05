package me.localx.icons.rounded.filled

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
                moveTo(21.973f, 6.533f)
                arcToRelative(4.011f, 4.011f, 0.0f, false, false, -4.921f, -3.414f)
                arcTo(3.479f, 3.479f, 0.0f, false, false, 14.66f, 2.0f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, false, -5.646f, -0.96f)
                arcToRelative(3.456f, 3.456f, 0.0f, false, false, -3.7f, 2.016f)
                arcTo(4.007f, 4.007f, 0.0f, false, false, 2.027f, 6.533f)
                curveTo(-0.135f, 7.563f, -1.137f, 11.815f, 2.092f, 12.0f)
                lineTo(5.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.293f, 1.732f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, true, 7.414f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.0f, 12.0f)
                horizontalLineToRelative(2.908f)
                curveTo(25.137f, 11.815f, 24.135f, 7.564f, 21.973f, 6.533f)
                close()
                moveTo(9.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 7.0f)
                close()
                moveTo(17.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 10.0f)
                close()
                moveTo(14.9f, 16.872f)
                lineTo(14.105f, 24.0f)
                lineTo(9.9f, 24.0f)
                lineTo(9.1f, 16.872f)
                arcTo(2.9f, 2.9f, 0.0f, false, true, 14.9f, 16.872f)
                close()
                moveTo(7.0f, 16.0f)
                lineToRelative(0.884f, 8.0f)
                arcToRelative(4.517f, 4.517f, 0.0f, false, true, -4.43f, -3.632f)
                lineTo(2.18f, 14.0f)
                lineTo(5.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 16.0f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(2.82f)
                lineToRelative(-1.274f, 6.369f)
                arcTo(4.517f, 4.517f, 0.0f, false, true, 16.117f, 24.0f)
                lineTo(17.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null

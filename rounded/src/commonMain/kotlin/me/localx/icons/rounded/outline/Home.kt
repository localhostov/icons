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

public val Icons.Outline.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.121f, 9.069f)
                lineTo(15.536f, 1.483f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -7.072f, 0.0f)
                lineTo(0.879f, 9.069f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 0.0f, 11.19f)
                verticalLineToRelative(9.817f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(21.0f, 24.007f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(24.0f, 11.19f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 23.121f, 9.069f)
                close()
                moveTo(15.0f, 22.007f)
                lineTo(9.0f, 22.007f)
                lineTo(9.0f, 18.073f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
                moveTo(22.0f, 21.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(17.0f, 22.007f)
                lineTo(17.0f, 18.073f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -10.0f, 0.0f)
                verticalLineToRelative(3.934f)
                lineTo(3.0f, 22.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 11.19f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 0.293f, -0.707f)
                lineTo(9.878f, 2.9f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 4.244f, 0.0f)
                lineToRelative(7.585f, 7.586f)
                arcTo(1.008f, 1.008f, 0.0f, false, true, 22.0f, 11.19f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null

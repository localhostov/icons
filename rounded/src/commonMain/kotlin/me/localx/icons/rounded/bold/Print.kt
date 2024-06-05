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

public val Icons.Bold.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 14.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 5.0f, 4.5f)
                lineTo(5.0f, 6.0f)
                lineTo(4.5f, 6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 10.5f)
                verticalLineToRelative(6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 4.5f, 21.0f)
                horizontalLineToRelative(0.776f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 9.5f, 24.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(4.494f, 4.494f, 0.0f, false, false, 4.224f, -3.0f)
                lineTo(19.5f, 21.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 24.0f, 16.5f)
                verticalLineToRelative(-6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 6.0f)
                close()
                moveTo(8.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 4.5f)
                lineTo(16.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(16.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 21.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 19.5f)
                verticalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 16.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 17.5f)
                close()
                moveTo(21.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 18.0f)
                lineTo(19.0f, 18.0f)
                verticalLineToRelative(-0.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 14.5f, 13.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 5.0f, 17.5f)
                lineTo(5.0f, 18.0f)
                lineTo(4.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 16.5f)
                verticalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 9.0f)
                horizontalLineToRelative(15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 10.5f)
                close()
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null

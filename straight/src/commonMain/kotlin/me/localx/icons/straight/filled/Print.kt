package me.localx.icons.straight.filled

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

public val Icons.Filled.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                lineTo(0.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 13.0f)
                lineTo(20.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.0f)
                lineTo(24.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 7.0f)
                close()
                moveTo(19.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null

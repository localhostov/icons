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

public val Icons.Outline.ChessPawnAlt: ImageVector
    get() {
        if (_chessPawnAlt != null) {
            return _chessPawnAlt!!
        }
        _chessPawnAlt = Builder(name = "ChessPawnAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                curveToRelative(-1.988f, 0.0f, -4.0f, -3.435f, -4.0f, -10.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 6.0f)
                lineTo(15.444f, 6.0f)
                arcTo(3.959f, 3.959f, 0.0f, false, false, 16.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 4.0f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, false, 0.556f, 2.0f)
                lineTo(7.0f, 6.0f)
                lineTo(7.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                curveToRelative(0.0f, 6.565f, -2.012f, 10.0f, -4.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 18.0f)
                close()
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 4.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 4.469f, 0.888f, 7.961f, 2.412f, 10.0f)
                lineTo(8.588f, 18.0f)
                curveTo(10.112f, 15.961f, 11.0f, 12.469f, 11.0f, 8.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _chessPawnAlt!!
    }

private var _chessPawnAlt: ImageVector? = null

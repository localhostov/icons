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

public val Icons.Outline.ArrowSquareRight: ImageVector
    get() {
        if (_arrowSquareRight != null) {
            return _arrowSquareRight!!
        }
        _arrowSquareRight = Builder(name = "ArrowSquareRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                lineTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(11.758f, 7.757f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(4.243f, 4.242f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.829f)
                lineToRelative(-4.243f, 4.242f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(15.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _arrowSquareRight!!
    }

private var _arrowSquareRight: ImageVector? = null

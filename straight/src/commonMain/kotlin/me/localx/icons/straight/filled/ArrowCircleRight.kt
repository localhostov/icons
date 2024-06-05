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

public val Icons.Filled.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight = Builder(name = "ArrowCircleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(17.414f, 10.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.828f)
                lineToRelative(-4.243f, 4.243f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(15.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                lineTo(11.757f, 7.757f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null

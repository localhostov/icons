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

public val Icons.Filled.MugHot: ImageVector
    get() {
        if (_mugHot != null) {
            return _mugHot!!
        }
        _mugHot = Builder(name = "MugHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 6.0f)
                lineTo(1.0f, 6.0f)
                lineTo(1.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(16.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(19.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(11.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                lineTo(5.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mugHot!!
    }

private var _mugHot: ImageVector? = null

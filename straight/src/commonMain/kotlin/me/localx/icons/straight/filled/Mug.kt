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

public val Icons.Filled.Mug: ImageVector
    get() {
        if (_mug != null) {
            return _mug!!
        }
        _mug = Builder(name = "Mug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 1.0f)
                lineTo(0.0f, 1.0f)
                lineTo(0.0f, 3.0f)
                lineTo(1.0f, 3.0f)
                lineTo(1.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                lineTo(15.0f, 8.0f)
                lineTo(1.0f, 8.0f)
                lineTo(1.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(16.0f, 23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(19.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                lineTo(24.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 6.0f)
                close()
                moveTo(22.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _mug!!
    }

private var _mug: ImageVector? = null

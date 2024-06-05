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

public val Icons.Filled.Trailer: ImageVector
    get() {
        if (_trailer != null) {
            return _trailer!!
        }
        _trailer = Builder(name = "Trailer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 21.0f)
                close()
                moveTo(22.0f, 19.0f)
                lineTo(22.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                curveToRelative(0.168f, -6.6f, 9.834f, -6.592f, 10.0f, 0.0f)
                lineTo(24.0f, 21.0f)
                lineTo(24.0f, 19.0f)
                close()
                moveTo(4.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(8.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineToRelative(9.0f)
                lineTo(4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _trailer!!
    }

private var _trailer: ImageVector? = null

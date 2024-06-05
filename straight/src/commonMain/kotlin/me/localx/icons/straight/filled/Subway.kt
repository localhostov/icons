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

public val Icons.Filled.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineTo(18.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                lineTo(22.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                close()
                moveTo(2.0f, 13.0f)
                lineTo(22.0f, 13.0f)
                verticalLineToRelative(6.0f)
                lineTo(17.785f, 19.0f)
                lineToRelative(3.062f, 5.0f)
                lineTo(18.5f, 24.0f)
                lineTo(15.44f, 19.0f)
                lineTo(8.655f, 19.0f)
                lineTo(5.593f, 24.0f)
                lineTo(3.248f, 24.0f)
                lineTo(6.31f, 19.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(17.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 17.0f)
                close()
                moveTo(7.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 17.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null

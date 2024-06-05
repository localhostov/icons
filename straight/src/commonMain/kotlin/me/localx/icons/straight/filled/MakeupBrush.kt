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

public val Icons.Filled.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.427f, 9.841f)
                lineToRelative(-2.12f, 1.824f)
                lineToRelative(4.048f, 4.047f)
                lineToRelative(1.821f, -2.122f)
                close()
                moveTo(15.482f, 12.068f)
                lineTo(23.942f, 2.211f)
                lineTo(21.789f, 0.058f)
                lineTo(11.946f, 8.532f)
                close()
                moveTo(8.046f, 24.0f)
                horizontalLineToRelative(-1.646f)
                arcToRelative(6.407f, 6.407f, 0.0f, false, true, -6.4f, -6.4f)
                verticalLineToRelative(-1.632f)
                lineToRelative(6.615f, -3.353f)
                lineToRelative(4.731f, 4.731f)
                close()
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null

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

public val Icons.Filled.CallOutgoing: ImageVector
    get() {
        if (_callOutgoing != null) {
            return _callOutgoing!!
        }
        _callOutgoing = Builder(name = "CallOutgoing", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.613f, 12.848f)
                lineToRelative(6.265f, 6.265f)
                lineToRelative(-3.171f, 3.171f)
                arcTo(5.893f, 5.893f, 0.0f, false, true, 16.5f, 24.0f)
                curveTo(9.252f, 24.0f, 0.0f, 14.748f, 0.0f, 7.5f)
                arcTo(5.893f, 5.893f, 0.0f, false, true, 1.716f, 3.293f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.265f, 6.265f)
                lineTo(7.027f, 10.512f)
                arcToRelative(12.145f, 12.145f, 0.0f, false, false, 6.453f, 6.469f)
                close()
                moveTo(21.529f, 0.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(3.615f)
                lineTo(15.0f, 7.62f)
                lineToRelative(1.414f, 1.414f)
                lineTo(22.0f, 3.443f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.5f)
                arcTo(2.488f, 2.488f, 0.0f, false, false, 21.529f, 0.0f)
                close()
            }
        }
        .build()
        return _callOutgoing!!
    }

private var _callOutgoing: ImageVector? = null

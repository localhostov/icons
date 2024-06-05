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

public val Icons.Filled.CallHistory: ImageVector
    get() {
        if (_callHistory != null) {
            return _callHistory!!
        }
        _callHistory = Builder(name = "CallHistory", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.48f, 16.981f)
                arcToRelative(12.135f, 12.135f, 0.0f, false, true, -6.453f, -6.469f)
                lineToRelative(4.124f, -4.125f)
                lineTo(4.887f, 0.122f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.887f, 5.887f, 0.0f, false, false, 0.0f, 7.5f)
                curveTo(0.0f, 14.748f, 9.252f, 24.0f, 16.5f, 24.0f)
                arcToRelative(5.893f, 5.893f, 0.0f, false, false, 4.207f, -1.715f)
                lineToRelative(3.171f, -3.172f)
                lineToRelative(-6.265f, -6.265f)
                close()
                moveTo(10.152f, 2.559f)
                arcTo(7.988f, 7.988f, 0.0f, true, true, 21.441f, 13.848f)
                lineToRelative(-1.413f, -1.414f)
                arcToRelative(5.991f, 5.991f, 0.0f, true, false, -8.463f, -8.461f)
                close()
                moveTo(15.0f, 8.5f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.758f)
                lineToRelative(1.561f, 1.56f)
                lineToRelative(-1.372f, 1.371f)
                close()
            }
        }
        .build()
        return _callHistory!!
    }

private var _callHistory: ImageVector? = null

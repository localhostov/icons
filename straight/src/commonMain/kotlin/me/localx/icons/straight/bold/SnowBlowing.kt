package me.localx.icons.straight.bold

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

public val Icons.Bold.SnowBlowing: ImageVector
    get() {
        if (_snowBlowing != null) {
            return _snowBlowing!!
        }
        _snowBlowing = Builder(name = "SnowBlowing", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.115f, 8.433f)
                lineTo(3.485f, 6.5f)
                lineTo(0.115f, 4.567f)
                lineToRelative(1.492f, -2.6f)
                lineTo(5.0f, 3.911f)
                lineTo(5.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 3.911f)
                lineToRelative(3.393f, -1.946f)
                lineToRelative(1.492f, 2.6f)
                lineTo(9.515f, 6.5f)
                lineToRelative(3.37f, 1.933f)
                lineToRelative(-1.492f, 2.6f)
                lineTo(8.0f, 9.089f)
                lineTo(8.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                lineTo(5.0f, 9.089f)
                lineTo(1.607f, 11.035f)
                close()
                moveTo(12.5f, 15.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(12.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcTo(1.645f, 1.645f, 0.0f, false, true, 11.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                curveToRelative(0.0f, 2.094f, 2.145f, 4.0f, 4.5f, 4.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -9.0f)
                close()
                moveTo(19.5f, 4.0f)
                curveTo(17.1f, 4.0f, 15.0f, 5.869f, 15.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.536f, 1.536f, 0.0f, true, true, 1.5f, 2.0f)
                lineTo(14.292f, 10.0f)
                lineToRelative(-1.72f, 3.0f)
                lineTo(19.5f, 13.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -9.0f)
                close()
            }
        }
        .build()
        return _snowBlowing!!
    }

private var _snowBlowing: ImageVector? = null

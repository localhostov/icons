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

public val Icons.Bold.MugHotAlt: ImageVector
    get() {
        if (_mugHotAlt != null) {
            return _mugHotAlt!!
        }
        _mugHotAlt = Builder(name = "MugHotAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.015f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(8.015f, 0.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.015f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.015f, 4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.015f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(3.015f, 4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(24.008f, 12.643f)
                arcTo(4.488f, 4.488f, 0.0f, false, true, 19.511f, 17.0f)
                lineTo(15.516f, 17.0f)
                arcToRelative(24.082f, 24.082f, 0.0f, false, true, -1.784f, 2.0f)
                horizontalLineToRelative(-8.3f)
                curveTo(5.261f, 18.843f, 0.866f, 14.691f, 0.048f, 9.723f)
                arcTo(3.157f, 3.157f, 0.0f, false, true, 0.767f, 7.172f)
                arcTo(3.307f, 3.307f, 0.0f, false, true, 3.293f, 6.0f)
                lineTo(15.706f, 6.0f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, true, 2.559f, 1.2f)
                arcTo(3.123f, 3.123f, 0.0f, false, true, 18.982f, 9.0f)
                horizontalLineToRelative(0.529f)
                curveTo(22.242f, 9.0f, 24.008f, 10.43f, 24.008f, 12.643f)
                close()
                moveTo(16.0f, 9.209f)
                arcTo(0.344f, 0.344f, 0.0f, false, false, 15.705f, 9.0f)
                lineTo(3.293f, 9.0f)
                arcToRelative(0.331f, 0.331f, 0.0f, false, false, -0.241f, 0.113f)
                arcToRelative(0.143f, 0.143f, 0.0f, false, false, -0.045f, 0.123f)
                arcTo(14.168f, 14.168f, 0.0f, false, false, 6.647f, 16.0f)
                horizontalLineToRelative(5.809f)
                arcTo(15.442f, 15.442f, 0.0f, false, false, 16.0f, 9.209f)
                close()
                moveTo(21.012f, 12.643f)
                curveToRelative(0.0f, -0.56f, -0.939f, -0.643f, -1.5f, -0.643f)
                lineTo(18.319f, 12.0f)
                arcToRelative(16.938f, 16.938f, 0.0f, false, true, -0.88f, 2.0f)
                horizontalLineToRelative(2.072f)
                arcTo(1.491f, 1.491f, 0.0f, false, false, 21.01f, 12.643f)
                close()
                moveTo(0.015f, 24.0f)
                horizontalLineToRelative(19.0f)
                lineTo(19.015f, 21.0f)
                horizontalLineToRelative(-19.0f)
                close()
            }
        }
        .build()
        return _mugHotAlt!!
    }

private var _mugHotAlt: ImageVector? = null

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

public val Icons.Bold.Onion: ImageVector
    get() {
        if (_onion != null) {
            return _onion!!
        }
        _onion = Builder(name = "Onion", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, -5.725f, -4.581f, -8.615f, -8.0f, -9.659f)
                lineTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 3.336f)
                curveTo(4.7f, 4.347f, 0.0f, 7.243f, 0.0f, 13.0f)
                curveToRelative(0.0f, 4.706f, 3.324f, 7.661f, 9.226f, 8.343f)
                lineToRelative(-0.586f, 0.645f)
                lineTo(10.86f, 24.0f)
                lineTo(12.0f, 22.751f)
                lineTo(13.14f, 24.0f)
                lineToRelative(2.22f, -2.016f)
                lineToRelative(-0.586f, -0.645f)
                curveTo(20.676f, 20.661f, 24.0f, 17.706f, 24.0f, 13.0f)
                close()
                moveTo(11.0f, 4.947f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 4.967f)
                lineToRelative(0.263f, 0.384f)
                arcTo(17.369f, 17.369f, 0.0f, false, true, 16.0f, 14.0f)
                curveToRelative(0.0f, 2.319f, -0.822f, 3.738f, -2.428f, 4.261f)
                arcTo(11.556f, 11.556f, 0.0f, false, false, 14.0f, 15.0f)
                curveToRelative(0.0f, -6.0f, -2.0f, -8.0f, -2.0f, -8.0f)
                reflectiveCurveToRelative(-2.0f, 2.0f, -2.0f, 8.0f)
                arcToRelative(11.556f, 11.556f, 0.0f, false, false, 0.428f, 3.261f)
                curveTo(8.822f, 17.737f, 8.0f, 16.318f, 8.0f, 14.0f)
                curveToRelative(0.0f, -4.354f, 2.732f, -8.639f, 2.759f, -8.68f)
                close()
                moveTo(3.0f, 13.0f)
                arcTo(6.478f, 6.478f, 0.0f, false, true, 6.424f, 7.31f)
                arcTo(18.418f, 18.418f, 0.0f, false, false, 5.0f, 14.0f)
                arcToRelative(9.415f, 9.415f, 0.0f, false, false, 0.521f, 3.222f)
                arcTo(4.544f, 4.544f, 0.0f, false, true, 3.0f, 13.0f)
                close()
                moveTo(18.479f, 17.221f)
                arcTo(9.415f, 9.415f, 0.0f, false, false, 19.0f, 14.0f)
                arcToRelative(18.215f, 18.215f, 0.0f, false, false, -1.367f, -6.643f)
                arcTo(6.467f, 6.467f, 0.0f, false, true, 21.0f, 13.0f)
                arcTo(4.544f, 4.544f, 0.0f, false, true, 18.479f, 17.221f)
                close()
            }
        }
        .build()
        return _onion!!
    }

private var _onion: ImageVector? = null

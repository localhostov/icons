package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 7.0f)
                close()
                moveTo(21.062f, 24.0f)
                lineTo(12.936f, 24.0f)
                arcToRelative(2.915f, 2.915f, 0.0f, false, true, -2.544f, -1.446f)
                arcToRelative(2.818f, 2.818f, 0.0f, false, true, -0.025f, -2.83f)
                lineToRelative(4.066f, -7.235f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, 5.136f, 0.0f)
                lineToRelative(4.063f, 7.232f)
                arcToRelative(2.817f, 2.817f, 0.0f, false, true, -0.025f, 2.832f)
                arcTo(2.915f, 2.915f, 0.0f, false, true, 21.062f, 24.0f)
                close()
                moveTo(16.991f, 14.023f)
                lineTo(13.107f, 21.0f)
                horizontalLineToRelative(7.812f)
                close()
                moveTo(8.0f, 22.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 21.0f)
                lineTo(3.712f, 21.0f)
                arcToRelative(0.685f, 0.685f, 0.0f, false, true, -0.608f, -0.347f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.015f, -0.7f)
                lineTo(9.35f, 8.372f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, true, 1.245f, 0.0f)
                lineToRelative(0.622f, 1.15f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.855f, 8.1f)
                lineToRelative(-0.622f, -1.151f)
                arcToRelative(3.732f, 3.732f, 0.0f, false, false, -6.522f, 0.0f)
                lineTo(0.45f, 18.521f)
                arcTo(3.713f, 3.713f, 0.0f, false, false, 3.712f, 24.0f)
                lineTo(6.5f, 24.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 22.5f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null

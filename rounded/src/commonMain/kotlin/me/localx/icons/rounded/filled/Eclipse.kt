package me.localx.icons.rounded.filled

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

public val Icons.Filled.Eclipse: ImageVector
    get() {
        if (_eclipse != null) {
            return _eclipse!!
        }
        _eclipse = Builder(name = "Eclipse", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                curveToRelative(-7.929f, -0.252f, -7.928f, -11.749f, 0.0f, -12.0f)
                curveTo(25.929f, 6.252f, 25.928f, 17.749f, 18.0f, 18.0f)
                close()
                moveTo(10.0f, 12.0f)
                arcToRelative(7.977f, 7.977f, 0.0f, false, true, 2.443f, -5.754f)
                arcTo(1.913f, 1.913f, 0.0f, false, false, 13.0f, 4.863f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 5.071f)
                arcToRelative(6.913f, 6.913f, 0.0f, false, false, -1.6f, 0.43f)
                lineTo(7.355f, 1.986f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 5.627f, 2.992f)
                lineTo(7.669f, 6.5f)
                arcTo(7.08f, 7.08f, 0.0f, false, false, 6.522f, 7.646f)
                lineTo(3.0f, 5.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 7.326f)
                lineTo(5.512f, 9.372f)
                arcTo(6.94f, 6.94f, 0.0f, false, false, 5.071f, 11.0f)
                lineTo(1.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(5.071f, 13.0f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, false, 0.439f, 1.622f)
                lineTo(2.0f, 16.662f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.01f, 18.391f)
                lineToRelative(3.509f, -2.042f)
                arcToRelative(7.028f, 7.028f, 0.0f, false, false, 1.13f, 1.131f)
                lineTo(5.6f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.33f, 22.007f)
                lineTo(9.376f, 18.49f)
                arcTo(6.966f, 6.966f, 0.0f, false, false, 11.0f, 18.929f)
                lineTo(11.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 19.137f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, false, -0.557f, -1.383f)
                arcTo(7.977f, 7.977f, 0.0f, false, true, 10.0f, 12.0f)
                close()
            }
        }
        .build()
        return _eclipse!!
    }

private var _eclipse: ImageVector? = null

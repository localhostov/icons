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

public val Icons.Bold.EnvelopeBan: ImageVector
    get() {
        if (_envelopeBan != null) {
            return _envelopeBan!!
        }
        _envelopeBan = Builder(name = "EnvelopeBan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.5f)
                verticalLineToRelative(3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                lineTo(0.0f, 8.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                arcTo(2.493f, 2.493f, 0.0f, false, false, 3.3f, 7.336f)
                lineToRelative(6.931f, 6.932f)
                arcToRelative(2.551f, 2.551f, 0.0f, false, false, 2.979f, 0.42f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.455f, 2.624f)
                arcToRelative(5.523f, 5.523f, 0.0f, false, true, -6.555f, -0.922f)
                lineTo(3.0f, 11.278f)
                lineTo(3.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 15.5f)
                close()
                moveTo(11.0f, 6.5f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 17.5f, 0.0f)
                curveToRelative(8.6f, 0.305f, 8.6f, 12.7f, 0.0f, 13.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 11.0f, 6.5f)
                close()
                moveTo(21.0f, 6.5f)
                arcToRelative(3.463f, 3.463f, 0.0f, false, false, -0.214f, -1.164f)
                lineToRelative(-4.45f, 4.45f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 6.5f)
                close()
                moveTo(14.0f, 6.5f)
                arcToRelative(3.463f, 3.463f, 0.0f, false, false, 0.214f, 1.164f)
                lineToRelative(4.45f, -4.45f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.0f, 6.5f)
                close()
            }
        }
        .build()
        return _envelopeBan!!
    }

private var _envelopeBan: ImageVector? = null

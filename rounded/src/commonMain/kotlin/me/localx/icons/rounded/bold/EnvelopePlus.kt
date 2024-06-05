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

public val Icons.Bold.EnvelopePlus: ImageVector
    get() {
        if (_envelopePlus != null) {
            return _envelopePlus!!
        }
        _envelopePlus = Builder(name = "EnvelopePlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.5f)
                verticalLineToRelative(6.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                horizontalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                verticalLineTo(8.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(2.493f, 2.493f, 0.0f, false, false, 3.3f, 7.336f)
                lineToRelative(6.931f, 6.932f)
                arcToRelative(2.562f, 2.562f, 0.0f, false, false, 3.536f, 0.0f)
                lineToRelative(1.224f, -1.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.182f, 2.06f)
                lineToRelative(-1.255f, 1.328f)
                arcToRelative(5.521f, 5.521f, 0.0f, false, true, -7.808f, 0.032f)
                lineTo(3.0f, 11.278f)
                verticalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 12.5f)
                close()
                moveTo(14.5f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 7.0f)
                close()
            }
        }
        .build()
        return _envelopePlus!!
    }

private var _envelopePlus: ImageVector? = null

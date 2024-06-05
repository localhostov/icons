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
                moveTo(24.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.2f)
                lineToRelative(5.239f, 5.24f)
                arcToRelative(5.317f, 5.317f, 0.0f, false, false, 7.521f, 0.0f)
                lineToRelative(2.457f, -2.456f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, -3.406f, -0.837f)
                lineToRelative(-1.172f, 1.172f)
                arcToRelative(2.373f, 2.373f, 0.0f, false, true, -3.278f, 0.0f)
                lineTo(3.0f, 6.96f)
                verticalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 6.0f)
                horizontalLineToRelative(6.525f)
                curveTo(10.016f, 5.834f, 10.0f, 5.669f, 10.0f, 5.5f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 10.375f, 3.0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 6.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(11.974f)
                arcToRelative(8.466f, 8.466f, 0.0f, false, true, -3.0f, 1.651f)
                close()
            }
        }
        .build()
        return _envelopePlus!!
    }

private var _envelopePlus: ImageVector? = null

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

public val Icons.Bold.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.655f, 8.162f)
                lineToRelative(-6.894f, -6.6f)
                arcToRelative(5.319f, 5.319f, 0.0f, false, false, -7.5f, -0.022f)
                lineTo(1.346f, 8.162f)
                arcTo(4.378f, 4.378f, 0.0f, false, false, 0.0f, 11.313f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(11.313f)
                arcTo(4.381f, 4.381f, 0.0f, false, false, 22.655f, 8.162f)
                close()
                moveTo(10.36f, 3.679f)
                arcToRelative(2.329f, 2.329f, 0.0f, false, true, 3.3f, 0.022f)
                lineToRelative(5.923f, 5.675f)
                lineTo(13.64f, 15.321f)
                arcToRelative(2.376f, 2.376f, 0.0f, false, true, -3.28f, 0.0f)
                lineTo(4.415f, 9.376f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineTo(12.2f)
                lineToRelative(5.239f, 5.24f)
                arcToRelative(5.32f, 5.32f, 0.0f, false, false, 7.522f, 0.0f)
                lineTo(21.0f, 12.2f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null

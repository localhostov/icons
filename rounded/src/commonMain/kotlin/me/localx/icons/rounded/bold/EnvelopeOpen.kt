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
                moveTo(22.306f, 7.827f)
                lineToRelative(-6.545f, -6.27f)
                arcToRelative(5.319f, 5.319f, 0.0f, false, false, -7.5f, -0.021f)
                lineTo(1.694f, 7.827f)
                arcTo(5.527f, 5.527f, 0.0f, false, false, 0.0f, 11.8f)
                verticalLineToRelative(6.7f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 18.5f)
                verticalLineTo(11.8f)
                arcTo(5.527f, 5.527f, 0.0f, false, false, 22.306f, 7.827f)
                close()
                moveTo(10.36f, 3.68f)
                arcToRelative(2.329f, 2.329f, 0.0f, false, true, 3.3f, 0.021f)
                lineToRelative(5.382f, 5.156f)
                lineToRelative(-5.276f, 5.411f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, true, -3.536f, 0.0f)
                lineTo(4.887f, 8.923f)
                close()
                moveTo(21.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 21.0f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineTo(11.8f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, true, 0.049f, -0.473f)
                lineToRelative(5.062f, 5.063f)
                arcToRelative(5.524f, 5.524f, 0.0f, false, false, 7.791f, -0.013f)
                lineToRelative(5.024f, -5.151f)
                arcTo(2.454f, 2.454f, 0.0f, false, true, 21.0f, 11.8f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null

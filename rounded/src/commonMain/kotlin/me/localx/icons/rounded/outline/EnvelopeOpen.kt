package me.localx.icons.rounded.outline

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

public val Icons.Outline.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.459f, 8.1f)
                lineTo(15.535f, 1.464f)
                arcTo(5.026f, 5.026f, 0.0f, false, false, 8.48f, 1.449f)
                lineTo(1.54f, 8.1f)
                arcTo(5.028f, 5.028f, 0.0f, false, false, 0.0f, 11.708f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(11.708f)
                arcTo(5.025f, 5.025f, 0.0f, false, false, 22.459f, 8.1f)
                close()
                moveTo(9.879f, 2.878f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, true, 4.258f, 0.016f)
                lineToRelative(6.747f, 6.464f)
                lineToRelative(-6.763f, 6.764f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, -4.242f, 0.0f)
                lineTo(3.115f, 9.358f)
                close()
                moveTo(22.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(11.708f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, true, 0.059f, -0.578f)
                lineToRelative(6.406f, 6.406f)
                arcToRelative(5.024f, 5.024f, 0.0f, false, false, 7.07f, 0.0f)
                lineToRelative(6.406f, -6.406f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, true, 0.059f, 0.578f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null

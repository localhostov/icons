package me.localx.icons.straight.outline

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
                moveTo(22.767f, 8.392f)
                lineTo(15.535f, 1.464f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.48f, 1.449f)
                lineTo(1.233f, 8.392f)
                arcTo(4.017f, 4.017f, 0.0f, false, false, 0.0f, 11.28f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(11.28f)
                arcTo(4.017f, 4.017f, 0.0f, false, false, 22.767f, 8.392f)
                close()
                moveTo(9.879f, 2.878f)
                arcToRelative(3.063f, 3.063f, 0.0f, false, true, 4.258f, 0.016f)
                lineToRelative(6.748f, 6.464f)
                lineToRelative(-6.764f, 6.764f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, -4.242f, 0.0f)
                lineTo(3.115f, 9.358f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.28f)
                curveToRelative(0.0f, -0.064f, 0.013f, -0.126f, 0.019f, -0.19f)
                lineToRelative(6.446f, 6.446f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 7.07f, 0.0f)
                lineToRelative(6.446f, -6.446f)
                curveToRelative(0.006f, 0.064f, 0.019f, 0.126f, 0.019f, 0.19f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null

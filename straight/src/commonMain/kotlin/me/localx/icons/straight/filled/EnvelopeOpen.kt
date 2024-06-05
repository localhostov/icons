package me.localx.icons.straight.filled

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

public val Icons.Filled.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2f, 8.437f)
                lineTo(8.48f, 1.449f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.055f, 0.015f)
                lineToRelative(7.27f, 6.973f)
                lineToRelative(-8.684f, 8.685f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, -4.242f, 0.0f)
                close()
                moveTo(15.54f, 18.537f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -7.07f, 0.0f)
                lineTo(0.16f, 10.23f)
                arcTo(3.962f, 3.962f, 0.0f, false, false, 0.0f, 11.28f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 11.28f)
                arcToRelative(3.962f, 3.962f, 0.0f, false, false, -0.16f, -1.05f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null

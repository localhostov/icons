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

public val Icons.Bold.EnvelopeMarker: ImageVector
    get() {
        if (_envelopeMarker != null) {
            return _envelopeMarker!!
        }
        _envelopeMarker = Builder(name = "EnvelopeMarker", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(0.46f)
                lineToRelative(7.361f, 7.361f)
                arcToRelative(2.373f, 2.373f, 0.0f, false, false, 3.278f, 0.0f)
                lineToRelative(0.327f, -0.327f)
                arcTo(3.334f, 3.334f, 0.0f, false, false, 16.356f, 15.0f)
                lineToRelative(0.847f, 0.0f)
                lineTo(15.76f, 16.442f)
                arcToRelative(5.317f, 5.317f, 0.0f, false, true, -7.521f, 0.0f)
                lineTo(3.0f, 11.2f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(15.0f, 0.0f)
                verticalLineTo(11.647f)
                arcTo(1.35f, 1.35f, 0.0f, false, false, 17.193f, 12.7f)
                lineTo(19.5f, 10.856f)
                lineTo(21.807f, 12.7f)
                arcTo(1.35f, 1.35f, 0.0f, false, false, 24.0f, 11.647f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _envelopeMarker!!
    }

private var _envelopeMarker: ImageVector? = null

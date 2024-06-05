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

public val Icons.Filled.BowlingPins: ImageVector
    get() {
        if (_bowlingPins != null) {
            return _bowlingPins!!
        }
        _bowlingPins = Builder(name = "BowlingPins", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.446f, 5.825f)
                arcTo(7.168f, 7.168f, 0.0f, false, true, 2.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(7.168f, 7.168f, 0.0f, false, true, -0.446f, 1.825f)
                arcTo(11.618f, 11.618f, 0.0f, false, false, 9.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                arcTo(11.618f, 11.618f, 0.0f, false, false, 2.446f, 5.825f)
                close()
                moveTo(9.511f, 10.0f)
                lineTo(2.489f, 10.0f)
                curveToRelative(-0.217f, 0.5f, -0.48f, 1.012f, -0.753f, 1.537f)
                arcTo(11.781f, 11.781f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(11.08f, 11.08f, 0.0f, false, false, 0.986f, 4.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.61f, 24.0f)
                lineTo(7.39f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.624f, -2.3f)
                arcTo(11.08f, 11.08f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(11.781f, 11.781f, 0.0f, false, false, -1.736f, -5.463f)
                curveTo(9.991f, 11.012f, 9.728f, 10.5f, 9.511f, 10.0f)
                close()
                moveTo(14.446f, 5.825f)
                arcTo(7.168f, 7.168f, 0.0f, false, true, 14.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(7.168f, 7.168f, 0.0f, false, true, -0.446f, 1.825f)
                arcTo(11.618f, 11.618f, 0.0f, false, false, 21.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                arcTo(11.618f, 11.618f, 0.0f, false, false, 14.446f, 5.825f)
                close()
                moveTo(21.511f, 10.0f)
                lineTo(14.489f, 10.0f)
                curveToRelative(-0.217f, 0.5f, -0.48f, 1.012f, -0.753f, 1.537f)
                arcTo(11.781f, 11.781f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(11.08f, 11.08f, 0.0f, false, false, 0.986f, 4.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.61f, 24.0f)
                horizontalLineToRelative(2.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.624f, -2.3f)
                arcTo(11.08f, 11.08f, 0.0f, false, false, 24.0f, 17.0f)
                arcToRelative(11.781f, 11.781f, 0.0f, false, false, -1.736f, -5.463f)
                curveTo(21.991f, 11.012f, 21.728f, 10.5f, 21.511f, 10.0f)
                close()
            }
        }
        .build()
        return _bowlingPins!!
    }

private var _bowlingPins: ImageVector? = null

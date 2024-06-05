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

public val Icons.Filled.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.954f, 2.525f)
                lineToRelative(3.046f, 1.523f)
                lineToRelative(1.0f, -0.049f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-1.897f)
                lineToRelative(-8.593f, -7.181f)
                lineToRelative(1.736f, -1.662f)
                lineToRelative(-1.383f, -1.445f)
                lineToRelative(-4.173f, 3.995f)
                curveToRelative(-0.207f, 0.208f, -0.493f, 0.315f, -0.788f, 0.29f)
                curveToRelative(-0.298f, -0.024f, -0.56f, -0.175f, -0.739f, -0.425f)
                curveToRelative(-0.274f, -0.38f, -0.19f, -0.975f, 0.181f, -1.347f)
                lineTo(14.646f, 3.073f)
                curveToRelative(1.51f, -1.173f, 3.618f, -1.393f, 5.308f, -0.548f)
                close()
                moveTo(12.056f, 11.211f)
                lineToRelative(-0.967f, 0.925f)
                curveToRelative(-0.551f, 0.552f, -1.312f, 0.863f, -2.104f, 0.863f)
                curveToRelative(-0.984f, 0.0f, -1.925f, -0.536f, -2.444f, -1.259f)
                curveToRelative(-0.846f, -1.172f, -0.675f, -2.866f, 0.398f, -3.938f)
                lineToRelative(4.007f, -3.911f)
                lineToRelative(-0.617f, -0.593f)
                curveToRelative(-0.919f, -0.837f, -2.109f, -1.298f, -3.39f, -1.298f)
                curveToRelative(-0.771f, 0.0f, -1.54f, 0.182f, -2.227f, 0.525f)
                lineToRelative(-1.949f, 1.475f)
                lineTo(0.0f, 4.0f)
                verticalLineToRelative(13.0f)
                lineTo(2.667f, 17.0f)
                lineToRelative(9.333f, 7.0f)
                lineToRelative(8.094f, -6.071f)
                lineToRelative(-8.039f, -6.718f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null

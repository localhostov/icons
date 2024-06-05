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

public val Icons.Outline.Messages: ImageVector
    get() {
        if (_messages != null) {
            return _messages!!
        }
        _messages = Builder(name = "Messages", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 4.0f)
                horizontalLineToRelative(-1.101f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(12.854f)
                curveToRelative(0.0f, 0.794f, 0.435f, 1.52f, 1.134f, 1.894f)
                curveToRelative(0.318f, 0.171f, 0.667f, 0.255f, 1.015f, 0.255f)
                curveToRelative(0.416f, 0.0f, 0.831f, -0.121f, 1.19f, -0.36f)
                lineToRelative(2.95f, -1.967f)
                curveToRelative(0.691f, 1.935f, 2.541f, 3.324f, 4.711f, 3.324f)
                horizontalLineToRelative(5.697f)
                lineToRelative(3.964f, 2.643f)
                curveToRelative(0.36f, 0.24f, 0.774f, 0.361f, 1.19f, 0.361f)
                curveToRelative(0.348f, 0.0f, 0.696f, -0.085f, 1.015f, -0.256f)
                curveToRelative(0.7f, -0.374f, 1.134f, -1.1f, 1.134f, -1.894f)
                verticalLineToRelative(-12.854f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.23f, 17.979f)
                curveToRelative(-0.019f, 0.012f, -0.075f, 0.048f, -0.152f, 0.007f)
                curveToRelative(-0.079f, -0.042f, -0.079f, -0.109f, -0.079f, -0.131f)
                lineTo(1.999f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.327f, 0.0f, -0.541f, 0.159f, -0.565f, 0.175f)
                lineToRelative(-4.205f, 2.804f)
                close()
                moveTo(22.0f, 21.855f)
                curveToRelative(0.0f, 0.021f, 0.0f, 0.089f, -0.079f, 0.131f)
                curveToRelative(-0.079f, 0.041f, -0.133f, 0.005f, -0.151f, -0.007f)
                lineToRelative(-4.215f, -2.811f)
                curveToRelative(-0.164f, -0.109f, -0.357f, -0.168f, -0.555f, -0.168f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, -0.836f, -2.828f, -2.0f)
                horizontalLineToRelative(4.828f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(12.854f)
                close()
            }
        }
        .build()
        return _messages!!
    }

private var _messages: ImageVector? = null

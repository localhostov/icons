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

public val Icons.Outline.RocketLunch: ImageVector
    get() {
        if (_rocketLunch != null) {
            return _rocketLunch!!
        }
        _rocketLunch = Builder(name = "RocketLunch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 8.5f)
                close()
                moveTo(17.994f, 15.366f)
                arcToRelative(11.065f, 11.065f, 0.0f, false, true, -1.163f, 4.569f)
                arcTo(7.634f, 7.634f, 0.0f, false, true, 10.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 18.5f)
                arcTo(3.517f, 3.517f, 0.0f, false, false, 5.5f, 15.0f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 14.0f)
                arcTo(7.634f, 7.634f, 0.0f, false, true, 4.065f, 7.169f)
                arcTo(11.065f, 11.065f, 0.0f, false, true, 8.634f, 6.006f)
                arcTo(15.487f, 15.487f, 0.0f, false, true, 20.972f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(3.009f, 3.009f, 0.0f, false, true, 24.0f, 3.0f)
                arcTo(15.507f, 15.507f, 0.0f, false, true, 17.994f, 15.366f)
                close()
                moveTo(2.084f, 13.0f)
                lineTo(4.346f, 13.0f)
                arcTo(34.361f, 34.361f, 0.0f, false, true, 6.955f, 8.237f)
                arcToRelative(8.993f, 8.993f, 0.0f, false, false, -1.993f, 0.72f)
                arcTo(5.519f, 5.519f, 0.0f, false, false, 2.084f, 13.0f)
                close()
                moveTo(15.763f, 17.045f)
                arcTo(34.361f, 34.361f, 0.0f, false, true, 11.0f, 19.654f)
                verticalLineToRelative(2.262f)
                arcToRelative(5.519f, 5.519f, 0.0f, false, false, 4.043f, -2.878f)
                arcTo(8.993f, 8.993f, 0.0f, false, false, 15.763f, 17.045f)
                close()
                moveTo(22.0f, 2.972f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 2.0f)
                curveToRelative(-5.16f, 0.147f, -8.65f, 2.124f, -12.018f, 6.822f)
                arcToRelative(29.92f, 29.92f, 0.0f, false, false, -2.471f, 4.271f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 4.4f, 4.4f)
                arcToRelative(29.92f, 29.92f, 0.0f, false, false, 4.271f, -2.471f)
                curveTo(19.876f, 11.65f, 21.853f, 8.16f, 22.0f, 2.972f)
                close()
                moveTo(6.122f, 17.879f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, true, 0.0f, 4.242f)
                curveToRelative(-0.907f, 0.906f, -3.622f, 1.465f, -4.748f, 1.664f)
                lineToRelative(-1.406f, 0.247f)
                lineToRelative(0.247f, -1.406f)
                curveToRelative(0.2f, -1.126f, 0.758f, -3.841f, 1.664f, -4.748f)
                arcTo(3.073f, 3.073f, 0.0f, false, true, 6.122f, 17.879f)
                close()
                moveTo(5.0f, 20.0f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, false, -0.293f, -0.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                arcTo(7.318f, 7.318f, 0.0f, false, false, 2.5f, 21.5f)
                arcToRelative(7.342f, 7.342f, 0.0f, false, false, 2.208f, -0.794f)
                arcTo(0.993f, 0.993f, 0.0f, false, false, 5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _rocketLunch!!
    }

private var _rocketLunch: ImageVector? = null

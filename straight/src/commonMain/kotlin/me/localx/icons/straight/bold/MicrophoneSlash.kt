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

public val Icons.Bold.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 12.0f)
                verticalLineToRelative(-2.05f)
                lineToRelative(3.183f, 3.183f)
                curveToRelative(0.385f, 1.29f, 1.393f, 2.299f, 2.683f, 2.683f)
                lineToRelative(2.936f, 2.936f)
                curveToRelative(-0.585f, 0.157f, -1.19f, 0.247f, -1.803f, 0.247f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                close()
                moveTo(13.5f, 21.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                verticalLineToRelative(-0.5f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 5.79f, 4.71f, 10.5f, 10.5f, 10.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.597f, 0.0f, 3.128f, -0.363f, 4.521f, -1.029f)
                lineToRelative(-2.303f, -2.303f)
                curveToRelative(-0.708f, 0.218f, -1.453f, 0.332f, -2.218f, 0.332f)
                close()
                moveTo(24.0f, 13.5f)
                curveToRelative(0.0f, 2.291f, -0.735f, 4.481f, -2.09f, 6.289f)
                lineToRelative(2.051f, 2.051f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.04f, 2.161f)
                lineTo(2.161f, 0.04f)
                lineToRelative(3.662f, 3.662f)
                curveToRelative(1.189f, -2.229f, 3.536f, -3.701f, 6.177f, -3.701f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.353f, -0.386f, 2.656f, -1.104f, 3.775f)
                lineToRelative(1.861f, 1.861f)
                curveToRelative(0.808f, -1.218f, 1.243f, -2.647f, 1.243f, -4.136f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(16.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.879f)
                lineToRelative(2.562f, 2.562f)
                curveToRelative(0.207f, -0.489f, 0.316f, -1.018f, 0.316f, -1.562f)
                close()
                moveTo(8.125f, 6.004f)
                lineToRelative(4.875f, 4.875f)
                verticalLineToRelative(-2.879f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.839f, 0.0f, -3.427f, 1.248f, -3.875f, 3.004f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null

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

public val Icons.Bold.ClipboardQuestion: ImageVector
    get() {
        if (_clipboardQuestion != null) {
            return _clipboardQuestion!!
        }
        _clipboardQuestion = Builder(name = "ClipboardQuestion", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.662f, 2.0f)
                curveToRelative(-0.563f, -1.182f, -1.769f, -2.0f, -3.162f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.394f, 0.0f, -2.599f, 0.818f, -3.162f, 2.0f)
                lineTo(2.0f, 2.0f)
                lineTo(2.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-5.338f)
                close()
                moveTo(19.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(10.5f, 16.013f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.042f, 7.148f)
                curveToRelative(1.363f, 0.353f, 2.472f, 1.462f, 2.824f, 2.825f)
                curveToRelative(0.488f, 1.893f, -0.431f, 3.857f, -2.187f, 4.672f)
                curveToRelative(-0.089f, 0.041f, -0.18f, 0.2f, -0.18f, 0.396f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.354f, 0.753f, -2.579f, 1.919f, -3.119f)
                curveToRelative(0.379f, -0.176f, 0.694f, -0.614f, 0.543f, -1.199f)
                curveToRelative(-0.081f, -0.313f, -0.357f, -0.59f, -0.671f, -0.671f)
                curveToRelative(-0.445f, -0.116f, -0.756f, 0.057f, -0.902f, 0.17f)
                curveToRelative(-0.247f, 0.19f, -0.389f, 0.479f, -0.389f, 0.791f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.247f, 0.566f, -2.399f, 1.552f, -3.164f)
                curveToRelative(0.988f, -0.765f, 2.26f, -1.019f, 3.49f, -0.701f)
                close()
            }
        }
        .build()
        return _clipboardQuestion!!
    }

private var _clipboardQuestion: ImageVector? = null

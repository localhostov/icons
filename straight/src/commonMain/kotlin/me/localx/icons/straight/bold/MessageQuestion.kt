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

public val Icons.Bold.MessageQuestion: ImageVector
    get() {
        if (_messageQuestion != null) {
            return _messageQuestion!!
        }
        _messageQuestion = Builder(name = "MessageQuestion", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.74f)
                lineToRelative(3.599f, 3.03f)
                curveToRelative(0.479f, 0.426f, 1.08f, 0.636f, 1.675f, 0.636f)
                curveToRelative(0.582f, 0.0f, 1.158f, -0.202f, 1.606f, -0.601f)
                lineToRelative(3.708f, -3.065f)
                horizontalLineToRelative(6.672f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-4.752f)
                lineToRelative(-4.244f, 3.511f)
                lineToRelative(-4.168f, -3.511f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(10.5f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.867f, 6.961f)
                curveToRelative(0.487f, 1.894f, -0.433f, 3.857f, -2.188f, 4.67f)
                curveToRelative(-0.088f, 0.041f, -0.179f, 0.2f, -0.179f, 0.397f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.355f, 0.753f, -2.58f, 1.918f, -3.12f)
                curveToRelative(0.38f, -0.175f, 0.694f, -0.614f, 0.544f, -1.198f)
                curveToRelative(-0.081f, -0.314f, -0.356f, -0.591f, -0.671f, -0.672f)
                curveToRelative(-0.442f, -0.112f, -0.756f, 0.058f, -0.902f, 0.17f)
                curveToRelative(-0.247f, 0.191f, -0.389f, 0.48f, -0.389f, 0.792f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.246f, 0.565f, -2.399f, 1.552f, -3.163f)
                curveToRelative(0.985f, -0.764f, 2.255f, -1.023f, 3.49f, -0.703f)
                curveToRelative(1.365f, 0.353f, 2.474f, 1.463f, 2.825f, 2.827f)
                close()
            }
        }
        .build()
        return _messageQuestion!!
    }

private var _messageQuestion: ImageVector? = null

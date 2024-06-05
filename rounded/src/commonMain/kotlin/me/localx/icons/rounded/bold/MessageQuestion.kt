package me.localx.icons.rounded.bold

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
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.24f)
                lineToRelative(3.599f, 3.03f)
                curveToRelative(0.479f, 0.426f, 1.08f, 0.636f, 1.675f, 0.636f)
                curveToRelative(0.582f, 0.0f, 1.158f, -0.202f, 1.606f, -0.601f)
                lineToRelative(3.708f, -3.065f)
                horizontalLineToRelative(1.172f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 14.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.712f)
                curveToRelative(-0.349f, 0.0f, -0.687f, 0.122f, -0.956f, 0.344f)
                lineToRelative(-3.828f, 3.167f)
                lineToRelative(-3.75f, -3.158f)
                curveToRelative(-0.27f, -0.228f, -0.612f, -0.353f, -0.966f, -0.353f)
                horizontalLineToRelative(-1.788f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(13.5f, 15.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.867f, 6.961f)
                curveToRelative(0.487f, 1.894f, -0.433f, 3.857f, -2.188f, 4.67f)
                curveToRelative(-0.114f, 0.053f, -0.207f, 0.168f, -0.226f, 0.243f)
                curveToRelative(-0.175f, 0.677f, -0.784f, 1.126f, -1.452f, 1.126f)
                curveToRelative(-0.124f, 0.0f, -0.249f, -0.015f, -0.375f, -0.047f)
                curveToRelative(-0.802f, -0.207f, -1.285f, -1.024f, -1.079f, -1.827f)
                curveToRelative(0.248f, -0.96f, 0.947f, -1.789f, 1.871f, -2.218f)
                curveToRelative(0.38f, -0.175f, 0.694f, -0.614f, 0.544f, -1.198f)
                curveToRelative(-0.081f, -0.314f, -0.356f, -0.591f, -0.671f, -0.672f)
                curveToRelative(-0.408f, -0.104f, -0.718f, 0.033f, -0.865f, 0.126f)
                curveToRelative(-0.238f, 0.148f, -0.404f, 0.38f, -0.456f, 0.635f)
                curveToRelative(-0.166f, 0.812f, -0.965f, 1.333f, -1.769f, 1.171f)
                curveToRelative(-0.812f, -0.165f, -1.336f, -0.957f, -1.171f, -1.769f)
                curveToRelative(0.215f, -1.058f, 0.873f, -1.998f, 1.806f, -2.581f)
                curveToRelative(0.96f, -0.601f, 2.101f, -0.772f, 3.206f, -0.486f)
                curveToRelative(1.365f, 0.353f, 2.474f, 1.463f, 2.825f, 2.827f)
                close()
            }
        }
        .build()
        return _messageQuestion!!
    }

private var _messageQuestion: ImageVector? = null

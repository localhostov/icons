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

public val Icons.Bold.MessageImage: ImageVector
    get() {
        if (_messageImage != null) {
            return _messageImage!!
        }
        _messageImage = Builder(name = "MessageImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.241f)
                lineToRelative(3.598f, 3.03f)
                curveToRelative(0.479f, 0.426f, 1.08f, 0.636f, 1.675f, 0.636f)
                curveToRelative(0.583f, 0.0f, 1.158f, -0.201f, 1.606f, -0.601f)
                lineToRelative(3.708f, -3.065f)
                horizontalLineToRelative(1.172f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.187f, 0.0f, 2.182f, 0.831f, 2.437f, 1.942f)
                lineToRelative(-5.315f, 5.315f)
                curveToRelative(-0.344f, 0.342f, -0.9f, 0.342f, -1.244f, 0.0f)
                lineToRelative(-0.635f, -0.635f)
                curveToRelative(-1.465f, -1.467f, -4.021f, -1.467f, -5.486f, 0.0f)
                lineToRelative(-5.231f, 5.231f)
                curveToRelative(-0.016f, -0.116f, -0.025f, -0.233f, -0.025f, -0.353f)
                lineTo(3.001f, 5.5f)
                close()
                moveTo(18.5f, 17.0f)
                horizontalLineToRelative(-1.712f)
                curveToRelative(-0.349f, 0.0f, -0.687f, 0.122f, -0.956f, 0.344f)
                lineToRelative(-3.829f, 3.167f)
                lineToRelative(-3.749f, -3.158f)
                curveToRelative(-0.271f, -0.228f, -0.613f, -0.353f, -0.966f, -0.353f)
                horizontalLineToRelative(-1.789f)
                curveToRelative(-0.12f, 0.0f, -0.238f, -0.009f, -0.353f, -0.025f)
                lineToRelative(5.232f, -5.231f)
                curveToRelative(0.332f, -0.332f, 0.911f, -0.332f, 1.244f, 0.0f)
                lineToRelative(0.635f, 0.635f)
                curveToRelative(1.466f, 1.467f, 4.021f, 1.467f, 5.486f, 0.0f)
                lineToRelative(3.257f, -3.257f)
                verticalLineToRelative(5.379f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(5.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _messageImage!!
    }

private var _messageImage: ImageVector? = null

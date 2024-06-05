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

public val Icons.Outline.MessageQuestion: ImageVector
    get() {
        if (_messageQuestion != null) {
            return _messageQuestion!!
        }
        _messageQuestion = Builder(name = "MessageQuestion", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(2.923f)
                lineToRelative(3.749f, 3.156f)
                curveToRelative(0.382f, 0.34f, 0.861f, 0.509f, 1.337f, 0.508f)
                curveToRelative(0.468f, 0.0f, 0.931f, -0.162f, 1.292f, -0.484f)
                lineToRelative(3.847f, -3.18f)
                horizontalLineToRelative(2.853f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(24.001f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.212f)
                curveToRelative(-0.232f, 0.0f, -0.458f, 0.081f, -0.637f, 0.229f)
                lineToRelative(-4.171f, 3.415f)
                lineToRelative(-4.048f, -3.409f)
                curveToRelative(-0.181f, -0.152f, -0.409f, -0.235f, -0.645f, -0.235f)
                horizontalLineToRelative(-3.288f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(1.999f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(13.5f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.864f, 6.951f)
                curveToRelative(0.49f, 1.898f, -0.429f, 3.867f, -2.186f, 4.68f)
                curveToRelative(-0.239f, 0.111f, -0.679f, 0.64f, -0.679f, 1.169f)
                verticalLineToRelative(0.2f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-0.2f)
                curveToRelative(0.0f, -1.384f, 0.947f, -2.57f, 1.838f, -2.983f)
                curveToRelative(0.732f, -0.339f, 1.385f, -1.224f, 1.091f, -2.365f)
                curveToRelative(-0.17f, -0.656f, -0.724f, -1.21f, -1.379f, -1.379f)
                curveToRelative(-0.643f, -0.169f, -1.271f, -0.043f, -1.772f, 0.345f)
                curveToRelative(-0.494f, 0.383f, -0.777f, 0.96f, -0.777f, 1.583f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.247f, 0.565f, -2.4f, 1.553f, -3.164f)
                curveToRelative(0.986f, -0.766f, 2.262f, -1.022f, 3.497f, -0.7f)
                curveToRelative(1.358f, 0.35f, 2.464f, 1.455f, 2.814f, 2.815f)
                close()
            }
        }
        .build()
        return _messageQuestion!!
    }

private var _messageQuestion: ImageVector? = null

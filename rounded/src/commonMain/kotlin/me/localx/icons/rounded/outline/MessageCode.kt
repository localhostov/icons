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

public val Icons.Outline.MessageCode: ImageVector
    get() {
        if (_messageCode != null) {
            return _messageCode!!
        }
        _messageCode = Builder(name = "MessageCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.831f, 15.0f)
                curveToRelative(-0.256f, 0.0f, -0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.583f, -2.583f)
                curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0.0f, -1.415f)
                lineToRelative(-2.583f, -2.583f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.583f, 2.583f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.073f, 0.0f, 4.243f)
                lineToRelative(-2.583f, 2.583f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                close()
                moveTo(9.877f, 14.707f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-2.583f, -2.583f)
                curveToRelative(-0.39f, -0.391f, -0.39f, -1.024f, 0.0f, -1.415f)
                lineToRelative(2.583f, -2.583f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-2.583f, 2.583f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.073f, 0.0f, 4.243f)
                lineToRelative(2.583f, 2.583f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                close()
                moveTo(13.302f, 23.18f)
                lineToRelative(3.847f, -3.18f)
                horizontalLineToRelative(2.852f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(24.001f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(2.923f)
                lineToRelative(3.748f, 3.156f)
                curveToRelative(0.382f, 0.34f, 0.862f, 0.509f, 1.338f, 0.509f)
                curveToRelative(0.467f, 0.0f, 0.931f, -0.163f, 1.292f, -0.485f)
                close()
                moveTo(20.0f, 2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.211f)
                curveToRelative(-0.232f, 0.0f, -0.458f, 0.081f, -0.637f, 0.229f)
                lineToRelative(-4.172f, 3.415f)
                lineToRelative(-4.047f, -3.409f)
                curveToRelative(-0.18f, -0.152f, -0.408f, -0.235f, -0.644f, -0.235f)
                horizontalLineToRelative(-3.289f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(2.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                lineTo(20.0f, 2.0f)
                close()
            }
        }
        .build()
        return _messageCode!!
    }

private var _messageCode: ImageVector? = null

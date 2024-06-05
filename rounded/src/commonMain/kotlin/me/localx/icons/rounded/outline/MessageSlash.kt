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

public val Icons.Outline.MessageSlash: ImageVector
    get() {
        if (_messageSlash != null) {
            return _messageSlash!!
        }
        _messageSlash = Builder(name = "MessageSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-3.187f, -3.187f)
                curveToRelative(0.917f, -0.746f, 1.48f, -1.88f, 1.48f, -3.106f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(6.0f, 2.0f)
                curveToRelative(-0.721f, 0.0f, -1.421f, 0.193f, -2.032f, 0.554f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.685f, -0.352f, 1.313f, -0.909f, 1.677f)
                lineTo(5.482f, 4.068f)
                curveToRelative(0.167f, -0.045f, 0.341f, -0.068f, 0.518f, -0.068f)
                close()
                moveTo(15.483f, 19.363f)
                curveToRelative(0.353f, 0.425f, 0.292f, 1.056f, -0.134f, 1.407f)
                lineToRelative(-2.169f, 1.793f)
                curveToRelative(-0.327f, 0.292f, -0.747f, 0.439f, -1.172f, 0.439f)
                curveToRelative(-0.433f, 0.0f, -0.869f, -0.153f, -1.218f, -0.463f)
                lineToRelative(-3.016f, -2.54f)
                horizontalLineToRelative(-1.775f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.141f)
                curveToRelative(0.235f, 0.0f, 0.464f, 0.083f, 0.645f, 0.235f)
                lineToRelative(3.216f, 2.71f)
                lineToRelative(2.075f, -1.716f)
                curveToRelative(0.426f, -0.353f, 1.058f, -0.291f, 1.407f, 0.134f)
                close()
            }
        }
        .build()
        return _messageSlash!!
    }

private var _messageSlash: ImageVector? = null

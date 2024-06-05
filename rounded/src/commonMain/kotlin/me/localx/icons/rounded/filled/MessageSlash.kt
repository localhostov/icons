package me.localx.icons.rounded.filled

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

public val Icons.Filled.MessageSlash: ImageVector
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
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.721f, 0.0f, -1.421f, 0.193f, -2.032f, 0.554f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(3.71f, 7.886f)
                curveToRelative(-0.285f, -0.288f, -0.716f, -0.375f, -1.091f, -0.221f)
                reflectiveCurveToRelative(-0.619f, 0.52f, -0.619f, 0.925f)
                verticalLineToRelative(7.41f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(1.775f)
                lineToRelative(3.016f, 2.54f)
                curveToRelative(0.35f, 0.311f, 0.788f, 0.464f, 1.221f, 0.464f)
                curveToRelative(0.422f, 0.0f, 0.839f, -0.146f, 1.161f, -0.434f)
                lineToRelative(1.967f, -1.59f)
                curveToRelative(0.22f, -0.178f, 0.354f, -0.44f, 0.369f, -0.723f)
                curveToRelative(0.016f, -0.282f, -0.089f, -0.558f, -0.288f, -0.759f)
                lineTo(3.71f, 7.886f)
                close()
            }
        }
        .build()
        return _messageSlash!!
    }

private var _messageSlash: ImageVector? = null

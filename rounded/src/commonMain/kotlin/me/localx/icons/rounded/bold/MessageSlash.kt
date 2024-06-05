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

public val Icons.Bold.MessageSlash: ImageVector
    get() {
        if (_messageSlash != null) {
            return _messageSlash!!
        }
        _messageSlash = Builder(name = "MessageSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 21.439f)
                lineToRelative(-2.113f, -2.113f)
                curveToRelative(0.98f, -1.014f, 1.552f, -2.384f, 1.552f, -3.826f)
                lineTo(23.0f, 6.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                lineTo(6.5f, 1.0f)
                curveToRelative(-0.941f, 0.0f, -1.867f, 0.244f, -2.681f, 0.698f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                reflectiveCurveTo(-0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                close()
                moveTo(6.5f, 4.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.639f, -0.248f, 1.248f, -0.673f, 1.706f)
                lineTo(6.146f, 4.025f)
                curveToRelative(0.116f, -0.016f, 0.234f, -0.025f, 0.354f, -0.025f)
                close()
                moveTo(15.156f, 20.135f)
                curveToRelative(0.527f, 0.639f, 0.438f, 1.584f, -0.201f, 2.111f)
                lineToRelative(-1.456f, 1.203f)
                curveToRelative(-0.412f, 0.369f, -0.945f, 0.557f, -1.484f, 0.557f)
                curveToRelative(-0.553f, 0.0f, -1.112f, -0.196f, -1.558f, -0.594f)
                lineToRelative(-2.864f, -2.412f)
                horizontalLineToRelative(-1.093f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.641f)
                curveToRelative(0.354f, 0.0f, 0.696f, 0.125f, 0.967f, 0.353f)
                lineToRelative(2.897f, 2.441f)
                lineToRelative(1.04f, -0.86f)
                curveToRelative(0.638f, -0.529f, 1.583f, -0.438f, 2.111f, 0.201f)
                close()
            }
        }
        .build()
        return _messageSlash!!
    }

private var _messageSlash: ImageVector? = null

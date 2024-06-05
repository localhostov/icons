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

public val Icons.Bold.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.169f, 4.262f)
                lineToRelative(3.477f, 1.738f)
                horizontalLineToRelative(3.354f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-2.646f)
                lineToRelative(-2.843f, -1.421f)
                curveToRelative(-2.005f, -1.004f, -4.605f, -0.599f, -6.146f, 0.857f)
                lineToRelative(-0.358f, 0.302f)
                lineToRelative(-0.341f, -0.311f)
                curveToRelative(-1.011f, -0.921f, -2.321f, -1.428f, -3.727f, -1.428f)
                curveToRelative(-0.848f, 0.0f, -1.695f, 0.2f, -2.45f, 0.578f)
                lineToRelative(-2.844f, 1.422f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(3.354f)
                lineToRelative(3.478f, -1.739f)
                curveToRelative(0.843f, -0.422f, 2.046f, -0.313f, 2.813f, 0.385f)
                lineToRelative(0.051f, 0.046f)
                lineToRelative(-3.788f, 3.208f)
                curveToRelative(-1.044f, 1.046f, -1.202f, 2.706f, -0.369f, 3.864f)
                curveToRelative(0.511f, 0.71f, 1.301f, 1.157f, 2.167f, 1.227f)
                curveToRelative(0.837f, 0.069f, 1.669f, -0.227f, 2.279f, -0.809f)
                lineToRelative(2.067f, -1.767f)
                lineToRelative(6.539f, 4.994f)
                lineToRelative(-6.591f, 4.845f)
                lineTo(3.492f, 14.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(2.508f)
                lineToRelative(9.492f, 6.977f)
                lineToRelative(9.492f, -6.977f)
                horizontalLineToRelative(2.508f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.31f)
                lineTo(12.044f, 6.634f)
                lineToRelative(2.317f, -1.96f)
                curveToRelative(0.741f, -0.697f, 1.902f, -0.867f, 2.808f, -0.412f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null

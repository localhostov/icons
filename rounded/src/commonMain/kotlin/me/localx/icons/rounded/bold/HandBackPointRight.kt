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

public val Icons.Bold.HandBackPointRight: ImageVector
    get() {
        if (_handBackPointRight != null) {
            return _handBackPointRight!!
        }
        _handBackPointRight = Builder(name = "HandBackPointRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.221f, 22.0f)
                horizontalLineTo(5.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-5.969f)
                curveToRelative(0.0f, -2.271f, 0.884f, -4.406f, 2.49f, -6.011f)
                lineToRelative(2.308f, -2.308f)
                curveToRelative(0.783f, -0.784f, 1.872f, -1.206f, 2.934f, -1.212f)
                curveToRelative(1.108f, 0.002f, 2.149f, 0.436f, 2.93f, 1.222f)
                lineToRelative(3.942f, 3.778f)
                horizontalLineToRelative(5.397f)
                curveToRelative(1.175f, 0.0f, 2.286f, 0.514f, 3.048f, 1.41f)
                curveToRelative(0.762f, 0.895f, 1.089f, 2.08f, 0.898f, 3.251f)
                curveToRelative(-0.31f, 1.904f, -2.064f, 3.339f, -4.08f, 3.339f)
                horizontalLineToRelative(-3.537f)
                lineToRelative(-0.716f, 3.579f)
                curveToRelative(-0.512f, 2.562f, -2.78f, 4.421f, -5.393f, 4.421f)
                close()
                moveTo(7.725f, 4.0f)
                curveToRelative(-0.304f, 0.0f, -0.59f, 0.118f, -0.806f, 0.333f)
                lineToRelative(-2.308f, 2.308f)
                curveToRelative(-1.039f, 1.039f, -1.611f, 2.42f, -1.611f, 3.889f)
                verticalLineToRelative(5.969f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.721f)
                curveToRelative(1.188f, 0.0f, 2.219f, -0.845f, 2.452f, -2.01f)
                lineToRelative(0.957f, -4.785f)
                curveToRelative(0.14f, -0.701f, 0.756f, -1.206f, 1.471f, -1.206f)
                horizontalLineToRelative(4.766f)
                curveToRelative(0.553f, 0.0f, 1.044f, -0.361f, 1.119f, -0.821f)
                curveToRelative(0.067f, -0.412f, -0.111f, -0.694f, -0.223f, -0.826f)
                curveToRelative(-0.191f, -0.224f, -0.469f, -0.353f, -0.763f, -0.353f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.268f)
                lineToRelative(-1.708f, -1.638f)
                curveToRelative(-0.241f, -0.242f, -0.528f, -0.362f, -0.833f, -0.362f)
                horizontalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _handBackPointRight!!
    }

private var _handBackPointRight: ImageVector? = null

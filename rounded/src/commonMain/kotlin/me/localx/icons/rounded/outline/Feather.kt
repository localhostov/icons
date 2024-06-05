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

public val Icons.Outline.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.827f, 1.174f)
                arcToRelative(3.968f, 3.968f, 0.0f, false, false, -3.787f, -1.055f)
                arcToRelative(31.29f, 31.29f, 0.0f, false, false, -13.784f, 7.75f)
                arcToRelative(7.757f, 7.757f, 0.0f, false, false, -2.247f, 5.831f)
                arcToRelative(7.646f, 7.646f, 0.0f, false, false, 1.569f, 4.3f)
                lineToRelative(-4.285f, 4.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(4.284f, -4.284f)
                arcToRelative(7.446f, 7.446f, 0.0f, false, false, 4.598f, 1.577f)
                arcToRelative(8.394f, 8.394f, 0.0f, false, false, 5.9f, -2.545f)
                curveToRelative(4.4f, -4.4f, 6.883f, -11.446f, 7.394f, -13.525f)
                arcToRelative(3.931f, 3.931f, 0.0f, false, false, -1.056f, -3.756f)
                close()
                moveTo(5.007f, 13.608f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, true, 1.665f, -4.327f)
                curveToRelative(0.428f, -0.425f, 0.873f, -0.824f, 1.328f, -1.214f)
                verticalLineToRelative(6.519f)
                lineToRelative(-1.99f, 1.99f)
                arcToRelative(5.671f, 5.671f, 0.0f, false, true, -1.003f, -2.968f)
                close()
                moveTo(15.045f, 17.067f)
                arcToRelative(5.908f, 5.908f, 0.0f, false, true, -7.618f, 0.92f)
                lineToRelative(2.279f, -2.279f)
                lineToRelative(2.708f, -2.708f)
                horizontalLineToRelative(5.762f)
                arcToRelative(25.778f, 25.778f, 0.0f, false, true, -3.131f, 4.067f)
                close()
                moveTo(21.945f, 4.447f)
                arcToRelative(29.628f, 29.628f, 0.0f, false, true, -2.6f, 6.553f)
                horizontalLineToRelative(-4.931f)
                lineToRelative(3.293f, -3.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(-1.293f, 1.293f)
                verticalLineToRelative(-6.074f)
                arcToRelative(30.354f, 30.354f, 0.0f, false, true, 9.522f, -4.451f)
                arcToRelative(2.017f, 2.017f, 0.0f, false, true, 0.484f, -0.061f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 1.409f, 0.589f)
                arcToRelative(1.925f, 1.925f, 0.0f, false, true, 0.526f, 1.858f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null

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

public val Icons.Bold.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.273f, 24.0f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, true, -2.473f, -1.025f)
                lineToRelative(-2.587f, -2.586f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.586f, 2.586f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.706f, 0.0f)
                lineToRelative(5.114f, -5.114f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-5.113f, 5.114f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, true, -2.475f, 1.025f)
                close()
                moveTo(1.885f, 20.475f)
                lineTo(4.014f, 18.346f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, -1.014f, -2.121f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, true, 2.218f, -2.792f)
                lineToRelative(2.165f, -0.557f)
                lineToRelative(-1.335f, -1.792f)
                arcToRelative(5.083f, 5.083f, 0.0f, false, true, -1.018f, -3.054f)
                arcToRelative(4.935f, 4.935f, 0.0f, false, true, 5.061f, -5.03f)
                arcToRelative(5.18f, 5.18f, 0.0f, false, true, 5.129f, 4.465f)
                lineToRelative(0.153f, 1.135f)
                lineToRelative(1.137f, 0.15f)
                arcToRelative(5.171f, 5.171f, 0.0f, false, true, 4.49f, 5.1f)
                arcToRelative(5.059f, 5.059f, 0.0f, false, true, -0.288f, 1.619f)
                lineToRelative(2.288f, 2.285f)
                arcToRelative(8.066f, 8.066f, 0.0f, false, false, 1.0f, -3.9f)
                arcToRelative(8.178f, 8.178f, 0.0f, false, false, -6.024f, -7.854f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -7.885f, -6.0f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -8.061f, 8.03f)
                arcToRelative(8.045f, 8.045f, 0.0f, false, false, 0.69f, 3.27f)
                arcToRelative(5.953f, 5.953f, 0.0f, false, false, -2.72f, 4.925f)
                arcToRelative(5.748f, 5.748f, 0.0f, false, false, 1.885f, 4.25f)
                close()
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null

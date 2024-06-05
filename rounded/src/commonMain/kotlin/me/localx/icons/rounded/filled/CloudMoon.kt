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

public val Icons.Filled.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.894f, 24.024f)
                curveToRelative(-1.961f, 0.0f, -3.839f, -0.007f, -4.492f, -0.025f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.833f, -0.12f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.451f, -6.589f)
                arcToRelative(6.376f, 6.376f, 0.0f, false, true, 0.057f, -2.731f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 19.542f, 13.7f)
                curveToRelative(0.136f, 0.325f, 0.763f, 0.469f, 0.763f, 0.469f)
                curveToRelative(4.926f, 1.279f, 4.861f, 8.572f, -0.144f, 9.7f)
                arcTo(5.241f, 5.241f, 0.0f, false, true, 19.1f, 24.0f)
                curveTo(18.229f, 24.016f, 16.013f, 24.024f, 13.894f, 24.024f)
                close()
                moveTo(6.0f, 16.256f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, 0.23f, -2.17f)
                arcTo(8.032f, 8.032f, 0.0f, false, true, 11.017f, 8.6f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 2.488f, -4.551f)
                arcToRelative(2.194f, 2.194f, 0.0f, false, false, 0.619f, -2.153f)
                arcToRelative(2.216f, 2.216f, 0.0f, false, false, -1.6f, -1.6f)
                arcTo(10.756f, 10.756f, 0.0f, false, false, 8.361f, 0.126f)
                arcToRelative(10.035f, 10.035f, 0.0f, false, false, -8.3f, 8.755f)
                arcTo(9.914f, 9.914f, 0.0f, false, false, 3.858f, 17.79f)
                curveToRelative(0.064f, 0.05f, 0.327f, 0.222f, 0.646f, 0.422f)
                arcTo(5.42f, 5.42f, 0.0f, false, true, 6.0f, 16.256f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null

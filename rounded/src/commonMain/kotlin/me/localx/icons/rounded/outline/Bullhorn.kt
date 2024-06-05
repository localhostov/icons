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

public val Icons.Outline.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.5f)
                curveToRelative(0.0f, -1.209f, -0.859f, -2.218f, -2.0f, -2.45f)
                lineTo(22.0f, 1.0f)
                curveToRelative(0.0f, -0.521f, -0.399f, -0.954f, -0.917f, -0.997f)
                curveToRelative(-0.514f, -0.048f, -0.983f, 0.319f, -1.069f, 0.832f)
                curveToRelative(-0.389f, 2.333f, -3.62f, 3.165f, -6.514f, 3.165f)
                lineTo(5.5f, 4.0f)
                curveTo(2.467f, 4.0f, 0.0f, 6.467f, 0.0f, 9.5f)
                curveToRelative(0.0f, 1.651f, 0.732f, 3.135f, 1.888f, 4.144f)
                lineToRelative(3.142f, 8.383f)
                curveToRelative(0.274f, 0.752f, 0.826f, 1.354f, 1.552f, 1.692f)
                curveToRelative(0.403f, 0.188f, 0.833f, 0.282f, 1.264f, 0.282f)
                curveToRelative(0.347f, 0.0f, 0.694f, -0.061f, 1.03f, -0.183f)
                curveToRelative(0.752f, -0.274f, 1.354f, -0.826f, 1.692f, -1.552f)
                curveToRelative(0.338f, -0.727f, 0.373f, -1.541f, 0.099f, -2.292f)
                lineToRelative(-1.803f, -4.974f)
                horizontalLineToRelative(4.636f)
                curveToRelative(2.894f, 0.0f, 6.125f, 0.831f, 6.514f, 3.165f)
                curveToRelative(0.081f, 0.485f, 0.501f, 0.835f, 0.985f, 0.835f)
                curveToRelative(0.028f, 0.0f, 0.056f, 0.0f, 0.083f, -0.003f)
                curveToRelative(0.519f, -0.043f, 0.917f, -0.476f, 0.917f, -0.997f)
                verticalLineToRelative(-6.05f)
                curveToRelative(1.141f, -0.232f, 2.0f, -1.24f, 2.0f, -2.45f)
                close()
                moveTo(5.5f, 6.0f)
                horizontalLineToRelative(1.496f)
                lineToRelative(-0.03f, 7.0f)
                horizontalLineToRelative(-1.465f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(8.788f, 20.657f)
                curveToRelative(0.091f, 0.25f, 0.08f, 0.522f, -0.033f, 0.764f)
                reflectiveCurveToRelative(-0.313f, 0.426f, -0.564f, 0.518f)
                curveToRelative(-0.25f, 0.092f, -0.522f, 0.08f, -0.764f, -0.033f)
                reflectiveCurveToRelative(-0.426f, -0.313f, -0.521f, -0.572f)
                lineToRelative(-2.408f, -6.425f)
                curveToRelative(0.325f, 0.06f, 0.66f, 0.092f, 1.002f, 0.092f)
                horizontalLineToRelative(1.237f)
                lineToRelative(2.051f, 5.657f)
                close()
                moveTo(20.0f, 14.699f)
                curveToRelative(-1.487f, -1.095f, -3.72f, -1.699f, -6.5f, -1.699f)
                horizontalLineToRelative(-4.535f)
                lineToRelative(0.03f, -7.0f)
                horizontalLineToRelative(4.504f)
                curveToRelative(2.78f, 0.0f, 5.013f, -0.604f, 6.5f, -1.699f)
                verticalLineToRelative(10.397f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null

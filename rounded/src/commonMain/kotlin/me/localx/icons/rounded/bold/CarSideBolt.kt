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

public val Icons.Bold.CarSideBolt: ImageVector
    get() {
        if (_carSideBolt != null) {
            return _carSideBolt!!
        }
        _carSideBolt = Builder(name = "CarSideBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.962f, 10.25f)
                lineToRelative(-3.951f, -5.895f)
                curveToRelative(-1.028f, -1.474f, -2.715f, -2.354f, -4.512f, -2.354f)
                horizontalLineToRelative(-3.335f)
                curveToRelative(-2.271f, 0.0f, -4.338f, 1.427f, -5.144f, 3.552f)
                lineToRelative(-1.952f, 5.167f)
                curveToRelative(-1.275f, 0.82f, -2.069f, 2.241f, -2.069f, 3.781f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.946f, -1.243f, -3.637f, -3.038f, -4.25f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.587f, 0.35f, -1.123f, 0.891f, -1.366f)
                curveToRelative(0.365f, -0.163f, 0.649f, -0.465f, 0.79f, -0.838f)
                lineToRelative(2.146f, -5.683f)
                curveToRelative(0.366f, -0.965f, 1.305f, -1.613f, 2.337f, -1.613f)
                horizontalLineToRelative(3.335f)
                curveToRelative(0.817f, 0.0f, 1.583f, 0.4f, 2.035f, 1.047f)
                lineToRelative(4.25f, 6.341f)
                curveToRelative(0.227f, 0.338f, 0.581f, 0.57f, 0.982f, 0.642f)
                curveToRelative(0.715f, 0.128f, 1.233f, 0.746f, 1.233f, 1.47f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(14.749f, 10.109f)
                curveToRelative(0.367f, 0.684f, 0.329f, 1.511f, -0.101f, 2.157f)
                lineToRelative(-1.406f, 2.075f)
                curveToRelative(-0.29f, 0.428f, -0.762f, 0.658f, -1.243f, 0.658f)
                curveToRelative(-0.29f, 0.0f, -0.583f, -0.083f, -0.84f, -0.258f)
                curveToRelative(-0.686f, -0.465f, -0.865f, -1.397f, -0.4f, -2.083f)
                lineToRelative(0.446f, -0.658f)
                horizontalLineToRelative(-1.089f)
                curveToRelative(-0.667f, 0.0f, -1.301f, -0.32f, -1.699f, -0.855f)
                curveToRelative(-0.397f, -0.535f, -0.519f, -1.235f, -0.325f, -1.873f)
                curveToRelative(0.043f, -0.141f, 0.106f, -0.275f, 0.188f, -0.397f)
                lineToRelative(1.473f, -2.207f)
                curveToRelative(0.46f, -0.689f, 1.392f, -0.875f, 2.08f, -0.415f)
                curveToRelative(0.689f, 0.46f, 0.875f, 1.391f, 0.415f, 2.08f)
                lineToRelative(-0.445f, 0.667f)
                horizontalLineToRelative(1.093f)
                curveToRelative(0.776f, 0.0f, 1.487f, 0.425f, 1.854f, 1.109f)
                close()
            }
        }
        .build()
        return _carSideBolt!!
    }

private var _carSideBolt: ImageVector? = null

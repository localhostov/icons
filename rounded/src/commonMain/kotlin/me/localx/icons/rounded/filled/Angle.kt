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

public val Icons.Filled.Angle: ImageVector
    get() {
        if (_angle != null) {
            return _angle!!
        }
        _angle = Builder(name = "Angle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 24.0f)
                lineTo(4.019f, 24.0f)
                curveToRelative(-1.426f, 0.0f, -2.711f, -0.731f, -3.439f, -1.957f)
                curveToRelative(-0.728f, -1.226f, -0.755f, -2.704f, -0.074f, -3.956f)
                lineTo(10.072f, 0.521f)
                curveToRelative(0.264f, -0.485f, 0.87f, -0.665f, 1.357f, -0.399f)
                curveToRelative(0.485f, 0.264f, 0.664f, 0.871f, 0.4f, 1.356f)
                lineTo(2.262f, 19.044f)
                curveToRelative(-0.341f, 0.626f, -0.327f, 1.365f, 0.037f, 1.978f)
                reflectiveCurveToRelative(1.007f, 0.979f, 1.72f, 0.979f)
                horizontalLineToRelative(18.981f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 18.962f)
                curveToRelative(0.0f, -1.121f, -0.107f, -2.242f, -0.318f, -3.333f)
                curveToRelative(-0.105f, -0.542f, -0.633f, -0.9f, -1.172f, -0.791f)
                curveToRelative(-0.542f, 0.104f, -0.897f, 0.629f, -0.792f, 1.172f)
                curveToRelative(0.187f, 0.965f, 0.282f, 1.958f, 0.282f, 2.952f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(19.987f, 13.174f)
                curveToRelative(0.504f, -0.226f, 0.73f, -0.816f, 0.505f, -1.321f)
                curveToRelative(-0.452f, -1.012f, -1.003f, -1.984f, -1.639f, -2.893f)
                curveToRelative(-0.316f, -0.452f, -0.938f, -0.562f, -1.393f, -0.246f)
                curveToRelative(-0.452f, 0.317f, -0.562f, 0.94f, -0.246f, 1.393f)
                curveToRelative(0.563f, 0.805f, 1.052f, 1.666f, 1.452f, 2.562f)
                curveToRelative(0.166f, 0.371f, 0.531f, 0.592f, 0.914f, 0.592f)
                curveToRelative(0.136f, 0.0f, 0.275f, -0.027f, 0.407f, -0.087f)
                close()
                moveTo(16.143f, 7.242f)
                curveToRelative(0.364f, -0.415f, 0.323f, -1.047f, -0.093f, -1.411f)
                curveToRelative(-0.73f, -0.641f, -1.515f, -1.222f, -2.333f, -1.727f)
                curveToRelative(-0.47f, -0.291f, -1.086f, -0.146f, -1.376f, 0.325f)
                curveToRelative(-0.291f, 0.47f, -0.145f, 1.086f, 0.325f, 1.376f)
                curveToRelative(0.724f, 0.447f, 1.418f, 0.962f, 2.066f, 1.529f)
                curveToRelative(0.19f, 0.166f, 0.425f, 0.248f, 0.659f, 0.248f)
                curveToRelative(0.278f, 0.0f, 0.555f, -0.115f, 0.752f, -0.341f)
                close()
            }
        }
        .build()
        return _angle!!
    }

private var _angle: ImageVector? = null

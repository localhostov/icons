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

public val Icons.Outline.Angle: ImageVector
    get() {
        if (_angle != null) {
            return _angle!!
        }
        _angle = Builder(name = "Angle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.214f, 10.106f)
                curveToRelative(-0.316f, -0.452f, -0.207f, -1.075f, 0.246f, -1.393f)
                curveToRelative(0.455f, -0.316f, 1.077f, -0.206f, 1.393f, 0.246f)
                curveToRelative(0.636f, 0.908f, 1.187f, 1.881f, 1.639f, 2.893f)
                curveToRelative(0.225f, 0.505f, 0.0f, 1.096f, -0.505f, 1.321f)
                curveToRelative(-0.132f, 0.06f, -0.271f, 0.087f, -0.407f, 0.087f)
                curveToRelative(-0.382f, 0.0f, -0.748f, -0.221f, -0.914f, -0.592f)
                curveToRelative(-0.4f, -0.896f, -0.888f, -1.758f, -1.452f, -2.562f)
                close()
                moveTo(19.718f, 16.009f)
                curveToRelative(0.187f, 0.965f, 0.282f, 1.958f, 0.282f, 2.952f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.121f, -0.107f, -2.242f, -0.318f, -3.333f)
                curveToRelative(-0.105f, -0.542f, -0.633f, -0.9f, -1.172f, -0.791f)
                curveToRelative(-0.542f, 0.104f, -0.897f, 0.629f, -0.792f, 1.172f)
                close()
                moveTo(12.665f, 5.805f)
                curveToRelative(0.724f, 0.447f, 1.418f, 0.962f, 2.066f, 1.529f)
                curveToRelative(0.19f, 0.166f, 0.425f, 0.248f, 0.659f, 0.248f)
                curveToRelative(0.278f, 0.0f, 0.555f, -0.115f, 0.752f, -0.341f)
                curveToRelative(0.364f, -0.415f, 0.323f, -1.047f, -0.093f, -1.411f)
                curveToRelative(-0.73f, -0.641f, -1.515f, -1.222f, -2.333f, -1.727f)
                curveToRelative(-0.47f, -0.291f, -1.086f, -0.146f, -1.376f, 0.325f)
                curveToRelative(-0.291f, 0.47f, -0.145f, 1.086f, 0.325f, 1.376f)
                close()
                moveTo(22.999f, 21.999f)
                lineTo(4.019f, 21.999f)
                curveToRelative(-0.713f, 0.0f, -1.356f, -0.366f, -1.72f, -0.979f)
                reflectiveCurveToRelative(-0.378f, -1.352f, -0.037f, -1.978f)
                lineTo(11.829f, 1.479f)
                curveToRelative(0.264f, -0.485f, 0.085f, -1.093f, -0.4f, -1.356f)
                curveToRelative(-0.487f, -0.266f, -1.093f, -0.086f, -1.357f, 0.399f)
                lineTo(0.505f, 18.087f)
                curveToRelative(-0.682f, 1.252f, -0.654f, 2.73f, 0.074f, 3.956f)
                curveToRelative(0.728f, 1.226f, 2.014f, 1.957f, 3.439f, 1.957f)
                horizontalLineToRelative(18.981f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _angle!!
    }

private var _angle: ImageVector? = null

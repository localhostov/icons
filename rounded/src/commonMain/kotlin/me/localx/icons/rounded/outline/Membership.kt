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

public val Icons.Outline.Membership: ImageVector
    get() {
        if (_membership != null) {
            return _membership!!
        }
        _membership = Builder(name = "Membership", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 14.0f)
                curveToRelative(-1.5f, 0.0f, -3.0f, 1.5f, -3.0f, 1.5f)
                curveToRelative(0.0f, 0.0f, -1.5f, -1.5f, -3.0f, -1.5f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(23.888f, 20.116f)
                curveToRelative(-0.225f, 0.541f, -0.729f, 0.878f, -1.316f, 0.878f)
                horizontalLineToRelative(-1.562f)
                verticalLineToRelative(1.562f)
                curveToRelative(0.0f, 0.894f, -0.729f, 1.427f, -1.434f, 1.427f)
                curveToRelative(-0.376f, 0.0f, -0.72f, -0.145f, -0.995f, -0.418f)
                lineToRelative(-4.368f, -4.368f)
                reflectiveCurveToRelative(-0.003f, -0.006f, -0.006f, -0.009f)
                curveToRelative(-0.167f, 0.134f, -0.331f, 0.271f, -0.524f, 0.378f)
                curveToRelative(-0.523f, 0.29f, -1.109f, 0.435f, -1.695f, 0.435f)
                reflectiveCurveToRelative(-1.171f, -0.145f, -1.693f, -0.434f)
                curveToRelative(-0.197f, -0.11f, -0.365f, -0.249f, -0.534f, -0.386f)
                curveToRelative(-0.005f, 0.005f, -0.006f, 0.011f, -0.01f, 0.016f)
                lineToRelative(-4.366f, 4.366f)
                curveToRelative(-0.277f, 0.275f, -0.621f, 0.42f, -0.997f, 0.42f)
                curveToRelative(-0.705f, 0.0f, -1.435f, -0.533f, -1.435f, -1.427f)
                verticalLineToRelative(-1.562f)
                horizontalLineToRelative(-1.562f)
                curveToRelative(-0.586f, 0.0f, -1.09f, -0.337f, -1.315f, -0.878f)
                curveToRelative(-0.225f, -0.544f, -0.106f, -1.139f, 0.31f, -1.554f)
                lineToRelative(3.539f, -3.54f)
                curveToRelative(-0.056f, -0.422f, -0.043f, -0.843f, 0.052f, -1.256f)
                curveToRelative(0.064f, -0.284f, -0.072f, -0.591f, -0.34f, -0.765f)
                curveToRelative(-0.499f, -0.321f, -0.903f, -0.757f, -1.202f, -1.296f)
                curveToRelative(-0.285f, -0.516f, -0.435f, -1.107f, -0.432f, -1.711f)
                curveToRelative(-0.003f, -0.594f, 0.146f, -1.186f, 0.431f, -1.7f)
                curveToRelative(0.3f, -0.54f, 0.704f, -0.976f, 1.203f, -1.298f)
                curveToRelative(0.268f, -0.173f, 0.405f, -0.479f, 0.34f, -0.764f)
                curveToRelative(-0.135f, -0.592f, -0.115f, -1.199f, 0.06f, -1.806f)
                curveToRelative(0.328f, -1.146f, 1.246f, -2.064f, 2.394f, -2.394f)
                curveToRelative(0.607f, -0.173f, 1.213f, -0.191f, 1.804f, -0.06f)
                curveToRelative(0.289f, 0.065f, 0.592f, -0.072f, 0.765f, -0.34f)
                curveToRelative(0.322f, -0.498f, 0.757f, -0.902f, 1.295f, -1.201f)
                curveToRelative(1.045f, -0.58f, 2.344f, -0.579f, 3.388f, 0.0f)
                curveToRelative(0.54f, 0.3f, 0.976f, 0.704f, 1.297f, 1.202f)
                curveToRelative(0.173f, 0.268f, 0.478f, 0.399f, 0.764f, 0.341f)
                curveToRelative(0.591f, -0.134f, 1.197f, -0.114f, 1.803f, 0.058f)
                curveToRelative(1.149f, 0.33f, 2.066f, 1.247f, 2.396f, 2.396f)
                curveToRelative(0.173f, 0.604f, 0.193f, 1.211f, 0.059f, 1.804f)
                curveToRelative(-0.064f, 0.285f, 0.072f, 0.592f, 0.34f, 0.765f)
                curveToRelative(0.498f, 0.321f, 0.902f, 0.758f, 1.202f, 1.297f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.285f, 0.515f, 0.434f, 1.106f, 0.431f, 1.71f)
                curveToRelative(0.003f, 0.594f, -0.146f, 1.186f, -0.431f, 1.7f)
                curveToRelative(-0.3f, 0.54f, -0.704f, 0.977f, -1.202f, 1.298f)
                curveToRelative(-0.268f, 0.173f, -0.405f, 0.479f, -0.34f, 0.764f)
                curveToRelative(0.095f, 0.418f, 0.108f, 0.843f, 0.05f, 1.269f)
                lineToRelative(3.528f, 3.528f)
                curveToRelative(0.415f, 0.414f, 0.534f, 1.009f, 0.309f, 1.553f)
                close()
                moveTo(8.068f, 18.051f)
                curveToRelative(-0.538f, 0.095f, -1.088f, 0.071f, -1.637f, -0.084f)
                curveToRelative(-0.628f, -0.18f, -1.173f, -0.546f, -1.605f, -1.018f)
                lineToRelative(-2.045f, 2.045f)
                horizontalLineToRelative(1.171f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.172f)
                lineToRelative(3.115f, -3.115f)
                close()
                moveTo(16.186f, 16.074f)
                curveToRelative(0.26f, 0.061f, 0.532f, 0.049f, 0.81f, -0.031f)
                curveToRelative(0.482f, -0.138f, 0.885f, -0.54f, 1.023f, -1.022f)
                curveToRelative(0.08f, -0.278f, 0.09f, -0.551f, 0.032f, -0.812f)
                curveToRelative(-0.25f, -1.1f, 0.234f, -2.261f, 1.207f, -2.888f)
                curveToRelative(0.218f, -0.141f, 0.399f, -0.338f, 0.537f, -0.586f)
                curveToRelative(0.119f, -0.215f, 0.182f, -0.468f, 0.181f, -0.73f)
                curveToRelative(0.001f, -0.272f, -0.062f, -0.525f, -0.181f, -0.741f)
                curveToRelative(-0.138f, -0.248f, -0.318f, -0.444f, -0.536f, -0.585f)
                curveToRelative(-0.972f, -0.627f, -1.457f, -1.788f, -1.207f, -2.889f)
                curveToRelative(0.059f, -0.26f, 0.048f, -0.532f, -0.031f, -0.81f)
                curveToRelative(-0.139f, -0.483f, -0.541f, -0.886f, -1.024f, -1.024f)
                curveToRelative(-0.277f, -0.078f, -0.549f, -0.091f, -0.81f, -0.03f)
                curveToRelative(-1.097f, 0.25f, -2.26f, -0.235f, -2.887f, -1.207f)
                curveToRelative(-0.141f, -0.218f, -0.338f, -0.399f, -0.587f, -0.537f)
                curveToRelative(-0.438f, -0.242f, -1.007f, -0.243f, -1.447f, 0.0f)
                curveToRelative(-0.247f, 0.137f, -0.444f, 0.317f, -0.586f, 0.536f)
                curveToRelative(-0.627f, 0.973f, -1.789f, 1.457f, -2.888f, 1.206f)
                curveToRelative(-0.258f, -0.057f, -0.532f, -0.048f, -0.811f, 0.032f)
                curveToRelative(-0.482f, 0.138f, -0.884f, 0.54f, -1.022f, 1.022f)
                curveToRelative(-0.08f, 0.279f, -0.091f, 0.551f, -0.032f, 0.811f)
                curveToRelative(0.25f, 1.101f, -0.235f, 2.262f, -1.207f, 2.888f)
                curveToRelative(-0.219f, 0.142f, -0.399f, 0.339f, -0.537f, 0.587f)
                curveToRelative(-0.119f, 0.215f, -0.182f, 0.468f, -0.181f, 0.73f)
                curveToRelative(-0.001f, 0.272f, 0.062f, 0.525f, 0.181f, 0.741f)
                curveToRelative(0.137f, 0.247f, 0.318f, 0.444f, 0.537f, 0.585f)
                curveToRelative(0.972f, 0.627f, 1.457f, 1.788f, 1.207f, 2.889f)
                curveToRelative(-0.059f, 0.26f, -0.048f, 0.531f, 0.031f, 0.81f)
                curveToRelative(0.139f, 0.483f, 0.541f, 0.886f, 1.024f, 1.024f)
                curveToRelative(0.277f, 0.078f, 0.55f, 0.09f, 0.811f, 0.03f)
                curveToRelative(0.192f, -0.044f, 0.387f, -0.064f, 0.581f, -0.064f)
                curveToRelative(0.909f, 0.0f, 1.789f, 0.47f, 2.307f, 1.271f)
                curveToRelative(0.141f, 0.219f, 0.338f, 0.399f, 0.586f, 0.537f)
                curveToRelative(0.439f, 0.242f, 1.008f, 0.243f, 1.447f, 0.0f)
                curveToRelative(0.248f, -0.137f, 0.445f, -0.318f, 0.586f, -0.536f)
                curveToRelative(0.627f, -0.972f, 1.788f, -1.451f, 2.888f, -1.207f)
                close()
                moveTo(21.182f, 18.994f)
                lineToRelative(-2.038f, -2.038f)
                curveToRelative(-0.43f, 0.468f, -0.974f, 0.831f, -1.597f, 1.009f)
                curveToRelative(-0.556f, 0.158f, -1.112f, 0.181f, -1.654f, 0.083f)
                lineToRelative(3.117f, 3.117f)
                verticalLineToRelative(-1.172f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.172f)
                close()
            }
        }
        .build()
        return _membership!!
    }

private var _membership: ImageVector? = null

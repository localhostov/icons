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

public val Icons.Outline.PickingBox: ImageVector
    get() {
        if (_pickingBox != null) {
            return _pickingBox!!
        }
        _pickingBox = Builder(name = "PickingBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 17.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(11.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(23.0f, 8.0f)
                horizontalLineToRelative(-1.173f)
                curveToRelative(-1.785f, 0.0f, -3.447f, 0.964f, -4.34f, 2.518f)
                lineToRelative(-0.188f, 0.324f)
                curveToRelative(-1.027f, 1.717f, -2.829f, 2.826f, -3.033f, 2.947f)
                curveToRelative(-0.582f, 0.349f, -1.395f, 0.234f, -1.865f, -0.269f)
                curveToRelative(-0.201f, -0.215f, -0.433f, -0.59f, -0.395f, -1.159f)
                curveToRelative(0.03f, -0.456f, 0.33f, -0.904f, 0.802f, -1.198f)
                curveToRelative(1.435f, -0.893f, 2.192f, -1.987f, 2.192f, -3.164f)
                curveToRelative(0.0f, -0.882f, -0.387f, -1.716f, -1.061f, -2.288f)
                curveToRelative(-0.674f, -0.571f, -1.559f, -0.814f, -2.441f, -0.671f)
                curveToRelative(-1.424f, 0.236f, -2.498f, 1.556f, -2.498f, 3.072f)
                verticalLineToRelative(4.887f)
                curveToRelative(0.0f, 0.294f, -0.129f, 0.572f, -0.353f, 0.763f)
                curveToRelative(-0.228f, 0.193f, -0.522f, 0.271f, -0.822f, 0.223f)
                curveToRelative(-0.463f, -0.076f, -0.825f, -0.556f, -0.825f, -1.093f)
                verticalLineToRelative(-5.893f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-11.169f)
                curveToRelative(-2.918f, 0.0f, -5.801f, 0.636f, -8.448f, 1.863f)
                lineToRelative(-1.546f, 0.717f)
                curveToRelative(-0.738f, 0.311f, -1.312f, 0.892f, -1.615f, 1.635f)
                curveToRelative(-0.301f, 0.742f, -0.295f, 1.558f, 0.016f, 2.294f)
                curveToRelative(0.311f, 0.738f, 0.891f, 1.312f, 1.637f, 1.616f)
                curveToRelative(0.121f, 0.049f, 0.251f, 0.073f, 0.378f, 0.106f)
                lineToRelative(-0.936f, 1.431f)
                curveToRelative(-0.358f, 0.718f, -0.415f, 1.531f, -0.16f, 2.291f)
                reflectiveCurveToRelative(0.791f, 1.375f, 1.505f, 1.729f)
                curveToRelative(0.418f, 0.21f, 0.868f, 0.316f, 1.339f, 0.316f)
                curveToRelative(0.4f, 0.0f, 0.782f, -0.083f, 1.135f, -0.228f)
                curveToRelative(0.322f, 1.119f, 1.228f, 2.002f, 2.368f, 2.188f)
                curveToRelative(0.88f, 0.142f, 1.768f, -0.102f, 2.439f, -0.673f)
                curveToRelative(0.272f, -0.231f, 0.497f, -0.505f, 0.669f, -0.808f)
                curveToRelative(0.098f, 0.143f, 0.208f, 0.28f, 0.328f, 0.409f)
                curveToRelative(0.662f, 0.708f, 1.596f, 1.113f, 2.562f, 1.113f)
                curveToRelative(0.633f, 0.0f, 1.253f, -0.171f, 1.792f, -0.495f)
                curveToRelative(0.402f, -0.24f, 2.47f, -1.543f, 3.726f, -3.641f)
                lineToRelative(0.204f, -0.353f)
                curveToRelative(0.535f, -0.932f, 1.533f, -1.511f, 2.604f, -1.511f)
                horizontalLineToRelative(1.173f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(2.626f, 6.272f)
                curveToRelative(-0.247f, -0.101f, -0.442f, -0.293f, -0.546f, -0.54f)
                curveToRelative(-0.106f, -0.248f, -0.107f, -0.512f, -0.005f, -0.763f)
                curveToRelative(0.101f, -0.248f, 0.293f, -0.442f, 0.516f, -0.537f)
                lineToRelative(3.103f, -1.466f)
                lineToRelative(-2.091f, 3.199f)
                lineToRelative(-0.227f, 0.106f)
                curveToRelative(-0.232f, 0.099f, -0.508f, 0.099f, -0.749f, 0.0f)
                close()
                moveTo(3.555f, 11.894f)
                curveToRelative(-0.239f, -0.118f, -0.417f, -0.323f, -0.502f, -0.577f)
                curveToRelative(-0.085f, -0.252f, -0.066f, -0.522f, 0.054f, -0.763f)
                lineToRelative(1.894f, -3.041f)
                verticalLineToRelative(3.728f)
                lineToRelative(-0.105f, 0.205f)
                curveToRelative(-0.238f, 0.481f, -0.853f, 0.691f, -1.34f, 0.447f)
                close()
                moveTo(11.0f, 10.071f)
                verticalLineToRelative(-1.958f)
                curveToRelative(0.0f, -0.54f, 0.385f, -1.113f, 0.999f, -1.113f)
                curveToRelative(0.821f, 0.0f, 1.001f, 0.707f, 1.001f, 1.0f)
                curveToRelative(0.0f, 0.438f, -0.455f, 0.972f, -1.249f, 1.466f)
                curveToRelative(-0.279f, 0.174f, -0.531f, 0.378f, -0.751f, 0.605f)
                close()
            }
        }
        .build()
        return _pickingBox!!
    }

private var _pickingBox: ImageVector? = null

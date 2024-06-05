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

public val Icons.Filled.BoneBreak: ImageVector
    get() {
        if (_boneBreak != null) {
            return _boneBreak!!
        }
        _boneBreak = Builder(name = "BoneBreak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(17.147f, 7.02f)
                lineToRelative(1.474f, -2.514f)
                curveToRelative(0.279f, -0.477f, 0.12f, -1.089f, -0.357f, -1.369f)
                curveToRelative(-0.477f, -0.28f, -1.089f, -0.119f, -1.369f, 0.357f)
                lineToRelative(-1.474f, 2.514f)
                curveToRelative(-0.279f, 0.477f, -0.12f, 1.089f, 0.357f, 1.369f)
                curveToRelative(0.159f, 0.093f, 0.333f, 0.137f, 0.505f, 0.137f)
                curveToRelative(0.343f, 0.0f, 0.677f, -0.177f, 0.864f, -0.494f)
                close()
                moveTo(8.272f, 7.48f)
                curveToRelative(0.48f, -0.272f, 0.649f, -0.882f, 0.377f, -1.363f)
                lineToRelative(-1.478f, -2.61f)
                curveToRelative(-0.272f, -0.481f, -0.881f, -0.65f, -1.363f, -0.377f)
                curveToRelative(-0.48f, 0.272f, -0.649f, 0.882f, -0.377f, 1.363f)
                lineToRelative(1.478f, 2.61f)
                curveToRelative(0.184f, 0.325f, 0.522f, 0.507f, 0.871f, 0.507f)
                curveToRelative(0.167f, 0.0f, 0.336f, -0.042f, 0.492f, -0.13f)
                close()
                moveTo(23.936f, 12.642f)
                curveToRelative(-0.253f, -1.305f, -1.335f, -2.363f, -2.645f, -2.591f)
                curveToRelative(-1.807f, -0.314f, -3.392f, 0.844f, -3.788f, 2.468f)
                lineToRelative(-3.132f, -1.178f)
                curveToRelative(-0.506f, -0.19f, -1.072f, 0.056f, -1.277f, 0.557f)
                lineToRelative(-1.093f, 2.46f)
                lineToRelative(-1.199f, -2.501f)
                curveToRelative(-0.212f, -0.49f, -0.772f, -0.726f, -1.272f, -0.537f)
                lineToRelative(-3.047f, 1.154f)
                curveToRelative(-0.415f, -1.602f, -1.989f, -2.737f, -3.782f, -2.421f)
                curveToRelative(-1.306f, 0.23f, -2.384f, 1.286f, -2.637f, 2.588f)
                curveToRelative(-0.28f, 1.442f, 0.384f, 2.749f, 1.476f, 3.442f)
                curveToRelative(-0.272f, 0.48f, -0.44f, 1.026f, -0.44f, 1.617f)
                curveToRelative(0.0f, 1.896f, 1.599f, 3.419f, 3.522f, 3.293f)
                curveToRelative(1.124f, -0.074f, 2.122f, -0.794f, 2.666f, -1.78f)
                curveToRelative(0.496f, -0.901f, 0.484f, -1.702f, 0.276f, -2.421f)
                lineToRelative(4.436f, -1.663f)
                lineToRelative(4.436f, 1.663f)
                curveToRelative(-0.084f, 0.289f, -0.136f, 0.592f, -0.136f, 0.909f)
                curveToRelative(0.0f, 1.983f, 1.749f, 3.558f, 3.789f, 3.265f)
                curveToRelative(1.223f, -0.176f, 2.271f, -1.08f, 2.649f, -2.257f)
                curveToRelative(0.315f, -0.98f, 0.143f, -1.883f, -0.278f, -2.626f)
                curveToRelative(1.092f, -0.692f, 1.756f, -1.999f, 1.476f, -3.441f)
                close()
            }
        }
        .build()
        return _boneBreak!!
    }

private var _boneBreak: ImageVector? = null

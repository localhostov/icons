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

public val Icons.Filled.ModelCubeSpace: ImageVector
    get() {
        if (_modelCubeSpace != null) {
            return _modelCubeSpace!!
        }
        _modelCubeSpace = Builder(name = "ModelCubeSpace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 13.71f)
                verticalLineToRelative(-2.844f)
                lineToRelative(3.0f, 1.714f)
                verticalLineToRelative(3.424f)
                lineToRelative(-2.496f, -1.426f)
                curveToRelative(-0.311f, -0.178f, -0.504f, -0.511f, -0.504f, -0.868f)
                close()
                moveTo(12.498f, 7.711f)
                curveToRelative(-0.153f, -0.088f, -0.325f, -0.132f, -0.498f, -0.132f)
                reflectiveCurveToRelative(-0.345f, 0.044f, -0.498f, 0.132f)
                lineToRelative(-2.49f, 1.43f)
                lineToRelative(2.988f, 1.708f)
                lineToRelative(2.988f, -1.708f)
                lineToRelative(-2.491f, -1.43f)
                close()
                moveTo(7.072f, 8.032f)
                curveToRelative(0.139f, -0.118f, 0.274f, -0.241f, 0.435f, -0.333f)
                lineToRelative(3.0f, -1.723f)
                curveToRelative(0.922f, -0.529f, 2.065f, -0.529f, 2.987f, 0.0f)
                lineToRelative(3.001f, 1.723f)
                curveToRelative(0.161f, 0.092f, 0.296f, 0.215f, 0.434f, 0.333f)
                lineToRelative(4.418f, -2.525f)
                curveToRelative(-0.253f, -0.257f, -0.541f, -0.484f, -0.863f, -0.667f)
                lineToRelative(-6.5f, -3.715f)
                curveToRelative(-1.225f, -0.699f, -2.745f, -0.699f, -3.968f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-6.5f, 3.715f)
                curveToRelative(-0.321f, 0.183f, -0.609f, 0.41f, -0.863f, 0.667f)
                lineToRelative(4.419f, 2.525f)
                close()
                moveTo(11.0f, 18.227f)
                curveToRelative(-0.166f, -0.059f, -0.334f, -0.111f, -0.489f, -0.199f)
                lineToRelative(-3.0f, -1.714f)
                curveToRelative(-0.933f, -0.533f, -1.512f, -1.531f, -1.512f, -2.604f)
                verticalLineToRelative(-3.409f)
                curveToRelative(0.0f, -0.183f, 0.039f, -0.359f, 0.072f, -0.537f)
                lineTo(1.65f, 7.237f)
                curveToRelative(-0.097f, 0.346f, -0.15f, 0.707f, -0.15f, 1.075f)
                verticalLineToRelative(7.375f)
                curveToRelative(0.0f, 1.432f, 0.772f, 2.763f, 2.016f, 3.473f)
                lineToRelative(6.5f, 3.715f)
                curveToRelative(0.312f, 0.178f, 0.643f, 0.31f, 0.984f, 0.397f)
                verticalLineToRelative(-5.044f)
                close()
                moveTo(17.928f, 9.763f)
                curveToRelative(0.033f, 0.177f, 0.072f, 0.353f, 0.072f, 0.537f)
                verticalLineToRelative(3.409f)
                curveToRelative(0.0f, 1.073f, -0.579f, 2.071f, -1.511f, 2.604f)
                lineToRelative(-3.001f, 1.714f)
                curveToRelative(-0.155f, 0.089f, -0.323f, 0.141f, -0.488f, 0.199f)
                verticalLineToRelative(5.044f)
                curveToRelative(0.341f, -0.087f, 0.672f, -0.219f, 0.984f, -0.397f)
                lineToRelative(6.5f, -3.715f)
                curveToRelative(1.243f, -0.711f, 2.016f, -2.041f, 2.016f, -3.473f)
                verticalLineToRelative(-7.375f)
                curveToRelative(0.0f, -0.368f, -0.053f, -0.729f, -0.15f, -1.075f)
                lineToRelative(-4.422f, 2.527f)
                close()
                moveTo(16.0f, 13.709f)
                verticalLineToRelative(-2.844f)
                lineToRelative(-3.0f, 1.714f)
                verticalLineToRelative(3.424f)
                lineToRelative(2.496f, -1.426f)
                curveToRelative(0.311f, -0.178f, 0.504f, -0.511f, 0.504f, -0.868f)
                close()
            }
        }
        .build()
        return _modelCubeSpace!!
    }

private var _modelCubeSpace: ImageVector? = null

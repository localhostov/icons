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

public val Icons.Bold.Journey: ImageVector
    get() {
        if (_journey != null) {
            return _journey!!
        }
        _journey = Builder(name = "Journey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 16.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(19.5f, 14.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(3.5f, 20.0f)
                curveToRelative(-1.632f, 0.0f, -3.011f, 1.054f, -3.454f, 2.5f)
                curveToRelative(-0.097f, 0.317f, -0.189f, 1.5f, 1.395f, 1.5f)
                horizontalLineToRelative(4.118f)
                curveToRelative(1.584f, 0.0f, 1.492f, -1.183f, 1.395f, -1.5f)
                curveToRelative(-0.443f, -1.446f, -1.822f, -2.5f, -3.454f, -2.5f)
                close()
                moveTo(15.503f, 7.389f)
                lineToRelative(-0.862f, 2.765f)
                curveToRelative(-0.116f, 0.371f, 0.013f, 0.776f, 0.325f, 1.009f)
                curveToRelative(0.162f, 0.122f, 0.356f, 0.183f, 0.55f, 0.183f)
                curveToRelative(0.178f, 0.0f, 0.355f, -0.051f, 0.51f, -0.155f)
                lineToRelative(2.482f, -1.661f)
                lineToRelative(2.524f, 1.644f)
                curveToRelative(0.326f, 0.212f, 0.751f, 0.195f, 1.06f, -0.042f)
                curveToRelative(0.309f, -0.238f, 0.433f, -0.645f, 0.311f, -1.014f)
                lineToRelative(-0.897f, -2.732f)
                lineToRelative(2.169f, -1.767f)
                curveToRelative(0.294f, -0.248f, 0.403f, -0.654f, 0.271f, -1.016f)
                curveToRelative(-0.132f, -0.362f, -0.476f, -0.602f, -0.861f, -0.602f)
                horizontalLineToRelative(-2.751f)
                lineToRelative(-0.974f, -2.732f)
                curveToRelative(-0.133f, -0.359f, -0.476f, -0.597f, -0.859f, -0.597f)
                reflectiveCurveToRelative(-0.726f, 0.238f, -0.859f, 0.597f)
                lineToRelative(-0.974f, 2.732f)
                horizontalLineToRelative(-2.751f)
                curveToRelative(-0.384f, 0.0f, -0.728f, 0.24f, -0.86f, 0.601f)
                curveToRelative(-0.133f, 0.361f, -0.026f, 0.766f, 0.267f, 1.015f)
                lineToRelative(2.179f, 1.773f)
                close()
            }
        }
        .build()
        return _journey!!
    }

private var _journey: ImageVector? = null

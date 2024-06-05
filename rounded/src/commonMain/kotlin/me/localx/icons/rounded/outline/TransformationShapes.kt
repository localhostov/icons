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

public val Icons.Outline.TransformationShapes: ImageVector
    get() {
        if (_transformationShapes != null) {
            return _transformationShapes!!
        }
        _transformationShapes = Builder(name = "TransformationShapes", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 0.0f)
                curveTo(2.916f, 0.0f, 0.0f, 2.916f, 0.0f, 6.5f)
                reflectiveCurveToRelative(2.916f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.916f, 6.5f, -6.5f)
                reflectiveCurveTo(10.084f, 0.0f, 6.5f, 0.0f)
                close()
                moveTo(6.5f, 11.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveTo(4.019f, 2.0f, 6.5f, 2.0f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(20.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(22.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(8.433f, 18.607f)
                curveToRelative(0.761f, 0.762f, 0.761f, 2.023f, -0.013f, 2.798f)
                lineToRelative(-2.199f, 2.288f)
                curveToRelative(-0.196f, 0.204f, -0.458f, 0.307f, -0.721f, 0.307f)
                curveToRelative(-0.249f, 0.0f, -0.499f, -0.093f, -0.693f, -0.279f)
                curveToRelative(-0.397f, -0.383f, -0.41f, -1.016f, -0.027f, -1.414f)
                lineToRelative(1.256f, -1.307f)
                horizontalLineToRelative(-2.035f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.029f)
                lineToRelative(-1.25f, -1.307f)
                curveToRelative(-0.383f, -0.398f, -0.37f, -1.031f, 0.027f, -1.414f)
                curveToRelative(0.399f, -0.384f, 1.032f, -0.371f, 1.414f, 0.027f)
                lineToRelative(2.212f, 2.301f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.029f)
                lineToRelative(1.25f, 1.307f)
                curveToRelative(0.383f, 0.398f, 0.37f, 1.031f, -0.027f, 1.414f)
                curveToRelative(-0.194f, 0.187f, -0.444f, 0.279f, -0.693f, 0.279f)
                curveToRelative(-0.263f, 0.0f, -0.524f, -0.103f, -0.721f, -0.307f)
                lineToRelative(-2.212f, -2.301f)
                curveToRelative(-0.761f, -0.762f, -0.761f, -2.023f, 0.013f, -2.798f)
                lineToRelative(2.199f, -2.288f)
                curveToRelative(0.382f, -0.397f, 1.015f, -0.41f, 1.414f, -0.027f)
                curveToRelative(0.397f, 0.383f, 0.41f, 1.016f, 0.027f, 1.414f)
                lineToRelative(-1.256f, 1.307f)
                horizontalLineToRelative(2.035f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _transformationShapes!!
    }

private var _transformationShapes: ImageVector? = null

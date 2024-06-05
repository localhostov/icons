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

public val Icons.Filled.TransformationBlock: ImageVector
    get() {
        if (_transformationBlock != null) {
            return _transformationBlock!!
        }
        _transformationBlock = Builder(name = "TransformationBlock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.825f, 7.44f)
                lineToRelative(-5.825f, 3.328f)
                lineToRelative(-5.811f, -3.32f)
                curveToRelative(0.203f, -0.202f, 0.433f, -0.378f, 0.679f, -0.534f)
                lineToRelative(-3.112f, -2.264f)
                curveToRelative(-0.37f, 0.217f, -0.796f, 0.35f, -1.256f, 0.35f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveTo(1.119f, 0.0f, 2.5f, 0.0f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.185f, -0.023f, 0.364f, -0.061f, 0.537f)
                lineToRelative(3.823f, 2.78f)
                lineToRelative(1.265f, -0.723f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.226f, -0.699f, 2.746f, -0.698f, 3.97f, 0.0f)
                lineToRelative(1.253f, 0.716f)
                lineToRelative(3.812f, -2.773f)
                curveToRelative(-0.038f, -0.173f, -0.061f, -0.352f, -0.061f, -0.537f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-0.46f, 0.0f, -0.886f, -0.133f, -1.256f, -0.35f)
                lineToRelative(-3.101f, 2.256f)
                curveToRelative(0.247f, 0.156f, 0.478f, 0.332f, 0.682f, 0.534f)
                close()
                moveTo(5.012f, 10.279f)
                lineToRelative(-0.011f, 3.763f)
                curveToRelative(0.0f, 1.277f, 0.616f, 2.47f, 1.63f, 3.218f)
                lineToRelative(-2.874f, 2.09f)
                curveToRelative(-0.37f, -0.217f, -0.796f, -0.35f, -1.256f, -0.35f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.185f, -0.023f, -0.364f, -0.061f, -0.537f)
                lineToRelative(3.568f, -2.595f)
                lineToRelative(1.508f, 0.862f)
                curveToRelative(0.312f, 0.178f, 0.644f, 0.31f, 0.985f, 0.398f)
                verticalLineToRelative(-7.127f)
                lineToRelative(-5.827f, -3.329f)
                curveToRelative(-0.104f, 0.357f, -0.162f, 0.728f, -0.162f, 1.109f)
                close()
                moveTo(21.501f, 19.0f)
                curveToRelative(-0.46f, 0.0f, -0.886f, 0.133f, -1.256f, 0.35f)
                lineToRelative(-2.874f, -2.09f)
                curveToRelative(1.014f, -0.748f, 1.63f, -1.941f, 1.63f, -3.215f)
                lineToRelative(0.011f, -3.763f)
                curveToRelative(0.0f, -0.385f, -0.06f, -0.762f, -0.166f, -1.122f)
                lineToRelative(-5.845f, 3.34f)
                verticalLineToRelative(7.127f)
                curveToRelative(0.341f, -0.087f, 0.672f, -0.219f, 0.984f, -0.397f)
                lineToRelative(1.508f, -0.862f)
                lineToRelative(3.568f, 2.595f)
                curveToRelative(-0.038f, 0.173f, -0.061f, 0.352f, -0.061f, 0.537f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _transformationBlock!!
    }

private var _transformationBlock: ImageVector? = null

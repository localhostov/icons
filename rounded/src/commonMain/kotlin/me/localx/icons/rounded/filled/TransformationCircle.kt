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

public val Icons.Filled.TransformationCircle: ImageVector
    get() {
        if (_transformationCircle != null) {
            return _transformationCircle!!
        }
        _transformationCircle = Builder(name = "TransformationCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 24.0f)
                curveTo(3.813f, 24.0f, 0.0f, 20.187f, 0.0f, 15.5f)
                reflectiveCurveTo(3.813f, 7.0f, 8.5f, 7.0f)
                reflectiveCurveToRelative(8.5f, 3.813f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.813f, 8.5f, -8.5f, 8.5f)
                close()
                moveTo(15.5f, 0.0f)
                curveToRelative(-3.454f, 0.0f, -6.427f, 2.074f, -7.755f, 5.038f)
                curveToRelative(0.25f, -0.018f, 0.5f, -0.038f, 0.755f, -0.038f)
                curveToRelative(2.535f, 0.0f, 4.864f, 0.904f, 6.68f, 2.406f)
                lineToRelative(2.096f, -2.096f)
                lineToRelative(-1.061f, -1.061f)
                curveToRelative(-0.461f, -0.461f, -0.134f, -1.249f, 0.517f, -1.249f)
                horizontalLineToRelative(3.262f)
                curveToRelative(0.555f, 0.0f, 1.005f, 0.45f, 1.005f, 1.005f)
                verticalLineToRelative(3.262f)
                curveToRelative(0.0f, 0.652f, -0.788f, 0.978f, -1.249f, 0.517f)
                lineToRelative(-1.061f, -1.061f)
                lineToRelative(-2.096f, 2.096f)
                curveToRelative(1.502f, 1.817f, 2.406f, 4.145f, 2.406f, 6.68f)
                curveToRelative(0.0f, 0.255f, -0.02f, 0.505f, -0.038f, 0.755f)
                curveToRelative(2.965f, -1.329f, 5.038f, -4.302f, 5.038f, -7.755f)
                curveTo(24.0f, 3.813f, 20.187f, 0.0f, 15.5f, 0.0f)
                close()
            }
        }
        .build()
        return _transformationCircle!!
    }

private var _transformationCircle: ImageVector? = null

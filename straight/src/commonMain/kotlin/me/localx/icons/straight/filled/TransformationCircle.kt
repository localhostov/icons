package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                curveToRelative(-3.46f, 0.0f, -6.432f, 2.071f, -7.758f, 5.038f)
                curveToRelative(0.251f, -0.018f, 0.502f, -0.038f, 0.758f, -0.038f)
                curveToRelative(2.536f, 0.0f, 4.864f, 0.904f, 6.681f, 2.405f)
                lineToRelative(2.362f, -2.362f)
                lineToRelative(-2.043f, -2.043f)
                horizontalLineToRelative(4.583f)
                curveToRelative(0.506f, 0.0f, 0.917f, 0.41f, 0.917f, 0.917f)
                verticalLineToRelative(4.583f)
                lineToRelative(-2.043f, -2.043f)
                lineToRelative(-2.362f, 2.362f)
                curveToRelative(1.502f, 1.817f, 2.405f, 4.145f, 2.405f, 6.681f)
                curveToRelative(0.0f, 0.256f, -0.02f, 0.507f, -0.038f, 0.758f)
                curveToRelative(2.967f, -1.326f, 5.038f, -4.298f, 5.038f, -7.758f)
                curveTo(24.0f, 3.806f, 20.194f, 0.0f, 15.5f, 0.0f)
                close()
            }
        }
        .build()
        return _transformationCircle!!
    }

private var _transformationCircle: ImageVector? = null

package me.localx.icons.straight.outline

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

public val Icons.Outline.RegionPin: ImageVector
    get() {
        if (_regionPin != null) {
            return _regionPin!!
        }
        _regionPin = Builder(name = "RegionPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 5.506f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(8.149f, 9.426f)
                curveToRelative(-1.073f, -1.071f, -1.649f, -2.456f, -1.649f, -3.926f)
                reflectiveCurveToRelative(0.572f, -2.851f, 1.612f, -3.889f)
                curveToRelative(1.038f, -1.039f, 2.419f, -1.611f, 3.888f, -1.611f)
                reflectiveCurveToRelative(2.85f, 0.572f, 3.888f, 1.611f)
                curveToRelative(1.04f, 1.038f, 1.612f, 2.419f, 1.612f, 3.889f)
                reflectiveCurveToRelative(-0.572f, 2.851f, -1.612f, 3.889f)
                lineToRelative(-3.888f, 3.609f)
                lineToRelative(-3.851f, -3.572f)
                close()
                moveTo(8.5f, 5.5f)
                curveToRelative(0.0f, 0.936f, 0.368f, 1.817f, 1.036f, 2.485f)
                lineToRelative(2.464f, 2.284f)
                lineToRelative(2.501f, -2.321f)
                curveToRelative(0.634f, -0.635f, 0.999f, -1.513f, 0.999f, -2.448f)
                reflectiveCurveToRelative(-0.364f, -1.813f, -1.025f, -2.475f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.661f, -0.661f, -1.539f, -1.025f, -2.474f, -1.025f)
                reflectiveCurveToRelative(-1.813f, 0.364f, -2.474f, 1.025f)
                curveToRelative(-0.662f, 0.661f, -1.026f, 1.539f, -1.026f, 2.475f)
                close()
                moveTo(24.0f, 22.5f)
                verticalLineToRelative(1.5f)
                lineTo(0.0f, 24.0f)
                lineToRelative(0.013f, -1.659f)
                lineToRelative(2.229f, -13.818f)
                curveToRelative(0.199f, -1.232f, 1.118f, -2.171f, 2.287f, -2.438f)
                curveToRelative(0.053f, 0.674f, 0.198f, 1.329f, 0.429f, 1.959f)
                curveToRelative(-0.378f, 0.096f, -0.677f, 0.395f, -0.742f, 0.797f)
                lineToRelative(-0.268f, 1.664f)
                lineToRelative(6.437f, 5.722f)
                lineToRelative(9.867f, -4.485f)
                lineToRelative(-0.468f, -2.901f)
                curveToRelative(-0.064f, -0.4f, -0.36f, -0.697f, -0.734f, -0.796f)
                curveToRelative(0.226f, -0.627f, 0.37f, -1.284f, 0.422f, -1.961f)
                curveToRelative(1.169f, 0.267f, 2.088f, 1.206f, 2.287f, 2.438f)
                lineToRelative(2.242f, 13.978f)
                close()
                moveTo(2.094f, 22.0f)
                horizontalLineToRelative(11.776f)
                lineTo(3.57f, 12.845f)
                lineToRelative(-1.477f, 9.155f)
                close()
                moveTo(21.906f, 22.0f)
                lineToRelative(-1.325f, -8.212f)
                lineToRelative(-8.562f, 3.892f)
                lineToRelative(4.86f, 4.32f)
                horizontalLineToRelative(5.026f)
                close()
            }
        }
        .build()
        return _regionPin!!
    }

private var _regionPin: ImageVector? = null

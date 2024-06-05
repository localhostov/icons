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

public val Icons.Outline.CircleZ: ImageVector
    get() {
        if (_circleZ != null) {
            return _circleZ!!
        }
        _circleZ = Builder(name = "CircleZ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.038f, 0.02f)
                curveTo(5.421f, 0.02f, 0.038f, 5.402f, 0.038f, 12.02f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.02f, 12.038f, 0.02f)
                close()
                moveTo(12.038f, 22.02f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.02f, 12.038f, 2.02f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(9.059f, 15.807f)
                curveToRelative(0.047f, 0.142f, 0.14f, 0.213f, 0.276f, 0.213f)
                horizontalLineToRelative(6.702f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.702f)
                curveToRelative(-1.001f, 0.0f, -1.854f, -0.62f, -2.174f, -1.58f)
                curveToRelative(-0.326f, -0.977f, -0.009f, -2.003f, 0.808f, -2.615f)
                lineToRelative(6.937f, -5.209f)
                curveToRelative(0.166f, -0.125f, 0.142f, -0.293f, 0.111f, -0.382f)
                curveToRelative(-0.047f, -0.142f, -0.14f, -0.214f, -0.276f, -0.214f)
                horizontalLineToRelative(-6.703f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.703f)
                curveToRelative(1.0f, 0.0f, 1.854f, 0.62f, 2.174f, 1.581f)
                curveToRelative(0.325f, 0.976f, 0.008f, 2.002f, -0.808f, 2.614f)
                lineToRelative(-6.937f, 5.209f)
                curveToRelative(-0.167f, 0.125f, -0.142f, 0.293f, -0.111f, 0.383f)
                close()
            }
        }
        .build()
        return _circleZ!!
    }

private var _circleZ: ImageVector? = null

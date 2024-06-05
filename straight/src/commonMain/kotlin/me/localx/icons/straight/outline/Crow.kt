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

public val Icons.Outline.Crow: ImageVector
    get() {
        if (_crow != null) {
            return _crow!!
        }
        _crow = Builder(name = "Crow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.0f)
                curveToRelative(0.0f, -1.957f, -1.16f, -3.003f, -2.093f, -3.529f)
                curveToRelative(-0.165f, -1.052f, -0.724f, -1.998f, -1.59f, -2.66f)
                curveTo(19.273f, 0.013f, 17.93f, -0.244f, 16.632f, 0.111f)
                curveToRelative(-1.205f, 0.327f, -2.211f, 1.225f, -2.694f, 2.401f)
                curveToRelative(-0.143f, 0.347f, -0.239f, 0.703f, -0.288f, 1.055f)
                curveToRelative(-0.19f, 1.362f, -0.676f, 2.455f, -1.505f, 3.318f)
                lineTo(0.052f, 22.017f)
                lineToRelative(1.562f, 1.248f)
                lineToRelative(1.809f, -2.265f)
                horizontalLineToRelative(5.438f)
                lineToRelative(1.5f, 3.0f)
                horizontalLineToRelative(2.236f)
                lineToRelative(-1.531f, -3.062f)
                curveToRelative(0.855f, -0.093f, 1.684f, -0.29f, 2.476f, -0.576f)
                lineToRelative(1.819f, 3.638f)
                horizontalLineToRelative(2.236f)
                lineToRelative(-2.243f, -4.487f)
                curveToRelative(3.341f, -1.949f, 5.645f, -5.604f, 5.645f, -9.685f)
                curveToRelative(0.0f, 0.0f, 0.002f, -2.795f, 0.005f, -2.828f)
                horizontalLineToRelative(2.995f)
                close()
                moveTo(13.0f, 9.011f)
                verticalLineToRelative(0.551f)
                curveToRelative(0.0f, 2.812f, -2.091f, 5.133f, -4.761f, 5.41f)
                lineToRelative(4.761f, -5.961f)
                close()
                moveTo(19.551f, 5.377f)
                curveToRelative(-0.361f, 0.499f, -0.551f, 1.095f, -0.551f, 1.723f)
                verticalLineToRelative(2.728f)
                curveToRelative(0.0f, 4.972f, -4.156f, 9.172f, -9.076f, 9.172f)
                horizontalLineToRelative(-4.903f)
                lineToRelative(1.656f, -2.073f)
                curveToRelative(0.338f, 0.049f, 0.681f, 0.073f, 1.025f, 0.073f)
                curveToRelative(4.024f, 0.0f, 7.298f, -3.337f, 7.298f, -7.438f)
                verticalLineToRelative(-3.408f)
                curveToRelative(0.302f, -0.696f, 0.512f, -1.468f, 0.63f, -2.313f)
                curveToRelative(0.026f, -0.188f, 0.079f, -0.379f, 0.158f, -0.571f)
                curveToRelative(0.244f, -0.596f, 0.769f, -1.067f, 1.369f, -1.23f)
                curveToRelative(0.701f, -0.191f, 1.393f, -0.064f, 1.946f, 0.359f)
                curveToRelative(0.544f, 0.416f, 0.856f, 1.046f, 0.856f, 1.729f)
                curveToRelative(0.0f, 0.449f, -0.141f, 0.88f, -0.407f, 1.249f)
                close()
            }
        }
        .build()
        return _crow!!
    }

private var _crow: ImageVector? = null

package me.localx.icons.straight.bold

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

public val Icons.Bold.Corn: ImageVector
    get() {
        if (_corn != null) {
            return _corn!!
        }
        _corn = Builder(name = "Corn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.136f, 10.045f)
                arcToRelative(13.717f, 13.717f, 0.0f, false, false, -2.18f, 0.761f)
                curveTo(18.557f, 5.009f, 15.422f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(5.443f, 5.009f, 5.044f, 10.806f)
                arcToRelative(13.717f, 13.717f, 0.0f, false, false, -2.18f, -0.761f)
                lineTo(1.0f, 9.579f)
                lineTo(1.0f, 11.5f)
                curveToRelative(0.0f, 10.064f, 6.339f, 12.074f, 9.7f, 12.43f)
                lineToRelative(1.284f, 0.07f)
                lineToRelative(1.306f, -0.069f)
                curveTo(16.653f, 23.577f, 23.0f, 21.57f, 23.0f, 11.5f)
                lineTo(23.0f, 9.579f)
                close()
                moveTo(4.129f, 13.664f)
                arcToRelative(12.039f, 12.039f, 0.0f, false, true, 6.0f, 7.164f)
                curveTo(7.626f, 20.345f, 4.763f, 18.666f, 4.129f, 13.664f)
                close()
                moveTo(12.0f, 17.573f)
                arcToRelative(15.085f, 15.085f, 0.0f, false, false, -3.989f, -4.982f)
                curveToRelative(0.0f, -0.183f, -0.011f, -0.364f, -0.011f, -0.549f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 8.543f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 5.0f)
                lineTo(9.816f, 5.0f)
                curveTo(10.6f, 3.715f, 11.466f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(1.4f, 0.715f, 2.184f, 2.0f)
                lineTo(13.0f, 5.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(2.457f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 16.0f, 12.042f)
                curveToRelative(0.0f, 0.185f, -0.006f, 0.366f, -0.011f, 0.549f)
                arcTo(15.085f, 15.085f, 0.0f, false, false, 12.0f, 17.573f)
                close()
                moveTo(13.867f, 20.828f)
                arcToRelative(12.039f, 12.039f, 0.0f, false, true, 6.0f, -7.164f)
                curveTo(19.237f, 18.666f, 16.374f, 20.345f, 13.867f, 20.828f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(10.0f, 13.0f)
                close()
            }
        }
        .build()
        return _corn!!
    }

private var _corn: ImageVector? = null

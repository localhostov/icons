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

public val Icons.Filled.Frog: ImageVector
    get() {
        if (_frog != null) {
            return _frog!!
        }
        _frog = Builder(name = "Frog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.27f, 4.875f)
                curveToRelative(-1.114f, -1.002f, -2.68f, -1.816f, -4.395f, -2.301f)
                curveToRelative(-0.407f, -1.482f, -1.766f, -2.574f, -3.375f, -2.574f)
                curveToRelative(-1.493f, 0.0f, -2.771f, 0.94f, -3.273f, 2.26f)
                curveTo(2.514f, 6.921f, 0.229f, 13.83f, 0.034f, 18.833f)
                curveToRelative(-0.053f, 1.354f, 0.438f, 2.641f, 1.384f, 3.624f)
                curveToRelative(0.943f, 0.98f, 2.263f, 1.542f, 3.622f, 1.542f)
                horizontalLineToRelative(9.96f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.077f)
                curveToRelative(0.235f, -0.693f, 0.532f, -1.36f, 0.89f, -2.0f)
                horizontalLineToRelative(1.448f)
                curveToRelative(2.165f, 0.0f, 4.078f, 1.101f, 5.209f, 2.772f)
                curveToRelative(0.0f, 0.0f, 0.35f, -1.766f, 0.427f, -2.284f)
                lineToRelative(6.054f, 9.513f)
                horizontalLineToRelative(3.549f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.451f)
                lineToRelative(-6.392f, -10.044f)
                curveToRelative(3.059f, -0.227f, 6.949f, -1.359f, 9.275f, -3.993f)
                curveToRelative(0.798f, -0.903f, 0.725f, -2.288f, -0.163f, -3.087f)
                close()
                moveTo(15.5f, 5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _frog!!
    }

private var _frog: ImageVector? = null

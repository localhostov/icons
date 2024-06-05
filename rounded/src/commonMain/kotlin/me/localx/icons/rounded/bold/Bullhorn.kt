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

public val Icons.Bold.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 7.05f)
                lineTo(22.0f, 1.5f)
                curveToRelative(0.0f, -0.78f, -0.599f, -1.431f, -1.376f, -1.495f)
                curveToRelative(-0.775f, -0.063f, -1.475f, 0.479f, -1.603f, 1.249f)
                curveToRelative(-0.398f, 2.39f, -3.63f, 2.747f, -5.521f, 2.747f)
                lineTo(5.5f, 4.001f)
                curveTo(2.467f, 4.0f, 0.0f, 6.467f, 0.0f, 9.5f)
                curveToRelative(0.0f, 1.899f, 0.967f, 3.576f, 2.434f, 4.564f)
                lineToRelative(3.88f, 8.73f)
                curveToRelative(0.326f, 0.733f, 1.053f, 1.206f, 1.855f, 1.206f)
                curveToRelative(0.646f, 0.0f, 1.296f, -0.186f, 1.795f, -0.596f)
                curveToRelative(1.008f, -0.828f, 1.293f, -2.156f, 0.797f, -3.272f)
                lineToRelative(-2.281f, -5.132f)
                horizontalLineToRelative(5.019f)
                curveToRelative(1.891f, 0.0f, 5.122f, 0.357f, 5.521f, 2.747f)
                curveToRelative(0.121f, 0.729f, 0.752f, 1.253f, 1.478f, 1.253f)
                curveToRelative(1.001f, 0.0f, 1.501f, -0.72f, 1.501f, -1.5f)
                verticalLineToRelative(-5.55f)
                curveToRelative(1.141f, -0.232f, 2.0f, -1.24f, 2.0f, -2.45f)
                reflectiveCurveToRelative(-0.859f, -2.218f, -2.0f, -2.45f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(19.0f, 13.175f)
                curveToRelative(-1.411f, -0.768f, -3.27f, -1.175f, -5.5f, -1.175f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.23f, 0.0f, 4.089f, -0.408f, 5.5f, -1.175f)
                verticalLineToRelative(7.351f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null

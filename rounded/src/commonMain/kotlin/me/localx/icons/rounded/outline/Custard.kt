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

public val Icons.Outline.Custard: ImageVector
    get() {
        if (_custard != null) {
            return _custard!!
        }
        _custard = Builder(name = "Custard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 17.0f)
                horizontalLineToRelative(-0.838f)
                lineToRelative(-2.021f, -11.456f)
                curveToRelative(-0.465f, -2.633f, -2.742f, -4.544f, -5.416f, -4.544f)
                horizontalLineToRelative(-5.449f)
                curveToRelative(-2.673f, 0.0f, -4.951f, 1.911f, -5.417f, 4.544f)
                lineToRelative(-2.022f, 11.456f)
                horizontalLineToRelative(-0.837f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.252f, 2.244f, 2.139f, 4.0f, 4.449f, 4.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(2.31f, 0.0f, 4.197f, -1.756f, 4.449f, -4.0f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(5.457f, 8.0f)
                horizontalLineToRelative(1.043f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.044f)
                lineToRelative(1.588f, 9.0f)
                lineTo(3.868f, 17.0f)
                lineToRelative(1.588f, -9.0f)
                close()
                moveTo(9.276f, 3.0f)
                horizontalLineToRelative(5.449f)
                curveToRelative(1.701f, 0.0f, 3.151f, 1.216f, 3.447f, 2.892f)
                lineToRelative(0.019f, 0.108f)
                horizontalLineToRelative(-1.691f)
                curveToRelative(-0.979f, 0.0f, -1.864f, 0.403f, -2.5f, 1.053f)
                curveToRelative(-0.636f, -0.649f, -1.521f, -1.053f, -2.5f, -1.053f)
                reflectiveCurveToRelative(-1.864f, 0.403f, -2.5f, 1.053f)
                curveToRelative(-0.636f, -0.649f, -1.521f, -1.053f, -2.5f, -1.053f)
                horizontalLineToRelative(-0.69f)
                lineToRelative(0.019f, -0.108f)
                curveToRelative(0.296f, -1.676f, 1.746f, -2.892f, 3.447f, -2.892f)
                close()
                moveTo(18.501f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.449f, -2.0f)
                horizontalLineToRelative(17.899f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.449f, 2.0f)
                close()
            }
        }
        .build()
        return _custard!!
    }

private var _custard: ImageVector? = null

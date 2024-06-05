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

public val Icons.Bold.Acorn: ImageVector
    get() {
        if (_acorn != null) {
            return _acorn!!
        }
        _acorn = Builder(name = "Acorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.5f)
                curveToRelative(0.0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                curveTo(3.92f, 2.0f, 1.0f, 4.92f, 1.0f, 8.5f)
                curveToRelative(0.0f, 1.21f, 0.86f, 2.22f, 2.0f, 2.45f)
                verticalLineToRelative(3.49f)
                curveToRelative(0.0f, 4.7f, 4.07f, 7.6f, 6.49f, 8.92f)
                curveToRelative(0.79f, 0.43f, 1.65f, 0.64f, 2.51f, 0.64f)
                reflectiveCurveToRelative(1.73f, -0.21f, 2.51f, -0.64f)
                curveToRelative(2.42f, -1.31f, 6.49f, -4.22f, 6.49f, -8.92f)
                verticalLineToRelative(-3.49f)
                curveToRelative(1.14f, -0.23f, 2.0f, -1.24f, 2.0f, -2.45f)
                close()
                moveTo(7.5f, 5.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.76f, 0.0f, 3.22f, 1.31f, 3.46f, 3.0f)
                lineTo(4.04f, 8.0f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3.0f, 3.46f, -3.0f)
                close()
                moveTo(13.08f, 20.72f)
                curveToRelative(-0.68f, 0.37f, -1.49f, 0.37f, -2.16f, 0.0f)
                curveToRelative(-1.84f, -1.0f, -4.92f, -3.13f, -4.92f, -6.28f)
                verticalLineToRelative(-3.44f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.44f)
                curveToRelative(0.0f, 3.15f, -3.08f, 5.28f, -4.92f, 6.28f)
                close()
            }
        }
        .build()
        return _acorn!!
    }

private var _acorn: ImageVector? = null

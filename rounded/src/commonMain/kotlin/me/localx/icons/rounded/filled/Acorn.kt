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

public val Icons.Filled.Acorn: ImageVector
    get() {
        if (_acorn != null) {
            return _acorn!!
        }
        _acorn = Builder(name = "Acorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.94f, 6.5f)
                curveToRelative(-0.68f, -2.65f, -3.07f, -4.5f, -5.81f, -4.5f)
                horizontalLineToRelative(-4.13f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.87f, 2.0f)
                curveTo(4.14f, 2.0f, 1.75f, 3.85f, 1.06f, 6.5f)
                curveToRelative(-0.16f, 0.6f, -0.02f, 1.23f, 0.36f, 1.72f)
                curveToRelative(0.38f, 0.49f, 0.96f, 0.78f, 1.59f, 0.78f)
                lineTo(20.99f, 9.0f)
                curveToRelative(0.62f, 0.0f, 1.2f, -0.28f, 1.59f, -0.78f)
                curveToRelative(0.38f, -0.49f, 0.51f, -1.12f, 0.36f, -1.72f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.41f)
                curveToRelative(0.0f, 4.7f, 4.14f, 7.65f, 6.61f, 8.98f)
                curveToRelative(0.75f, 0.41f, 1.57f, 0.61f, 2.39f, 0.61f)
                reflectiveCurveToRelative(1.64f, -0.2f, 2.39f, -0.61f)
                curveToRelative(2.47f, -1.34f, 6.61f, -4.28f, 6.61f, -8.98f)
                verticalLineToRelative(-2.41f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _acorn!!
    }

private var _acorn: ImageVector? = null

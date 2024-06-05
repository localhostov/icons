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

public val Icons.Outline.Acorn: ImageVector
    get() {
        if (_acorn != null) {
            return _acorn!!
        }
        _acorn = Builder(name = "Acorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 2.0f)
                curveTo(3.69f, 2.0f, 1.0f, 4.69f, 1.0f, 8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                verticalLineToRelative(4.41f)
                curveToRelative(0.0f, 4.7f, 4.14f, 7.65f, 6.61f, 8.98f)
                curveToRelative(0.75f, 0.41f, 1.57f, 0.61f, 2.39f, 0.61f)
                reflectiveCurveToRelative(1.64f, -0.2f, 2.39f, -0.61f)
                curveToRelative(2.47f, -1.34f, 6.61f, -4.28f, 6.61f, -8.98f)
                verticalLineToRelative(-4.41f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.0f, 14.41f)
                curveToRelative(0.0f, 3.67f, -3.48f, 6.1f, -5.56f, 7.23f)
                curveToRelative(-0.9f, 0.49f, -1.98f, 0.49f, -2.88f, 0.0f)
                curveToRelative(-2.08f, -1.12f, -5.56f, -3.56f, -5.56f, -7.23f)
                verticalLineToRelative(-4.41f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(4.41f)
                close()
                moveTo(3.0f, 8.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                lineTo(3.0f, 8.0f)
                close()
            }
        }
        .build()
        return _acorn!!
    }

private var _acorn: ImageVector? = null

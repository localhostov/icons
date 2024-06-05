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

public val Icons.Bold.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.836f)
                curveToRelative(-0.747f, 3.304f, -3.927f, 5.41f, -7.336f, 5.893f)
                verticalLineToRelative(-5.893f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.257f)
                curveToRelative(1.746f, -0.619f, 3.0f, -2.287f, 3.0f, -4.243f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                curveToRelative(0.0f, 1.956f, 1.254f, 3.624f, 3.0f, 4.243f)
                verticalLineToRelative(3.257f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(5.893f)
                curveToRelative(-3.41f, -0.483f, -6.589f, -2.59f, -7.335f, -5.893f)
                horizontalLineToRelative(1.835f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 6.572f, 6.102f, 10.5f, 12.0f, 10.5f)
                reflectiveCurveToRelative(12.0f, -3.928f, 12.0f, -10.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null

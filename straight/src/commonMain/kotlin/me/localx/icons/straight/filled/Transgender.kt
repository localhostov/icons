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

public val Icons.Filled.Transgender: ImageVector
    get() {
        if (_transgender != null) {
            return _transgender!!
        }
        _transgender = Builder(name = "Transgender", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(-5.115f, 5.115f)
                curveToRelative(-0.981f, -0.699f, -2.177f, -1.115f, -3.471f, -1.115f)
                reflectiveCurveToRelative(-2.49f, 0.416f, -3.471f, 1.115f)
                lineToRelative(-1.524f, -1.524f)
                lineToRelative(1.465f, -1.465f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.465f, 1.465f)
                lineToRelative(-2.177f, -2.177f)
                horizontalLineToRelative(2.586f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.0f)
                curveTo(0.897f, 0.0f, 0.0f, 0.897f, 0.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.586f)
                lineToRelative(2.177f, 2.177f)
                lineToRelative(-1.621f, 1.621f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.621f, -1.621f)
                lineToRelative(1.524f, 1.524f)
                curveToRelative(-0.699f, 0.981f, -1.115f, 2.177f, -1.115f, 3.471f)
                curveToRelative(0.0f, 2.967f, 2.167f, 5.431f, 5.0f, 5.91f)
                verticalLineToRelative(2.09f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.09f)
                curveToRelative(2.833f, -0.478f, 5.0f, -2.942f, 5.0f, -5.91f)
                curveToRelative(0.0f, -1.294f, -0.416f, -2.49f, -1.115f, -3.471f)
                lineToRelative(5.115f, -5.115f)
                verticalLineToRelative(2.586f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _transgender!!
    }

private var _transgender: ImageVector? = null

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

public val Icons.Bold.Popsicle: ImageVector
    get() {
        if (_popsicle != null) {
            return _popsicle!!
        }
        _popsicle = Builder(name = "Popsicle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 9.0f)
                curveTo(21.0f, 4.038f, 16.963f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.0f, 4.038f, 3.0f, 9.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null

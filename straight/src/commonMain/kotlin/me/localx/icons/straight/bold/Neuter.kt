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

public val Icons.Bold.Neuter: ImageVector
    get() {
        if (_neuter != null) {
            return _neuter!!
        }
        _neuter = Builder(name = "Neuter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 8.0f)
                curveTo(20.0f, 3.589f, 16.411f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.0f, 3.589f, 4.0f, 8.0f)
                curveToRelative(0.0f, 3.898f, 2.803f, 7.154f, 6.5f, 7.858f)
                verticalLineToRelative(8.142f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.142f)
                curveToRelative(3.697f, -0.704f, 6.5f, -3.96f, 6.5f, -7.858f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _neuter!!
    }

private var _neuter: ImageVector? = null

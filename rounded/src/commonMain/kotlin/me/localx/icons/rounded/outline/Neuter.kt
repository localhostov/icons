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

public val Icons.Outline.Neuter: ImageVector
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
                curveToRelative(0.0f, 4.073f, 3.059f, 7.444f, 7.0f, 7.938f)
                verticalLineToRelative(7.062f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-7.062f)
                curveToRelative(3.941f, -0.494f, 7.0f, -3.865f, 7.0f, -7.938f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _neuter!!
    }

private var _neuter: ImageVector? = null

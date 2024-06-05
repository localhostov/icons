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

public val Icons.Filled.Eyes: ImageVector
    get() {
        if (_eyes != null) {
            return _eyes!!
        }
        _eyes = Builder(name = "Eyes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.5f, 0.0f)
                curveTo(2.462f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(2.462f, 12.0f, 5.5f, 12.0f)
                reflectiveCurveToRelative(5.5f, -5.373f, 5.5f, -12.0f)
                reflectiveCurveTo(8.538f, 0.0f, 5.5f, 0.0f)
                close()
                moveTo(4.5f, 17.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(18.5f, 0.0f)
                curveToRelative(-3.038f, 0.0f, -5.5f, 5.373f, -5.5f, 12.0f)
                reflectiveCurveToRelative(2.462f, 12.0f, 5.5f, 12.0f)
                reflectiveCurveToRelative(5.5f, -5.373f, 5.5f, -12.0f)
                reflectiveCurveTo(21.538f, 0.0f, 18.5f, 0.0f)
                close()
                moveTo(17.5f, 17.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _eyes!!
    }

private var _eyes: ImageVector? = null

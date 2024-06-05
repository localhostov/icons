package me.localx.icons.straight.outline

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

public val Icons.Outline.MarsStrokeRight: ImageVector
    get() {
        if (_marsStrokeRight != null) {
            return _marsStrokeRight!!
        }
        _marsStrokeRight = Builder(name = "MarsStrokeRight", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.414f, 10.586f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.5f, 2.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.072f)
                curveToRelative(-0.487f, -3.388f, -3.408f, -6.0f, -6.928f, -6.0f)
                curveTo(3.14f, 5.0f, 0.0f, 8.14f, 0.0f, 12.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                curveToRelative(3.52f, 0.0f, 6.442f, -2.612f, 6.928f, -6.0f)
                horizontalLineToRelative(1.072f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.048f, 0.0f, -2.828f)
                close()
                moveTo(7.0f, 17.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _marsStrokeRight!!
    }

private var _marsStrokeRight: ImageVector? = null

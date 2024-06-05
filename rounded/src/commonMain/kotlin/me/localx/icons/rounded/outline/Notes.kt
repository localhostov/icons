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

public val Icons.Outline.Notes: ImageVector
    get() {
        if (_notes != null) {
            return _notes!!
        }
        _notes = Builder(name = "Notes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(4.038f, 24.0f, 0.0f, 19.963f, 0.0f, 15.0f)
                verticalLineToRelative(-7.0f)
                curveTo(0.0f, 7.447f, 0.448f, 7.0f, 1.0f, 7.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(6.616f)
                curveToRelative(0.0f, 1.336f, -0.52f, 2.591f, -1.464f, 3.535f)
                lineToRelative(-3.678f, 3.677f)
                curveToRelative(-0.756f, 0.756f, -1.76f, 1.172f, -2.828f, 1.172f)
                horizontalLineToRelative(-7.03f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(4.0f, 5.0f)
                curveTo(4.0f, 2.243f, 6.244f, 0.0f, 9.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(21.122f, 13.737f)
                curveToRelative(0.219f, -0.219f, 0.386f, -0.471f, 0.526f, -0.737f)
                horizontalLineToRelative(-3.648f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.74f)
                curveToRelative(0.159f, -0.089f, 0.312f, -0.193f, 0.444f, -0.325f)
                lineToRelative(3.678f, -3.677f)
                close()
            }
        }
        .build()
        return _notes!!
    }

private var _notes: ImageVector? = null

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

public val Icons.Outline.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.529f, 9.525f)
                lineToRelative(-1.529f, 1.112f)
                verticalLineToRelative(-5.354f)
                lineTo(12.0f, 0.032f)
                lineToRelative(-7.0f, 5.25f)
                verticalLineToRelative(5.354f)
                lineToRelative(-1.529f, -1.112f)
                lineToRelative(-3.471f, 2.777f)
                verticalLineToRelative(11.698f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-11.698f)
                lineToRelative(-3.471f, -2.777f)
                close()
                moveTo(12.0f, 2.532f)
                lineToRelative(5.0f, 3.75f)
                verticalLineToRelative(15.718f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 6.282f)
                lineToRelative(5.0f, -3.75f)
                close()
                moveTo(13.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(2.0f, 13.263f)
                lineToRelative(1.529f, -1.223f)
                lineToRelative(1.471f, 1.07f)
                verticalLineToRelative(8.891f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-8.737f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-8.891f)
                lineToRelative(1.471f, -1.07f)
                lineToRelative(1.529f, 1.223f)
                verticalLineToRelative(8.737f)
                close()
                moveTo(9.0f, 11.731f)
                lineToRelative(1.05f, -1.75f)
                lineToRelative(-1.05f, -1.75f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -1.5f)
                lineToRelative(0.9f, 1.5f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-1.05f, 1.75f)
                lineToRelative(1.05f, 1.75f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(-0.9f, 1.5f)
                lineToRelative(-0.9f, -1.5f)
                horizontalLineToRelative(-2.1f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null

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

public val Icons.Outline.Lead: ImageVector
    get() {
        if (_lead != null) {
            return _lead!!
        }
        _lead = Builder(name = "Lead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(8.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.0f, 21.858f)
                verticalLineToRelative(-1.858f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.858f)
                curveToRelative(-1.399f, -0.364f, -2.494f, -1.459f, -2.858f, -2.858f)
                horizontalLineToRelative(1.858f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.858f)
                curveToRelative(0.364f, -1.399f, 1.459f, -2.494f, 2.858f, -2.858f)
                verticalLineToRelative(1.858f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.858f)
                curveToRelative(1.399f, 0.364f, 2.494f, 1.459f, 2.858f, 2.858f)
                horizontalLineToRelative(-1.858f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.858f)
                curveToRelative(-0.364f, 1.399f, -1.459f, 2.494f, -2.858f, 2.858f)
                close()
            }
        }
        .build()
        return _lead!!
    }

private var _lead: ImageVector? = null

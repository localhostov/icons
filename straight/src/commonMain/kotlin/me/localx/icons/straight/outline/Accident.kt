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

public val Icons.Outline.Accident: ImageVector
    get() {
        if (_accident != null) {
            return _accident!!
        }
        _accident = Builder(name = "Accident", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.616f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-3.826f, 2.335f)
                lineToRelative(1.438f, 4.245f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-5.612f, -1.969f)
                verticalLineToRelative(-6.228f)
                horizontalLineToRelative(-5.047f)
                lineToRelative(-1.204f, -3.557f)
                horizontalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(3.836f, 1.392f, 3.836f, 1.392f)
                lineToRelative(1.392f, -3.836f)
                lineToRelative(2.335f, 3.826f)
                lineToRelative(4.245f, -1.438f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-1.392f, 3.836f)
                lineToRelative(3.836f, 1.392f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(6.507f, 12.0f)
                curveToRelative(1.381f, -0.004f, 2.497f, -1.126f, 2.493f, -2.507f)
                reflectiveCurveToRelative(-1.126f, -2.497f, -2.507f, -2.493f)
                curveToRelative(-1.381f, 0.004f, -2.497f, 1.126f, -2.493f, 2.507f)
                curveToRelative(0.004f, 1.381f, 1.126f, 2.497f, 2.507f, 2.493f)
                close()
                moveTo(16.083f, 20.331f)
                lineToRelative(5.599f, 1.618f)
                lineToRelative(-0.556f, 1.922f)
                lineToRelative(-5.054f, -1.462f)
                lineToRelative(-5.373f, 1.492f)
                curveToRelative(-0.237f, 0.054f, -0.475f, 0.08f, -0.707f, 0.08f)
                curveToRelative(-1.205f, 0.0f, -2.295f, -0.702f, -2.77f, -1.828f)
                lineToRelative(-3.056f, -7.153f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.434f)
                lineToRelative(6.566f, -0.875f)
                verticalLineToRelative(-4.125f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.876f)
                lineToRelative(-3.762f, 0.501f)
                lineToRelative(2.102f, 5.08f)
                lineToRelative(3.335f, -3.457f)
                horizontalLineToRelative(5.325f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.475f)
                lineToRelative(-2.91f, 3.017f)
                lineToRelative(2.469f, -0.686f)
                close()
                moveTo(11.109f, 21.713f)
                lineToRelative(-2.922f, -7.062f)
                lineToRelative(-1.887f, 0.252f)
                lineToRelative(2.764f, 6.47f)
                curveToRelative(0.19f, 0.452f, 0.671f, 0.695f, 1.146f, 0.591f)
                lineToRelative(0.9f, -0.25f)
                close()
            }
        }
        .build()
        return _accident!!
    }

private var _accident: ImageVector? = null

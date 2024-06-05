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

public val Icons.Filled.Accident: ImageVector
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
                moveTo(8.273f, 11.262f)
                curveToRelative(0.974f, -0.979f, 0.969f, -2.562f, -0.01f, -3.536f)
                reflectiveCurveToRelative(-2.562f, -0.969f, -3.536f, 0.01f)
                curveToRelative(-0.974f, 0.979f, -0.969f, 2.562f, 0.01f, 3.536f)
                curveToRelative(0.979f, 0.974f, 2.562f, 0.969f, 3.536f, -0.01f)
                close()
                moveTo(16.083f, 20.33f)
                lineToRelative(5.599f, 1.618f)
                lineToRelative(-0.556f, 1.922f)
                lineToRelative(-5.054f, -1.462f)
                lineToRelative(-5.373f, 1.492f)
                curveToRelative(-0.237f, 0.054f, -0.475f, 0.08f, -0.707f, 0.08f)
                curveToRelative(-1.205f, 0.0f, -2.295f, -0.702f, -2.77f, -1.828f)
                lineToRelative(-3.056f, -7.153f)
                lineTo(0.0f, 14.999f)
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
            }
        }
        .build()
        return _accident!!
    }

private var _accident: ImageVector? = null

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

public val Icons.Outline.Completed: ImageVector
    get() {
        if (_completed != null) {
            return _completed!!
        }
        _completed = Builder(name = "Completed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.829f, 2.0f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                lineTo(3.0f, 2.0f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                horizontalLineToRelative(-5.171f)
                close()
                moveTo(19.0f, 21.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(17.0f)
                close()
                moveTo(7.442f, 11.511f)
                lineToRelative(-1.43f, -1.354f)
                lineToRelative(1.375f, -1.452f)
                lineToRelative(1.28f, 1.213f)
                lineToRelative(2.548f, -2.547f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.692f, 2.692f)
                curveToRelative(-0.351f, 0.352f, -0.808f, 0.528f, -1.265f, 0.528f)
                curveToRelative(-0.44f, 0.0f, -0.882f, -0.164f, -1.23f, -0.494f)
                close()
                moveTo(12.63f, 14.784f)
                lineToRelative(-2.692f, 2.692f)
                curveToRelative(-0.351f, 0.352f, -0.808f, 0.528f, -1.265f, 0.528f)
                curveToRelative(-0.44f, 0.0f, -0.882f, -0.164f, -1.23f, -0.494f)
                lineToRelative(-1.43f, -1.354f)
                lineToRelative(1.375f, -1.452f)
                lineToRelative(1.28f, 1.213f)
                lineToRelative(2.548f, -2.547f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(12.0f, 12.0f)
                lineToRelative(2.042f, -2.0f)
                horizontalLineToRelative(2.958f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(14.042f, 16.0f)
                horizontalLineToRelative(2.958f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(2.042f, -2.0f)
                close()
            }
        }
        .build()
        return _completed!!
    }

private var _completed: ImageVector? = null

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

public val Icons.Filled.ChecklistTaskBudget: ImageVector
    get() {
        if (_checklistTaskBudget != null) {
            return _checklistTaskBudget!!
        }
        _checklistTaskBudget = Builder(name = "ChecklistTaskBudget", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.0f)
                curveToRelative(0.0f, 1.7f, -1.3f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.7f, 0.0f, -3.0f, -1.3f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.6f, 0.4f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.6f, 0.0f, 1.0f, -0.4f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.4f, -0.3f, -0.7f, -0.6f, -0.8f)
                lineToRelative(-3.0f, -0.5f)
                curveTo(17.0f, 18.5f, 16.0f, 17.4f, 16.0f, 16.0f)
                curveToRelative(0.0f, -1.7f, 1.3f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.7f, 0.0f, 3.0f, 1.3f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.6f, -0.4f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.6f, 0.0f, -1.0f, 0.4f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.4f, 0.3f, 0.7f, 0.6f, 0.8f)
                lineToRelative(3.0f, 0.5f)
                curveTo(23.0f, 17.5f, 24.0f, 18.6f, 24.0f, 20.0f)
                close()
                moveTo(14.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.0f, 1.2f, -3.8f, 3.0f, -4.6f)
                lineToRelative(1.0f, -0.3f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-5.2f)
                curveToRelative(-0.4f, -1.2f, -1.5f, -2.0f, -2.8f, -2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.7f, 0.0f, 5.6f, 0.8f, 5.2f, 2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 1.7f, 1.3f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.3f, 0.0f, 0.6f, -0.1f, 0.8f, -0.1f)
                curveTo(14.7f, 22.9f, 14.0f, 21.6f, 14.0f, 20.0f)
                close()
                moveTo(7.2f, 16.5f)
                curveTo(6.9f, 16.8f, 6.5f, 17.0f, 6.1f, 17.0f)
                reflectiveCurveToRelative(-0.8f, -0.2f, -1.1f, -0.5f)
                lineToRelative(-1.6f, -1.6f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(1.4f, 1.4f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(1.4f, 1.4f)
                curveTo(10.0f, 13.7f, 7.2f, 16.5f, 7.2f, 16.5f)
                close()
                moveTo(7.2f, 10.5f)
                curveTo(6.9f, 10.8f, 6.5f, 11.0f, 6.1f, 11.0f)
                reflectiveCurveToRelative(-0.8f, -0.2f, -1.1f, -0.5f)
                lineTo(3.3f, 8.9f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(1.4f, 1.4f)
                lineToRelative(2.5f, -2.5f)
                lineTo(10.0f, 7.7f)
                curveTo(10.0f, 7.7f, 7.2f, 10.5f, 7.2f, 10.5f)
                close()
            }
        }
        .build()
        return _checklistTaskBudget!!
    }

private var _checklistTaskBudget: ImageVector? = null

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

public val Icons.Filled.WorkflowSetting: ImageVector
    get() {
        if (_workflowSetting != null) {
            return _workflowSetting!!
        }
        _workflowSetting = Builder(name = "WorkflowSetting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.78f, 19.45f)
                curveToRelative(0.293f, 0.304f, 0.293f, 0.796f, 0.0f, 1.1f)
                lineToRelative(-2.78f, 2.95f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 13.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.5f)
                lineToRelative(2.78f, 2.95f)
                close()
                moveTo(9.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(9.0f, 23.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(22.5f, 7.0f)
                curveToRelative(0.0f, -0.461f, -0.07f, -0.905f, -0.199f, -1.324f)
                lineToRelative(1.397f, -0.805f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(-1.4f, 0.806f)
                curveToRelative(-0.606f, -0.654f, -1.402f, -1.128f, -2.301f, -1.333f)
                verticalLineToRelative(-1.612f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.612f)
                curveToRelative(0.898f, -0.205f, 1.695f, -0.679f, 2.301f, -1.333f)
                lineToRelative(1.4f, 0.806f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(-1.397f, -0.805f)
                curveToRelative(0.129f, -0.419f, 0.199f, -0.863f, 0.199f, -1.324f)
                close()
            }
        }
        .build()
        return _workflowSetting!!
    }

private var _workflowSetting: ImageVector? = null

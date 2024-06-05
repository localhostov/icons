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

public val Icons.Filled.WorkflowSettingAlt: ImageVector
    get() {
        if (_workflowSettingAlt != null) {
            return _workflowSettingAlt!!
        }
        _workflowSettingAlt = Builder(name = "WorkflowSettingAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.612f)
                curveToRelative(0.898f, -0.205f, 1.695f, -0.679f, 2.3f, -1.332f)
                lineToRelative(1.4f, 0.806f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(-1.397f, -0.805f)
                curveToRelative(0.129f, -0.419f, 0.199f, -0.863f, 0.199f, -1.324f)
                reflectiveCurveToRelative(-0.07f, -0.905f, -0.199f, -1.324f)
                lineToRelative(1.397f, -0.805f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(-1.4f, 0.806f)
                curveToRelative(-0.606f, -0.654f, -1.402f, -1.128f, -2.3f, -1.332f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.612f)
                curveToRelative(-0.898f, 0.205f, -1.695f, 0.679f, -2.3f, 1.332f)
                lineToRelative(-1.4f, -0.806f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(1.397f, 0.805f)
                curveToRelative(-0.129f, 0.419f, -0.199f, 0.863f, -0.199f, 1.324f)
                reflectiveCurveToRelative(0.07f, 0.905f, 0.199f, 1.324f)
                lineToRelative(-1.397f, 0.805f)
                lineToRelative(0.998f, 1.733f)
                lineToRelative(1.4f, -0.806f)
                curveToRelative(0.606f, 0.654f, 1.402f, 1.128f, 2.3f, 1.332f)
                verticalLineToRelative(1.612f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.5f, 6.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(9.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _workflowSettingAlt!!
    }

private var _workflowSettingAlt: ImageVector? = null

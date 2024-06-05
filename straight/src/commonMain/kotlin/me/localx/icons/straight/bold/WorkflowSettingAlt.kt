package me.localx.icons.straight.bold

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

public val Icons.Bold.WorkflowSettingAlt: ImageVector
    get() {
        if (_workflowSettingAlt != null) {
            return _workflowSettingAlt!!
        }
        _workflowSettingAlt = Builder(name = "WorkflowSettingAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(4.5f, 17.0f)
                lineTo(1.5f, 17.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.757f)
                curveToRelative(-0.527f, -0.187f, -1.009f, -0.469f, -1.425f, -0.826f)
                lineToRelative(-1.525f, 0.878f)
                lineToRelative(-1.498f, -2.6f)
                lineToRelative(1.523f, -0.877f)
                curveToRelative(-0.049f, -0.265f, -0.075f, -0.539f, -0.075f, -0.818f)
                reflectiveCurveToRelative(0.026f, -0.553f, 0.075f, -0.818f)
                lineToRelative(-1.523f, -0.877f)
                lineToRelative(1.498f, -2.6f)
                lineToRelative(1.525f, 0.878f)
                curveToRelative(0.416f, -0.357f, 0.898f, -0.639f, 1.425f, -0.826f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.757f)
                curveToRelative(0.527f, 0.187f, 1.009f, 0.469f, 1.425f, 0.826f)
                lineToRelative(1.525f, -0.878f)
                lineToRelative(1.498f, 2.6f)
                lineToRelative(-1.523f, 0.877f)
                curveToRelative(0.049f, 0.265f, 0.075f, 0.539f, 0.075f, 0.818f)
                reflectiveCurveToRelative(-0.026f, 0.553f, -0.075f, 0.818f)
                lineToRelative(1.523f, 0.877f)
                lineToRelative(-1.498f, 2.6f)
                lineToRelative(-1.525f, -0.878f)
                curveToRelative(-0.416f, 0.357f, -0.898f, 0.639f, -1.425f, 0.826f)
                verticalLineToRelative(1.757f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.5f, 6.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _workflowSettingAlt!!
    }

private var _workflowSettingAlt: ImageVector? = null

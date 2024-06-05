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

public val Icons.Bold.WorkflowSetting: ImageVector
    get() {
        if (_workflowSetting != null) {
            return _workflowSetting!!
        }
        _workflowSetting = Builder(name = "WorkflowSetting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
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
                moveTo(5.0f, 16.062f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-5.062f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.062f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.78f, -2.95f)
                curveToRelative(0.293f, -0.304f, 0.293f, -0.796f, 0.0f, -1.1f)
                lineToRelative(-2.78f, -2.95f)
                close()
                moveTo(22.5f, 7.0f)
                curveToRelative(0.0f, -0.279f, -0.026f, -0.552f, -0.075f, -0.818f)
                lineToRelative(1.524f, -0.878f)
                lineToRelative(-1.498f, -2.6f)
                lineToRelative(-1.525f, 0.879f)
                curveToRelative(-0.416f, -0.357f, -0.898f, -0.64f, -1.425f, -0.827f)
                verticalLineToRelative(-1.757f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.757f)
                curveToRelative(0.527f, -0.187f, 1.009f, -0.47f, 1.425f, -0.827f)
                lineToRelative(1.525f, 0.879f)
                lineToRelative(1.498f, -2.6f)
                lineToRelative(-1.524f, -0.878f)
                curveToRelative(0.049f, -0.265f, 0.075f, -0.538f, 0.075f, -0.818f)
                close()
            }
        }
        .build()
        return _workflowSetting!!
    }

private var _workflowSetting: ImageVector? = null

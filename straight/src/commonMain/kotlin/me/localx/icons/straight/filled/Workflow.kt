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

public val Icons.Filled.Workflow: ImageVector
    get() {
        if (_workflow != null) {
            return _workflow!!
        }
        _workflow = Builder(name = "Workflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.164f, 4.25f)
                lineTo(12.0f, 0.086f)
                lineToRelative(-4.164f, 4.164f)
                lineToRelative(3.164f, 3.164f)
                verticalLineToRelative(1.982f)
                curveToRelative(-1.444f, 0.431f, -2.5f, 1.772f, -2.5f, 3.354f)
                reflectiveCurveToRelative(1.056f, 2.923f, 2.5f, 3.354f)
                verticalLineToRelative(1.896f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.896f)
                curveToRelative(1.444f, -0.431f, 2.5f, -1.772f, 2.5f, -3.354f)
                reflectiveCurveToRelative(-1.056f, -2.923f, -2.5f, -3.354f)
                verticalLineToRelative(-1.982f)
                lineToRelative(3.164f, -3.164f)
                close()
                moveTo(6.78f, 19.45f)
                curveToRelative(0.293f, 0.304f, 0.293f, 0.796f, 0.0f, 1.1f)
                lineToRelative(-2.78f, 2.95f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.5f)
                lineToRelative(2.78f, 2.95f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(-2.78f, -2.95f)
                curveToRelative(-0.293f, -0.304f, -0.293f, -0.796f, 0.0f, -1.1f)
                lineToRelative(2.78f, -2.95f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _workflow!!
    }

private var _workflow: ImageVector? = null

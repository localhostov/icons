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

public val Icons.Filled.WorkflowAlt: ImageVector
    get() {
        if (_workflowAlt != null) {
            return _workflowAlt!!
        }
        _workflowAlt = Builder(name = "WorkflowAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.586f, 15.121f)
                verticalLineToRelative(-5.207f)
                lineToRelative(4.414f, -4.414f)
                lineTo(18.586f, 0.086f)
                lineToRelative(-3.914f, 3.914f)
                horizontalLineToRelative(-5.636f)
                curveTo(8.783f, 1.756f, 6.896f, 0.0f, 4.586f, 0.0f)
                curveTo(2.104f, 0.0f, 0.086f, 2.019f, 0.086f, 4.5f)
                curveToRelative(0.0f, 1.953f, 1.258f, 3.602f, 3.0f, 4.224f)
                verticalLineToRelative(7.276f)
                horizontalLineTo(0.086f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.051f)
                curveToRelative(1.731f, -0.195f, 3.157f, -1.36f, 3.724f, -2.949f)
                horizontalLineToRelative(4.862f)
                lineToRelative(3.914f, 3.914f)
                verticalLineToRelative(5.207f)
                curveToRelative(-2.0f, 0.457f, -3.5f, 2.242f, -3.5f, 4.379f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -2.137f, -1.5f, -3.922f, -3.5f, -4.379f)
                close()
            }
        }
        .build()
        return _workflowAlt!!
    }

private var _workflowAlt: ImageVector? = null

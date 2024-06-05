package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.NotebookAlt: ImageVector
    get() {
        if (_notebookAlt != null) {
            return _notebookAlt!!
        }
        _notebookAlt = Builder(name = "NotebookAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 0.0f)
                lineTo(8.5f, 0.0f)
                curveToRelative(-2.13f, 0.0f, -3.99f, 1.22f, -4.9f, 3.0f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.91f, 1.78f, 2.77f, 3.0f, 4.9f, 3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(23.0f, 5.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(6.0f, 18.5f)
                lineTo(6.0f, 5.5f)
                curveToRelative(0.0f, -1.21f, 0.86f, -2.22f, 2.0f, -2.45f)
                lineTo(8.0f, 20.95f)
                curveToRelative(-1.14f, -0.23f, -2.0f, -1.24f, -2.0f, -2.45f)
                close()
                moveTo(20.0f, 18.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _notebookAlt!!
    }

private var _notebookAlt: ImageVector? = null

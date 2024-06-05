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

public val Icons.Outline.SortDown: ImageVector
    get() {
        if (_sortDown != null) {
            return _sortDown!!
        }
        _sortDown = Builder(name = "SortDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.973f, 18.0f)
                curveToRelative(-0.704f, 0.0f, -1.378f, -0.301f, -1.848f, -0.824f)
                lineTo(1.729f, 8.0f)
                horizontalLineTo(22.216f)
                lineToRelative(-8.401f, 9.183f)
                curveToRelative(-0.464f, 0.517f, -1.138f, 0.817f, -1.842f, 0.817f)
                close()
                moveTo(6.271f, 10.0f)
                lineToRelative(5.337f, 5.833f)
                curveToRelative(0.131f, 0.146f, 0.285f, 0.167f, 0.365f, 0.167f)
                reflectiveCurveToRelative(0.234f, -0.021f, 0.359f, -0.16f)
                lineToRelative(5.343f, -5.84f)
                horizontalLineTo(6.271f)
                close()
            }
        }
        .build()
        return _sortDown!!
    }

private var _sortDown: ImageVector? = null

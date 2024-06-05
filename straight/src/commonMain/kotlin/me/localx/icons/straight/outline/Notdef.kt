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

public val Icons.Outline.Notdef: ImageVector
    get() {
        if (_notdef != null) {
            return _notdef!!
        }
        _notdef = Builder(name = "Notdef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(10.76f, 12.0f)
                lineToRelative(-5.76f, 7.92f)
                lineTo(5.0f, 4.07f)
                lineToRelative(5.76f, 7.92f)
                close()
                moveTo(12.0f, 13.7f)
                lineToRelative(6.04f, 8.3f)
                lineTo(5.96f, 22.0f)
                lineToRelative(6.04f, -8.3f)
                close()
                moveTo(13.24f, 12.0f)
                lineToRelative(5.76f, -7.92f)
                verticalLineToRelative(15.85f)
                lineToRelative(-5.76f, -7.92f)
                close()
                moveTo(18.0f, 2.0f)
                reflectiveCurveToRelative(0.02f, 0.0f, 0.03f, 0.0f)
                lineToRelative(-6.03f, 8.29f)
                lineTo(5.97f, 2.01f)
                reflectiveCurveToRelative(0.02f, 0.0f, 0.03f, 0.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _notdef!!
    }

private var _notdef: ImageVector? = null

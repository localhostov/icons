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

public val Icons.Outline.LaughWink: ImageVector
    get() {
        if (_laughWink != null) {
            return _laughWink!!
        }
        _laughWink = Builder(name = "LaughWink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(17.0f, 14.0f)
                curveToRelative(0.0f, 2.0f, -2.0f, 5.0f, -4.993f, 5.0f)
                reflectiveCurveTo(7.05f, 16.0f, 7.0f, 14.0f)
                close()
                moveTo(18.0f, 10.0f)
                verticalLineToRelative(1.0f)
                lineTo(14.0f, 11.0f)
                lineTo(14.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(10.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _laughWink!!
    }

private var _laughWink: ImageVector? = null

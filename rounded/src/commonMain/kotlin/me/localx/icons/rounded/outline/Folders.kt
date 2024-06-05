package me.localx.icons.rounded.outline

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

public val Icons.Outline.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = Builder(name = "Folders", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.154f, 0.0f, -0.31f, -0.036f, -0.447f, -0.105f)
                lineToRelative(-3.156f, -1.578f)
                curveToRelative(-0.415f, -0.207f, -0.878f, -0.316f, -1.341f, -0.316f)
                horizontalLineToRelative(-2.056f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                lineTo(4.0f, 14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(2.056f)
                curveToRelative(0.154f, 0.0f, 0.31f, 0.036f, 0.447f, 0.105f)
                lineToRelative(3.155f, 1.578f)
                curveToRelative(0.414f, 0.207f, 0.878f, 0.316f, 1.342f, 0.316f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, 0.836f, 2.828f, 2.0f)
                lineTo(6.0f, 6.999f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(19.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-5.0f)
                lineTo(22.0f, 9.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(20.0f, 22.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 8.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _folders!!
    }

private var _folders: ImageVector? = null

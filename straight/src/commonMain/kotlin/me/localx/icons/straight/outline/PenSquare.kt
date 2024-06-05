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

public val Icons.Outline.PenSquare: ImageVector
    get() {
        if (_penSquare != null) {
            return _penSquare!!
        }
        _penSquare = Builder(name = "PenSquare", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                close()
                moveTo(13.879f, 6.379f)
                lineToRelative(-7.879f, 7.879f)
                verticalLineToRelative(4.242f)
                horizontalLineToRelative(4.243f)
                lineToRelative(7.878f, -7.879f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, 0.0f, -4.242f)
                curveToRelative(-1.134f, -1.133f, -3.11f, -1.133f, -4.243f, 0.0f)
                close()
                moveTo(9.415f, 16.5f)
                horizontalLineToRelative(-1.415f)
                verticalLineToRelative(-1.414f)
                lineToRelative(4.836f, -4.836f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-4.836f, 4.836f)
                close()
                moveTo(16.707f, 9.207f)
                lineToRelative(-1.043f, 1.043f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.043f, -1.043f)
                curveToRelative(0.377f, -0.379f, 1.036f, -0.379f, 1.414f, 0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _penSquare!!
    }

private var _penSquare: ImageVector? = null

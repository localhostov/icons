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

public val Icons.Outline.EmailPending: ImageVector
    get() {
        if (_emailPending != null) {
            return _emailPending!!
        }
        _emailPending = Builder(name = "EmailPending", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 12.921f)
                curveToRelative(0.754f, -0.437f, 1.428f, -0.992f, 2.0f, -1.642f)
                verticalLineToRelative(12.721f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.587f)
                curveToRelative(-0.256f, 0.631f, -0.431f, 1.301f, -0.518f, 2.0f)
                lineTo(3.0f, 5.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f)
                lineToRelative(0.754f, -0.754f)
                curveToRelative(0.703f, 0.299f, 1.458f, 0.497f, 2.246f, 0.584f)
                lineToRelative(-1.581f, 1.581f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineToRelative(-6.46f, -6.46f)
                verticalLineToRelative(12.93f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-9.079f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(14.0f, 6.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(20.707f, 7.293f)
                lineToRelative(-1.707f, -1.707f)
                verticalLineToRelative(-2.586f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _emailPending!!
    }

private var _emailPending: ImageVector? = null

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

public val Icons.Outline.CallOutgoing: ImageVector
    get() {
        if (_callOutgoing != null) {
            return _callOutgoing!!
        }
        _callOutgoing = Builder(name = "CallOutgoing", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.98f, 2.023f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(21.98f, 3.46f)
                lineToRelative(-5.3f, 5.272f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.41f, -1.418f)
                lineTo(20.59f, 2.023f)
                lineTo(17.98f, 2.023f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.98f, 2.023f)
                close()
                moveTo(23.075f, 16.762f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 0.0f, 4.378f)
                lineToRelative(-0.912f, 1.05f)
                curveToRelative(-8.191f, 7.838f, -28.12f, -12.085f, -20.4f, -20.3f)
                lineToRelative(1.149f, -1.0f)
                arcTo(3.085f, 3.085f, 0.0f, false, true, 7.241f, 0.928f)
                curveToRelative(0.03f, 0.031f, 1.883f, 2.439f, 1.883f, 2.439f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -0.006f, 4.281f)
                lineTo(7.959f, 9.105f)
                arcTo(12.781f, 12.781f, 0.0f, false, false, 14.89f, 16.05f)
                lineToRelative(1.465f, -1.165f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 4.28f, -0.006f)
                reflectiveCurveTo(23.044f, 16.732f, 23.075f, 16.762f)
                close()
                moveTo(21.7f, 18.216f)
                reflectiveCurveToRelative(-2.393f, -1.842f, -2.424f, -1.872f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.549f, 0.0f)
                curveToRelative(-0.027f, 0.026f, -2.044f, 1.634f, -2.044f, 1.634f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.979f, 0.152f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 5.88f, 9.318f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.145f, -0.995f)
                reflectiveCurveTo(7.632f, 6.306f, 7.659f, 6.279f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.0f, -1.549f)
                curveTo(7.629f, 4.7f, 5.787f, 2.306f, 5.787f, 2.306f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.51f, 0.038f)
                lineToRelative(-1.149f, 1.0f)
                curveTo(-2.516f, 10.126f, 14.757f, 26.442f, 20.7f, 20.826f)
                lineToRelative(0.912f, -1.05f)
                arcTo(1.12f, 1.12f, 0.0f, false, false, 21.7f, 18.216f)
                close()
            }
        }
        .build()
        return _callOutgoing!!
    }

private var _callOutgoing: ImageVector? = null

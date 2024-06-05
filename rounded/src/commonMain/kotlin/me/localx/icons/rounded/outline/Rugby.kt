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

public val Icons.Outline.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.1f, 1.9f)
                curveToRelative(-3.436f, -3.431f, -12.728f, -1.967f, -17.448f, 2.752f)
                reflectiveCurveToRelative(-6.183f, 14.012f, -2.752f, 17.448f)
                arcToRelative(8.106f, 8.106f, 0.0f, false, false, 5.767f, 1.88f)
                arcToRelative(17.434f, 17.434f, 0.0f, false, false, 11.681f, -4.632f)
                curveToRelative(4.718f, -4.719f, 6.183f, -14.012f, 2.752f, -17.448f)
                close()
                moveTo(16.333f, 2.0f)
                arcToRelative(6.232f, 6.232f, 0.0f, false, true, 4.351f, 1.314f)
                curveToRelative(1.016f, 1.017f, 1.427f, 2.986f, 1.275f, 5.231f)
                lineToRelative(-6.5f, -6.5f)
                curveToRelative(0.295f, -0.019f, 0.591f, -0.045f, 0.874f, -0.045f)
                close()
                moveTo(3.316f, 20.684f)
                curveToRelative(-1.016f, -1.015f, -1.427f, -2.984f, -1.275f, -5.229f)
                lineToRelative(6.5f, 6.5f)
                curveToRelative(-2.241f, 0.155f, -4.21f, -0.255f, -5.225f, -1.271f)
                close()
                moveTo(17.934f, 17.934f)
                arcToRelative(14.685f, 14.685f, 0.0f, false, true, -6.929f, 3.657f)
                lineToRelative(-8.6f, -8.6f)
                arcToRelative(14.674f, 14.674f, 0.0f, false, true, 3.661f, -6.925f)
                arcToRelative(14.645f, 14.645f, 0.0f, false, true, 6.94f, -3.646f)
                lineToRelative(8.586f, 8.586f)
                arcToRelative(14.674f, 14.674f, 0.0f, false, true, -3.658f, 6.928f)
                close()
                moveTo(17.707f, 11.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-1.586f, 1.586f)
                lineToRelative(1.293f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-1.586f, 1.586f)
                lineToRelative(1.293f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(1.586f, -1.586f)
                lineToRelative(-1.293f, -1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(1.586f, -1.586f)
                lineToRelative(-1.293f, -1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null

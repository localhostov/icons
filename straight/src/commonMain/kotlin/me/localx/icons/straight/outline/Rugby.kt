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
                moveTo(13.707f, 6.293f)
                lineTo(17.707f, 10.293f)
                lineTo(16.293f, 11.707f)
                lineTo(15.0f, 10.414f)
                lineTo(13.414f, 12.0f)
                lineTo(14.707f, 13.293f)
                lineTo(13.293f, 14.707f)
                lineTo(12.0f, 13.414f)
                lineTo(10.414f, 15.0f)
                lineTo(11.707f, 16.293f)
                lineTo(10.293f, 17.707f)
                lineTo(6.293f, 13.707f)
                lineTo(7.707f, 12.293f)
                lineTo(9.0f, 13.586f)
                lineTo(10.586f, 12.0f)
                lineTo(9.293f, 10.707f)
                lineTo(10.707f, 9.293f)
                lineTo(12.0f, 10.586f)
                lineTo(13.586f, 9.0f)
                lineTo(12.293f, 7.707f)
                close()
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null

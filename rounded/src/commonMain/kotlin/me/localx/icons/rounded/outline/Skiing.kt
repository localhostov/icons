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

public val Icons.Outline.Skiing: ImageVector
    get() {
        if (_skiing != null) {
            return _skiing!!
        }
        _skiing = Builder(name = "Skiing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9f, 21.729f)
                arcTo(4.014f, 4.014f, 0.0f, false, true, 20.253f, 24.0f)
                arcToRelative(4.324f, 4.324f, 0.0f, false, true, -1.768f, -0.383f)
                lineTo(0.483f, 14.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.872f, -1.8f)
                lineToRelative(8.913f, 4.316f)
                lineToRelative(1.636f, -3.3f)
                lineToRelative(-2.0f, -1.469f)
                arcToRelative(1.077f, 1.077f, 0.0f, false, true, -0.106f, -0.086f)
                arcTo(2.772f, 2.772f, 0.0f, false, true, 9.74f, 8.61f)
                lineTo(5.027f, 6.393f)
                lineToRelative(-0.386f, 0.815f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.9f, 0.571f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, true, -0.428f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.475f, -1.332f)
                lineToRelative(0.384f, -0.809f)
                lineToRelative(-0.7f, -0.329f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.37f, 3.4f)
                lineToRelative(0.705f, 0.332f)
                lineToRelative(0.37f, -0.781f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.807f, 0.858f)
                lineToRelative(-0.367f, 0.774f)
                lineTo(11.251f, 7.11f)
                lineToRelative(1.224f, -1.193f)
                arcTo(3.022f, 3.022f, 0.0f, false, true, 14.731f, 5.0f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, true, 1.849f, 0.748f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 1.339f, 2.72f)
                verticalLineTo(9.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.579f, 0.908f)
                lineToRelative(2.714f, 1.258f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.842f, 1.815f)
                lineToRelative(-2.714f, -1.259f)
                arcTo(3.01f, 3.01f, 0.0f, false, true, 15.919f, 9.7f)
                verticalLineTo(8.47f)
                arcToRelative(1.448f, 1.448f, 0.0f, false, false, -0.59f, -1.163f)
                arcTo(1.018f, 1.018f, 0.0f, false, false, 14.667f, 7.0f)
                arcToRelative(0.986f, 0.986f, 0.0f, false, false, -0.764f, 0.316f)
                lineToRelative(-0.72f, 0.7f)
                lineToRelative(0.162f, 0.076f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.852f, 1.81f)
                lineToRelative(-0.839f, -0.395f)
                lineToRelative(-0.4f, 0.386f)
                curveToRelative(-0.121f, 0.131f, -0.572f, 0.69f, -0.121f, 1.17f)
                lineToRelative(1.959f, 1.4f)
                arcToRelative(2.014f, 2.014f, 0.0f, false, true, 0.587f, 2.562f)
                lineToRelative(-1.614f, 3.258f)
                lineToRelative(7.263f, 3.517f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 2.767f, -0.941f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.8f, 0.865f)
                close()
                moveTo(18.419f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.419f, 5.0f)
                close()
            }
        }
        .build()
        return _skiing!!
    }

private var _skiing: ImageVector? = null

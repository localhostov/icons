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

public val Icons.Outline.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -0.293f)
                lineToRelative(6.619f, -6.619f)
                lineTo(9.574f, 18.38f)
                arcToRelative(5.169f, 5.169f, 0.0f, false, false, 3.605f, 1.614f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, false, 1.339f, -0.227f)
                arcToRelative(3.63f, 3.63f, 0.0f, false, false, 2.435f, -3.122f)
                arcToRelative(8.486f, 8.486f, 0.0f, false, false, -0.222f, -3.027f)
                lineToRelative(-0.214f, -1.042f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.264f, -0.943f)
                lineToRelative(1.587f, -1.588f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.236f, -0.1f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, true, 0.167f, 0.065f)
                arcToRelative(3.077f, 3.077f, 0.0f, false, false, 3.971f, 0.432f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.379f, -4.565f)
                lineTo(18.2f, 0.954f)
                arcToRelative(3.085f, 3.085f, 0.0f, false, false, -3.938f, -0.4f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.38f, 4.565f)
                lineToRelative(0.076f, 0.076f)
                arcToRelative(0.308f, 0.308f, 0.0f, false, true, 0.0f, 0.434f)
                lineToRelative(-1.6f, 1.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.954f, 0.261f)
                lineToRelative(-0.817f, -0.209f)
                arcToRelative(8.632f, 8.632f, 0.0f, false, false, -3.082f, -0.233f)
                arcTo(3.863f, 3.863f, 0.0f, false, false, 4.25f, 9.634f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.928f, 4.2f)
                lineToRelative(1.758f, 1.82f)
                lineTo(0.293f, 22.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 24.0f)
                close()
                moveTo(6.135f, 10.3f)
                arcTo(1.856f, 1.856f, 0.0f, false, true, 7.713f, 9.036f)
                arcTo(6.7f, 6.7f, 0.0f, false, true, 8.406f, 9.0f)
                arcToRelative(6.622f, 6.622f, 0.0f, false, true, 1.681f, 0.217f)
                lineToRelative(0.823f, 0.21f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, false, 2.862f, -0.785f)
                lineToRelative(1.6f, -1.6f)
                arcToRelative(2.31f, 2.31f, 0.0f, false, false, 0.0f, -3.262f)
                lineToRelative(-0.076f, -0.076f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.134f, -1.528f)
                arcToRelative(1.084f, 1.084f, 0.0f, false, true, 1.356f, 0.19f)
                lineToRelative(4.924f, 4.924f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.134f, 1.528f)
                arcToRelative(1.085f, 1.085f, 0.0f, false, true, -1.368f, -0.2f)
                arcToRelative(2.212f, 2.212f, 0.0f, false, false, -1.584f, -0.672f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -1.667f, 0.684f)
                lineToRelative(-1.586f, 1.587f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.8f, 2.8f)
                lineToRelative(0.219f, 1.058f)
                arcToRelative(6.646f, 6.646f, 0.0f, false, true, 0.181f, 2.366f)
                arcToRelative(1.655f, 1.655f, 0.0f, false, true, -1.115f, 1.444f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -2.85f, -0.9f)
                lineToRelative(-4.4f, -4.55f)
                arcTo(2.027f, 2.027f, 0.0f, false, true, 6.135f, 10.3f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null

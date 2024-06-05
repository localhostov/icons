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

public val Icons.Outline.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) {
            return _motorcycle!!
        }
        _motorcycle = Builder(name = "Motorcycle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                arcToRelative(5.186f, 5.186f, 0.0f, false, false, -0.6f, 0.036f)
                lineToRelative(-0.607f, -1.82f)
                curveToRelative(0.495f, -0.087f, 1.018f, -0.152f, 1.493f, -0.187f)
                curveTo(19.767f, 10.053f, 21.909f, 10.543f, 22.0f, 9.0f)
                lineTo(22.0f, 7.0f)
                curveToRelative(-0.1f, -1.574f, -2.293f, -1.033f, -2.747f, 0.026f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -2.02f, 0.259f)
                lineToRelative(-0.079f, 0.016f)
                lineToRelative(-0.522f, -1.566f)
                arcTo(3.994f, 3.994f, 0.0f, false, false, 12.838f, 3.0f)
                lineTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.838f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.9f, 1.368f)
                lineToRelative(0.553f, 1.659f)
                arcTo(5.987f, 5.987f, 0.0f, false, false, 14.063f, 9.0f)
                lineTo(8.825f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(0.983f, 0.983f, 0.0f, false, true, 0.895f, 0.553f)
                arcTo(1.017f, 1.017f, 0.0f, false, true, 7.0f, 9.948f)
                arcToRelative(1.579f, 1.579f, 0.0f, false, true, -0.2f, 0.652f)
                lineToRelative(-0.44f, 0.586f)
                arcTo(5.025f, 5.025f, 0.0f, false, false, 0.0f, 16.0f)
                curveToRelative(0.114f, 6.163f, 8.966f, 6.763f, 9.947f, 0.726f)
                arcTo(4.016f, 4.016f, 0.0f, false, false, 11.7f, 15.4f)
                lineToRelative(3.451f, -4.6f)
                arcToRelative(9.341f, 9.341f, 0.0f, false, true, 0.794f, -0.8f)
                lineTo(16.5f, 11.67f)
                arcTo(5.015f, 5.015f, 0.0f, false, false, 19.0f, 21.0f)
                curveTo(25.608f, 20.79f, 25.606f, 11.209f, 19.0f, 11.0f)
                close()
                moveTo(5.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                lineToRelative(-0.6f, 0.8f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 17.0f)
                lineTo(7.828f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 19.0f)
                close()
                moveTo(10.1f, 14.2f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -1.6f, 0.8f)
                lineTo(6.0f, 15.0f)
                lineToRelative(2.4f, -3.2f)
                arcToRelative(3.03f, 3.03f, 0.0f, false, false, 0.431f, -0.8f)
                lineTo(12.5f, 11.0f)
                close()
                moveTo(19.0f, 19.0f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, true, -1.842f, -5.365f)
                lineToRelative(0.894f, 2.681f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.9f, -0.632f)
                lineTo(19.054f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 19.0f)
                close()
            }
        }
        .build()
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null

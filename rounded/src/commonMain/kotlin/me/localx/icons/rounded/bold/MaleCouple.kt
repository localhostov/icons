package me.localx.icons.rounded.bold

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

public val Icons.Bold.MaleCouple: ImageVector
    get() {
        if (_maleCouple != null) {
            return _maleCouple!!
        }
        _maleCouple = Builder(name = "MaleCouple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.99f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(18.421f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, 1.707f)
                lineToRelative(1.229f, 1.229f)
                lineToRelative(-2.038f, 2.038f)
                arcTo(6.447f, 6.447f, 0.0f, false, false, 13.5f, 11.0f)
                curveToRelative(-0.181f, 0.0f, -0.359f, 0.013f, -0.536f, 0.028f)
                curveToRelative(0.015f, -0.176f, 0.036f, -0.349f, 0.036f, -0.528f)
                arcToRelative(6.447f, 6.447f, 0.0f, false, false, -0.974f, -3.4f)
                lineToRelative(2.038f, -2.038f)
                lineToRelative(1.229f, 1.229f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 5.577f)
                lineTo(16.99f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(11.421f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, 1.707f)
                lineToRelative(1.229f, 1.229f)
                lineTo(9.9f, 4.974f)
                arcTo(6.5f, 6.5f, 0.0f, true, false, 6.5f, 17.0f)
                curveToRelative(0.183f, 0.0f, 0.36f, -0.022f, 0.54f, -0.037f)
                curveToRelative(-0.015f, 0.179f, -0.04f, 0.355f, -0.04f, 0.537f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 12.026f, -3.4f)
                lineToRelative(2.038f, -2.038f)
                lineToRelative(1.229f, 1.229f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 12.577f)
                close()
                moveTo(3.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 6.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.0f, 10.5f)
                close()
                moveTo(13.5f, 21.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 17.0f, 17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 13.5f, 21.0f)
                close()
            }
        }
        .build()
        return _maleCouple!!
    }

private var _maleCouple: ImageVector? = null

package me.localx.icons.rounded.filled

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

public val Icons.Filled.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.732f, 4.792f)
                arcTo(3.672f, 3.672f, 0.0f, false, false, 22.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                curveToRelative(-0.785f, 0.0f, -1.0f, -0.215f, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(3.513f, 3.513f, 0.0f, false, false, 0.28f, 1.417f)
                lineToRelative(-0.706f, 0.784f)
                arcTo(10.923f, 10.923f, 0.0f, false, false, 13.0f, 2.051f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(2.051f)
                arcTo(10.923f, 10.923f, 0.0f, false, false, 5.426f, 4.2f)
                lineTo(4.72f, 3.417f)
                arcTo(3.513f, 3.513f, 0.0f, false, false, 5.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 2.0f)
                curveToRelative(0.0f, 0.785f, -0.215f, 1.0f, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 5.0f)
                arcToRelative(3.672f, 3.672f, 0.0f, false, false, 1.268f, -0.208f)
                lineToRelative(0.672f, 0.747f)
                arcToRelative(11.0f, 11.0f, 0.0f, true, false, 16.12f, 0.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, true, -1.0f, -3.723f)
                verticalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(4.277f)
                arcTo(1.994f, 1.994f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null

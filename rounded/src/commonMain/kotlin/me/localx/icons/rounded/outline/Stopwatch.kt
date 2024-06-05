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

public val Icons.Outline.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.0f, -1.723f)
                verticalLineToRelative(-4.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(4.277f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, true, 1.0f, 1.723f)
                close()
                moveTo(20.06f, 5.539f)
                arcToRelative(11.0f, 11.0f, 0.0f, true, true, -16.12f, 0.0f)
                lineToRelative(-0.672f, -0.747f)
                arcToRelative(3.672f, 3.672f, 0.0f, false, true, -1.268f, 0.208f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                curveToRelative(0.785f, 0.0f, 1.0f, -0.215f, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcToRelative(3.513f, 3.513f, 0.0f, false, true, -0.28f, 1.417f)
                lineToRelative(0.706f, 0.784f)
                arcToRelative(10.923f, 10.923f, 0.0f, false, true, 5.574f, -2.15f)
                verticalLineToRelative(-1.051f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.051f)
                arcToRelative(10.923f, 10.923f, 0.0f, false, true, 5.574f, 2.149f)
                lineToRelative(0.706f, -0.784f)
                arcToRelative(3.513f, 3.513f, 0.0f, false, true, -0.28f, -1.416f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                curveToRelative(0.0f, 0.785f, 0.215f, 1.0f, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(3.672f, 3.672f, 0.0f, false, true, -1.268f, -0.208f)
                close()
                moveTo(21.0f, 13.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -9.0f, 9.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null

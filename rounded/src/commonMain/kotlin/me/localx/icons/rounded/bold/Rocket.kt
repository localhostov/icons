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

public val Icons.Bold.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                close()
                moveTo(10.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                close()
                moveTo(23.841f, 3.553f)
                lineTo(23.766f, 3.762f)
                curveToRelative(-1.654f, 4.589f, -3.234f, 8.925f, -6.875f, 12.691f)
                arcToRelative(11.063f, 11.063f, 0.0f, false, true, -3.3f, 6.787f)
                arcToRelative(2.757f, 2.757f, 0.0f, false, true, -1.891f, 0.76f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -2.7f, -2.7f)
                verticalLineToRelative(-1.631f)
                arcToRelative(5.259f, 5.259f, 0.0f, false, true, -1.607f, -0.941f)
                lineToRelative(-1.832f, 1.833f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, -2.122f)
                lineToRelative(1.834f, -1.834f)
                arcToRelative(5.282f, 5.282f, 0.0f, false, true, -1.145f, -2.605f)
                horizontalLineToRelative(-1.428f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -2.7f, -2.7f)
                arcToRelative(2.757f, 2.757f, 0.0f, false, true, 0.76f, -1.89f)
                arcToRelative(11.288f, 11.288f, 0.0f, false, true, 7.983f, -3.392f)
                curveToRelative(3.476f, -2.893f, 7.386f, -4.3f, 11.5f, -5.784f)
                lineToRelative(0.208f, -0.075f)
                arcToRelative(2.652f, 2.652f, 0.0f, false, true, 3.394f, 3.394f)
                close()
                moveTo(20.768f, 3.232f)
                curveToRelative(-4.356f, 1.573f, -8.133f, 3.008f, -11.368f, 6.24f)
                arcToRelative(26.059f, 26.059f, 0.0f, false, false, -1.921f, 2.449f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, false, 0.261f, 2.979f)
                lineToRelative(1.424f, 1.42f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, false, 2.976f, 0.258f)
                arcToRelative(17.546f, 17.546f, 0.0f, false, false, 2.388f, -1.978f)
                curveToRelative(3.232f, -3.235f, 4.672f, -7.012f, 6.24f, -11.368f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null

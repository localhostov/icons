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

public val Icons.Filled.Steak: ImageVector
    get() {
        if (_steak != null) {
            return _steak!!
        }
        _steak = Builder(name = "Steak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 0.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 0.0f, 10.0f)
                curveToRelative(0.0f, 5.327f, 4.206f, 10.0f, 9.0f, 10.0f)
                arcToRelative(4.341f, 4.341f, 0.0f, false, true, 3.781f, 1.762f)
                curveToRelative(3.4f, 4.46f, 11.265f, 1.81f, 11.219f, -4.262f)
                curveTo(24.0f, 11.588f, 19.772f, 0.0f, 10.0f, 0.0f)
                close()
                moveTo(4.293f, 7.293f)
                lineToRelative(3.0f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.707f, 5.707f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.293f, 7.293f)
                close()
                moveTo(6.707f, 13.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(7.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                close()
                moveTo(10.707f, 15.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                close()
                moveTo(14.0f, 18.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, -0.707f, -1.707f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineToRelative(-4.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 18.0f)
                close()
                moveTo(19.707f, 18.707f)
                curveTo(19.31f, 19.03f, 18.593f, 20.076f, 18.0f, 20.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, -0.707f, -1.707f)
                lineToRelative(1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.707f, 18.707f)
                close()
            }
        }
        .build()
        return _steak!!
    }

private var _steak: ImageVector? = null

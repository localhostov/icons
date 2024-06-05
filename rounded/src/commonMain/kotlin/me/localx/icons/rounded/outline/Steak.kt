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

public val Icons.Outline.Steak: ImageVector
    get() {
        if (_steak != null) {
            return _steak!!
        }
        _steak = Builder(name = "Steak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 24.0f)
                arcToRelative(5.772f, 5.772f, 0.0f, false, true, -4.719f, -2.238f)
                arcTo(4.341f, 4.341f, 0.0f, false, false, 9.0f, 20.0f)
                curveToRelative(-4.794f, 0.0f, -9.0f, -4.673f, -9.0f, -10.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 10.0f, 0.0f)
                curveToRelative(9.772f, 0.0f, 14.0f, 11.588f, 14.0f, 17.5f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 17.5f, 24.0f)
                close()
                moveTo(10.0f, 2.0f)
                curveTo(-0.468f, 2.379f, -0.38f, 17.105f, 9.0f, 18.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, 5.242f, 2.4f)
                curveTo(16.578f, 23.651f, 22.1f, 21.573f, 22.0f, 17.5f)
                curveTo(22.0f, 12.938f, 18.547f, 2.0f, 10.0f, 2.0f)
                close()
                moveTo(6.707f, 13.707f)
                lineToRelative(7.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineToRelative(-7.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.707f, 13.707f)
                close()
                moveTo(10.707f, 15.707f)
                lineTo(16.707f, 9.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineToRelative(-6.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.707f, 15.707f)
                close()
                moveTo(14.707f, 17.707f)
                lineTo(18.707f, 13.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineToRelative(-4.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.707f, 17.707f)
                close()
                moveTo(18.707f, 19.707f)
                lineTo(19.707f, 18.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineToRelative(-1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.707f, 19.707f)
                close()
                moveTo(5.707f, 8.707f)
                lineTo(8.707f, 5.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.293f, 4.293f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.707f, 8.707f)
                close()
            }
        }
        .build()
        return _steak!!
    }

private var _steak: ImageVector? = null

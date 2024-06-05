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

public val Icons.Outline.MugHotAlt: ImageVector
    get() {
        if (_mugHotAlt != null) {
            return _mugHotAlt!!
        }
        _mugHotAlt = Builder(name = "MugHotAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                horizontalLineToRelative(-0.115f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 17.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-5.451f, 0.372f, -2.0f, 8.651f, -0.589f, 10.912f)
                arcTo(6.877f, 6.877f, 0.0f, false, false, 8.216f, 20.0f)
                horizontalLineToRelative(3.567f)
                arcToRelative(6.875f, 6.875f, 0.0f, false, false, 5.742f, -3.0f)
                lineTo(20.0f, 17.0f)
                curveTo(24.814f, 16.907f, 25.759f, 9.822f, 20.0f, 10.0f)
                close()
                moveTo(11.783f, 18.0f)
                lineTo(8.216f, 18.0f)
                arcToRelative(4.881f, 4.881f, 0.0f, false, true, -4.131f, -2.179f)
                curveTo(3.541f, 15.3f, 0.494f, 8.0f, 3.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, 0.729f, 0.325f)
                arcToRelative(1.028f, 1.028f, 0.0f, false, true, 0.261f, 0.8f)
                curveTo(17.427f, 13.384f, 16.368f, 17.811f, 11.783f, 18.0f)
                close()
                moveTo(20.0f, 15.0f)
                lineTo(18.588f, 15.0f)
                arcToRelative(16.82f, 16.82f, 0.0f, false, false, 0.954f, -3.0f)
                curveToRelative(1.209f, -0.081f, 2.546f, 0.216f, 2.458f, 1.143f)
                arcTo(1.984f, 1.984f, 0.0f, false, true, 20.0f, 15.0f)
                close()
                moveTo(9.025f, 3.0f)
                lineTo(9.025f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(11.025f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.025f, 3.0f)
                close()
                moveTo(13.025f, 3.0f)
                lineTo(13.025f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(15.025f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.025f, 3.0f)
                close()
                moveTo(5.025f, 3.0f)
                lineTo(5.025f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(7.025f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.025f, 3.0f)
                close()
                moveTo(20.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(1.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(19.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 23.0f)
                close()
            }
        }
        .build()
        return _mugHotAlt!!
    }

private var _mugHotAlt: ImageVector? = null

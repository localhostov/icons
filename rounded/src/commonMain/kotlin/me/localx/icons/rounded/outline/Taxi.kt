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

public val Icons.Outline.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(21.6f, 9.0f)
                lineToRelative(-0.77f, -2.481f)
                arcTo(4.964f, 4.964f, 0.0f, false, false, 16.7f, 3.052f)
                arcTo(4.982f, 4.982f, 0.0f, false, false, 12.117f, 0.0f)
                horizontalLineToRelative(-0.234f)
                arcTo(4.982f, 4.982f, 0.0f, false, false, 7.3f, 3.052f)
                arcTo(4.964f, 4.964f, 0.0f, false, false, 3.172f, 6.518f)
                lineTo(2.4f, 9.0f)
                lineTo(1.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.781f)
                lineToRelative(-0.715f, 2.3f)
                arcTo(3.958f, 3.958f, 0.0f, false, false, 2.0f, 19.444f)
                lineTo(2.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(8.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(22.0f, 19.444f)
                arcToRelative(3.958f, 3.958f, 0.0f, false, false, 0.934f, -6.142f)
                lineTo(22.219f, 11.0f)
                close()
                moveTo(11.883f, 2.0f)
                horizontalLineToRelative(0.234f)
                arcToRelative(2.991f, 2.991f, 0.0f, false, true, 2.226f, 1.0f)
                lineTo(9.657f, 3.0f)
                arcTo(2.988f, 2.988f, 0.0f, false, true, 11.883f, 2.0f)
                close()
                moveTo(5.083f, 7.11f)
                arcTo(2.986f, 2.986f, 0.0f, false, true, 7.947f, 5.0f)
                horizontalLineToRelative(8.106f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, true, 2.865f, 2.111f)
                lineToRelative(1.532f, 4.934f)
                arcTo(3.941f, 3.941f, 0.0f, false, false, 20.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                arcToRelative(3.941f, 3.941f, 0.0f, false, false, -0.45f, 0.045f)
                close()
                moveTo(6.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(4.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                close()
                moveTo(20.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(18.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(6.0f, 14.0f)
                lineTo(18.0f, 14.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(20.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
